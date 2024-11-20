package model;

import java.util.Scanner;

public class Lectura {

		private Scanner scanner;

		public Lectura() {
			scanner = new Scanner(System.in);
		}

		public int leerInt() {
			while (true) {
				try {
					System.out.print("Ingrese un número entero: ");
					return Integer.parseInt(scanner.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Valor no válido. Intente de nuevo.");
				}
			}
		}

		public float leerFloat() {
			while (true) {
				try {
					System.out.print("Ingrese un número flotante: ");
					return Float.parseFloat(scanner.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Valor no válido. Intente de nuevo.");
				}
			}
		}

		public double leerDouble() {
			while (true) {
				try {
					System.out.print("Ingrese un número doble: ");
					return Double.parseDouble(scanner.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Valor no válido. Intente de nuevo.");
				}
			}
		}
	}

