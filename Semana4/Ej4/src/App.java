import java.util.Scanner;
import Datos.Alumno;
import com.coti.tools.Esdia;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numAlumnos = Esdia.readInt("Ingrese el número de alumnos: ");
		

		Alumno[] alumnos = new Alumno[numAlumnos];

		for (int i = 0; i < numAlumnos; i++) {
			System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
			String nombre = scanner.nextLine();

			System.out.print("Ingrese la nota del primer parcial: ");
			double parcial1 = scanner.nextDouble();

			System.out.print("Ingrese la nota del segundo parcial: ");
			double parcial2 = scanner.nextDouble();

			System.out.print("Ingrese la nota del examen final: ");
			double finalExam = scanner.nextDouble();
			scanner.nextLine(); // Consume newline

			alumnos[i] = new Alumno(nombre, parcial1, parcial2, finalExam);
		}

		System.out.println("\nCalificaciones:");
		System.out.printf("%-12s%-10s%-10s%-14s%-10s\n", "Nombre", "Parcial 1", "Parcial 2", "Examen Final", "Nota Final");
		double sumaParcial1 = 0, sumaParcial2 = 0, sumaFinalExam = 0, sumaNotaFinal = 0;

		for (Alumno alumno : alumnos) {
			System.out.printf("%-12s%-10.2f%-10.2f%-14.2f%-10.2f\n", alumno.getNombre(), alumno.getParcial1(),
					alumno.getParcial2(), alumno.getFinalExam(), alumno.getNotaFinal());
			sumaParcial1 += alumno.getParcial1();
			sumaParcial2 += alumno.getParcial2();
			sumaFinalExam += alumno.getFinalExam();
			sumaNotaFinal += alumno.getNotaFinal();
		}

		double mediaParcial1 = sumaParcial1 / numAlumnos;
		double mediaParcial2 = sumaParcial2 / numAlumnos;
		double mediaFinalExam = sumaFinalExam / numAlumnos;
		double mediaNotaFinal = sumaNotaFinal / numAlumnos;

		System.out.println("\nMedias:");
		System.out.println("Parcial 1: " + mediaParcial1);
		System.out.println("Parcial 2: " + mediaParcial2);
		System.out.println("Examen Final: " + mediaFinalExam);
		System.out.println("Nota Final: " + mediaNotaFinal);

		scanner.close();
	}
}