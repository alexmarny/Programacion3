package PersonaLista.model;

public class Persona {
	private String nombre;
    private int telefono;
	private double peso;

	public Persona(String nombre, int telefono, double peso) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getTelefono() {
		return telefono;
	}




	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}




	public double getPeso() {
		return peso;
	}




	public void setPeso(double peso) {
		this.peso = peso;
	}

    public String getEstadoComoString() {
		return "Nombre: " + nombre + ", Telefono: " + telefono + ", Peso: " + peso;
    }

	

	

}
