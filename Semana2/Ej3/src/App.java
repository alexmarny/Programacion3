
import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
        
		String promt = "Introduzca un número entero positivo: ";

			int numero;
		
			while (true) {
				numero = Esdia.readInt(promt);
				if (numero > 0) {
					break;
				}
				System.out.println("Eso no es un número entero positivo. Inténtelo de nuevo:");
			}
			
			System.out.printf("introduzca %d números de coma flotante\n", numero);

			int i;
			
			float[] numerosFlotantes = new float[numero];

			for(i = 0; i < numero; i++) {
				numerosFlotantes[i] = Esdia.readFloat("Introduzca el numero " + (i + 1) + ": ");
			}

			System.out.println("Los números introducidos son:");

			for (i = 0; i < numero; i++) {
				System.out.printf("%2.2f ",numerosFlotantes[i]);
			}

			System.out.println("La media de los números introducidos es:");
			float suma = 0;
			for (i = 0; i < numero; i++) {
				suma += numerosFlotantes[i];
			}
			System.out.printf("%2.2f", suma / numero);

			System.out.println();
		
		
	}
}

