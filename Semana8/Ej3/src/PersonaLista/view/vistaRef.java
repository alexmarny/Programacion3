package PersonaLista.view;

import java.nio.file.Path;

import com.coti.tools.Esdia;
import com.coti.tools.Rutas;

import PersonaLista.controller.ControllerRef;

public class vistaRef {

	private ControllerRef Controller;
        
	private String nombreArchivo;
	private Path rutaArchivoConBiblioteca;

	public void showMenu() {
		System.out.println("1. Cargar personas desde archivo");
		System.out.println("2. Mostrar personas en forma tabular");
		System.out.println("3. Salir");

		int opcion = Esdia.readInt("Introduce una opcion: ");

		switch (opcion) {
		case 1:
			cargarPersonas();
			break;
		case 2:
			mostrarPersonas();
			break;
		case 3:
			boolean salir = Esdia.yesOrNo("¿Seguro que quieres salir? (s/n): ");
			if (salir) {
				System.out.println("Saliendo...");
				System.exit(0);
			}
			break;
		default:
			System.out.println("Opcion no valida");
			break;
		}
	}

	public void mostrarPersonas() {
		System.out.printf("%-20s\t%-15s\t%-10s\n", "Nombre", "Apellido", "Edad");
		System.out.println("-------------------------------------------------");
		for (int i = 0; i < Controller.getPersonaCount(); i++) {
			System.out.println(Controller.getEstadoComoString(i));
		}
	}

	public vistaRef() {
		this.nombreArchivo = Esdia.readString("Introduce el nombre del archivo: ");
		this.rutaArchivoConBiblioteca = Rutas.pathToFileOnDesktop(nombreArchivo);
	}

	public void cargarPersonas() {
		Controller.cargarPersonasDesdeArchivo(rutaArchivoConBiblioteca);
	}

	public void setControllerRef(ControllerRef controllerRef) {
		this.Controller = controllerRef;
	}


	
}



