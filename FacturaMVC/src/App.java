import java.util.List;

import model.Factura;
import model.FacturaModel;

public class App {

	public static void main(String[] args) {
		

		FacturaModel model = new FacturaModel();
		int facturasLeidas = model.cargarFacturasDesdeArchivo();

		System.out.printf("Se han leido %d facturas\n", facturasLeidas);

		List<Factura> facturas = model.getFacturas();
		for(Factura factura : facturas){
			System.out.println(factura.GetFacturaAsDelimitedString(";"));
		}

	
	}
}
