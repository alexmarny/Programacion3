package Datos;

public class Producto {

	private String nombre;
	private Float precioKgSinIva;
	private int cantidad;

	public final Double IVA = 0.21;

	public Producto(String nombre, Float precioKgSinIva, int cantidad) {
		this.nombre = nombre;
		this.precioKgSinIva = precioKgSinIva;
		this.cantidad = cantidad;
	}

	

	
	


}
