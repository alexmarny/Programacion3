
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Escriba su año de nacimiento:");
		String anoNacS = System.console().readLine();

		System.out.println("introduzca el año actual:");
		String anoActS = System.console().readLine();

		int anoNac = Integer.parseInt(anoNacS);
		int anoAct = Integer.parseInt(anoActS);

		int edad = anoAct - anoNac;
		System.out.println("Su edad es: " + edad);
    }
}