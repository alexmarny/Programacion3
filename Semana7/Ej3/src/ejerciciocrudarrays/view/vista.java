package ejerciciocrudarrays.view;
import java.util.Arrays;

import com.coti.tools.Esdia;

import ejerciciocrudarrays.controller.controller;



public class vista {

	controller controlador;

	
	
	public void mostrarMenu() {
		boolean salir = false;


        while(!salir) {
            System.out.println("\n--- MENU CRUD ---");
            System.out.println("1. Agregar número");
            System.out.println("2. Eliminar número");
            System.out.println("3. Modificar número");
            System.out.println("4. Listar números");
            System.out.println("5. Salir");
            int opcion = Esdia.readInt("Ingrese una opción: ");

            switch (opcion) {
                case 1: agregarNumero(); break;
                case 2: eliminarNumero(); break;
                case 3: modificarNumero(); break;
                case 4: listarNumeros(); break;
                case 5: salir = true; break;
                default: System.out.println("Opción no válida.");
            }
        } 
    }

	public void agregarNumero() {
        if (controlador.getNumCount() < controlador.getMaxSize()) {
            int num = Esdia.readInt("Ingrese el número:");
            controlador.setNum(num);
        } else {
            System.out.println("Array de números está lleno.");
        }
    }

	public void modificarNumero() {
        
        int num = Esdia.readInt("Ingrese el número a modificar: ");
        boolean encontrado = false;
        for (int i = 0; i < controlador.getNumCount(); i++) {
            if (controlador.getNumeros()[i] == num) {
                int nuevoNum = Esdia.readInt("Ingrese el nuevo número: ");
                controlador.cambiarNumero(i, nuevoNum);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Número no encontrado.");
        }
	}

	public void eliminarNumero() {
        if (controlador.getNumCount() == 0) {
            System.out.println("No hay números para eliminar.");
            return;
        }
        int num = Esdia.readInt("Ingrese el número a eliminar:");
        boolean encontrado = controlador.eliminarNumero(num);
        if (!encontrado) {
            System.out.println("Número no encontrado.");
        }
	}


	public void listarNumeros() {
        int[] numeros = controlador.getNumeros();
        if (controlador.getNumCount() == 0) {
            System.out.println("No hay números para listar.");
        } else {
            System.out.println("Números: " + Arrays.toString(numeros));
        }
	}
        
  

	public void setController(controller controlador) {
		this.controlador = controlador;
	}
}


