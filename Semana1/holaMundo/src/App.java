
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

		Scanner scanRef = new Scanner(System.in);
		String frase = "Hola, Mundo!";
		int[] num = new int[3];
		

        System.out.println("Hello, World!");
		System.out.printf("%S hoy es  %d / %d / %d \n", frase, 18, 9 , 2024);
		System.out.println("Ingrese su nombre: ");
		String nombre = scanRef.nextLine();
		System.out.println("Escriba su edad: ");
		int edad = scanRef.nextInt();

		System.out.println("su nombre es: " + nombre + " y su edad es: " + edad);
		System.out.println("A continuacion se le pediran 3 numeros" + "\nSe le dira el mayor y el meno de ellos");

		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese el numero " + (i + 1) + ": ");
			int entrada = scanRef.nextInt();
			if (i == 0) {
				num[i] = entrada;
			} else if (i == 1) {
				num[i] = entrada;
			} else {
				num[i] = entrada;
			}
		}
		
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}

		System.out.println("El numero menor es: " + num[0]);
		System.out.println("El numero mayor es: " + num[num.length - 1]);

    }
}
