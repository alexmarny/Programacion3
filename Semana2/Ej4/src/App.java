import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Introduce tu edad: ");
	int edad = scanner.nextInt();

	scanner.nextLine(); // Limpiar el buffer

	System.out.print("Introduce tu nombre: ");
	String nombre = scanner.nextLine();

	System.out.println("Edad: " + edad);
	System.out.println("Nombre: " + nombre);

	scanner.close();
    }
}
