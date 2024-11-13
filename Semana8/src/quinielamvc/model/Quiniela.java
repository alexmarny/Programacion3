package quinielamvc.model;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Quiniela {

	private ArrayList<Partido> partidos;

	public Quiniela() {
		this.partidos = new ArrayList<>();
	}

	public int cargarPartidos(Path archivoPartidos){

		List<String> lineas = null;

		try {
			lineas = Files.readAllLines(archivoPartidos, StandardCharsets.UTF_8);
			for (String linea : lineas) {
				String[] equipos = linea.split("-");
				//split separa cada equipo por el guion
				partidos.add(new Partido(equipos[0], equipos[1]));
			}
			return lineas.size();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

}
