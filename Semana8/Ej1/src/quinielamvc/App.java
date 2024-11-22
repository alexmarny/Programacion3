package quinielamvc;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.coti.tools.Rutas;

import quinielamvc.model.Quiniela;


public class App {
    public static void main(String[] args) throws Exception {

		Path rutaArchivo = Paths.get(System.getProperty("user.home"), "Desktop", "partidos.txt");

		//Rutas con biblioteca.jar
		//un fichero (partidos.txt) en Desktop

		Path rutaArchivoConBiblioteca = Rutas.pathToFileOnDesktop("partidos.txt");

		System.out.println(rutaArchivo);
		System.out.println(rutaArchivoConBiblioteca);

		Quiniela quiniela = new Quiniela();
		int partidosCount = quiniela.cargarPartidos(rutaArchivo);
		System.out.println("Partidos cargados: " + partidosCount);
	}
}
