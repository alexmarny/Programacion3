
import java.util.Scanner;
import java.io.Console;

public class App {

	private static final int TAM = 3;
    public static void main(String[] args) throws Exception {

		Scanner scanRef = new Scanner(System.in);

		Console console = System.console();
		String nombre = console.readLine("Ingrese su nombre: ");
		char[] password = console.readPassword("Ingrese su password: ");

		if(password.length < 8){
			System.out.println("El password debe tener al menos 8 caracteres");
			System.exit(0);
		}

		String frase = "Hola, Mundo!";
		int[] num = new int[TAM];
		

        System.out.println("Hello, World!");
		System.out.printf("%S hoy es  %d / %d / %d \n", frase, 18, 9 , 2024);
		System.out.println("Ingrese su nombre: ");
		System.out.println("Escriba su edad: ");
		int edad = scanRef.nextInt();

		System.out.println("su nombre es: " + nombre + " y su edad es: " + edad);
		System.out.println("A continuacion se le pediran 3 numeros" + "\n\nSe le dira el mayor y el menor de ellos");

		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese el numero " + (i + 1) + ": ");
			int entrada = scanRef.nextInt();
			num[i] = entrada;
			
		}
		//bubble sort
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

		scanRef.close();

    }
}
