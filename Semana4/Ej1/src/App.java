public class App {
    public static void main(String[] args) throws Exception {
	if (args.length != 2) {
		System.out.println("Error: Debes introducir exactamente 2 argumentos numéricos.");
		return;
	}

	try {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int suma = num1 + num2;
		System.out.println("La suma de los números es: " + suma);
	} catch (NumberFormatException e) {
		System.out.println("Error: Ambos argumentos deben ser números enteros.");
	}
    }
}
