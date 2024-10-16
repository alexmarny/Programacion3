import Datos.Producto;
import Datos.Cliente;
import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {

		Producto peras = new Producto();

		peras.setNombre("Peras");

		String promtPeras = "Introduzca el precio de las peras hoy \n";

		peras.setPrecioKgSinIva(Esdia.readFloat(promtPeras));

		Producto manzanas = new Producto();

		String promptmanzanas = "Introduzca el precio de las manzanas hoy \n";

		manzanas.setNombre("Manzanas");

		manzanas.setPrecioKgSinIva(Esdia.readFloat(promptmanzanas));

		
		Cliente[] clientes = new Cliente[100];

		int cuentaClientes = 0;

		while (true) {
			int opcion = Esdia.readInt("\nIntroduzca 1 para añadir un cliente, 2 para mostrar los clientes y 3 para salir \n");

			if (opcion == 1) {
				Cliente cliente = new Cliente();

				cliente.setKgManzanas(Esdia.readInt("Introduzca los kg de manzanas \n"));
				cliente.setKgPeras(Esdia.readInt("Introduzca los kg de peras \n"));

				clientes[cuentaClientes] = cliente;

				cuentaClientes++;
			} else if (opcion == 2) {
				for (int i = 0; i < cuentaClientes; i++) {
					Cliente cliente = clientes[i];

					Double precioManzanas = manzanas.calcularPrecioConIva() * cliente.getKgManzanas();
					Double precioPeras = peras.calcularPrecioConIva() * cliente.getKgPeras();
					Double precioTotal = precioManzanas + precioPeras;

					System.out.printf("|---------------------------------------------------|\n");
					System.out.printf("|%-47s|%2d |\n", "cliente", i + 1);
					System.out.printf("|---------------------------------------------------|\n");
					System.out.printf("| Manzanas |%2d kg |  Precio Kg + IVA %7.2f|%7.2f|\n", cliente.getKgManzanas(), manzanas.calcularPrecioConIva(), precioManzanas);
					System.out.printf("| Peras    |%2d kg |  Precio Kg + IVA %7.2f|%7.2f|\n", cliente.getKgPeras(), peras.calcularPrecioConIva(), precioPeras);	
					System.out.printf("|---------------------------------------------------|\n");
					System.out.printf("|%-43s|%7.2f|\n","Total con IVA", precioTotal);
					System.out.printf("|---------------------------------------------------|\n");

					}
				} else if (opcion == 3) {
					break;
				} else {
					System.out.println("Opción no válida");
				}
							
		} 
	}
}

