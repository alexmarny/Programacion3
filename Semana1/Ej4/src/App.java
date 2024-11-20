
import java.util.Scanner;

public class App {

	private static final int TAM = 3;
    public static void main(String[] args) throws Exception {

		Scanner scanRef = new Scanner(System.in);

		String frase = "Hola, Mundo!";
		int[] num = new int[TAM];

		System.out.printf("%S hoy es  %d / %d / %d \n", frase, 18, 9 , 2024);

		System.out.println("A continuacion se le pediran 3 numeros" + "\nSe le dira el mayor y el menor de ellos:");

		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese el numero " + (i + 1) + ": ");
			int entrada = scanRef.nextInt();
			num[i] = entrada;
			
		}
	
		boolean allEqual = true;
		for (int i = 1; i < num.length; i++) {
			if (num[i] != num[0]) {
				allEqual = false;
				break;
			}
		}

		if (allEqual) {
			System.out.println("Todos los numeros son iguales: " + num[0]);
		} else {
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
		}

		scanRef.close();

    }
}
