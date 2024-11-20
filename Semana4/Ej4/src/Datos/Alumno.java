package Datos;

public class Alumno {
	private String nombre;
	private double parcial1;
	private double parcial2;
	private double finalExam;
	private double notaFinal;

	public Alumno(String nombre, double parcial1, double parcial2, double finalExam) {
		this.nombre = nombre;
		this.parcial1 = parcial1;
		this.parcial2 = parcial2;
		this.finalExam = finalExam;
		this.notaFinal = (parcial1 * 0.1) + (parcial2 * 0.1) + (finalExam * 0.8);
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getParcial1() {
		return parcial1;
	}

	public void setParcial1(double parcial1) {
		this.parcial1 = parcial1;
	}

	public double getParcial2() {
		return parcial2;
	}

	public void setParcial2(double parcial2) {
		this.parcial2 = parcial2;
	}

	public double getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(double finalExam) {
		this.finalExam = finalExam;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
}


