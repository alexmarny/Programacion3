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
		   personas[i] = new Persona( "", "", "");

		   //pedir el nombre de la persona
		   String prompt = String.format("Introduce el nombre de la persona %d: ", i + 1);
		   String nombre = Esdia.readString(prompt);
		   personas[i].setNombre(nombre);

		   //pedir el peso de la persona
		   prompt = String.format("Introduce el peso de la persona %d: ", i + 1);
		   String peso = Esdia.readString(prompt);
		   personas[i].setPeso(peso);

		   //pedir la altura de la persona
		   prompt = String.format("Introduce la altura de la persona %d: ", i + 1);
		   String altura = Esdia.readString(prompt);
		   personas[i].setAltura(altura);

	   }

	   for (int i = 0; i < personas.length; i++) {
		   System.out.println("Nombre: " + personas[i].getNombre());
		   System.out.println("Peso: " + personas[i].getPeso());
		   System.out.println("Altura: " + personas[i].getAltura());
	   }
	   
	   String mayorPeso = Persona.getMayorPeso(personas);

	   System.out.println("La persona con mayor peso es: " + mayorPeso);

	   String mayorAltura = Persona.getMayorAltura(personas);

	   System.out.println("La persona con mayor altura es: " + mayorAltura);

	   
	}
}
