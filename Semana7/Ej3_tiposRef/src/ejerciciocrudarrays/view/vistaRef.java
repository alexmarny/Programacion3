package ejerciciocrudarrays.view;

import static com.coti.tools.Esdia.*;

import ejerciciocrudarrays.controller.ControllerRef;



public class vistaRef {

	private ControllerRef ControllerRef;
	
	public void mostrarMenu() {
		boolean salir = false;


        while(!salir) {
            System.out.println("\n--- MENU CRUD ---");
            System.out.println("1. Agregar persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Modificar persona");
            System.out.println("4. Listar personas");
            System.out.println("5. Salir");
			
            int opcion = readInt("Ingrese una opción: ");

            switch (opcion) {
				case 1: agregarPersona(); break;
                case 2: eliminarPersona(); break;
                case 3: modificarPersona(); break;
                case 4: listarPersonas(); break;
                case 5: salir = true; break;
                default: System.out.println("Opción no válida.");
            }
        } 
    }

	public void agregarPersona() {
		if (ControllerRef.getPersonaCount() < ControllerRef.getMaxSize()) {
			String nombre = readString_ne("Ingrese el nombre de la persona: ");
			int edad = readInt("Ingrese la edad de la persona: ");
			double altura = readDouble("Ingrese la altura de la persona (ej. 1.75): ");
			ControllerRef.setPersona(nombre, edad, altura);
		} else {
			System.out.println("No se puede agregar más personas. Capacidad máxima alcanzada.");
		}
	}

	public void modificarPersona() {
        
		String nombre = readString_ne("Ingrese el nombre de la persona a modificar: ");

		if(!ControllerRef.eliminarPersona(nombre)) {
			System.out.println("Persona no encontrada.");
			return;
		} else{
		int edad = readInt("Ingrese la nueva edad de la persona: ");
		double altura = readDouble("Ingrese la nueva altura de la persona (ej. 1.75): ");
	
		ControllerRef.setPersona(nombre, edad, altura);}
    
	}

	public void eliminarPersona() {
        String nombre = readString_ne("Ingrese el nombre de la persona a eliminar: ");

		if (ControllerRef.getPersonaCount() == 0) {
			System.out.println("No hay personas para eliminar.");
			return;
		}

		if (ControllerRef.eliminarPersona(nombre)) {
			System.out.println("Persona eliminada.");
		} else {
			System.out.println("Persona no encontrada.");
		}
	}


	public void listarPersonas() {
		if(ControllerRef.getPersonaCount() == 0) {
			System.out.println("No hay personas para mostrar.");
			return;
		}
		
        System.out.println("\n--- Lista de personas ---");
		for (int i = 0; i < ControllerRef.getPersonaCount(); i++) {
			System.out.println("Persona " + (i + 1) + ": " + ControllerRef.getEstadoComoString(i));
		}
	}
        
  

	public void setControllerRef(ControllerRef controllerRef) {
		this.ControllerRef = controllerRef;
	}

	
}



