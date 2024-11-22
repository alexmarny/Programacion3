package ejerciciocrudarrays.controller;
import ejerciciocrudarrays.view.vistaRef;
import ejerciciocrudarrays.model.PersonaModel;
import ejerciciocrudarrays.model.Persona;


public class ControllerRef {

	vistaRef vistaRef;
	PersonaModel Persona;

	public ControllerRef(vistaRef vistaRef, PersonaModel Persona) {
		this.vistaRef = vistaRef;
		this.Persona = Persona;
			
		this.vistaRef.setControllerRef(this);
	}



	public void run() {
	
		vistaRef.mostrarMenu();
	}



	public int getMaxSize() {

		return Persona.getMAX_SIZE();
	}



	public void setPersona(String nombre, int edad, double altura) {
		
		Persona.addPersona(nombre, edad, altura);
	}



	public int getPersonaCount() {

		return Persona.getPersonaCount();
	}


	public Persona[] getPersonas() {

		return Persona.getPersonas();
	}



	public boolean eliminarPersona(String nombre) {

		return Persona.eliminarPersona(nombre);
	}



	public String getEstadoComoString(int i) {

		return Persona.getEstadoComoString(i);
	}	

}