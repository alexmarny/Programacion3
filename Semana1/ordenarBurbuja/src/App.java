import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];

		System.out.println("Ingrese 5 números:");
		for (int i = 0; i < 5; i++) {
			numbers[i] = scanner.nextInt();
		}

		// Algoritmo de burbuja
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}

		System.out.println("Números ordenados:");
		for (int number : numbers) {
			System.out.println(number);
		}

		scanner.close();
    }
}
