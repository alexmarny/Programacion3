import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {

		Console console = System.console();
		
		if (console == null) {	
			System.out.println("No se puede usar la consola en este sistema operativo");
			return;
		}

		String anoNacS = console.readLine("introduzca su año de nacimiento:");

		
		String anoActS = console.readLine("introduzca el año actual:");

		int anoNac = Integer.parseInt(anoNacS);
		int anoAct = Integer.parseInt(anoActS);

		int edad = anoAct - anoNac;
		System.out.println("Su edad es: " + edad);
    }
}