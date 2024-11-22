package PersonaLista.controller;
import java.nio.file.Path;

import PersonaLista.model.Persona;
import PersonaLista.model.PersonaModel;
import PersonaLista.view.vistaRef;


public class ControllerRef {

	vistaRef vistaRef;
	PersonaModel Persona;

	public ControllerRef(vistaRef vistaRef, PersonaModel Persona) {
		this.vistaRef = vistaRef;
		this.Persona = Persona;
			
		this.vistaRef.setControllerRef(this);
	}

	public void run() {
		vistaRef.showMenu();
	}

	public void setPersona(String nombre, int Telefono, double Peso) {
		
		Persona.addPersona(nombre, Telefono, Peso);
	}



	public int getPersonaCount() {

		return Persona.getPersonaCount();
	}


	public Persona[] getPersonas() {

		return Persona.getPersonas().toArray(new Persona[0]);
	}



	public boolean eliminarPersona(String nombre) {

		return Persona.eliminarPersona(nombre);
	}



	public String getEstadoComoString(int i) {

		return Persona.getEstadoComoString(i);
	}	

	public void cargarPersonasDesdeArchivo(Path rutaArchivoConBiblioteca) {
		
		Persona.cargarPersonasDesdeArchivo(rutaArchivoConBiblioteca);
	}

}