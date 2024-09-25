
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Escriba u número entero mayor que 0:");
		Scanner scanner = new Scanner(System.in);

		int numero;
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("Eso no es un número entero. Inténtelo de nuevo:");
				scanner.next();
			}
			numero = scanner.nextInt();
			if (numero <= 0) {
				System.out.println("El número debe ser mayor que 0. Inténtelo de nuevo:");
			}
		} while (numero <= 0);
		
		System.out.printf("introduzca %d números de coma flotante\n", numero);

		int i;
		
		float[] numerosFlotantes = new float[numero];

		for(i = 0; i < numero; i++) {
			while (!scanner.hasNextFloat()) {
				System.out.println("Eso no es un número de coma flotante. Inténtelo de nuevo:");
				scanner.next();
			}
			numerosFlotantes[i] = scanner.nextFloat();
		} scanner.close();
	
		System.out.println("Los números introducidos son:");

		for (i = 0; i < numero; i++) {
			System.out.printf("%2.2f ",numerosFlotantes[i]);
		}
		System.out.println();
		scanner.close();
		
	}
}

