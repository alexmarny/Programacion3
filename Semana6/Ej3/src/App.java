import java.util.HashMap;
import Datos.Libro;
import com.coti.tools.Esdia;

public class App {
	public static void main(String[] args) throws Exception {
		HashMap<String, Libro> biblioteca = new HashMap<>();
		int opcion;
		do {
			System.out.println("1. Agregar libro");
			System.out.println("2. Mostrar libro");
			System.out.println("3. Actualizar libro");
			System.out.println("4. Eliminar libro");
			System.out.println("5. Salir");
			opcion = Esdia.readInt("Elige una opción: ");
			switch (opcion) {
				case 1:
					
					String isbn = Esdia.readString("Introduce el ISBN: ");
					String titulo = Esdia.readString("Introduce el título: ");
					String autor =  Esdia.readString("Introduce el autor: ");
					biblioteca.put(isbn, new Libro(isbn, titulo, autor));
					System.out.println("Libro agregado.");
					break;
				case 2:
					
					isbn = Esdia.readString("Introduce el ISBN del libro a mostrar: ");
					Libro libro = biblioteca.get(isbn);
					if (libro != null) {
						System.out.println(libro);
					} else {
						System.out.println("Libro no encontrado.");
					}
					break;
				case 3:
					
					isbn = Esdia.readString("Introduce el ISBN del libro a actualizar: ");
					libro = biblioteca.get(isbn);
					if (libro != null) {
						
						titulo = Esdia.readString("Introduce el nuevo título: ");
						autor = Esdia.readString("Introduce el nuevo autor: ");	
						biblioteca.put(isbn, new Libro(isbn, titulo, autor));
						System.out.println("Libro actualizado.");
					} else {
						System.out.println("Libro no encontrado.");
					}
					break;
				case 4:
					isbn = Esdia.readString("Introduce el ISBN del libro a eliminar: "); 
					if (biblioteca.remove(isbn) != null) {
						System.out.println("Libro eliminado.");
					} else {
						System.out.println("Libro no encontrado.");
					}
					break;
				case 5:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opción no válida.");
			}
		} while (opcion != 5);
	}
}
