package almacenmvc.controller;

import almacenmvc.model.almacenModel;
import almacenmvc.view.almacenView;

public class almacenController {

	almacenView view;
	almacenModel model;

	public almacenController(almacenView view, almacenModel model) {
		this.view = view;
		this.model = model;

		this.view.setController(this);
	}

	public void leerTablaVentas() {
		model.leerTablaVentas();
	}

	public void leerTablaPrecios() {
		model.leerTablaPrecios();
	}

	public void calcularIngresosTotales() {
		model.calcularIngresosTotales();
	}

	public void mostrarResultados() {
		model.mostrarResultados();
	}

	public void run() {
		view.showMenu();
	}



}
