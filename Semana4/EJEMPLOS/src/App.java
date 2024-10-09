
import datos.Persona;

public class App {
    public static void main(String[] args) throws Exception {

		System.out.println("Estoy probando argumentos");
		//arg[0] = nombre, arg[1] = DNI
		Persona p1 = new Persona(args[0], args[1]);
		System.out.println("Nombre: " + p1.getNombre()+ " DNI: " + p1.getDni());
	}
}
