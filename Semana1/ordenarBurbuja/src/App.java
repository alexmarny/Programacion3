import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int[] lista = new int[5];

		System.out.println("Ingrese 5 números:");
		for (int i = 0; i < 5; i++) {
			lista[i] = scanner.nextInt();
		}

		// Algoritmo de burbuja
		for (int i = 0; i < lista.length - 1; i++) {
			for (int j = 0; j < lista.length - 1 - i; j++) {
				if (lista[j] > lista[j + 1]) {
					int temp = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = temp;
				}
			}
		}

		System.out.println("Números ordenados:");
		for (int number : lista) {
			System.out.println(number);
		}

		scanner.close();
    }
}
