package PersonaLista.model;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import java.util.ArrayList;

public class PersonaModel {

	

	private ArrayList<Persona> personas = new ArrayList<>();
	
	private int personaCount;

	public int getPersonaCount() {
		return personaCount;
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public String getEstadoComoString(int i) {
		if (personaCount > 0) {
			if (personas.get(i) != null) {
				return String.format("%-20s\t%-15s\t%-10s", personas.get(i).getNombre(), personas.get(i).getTelefono(), personas.get(i).getPeso());
			}
		}
		return "No personas available";
	}

	public boolean eliminarPersona(String nombre) {

		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i) != null && personas.get(i).getNombre().equals(nombre)) {
				for (int j = i; j < personas.size() - 1; j++) {
					personas.set(j, personas.get(j + 1));
				}
				personas.remove(personas.size() - 1);
				personaCount--;
				return true;
			}
		}
		return false;
	}

	public void addPersona(String nombre, int Telefono, double Peso) {
		personas.add(new Persona(nombre, Telefono, Peso));
		personaCount++;
	}

	public int cargarPersonasDesdeArchivo(Path rutaArchivoConBiblioteca) {
		List<String> lineas = null;

		try {
			lineas = Files.readAllLines(rutaArchivoConBiblioteca, StandardCharsets.UTF_8);
			for (String linea : lineas) {
				String[] datos = linea.split("\t");
				String nombre = datos[0].trim();
				int telefono = Integer.parseInt(datos[1].trim());
				double peso = Double.parseDouble(datos[2].trim());
				addPersona(nombre, telefono, peso);
				personaCount++;
			}
			return lineas.size();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}
}