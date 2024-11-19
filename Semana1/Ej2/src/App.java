import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int num1 = scanner.nextInt();

		System.out.print("Introduce el segundo número: ");
		int num2 = scanner.nextInt();

		int suma = num1 + num2;
		System.out.println("La suma de ambos números es: " + suma);

		scanner.close();
    }
}
