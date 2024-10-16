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

	public Producto() {
		this.nombre = "";
		this.precioKgSinIva = 0.0f;
		this.cantidad = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public Float getPrecioKgSinIva() {
		return precioKgSinIva;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecioKgSinIva(Float precioKgSinIva) {
		this.precioKgSinIva = precioKgSinIva;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double calcularPrecioConIva() {
		return precioKgSinIva * (1 + IVA);
	}


	

	
	


}

