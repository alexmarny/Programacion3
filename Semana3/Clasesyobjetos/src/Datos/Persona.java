package Datos;

public class Persona {

	// Atributos

	private String nombre;
	private String peso;
	private String altura;

	// Constructor con parametros

	public Persona(String nombre, String peso, String altura) {
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
	}

	//Metodos

	public static String getMayorPeso(Persona[] personas) {
		String mayorPeso = "";
		double peso = 0;
		for (int i = 0; i < personas.length; i++) {
			if (Double.parseDouble(personas[i].getPeso()) > peso) {
				peso = Double.parseDouble(personas[i].getPeso());
				mayorPeso = personas[i].getNombre();
			}
		}
		return mayorPeso;
	}

	public static String getMayorAltura(Persona[] personas) {
		String mayorAltura = "";
		double altura = 0;
		for (int i = 0; i < personas.length; i++) {
			if (Double.parseDouble(personas[i].getAltura()) > altura) {
				altura = Double.parseDouble(personas[i].getAltura());
				mayorAltura = personas[i].getNombre();
			}
		}
		return mayorAltura;
	}


	//getter y setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}

	
}
