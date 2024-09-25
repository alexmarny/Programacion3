import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Escriba su año de nacimiento:");
		Scanner scanner = new Scanner(System.in);
		int anoNac = scanner.nextInt();

		System.out.println("introduzca el año actual:");
		int anoAct = scanner.nextInt();
		scanner.close();

		int edad = anoAct - anoNac;
		System.out.println("Su edad es: " + edad);
    }
}
