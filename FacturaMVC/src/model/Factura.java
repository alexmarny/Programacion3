package model;

import java.util.Locale;

public class Factura {

	private String concepto;
	private double descuento;
	private String fecha;
	private double importe;
	private String nombreCliente;
	private String nif;
	private String direccion;
	private double iva;

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public Factura(String concepto, double descuento, String fecha, double importe, String nif, String nombreCliente, 
			String direccion, double iva) {
		this.concepto = concepto;
		this.descuento = descuento;
		this.fecha = fecha;
		this.importe = importe;
		this.nif = nif;
		this.nombreCliente = nombreCliente;
		this.direccion = direccion;
		this.iva = iva;
	}

	//Factory Method (Factura)
	//Venta de equipos 0.05 2020-01-01 1000.0 Juan 12345678A Calle Falsa 123 0.21
	// ----->>>> new Factura()

	public static Factura GetFacturaFromString(String facturaString, String delimitador){

		try{

			String[] datos = facturaString.split(delimitador);

			if(datos.length == 8){
				String concepto = datos[0];
				double descuento = Double.parseDouble(datos[1]);
				String fecha = datos[2];
				double importe = Double.parseDouble(datos[3]);
				String nif = datos[4];
				String nombreCliente = datos[5];
				String direccion = datos[6];
				double iva = Double.parseDouble(datos[7]);

				return new Factura(concepto, descuento, fecha, importe, nombreCliente, nif, direccion, iva);
				
			} else {return null;}

		} catch (Exception e){
			System.out.println("Error al crear la factura");
			return null;
		}
	}

	public String GetFacturaAsDelimitedString(String delimitador){
		return String.format(Locale.ENGLISH, "%s%s%f%s%s%s%f", concepto, delimitador, descuento, delimitador, fecha, delimitador, importe, delimitador, nombreCliente, delimitador, nif, delimitador, direccion, delimitador, iva);
	}

}
