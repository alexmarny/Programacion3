import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Introduce tu nombre: ");
	String nombre = scanner.nextLine();

	System.out.print("Introduce tus apellidos: ");
	String apellidos = scanner.nextLine();

	int longitudNombre = nombre.length();
	int longitudApellidos = apellidos.length();
	int longitudTotal = Math.max(longitudNombre, longitudApellidos) + 4;

	

	for (int i = 0; i < (longitudTotal * 2) + 7; i++) {
		System.out.print("*");
	}

	System.out.println();
	System.out.printf("* %-"+longitudTotal+"s * %-"+longitudTotal+"s *\n", "Nombre", "Apellidos");
	
	System.out.printf("* %-"+longitudTotal+"s * %-"+longitudTotal+"s *\n", nombre, apellidos);
	

	scanner.close();
    }
}
