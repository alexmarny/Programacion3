package almacenMVC.model;ç
import java.util.ArrayList;

public class modelo {

	private static ArrayList<Integer> tablaVentas = new ArrayList<Integer>();
	private static ArrayList<Integer> tablaPrecios = new ArrayList<Integer>();
	private static int ingresosTotales = 0;

	public static void leerTablaVentas() {
	
	}

	public static void leerTablaPrecios() {
		
	}

	public static void calcularIngresosTotales() {
		for (int i = 0; i < tablaVentas.size(); i++) {
			ingresosTotales += tablaVentas.get(i) * tablaPrecios.get(i);
		}
	}

	public static int getIngresosTotales() {
		return ingresosTotales;
	}



}
