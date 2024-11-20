package concesionario;

import modelo.Coche;
import com.coti.tools.Esdia;
import java.util.ArrayList;

public class Concesionario {

	public static void main(String[] args) {

		boolean flag = false;
		boolean decision = false, salir = false;
		String matricula = null;

		bienvenida();

		ArrayList<Coche> coches = abrirConcesionario();

		while (!flag) {
			System.out.println("\n ");

			matricula = Esdia.readString_ne("Por favor, introduzca la matricula del coche: ");
			decision = Esdia.yesOrNo("¿Desea incluir el resto de información del coche?");

			if (!decision) {
				Coche coche = new Coche(matricula);
				coches.add(coche);
			} else {
				String marca = Esdia.readString_ne("Por favor, introduzca la marca del coche: ");
				String modelo = Esdia.readString_ne("Por favor, introduzca el modelo del coche: ");
				int anio = Esdia.readInt("Por favor, introduzca el año de fabricación del coche: ");
				double precioSinIVA = Esdia.readDouble("Por favor, introduzca el precio sin iva del coche: ");

				Coche coche = new Coche(modelo, marca, matricula, anio, precioSinIVA);
				coches.add(coche);
			}
			salir = Esdia.yesOrNo("¿Desea Salir?");
			if (salir) {
				flag = true;
			}
		}

		System.out.println("\n\n\tCATALOGO DE AUTOS-SALAMANCA");
		System.out.println("\t---------------------------\n\n ");
		System.out.println("Marca \t\tModelo \t\tMatricula \t\tAño \t\tPrecio con IVA");

		for (Coche coche : coches) {
			System.out.printf("%-15s %-15s %-10s \t\t%-15d %-15.2f%n", coche.getMarca(), coche.getModelo(), coche.getMatricula(), coche.getAnio(), coche.getPrecioConIVA());
		}
	}

	private static ArrayList<Coche> abrirConcesionario() {
		return new ArrayList<>();
	}

	private static void bienvenida() {
		System.out.println("\t-----------------------------\n ");
		System.out.println("\tBIENVENIDOS A AUTOS-SALAMANCA");
		System.out.println("\t-----------------------------\n ");
	}
}
