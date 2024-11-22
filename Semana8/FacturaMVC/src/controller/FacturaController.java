package controller;

import java.util.List;

import model.Factura;
import model.FacturaModel;
import view.FacturasView;

public class FacturaController {

	FacturasView view;
	FacturaModel model;
	
	public FacturaController(FacturaModel model, FacturasView view) {
	
		this.model = model;
		this.view = view;

		this.view.setControllerRef(this);
	}

	public List<Factura> getFacturas() {

		return model.getFacturas();
	}

	public int cargarFacturasDesdeArchivo() {

		return model.cargarFacturasDesdeArchivo();
	}

	public void exportarFacturasCsv() {

		model.exportarFacturasACsv();
	}

	public void exportarFacturasHtml() {

		model.exportarFacturasAHtml();
	}

	public void run() {

		view.showMenu();
	}

}
