package model;

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

	// Constructor sin parametros

	public Persona() {
		this.nombre = "Alejandro";
		this.peso = "80";
		this.altura = "175";
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

	public static String cacularIMC(Persona persona){

		if(persona.getNombre().equals("")||persona.getPeso() == null || persona.getAltura() == null){
			return "Faltan datos";
		}
		
		try {
			double peso = Double.parseDouble(persona.getPeso());
			double altura = Double.parseDouble(persona.getAltura());

			double imc = peso / ((altura * altura)/10000);

			return "El IMC de " + persona.getNombre() + " es: " + imc;
		} catch (NumberFormatException e) {
			return "El peso o la altura no son números válidos";
		}
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
