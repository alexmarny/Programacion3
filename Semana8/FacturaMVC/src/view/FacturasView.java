package view;

import java.util.List;
import com.coti.tools.Esdia;
import model.Factura;
import model.FacturaModel;
import controller.FacturaController;

public class FacturasView {

	FacturaController controller;

	int facturasLeidas = controller.cargarFacturasDesdeArchivo();

	public void mostrarFacturas(List<Factura> facturas) {
		for (Factura factura : facturas) {
			System.out.println(factura.GetFacturaAsDelimitedString(";"));
		}
	}

	public void leerValorFacturasMinimo() {
		List<Factura> facturas = controller.getFacturas();
		double valorMinimo = Esdia.readDouble("Introduce el valor minimo de las facturas a mostrar: ");

		List<String> clientes = FacturaModel.obtenerClientesConFacturasMayores(facturas, valorMinimo);
		System.out.println("Clientes con facturas mayores a 1000 euros:");
		for(String cliente : clientes){
			System.out.println(cliente);
		}

	}

	public static void mostrarClientes(List<String> clientes) {
		System.out.println("Clientes con facturas mayores a 1000 euros:");
		for (String cliente : clientes) {
			System.out.println(cliente);
		}
	}

	public void setControllerRef(FacturaController FacturaController) {
		
		this.controller = FacturaController;

	}

	public void showMenu() {

		boolean salir = false;

		while (!salir) {

			System.out.println("1. Mostrar facturas");
			System.out.println("2. Mostrar clientes con facturas mayores a 1000 euros");
			System.out.println("3. Exportar a .html simple");
			System.out.println("4. Exportar a .csv");
			System.out.println("5. Salir");

			int opcion = Esdia.readInt("Introduce una opcion: ");

			switch (opcion) {
			case 1:
				mostrarFacturas(controller.getFacturas());
				break;
			case 2:
				leerValorFacturasMinimo();
				break;
			case 3:
				controller.exportarFacturasHtml();
				break;
			case 4:
				controller.exportarFacturasCsv();
				break;
			case 5:
				salir = true;
				break;
			default:
				System.out.println("Opcion no valida");
			}

		}
	}

}
