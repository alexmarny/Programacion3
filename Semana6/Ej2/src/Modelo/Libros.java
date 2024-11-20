package Modelo;

public class Libros {

	private String titulo;
	private String autor;
	private int añoDePublicacion;
	private int numeroDePaginas;
	private int precio;

	public Libros(String titulo, String autor, int añoDePublicacion, int numeroDePaginas, int precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.añoDePublicacion = añoDePublicacion;
		this.numeroDePaginas = numeroDePaginas;
		this.precio = precio;
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

	public int getAñoDePublicacion() {
		return añoDePublicacion;
	}

	public void setAñoDePublicacion(int añoDePublicacion) {
		this.añoDePublicacion = añoDePublicacion;
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}


	


}
