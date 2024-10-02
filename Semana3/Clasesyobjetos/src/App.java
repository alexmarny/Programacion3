import Datos.Persona;
import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
      
		
		/* Persona p1 = new Persona();
	   Persona p2 = new Persona();

	   p1.setNombre("Juan");
	   p2.setNombre("Pedro");

	   p1.setPeso("70");
	   p2.setPeso("80");

	   p1.setAltura("1.70");
	   p2.setAltura("1.80");

	   System.out.println("Nombre: " + p1.getNombre() + " Peso: " + p1.getPeso() + " Altura: " + p1.getAltura());
	   System.out.println("Nombre: " + p2.getNombre() + " Peso: " + p2.getPeso() + " Altura: " + p2.getAltura());*/

	   //crea un array

	   Persona[] personas = new Persona[3];

	   for (int i = 0; i < personas.length; i++) {
		   personas[i] = new Persona();
		   String prompt = String.format("Introduce el nombre de la persona %d: ", i + 1);
		   String nombre = Esdia.readString(prompt);
		   personas[i].setNombre(nombre);
	   }

	   for (int i = 0; i < personas.length; i++) {
		   System.out.println("Nombre: " + personas[i].getNombre());
	   }

	   
	}
}
