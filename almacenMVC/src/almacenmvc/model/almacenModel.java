package almacenmvc.model;

public class almacenModel {

	public void leerTablaVentas() {
		System.out.println("Leyendo tabla de ventas...");
		for (int i = 0; i < tablaVentas.length; i++) {
			for (int j = 0; j < tablaVentas[i].length; j++) {
				getTablaVentas(i, j);
			}
			System.out.println();
		}
	}

	public void leerTablaPrecios() {
		System.out.println("Leyendo tabla de precios...");
		for (int i = 0; i < tablaPrecios.length; i++) {
			for (int j = 0; j < tablaPrecios[i].length; j++) {
				getTablaPrecios(i, j);
			}
			System.out.println();
		}
	}

	public int calcularIngresosTotales() {
		int ingresosTotales = 0;
		for (int i = 0; i < tablaVentas.length; i++) {
			for (int j = 0; j < tablaVentas[i].length; j++) {
				ingresosTotales += (getTablaVentas(i, j) * getTablaPrecios(i, j));
			}
		}
		return ingresosTotales;
	}

	public int tablaVentas[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	public int tablaPrecios[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

	public int getTablaVentas(int i, int j) {

		return tablaVentas[i][j];
	}

	public int getTablaPrecios(int i, int j) {
		return tablaPrecios[i][j];
	}


}
