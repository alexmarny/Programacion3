package model;
import java.io.Serializable;


class Libro implements Serializable {
	private String titulo;
	private String autor;
	private String isbn;

	
	public Libro(String titulo, String autor, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}

	@Override

	public String toString() {
		return "Libro [autor=" + autor + ", isbn=" + isbn + ", titulo=" + titulo + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}