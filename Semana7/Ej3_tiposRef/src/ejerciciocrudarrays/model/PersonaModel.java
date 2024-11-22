package ejerciciocrudarrays.model;

public class PersonaModel {
    
	private final int MAX_SIZE = 5;
    private  Persona[] personas = new Persona[MAX_SIZE];
	
	private int personaCount = 0;

	public int getPersonaCount() {
		return personaCount;
	}

	public int getMAX_SIZE() {
		return MAX_SIZE;
	}

	public Persona[] getPersonas() {
		return personas;
	}


	public String getEstadoComoString(int i) {
		if (personaCount > 0) {
			if (personas[i] != null) {
				return personas[i].getNombre() + ", " + personas[i].getEdad() + ", " + personas[i].getAltura();
			}
		}
		return "No personas available";
	}

	public boolean eliminarPersona(String nombre) {

		for (int i = 0; i < personas.length; i++) {
			if (personas[i] != null && personas[i].getNombre().equals(nombre)) {
				for (int j = i; j < personas.length - 1; j++) {
					personas[j] = personas[j + 1];
				}
				personas[personas.length - 1] = null;
				personaCount--;
				return true;
			}
		}
		return false;
	}

	public void addPersona(String nombre, int edad, double altura) {
		personas[personaCount] = new Persona(nombre, edad, altura);
		personaCount++;
	}
}