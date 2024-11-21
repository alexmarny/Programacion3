package almacenMVC.view;
import com.coti.tools.Esdia;

import almacenMVC.controller.controller;

public class vista {

	public void mostrarMenu() {
		
		System.out.println("1.- Leer tabla de ventas");	
		System.out.println("2.- Leer tabla de precios");
		System.out.println("3.- Calcular ingresos totales");
		System.out.println("4.- Mostrar resultados");
		System.out.println("5.- Salir");

		boolean salir = false;

		while (!salir) {
			int opcion = Esdia.readInt("Introduce una opcion: ");
			switch (opcion) {
			case 1:
				controller.leerTablaVentas();
				break;
			case 2:
				controller.leerTablaPrecios();
				break;
			case 3:
				controller.calcularIngresosTotales();
				break;
			case 4:
				mostrarResultados();
				break;
			case 5:
				salir = true;
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		}
	}

	public static void mostrarResultados() {
	}



	

}
