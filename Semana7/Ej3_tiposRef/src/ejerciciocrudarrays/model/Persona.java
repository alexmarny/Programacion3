package ejerciciocrudarrays.model;

public class Persona {
	private String nombre;
    private int edad;
    private double altura;

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
	
    public String getEstadoComoString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + "]";
    }

	public int getEdad() {
		return edad;
	}

	public double getAltura() {
		return altura;
	}

}
