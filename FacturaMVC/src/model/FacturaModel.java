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

}
