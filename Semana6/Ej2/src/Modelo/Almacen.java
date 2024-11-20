package Modelo;
import java.util.ArrayList;


public class Almacen {

	private ArrayList<Libros> libros;
	private ArrayList<Autor> autores;

	public Almacen() {
		libros = new ArrayList<>();
		autores = new ArrayList<>();
	}

	public ArrayList<Libros> getLibros() {
		return libros;
	}

	public ArrayList<Autor> getAutores() {
		return autores;
	}

	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}

	public void setLibro(Libros libro, Autor autor) {
		libros.add(libro);
		autores.add(autor);
	}

	public Autor getAutor(Libros libro) {
		int index = libros.indexOf(libro);
		if (index != -1) {
			return autores.get(index);
		}
		return null;
	}
}
