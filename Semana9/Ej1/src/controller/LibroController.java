package controller;
import view.LibroView;
import model.LibroModel;

public class LibroController {
	LibroModel model;
	LibroView view;

	public LibroController(LibroModel model, LibroView view) {
		this.model = model;
		this.view = view;

		this.view.setController(this);
	}

	public void run() {

		view.mostrarMenu();
	}

	public void mostrarLibrosTabla() {

		model.mostrarLibrosTabla();
	}

	public void addLibro(String titulo, String autor, String isbn) {
		model.addLibro(titulo, autor, isbn);
	}

	public void removeLibro(String nombre) {
		
		model.removeLibro(nombre);
	}

	public boolean updateLibro(String nombreModificar) {

		return model.updateLibro(nombreModificar);
	}

	public void exportLibrosCSV() {
	
		model.exportLibrosCSV();
	}

	public void exportLibrosJSON() {
		
		model.exportLibrosJSON();
	}

	public void exportLibrosXML() {
	
		model.exportLibrosXML();
	}

	public void importLibrosJSON() {
		
		model.importLibrosJSON();
	}

	public void importLibrosXML() {
		
		model.importLibrosXML();
	}

	public void importLibrosCSV() {
		
		model.importLibrosCSV();
	}

	public void guardarLibros() {
		
		model.guardarLibros();
	}
	
}
