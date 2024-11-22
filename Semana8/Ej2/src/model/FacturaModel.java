package model;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import com.coti.tools.Rutas;

public class FacturaModel {

	private List<Factura> facturas;
	private Path rutaArchivo = Rutas.pathToFileOnDesktop("facturas.tsv");

	public FacturaModel(){
		this.facturas = new ArrayList<>();
	}

	/*
	 * Carga facturas desde archivo TSV (Facturas.tsv)
	 */
	public int cargarFacturasDesdeArchivo(){
		
		//leer todas las lineas del fichero

		List<String> lineas = null;

		try {
			lineas = Files.readAllLines(rutaArchivo, StandardCharsets.UTF_8);
			int lineasCorrectas = 0;

			for(String linea : lineas){
				String[] campos = linea.split("\t");
				if(campos.length == 8){
					Factura factura = Factura.GetFacturaFromString(linea, "\t");
					if(factura != null){
						facturas.add(factura);
						lineasCorrectas++;
					}
				}
			} return lineasCorrectas;

		} catch (IOException e) {
			System.out.println("Error al leer el archivo de facturas");
			return -1;
		}

	}

	public List<Factura> getFacturas() {
		return facturas;
	}

	public static List<String> obtenerClientesConFacturasMayores(List<Factura> facturas, double valorMinimo) {
		List<String> clientes = new ArrayList<>();
		for (Factura factura : facturas) {
			if (factura.getImporte() > valorMinimo) {
				clientes.add(factura.getNombreCliente());
			}
		}
		return clientes;
	}

	public void exportarFacturasACsv() {

		List<String> lineas = new ArrayList<>();
		for(Factura factura : facturas){
			lineas.add(factura.GetFacturaAsDelimitedString(";"));
		}

		try {
			Files.write(Rutas.pathToFileOnDesktop("facturas.csv"), lineas, StandardCharsets.UTF_8);
		} catch (IOException e) {
			System.out.println("Error al escribir el archivo de facturas");
		}
	}

	public void exportarFacturasAHtml() {

		List<String> lineas = new ArrayList<>();
		lineas.add("<html>");
		lineas.add("<head>");
		lineas.add("<title>Facturas</title>");
		lineas.add("</head>");
		lineas.add("<body>");
		lineas.add("<table border='1'>");
		lineas.add("<tr>");
		lineas.add("<th>Concepto</th>");
		lineas.add("<th>Descuento</th>");
		lineas.add("<th>Fecha</th>");
		lineas.add("<th>Importe</th>");
		lineas.add("<th>Nombre Cliente</th>");
		lineas.add("<th>NIF</th>");
		lineas.add("<th>Direccion</th>");
		lineas.add("<th>IVA</th>");
		lineas.add("</tr>");

		for(Factura factura : facturas){
			lineas.add("<tr>");
			lineas.add("<td>" + factura.getConcepto() + "</td>");
			lineas.add("<td>" + factura.getDescuento() + "</td>");
			lineas.add("<td>" + factura.getFecha() + "</td>");
			lineas.add("<td>" + factura.getImporte() + "</td>");
			lineas.add("<td>" + factura.getNombreCliente() + "</td>");
			lineas.add("<td>" + factura.getNif() + "</td>");
			lineas.add("<td>" + factura.getDireccion() + "</td>");
			lineas.add("<td>" + factura.getIva() + "</td>");
			lineas.add("</tr>");
		}

		lineas.add("</table>");
		lineas.add("</body>");
		lineas.add("</html>");

		try {
			Files.write(Rutas.pathToFileOnDesktop("facturas.html"), lineas, StandardCharsets.UTF_8);
		} catch (IOException e) {
			System.out.println("Error al escribir el archivo de facturas");
		}
	}

}
