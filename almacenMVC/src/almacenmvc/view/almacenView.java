package almacenmvc.view;

import com.coti.tools.Esdia;

import almacenmvc.controller.almacenController;

public class almacenView {

	almacenController controller;

	public void showMenu() {

		boolean salir = false;

		while (!salir){
		System.out.println("1. Leer tabla de ventas");
		System.out.println("2. Leer tabla de precios");
		System.out.println("3. Calcular ingresos totales");
		System.out.println("4. Mostrar resutados");
		System.out.println("5. Salir");

		int opcion = Esdia.readInt("Introduce una opcion: ");

		switch (opcion) {
		
		case 1:
			leerTablaVentas();
			break;
		case 2:
			leerTablaPrecios();
			break;
		case 3:
			calcularIngresosTotales();
			break;
		case 4:
			mostrarResultados();
			break;
		case 5:
			salir = true;
			break;
		}

	}
}

public void leerTablaVentas() {
	controller.leerTablaVentas();
}

public void leerTablaPrecios() {
	controller.leerTablaPrecios();
}


public void calcularIngresosTotales() {
	controller.calcularIngresosTotales();
}

public void mostrarResultados() {
	controller.mostrarResultados();
}

public void setController(almacenController almacenController) {
	this.controller = almacenController;	
}

}
