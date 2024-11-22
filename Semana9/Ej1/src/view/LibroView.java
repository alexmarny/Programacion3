package view;
import controller.LibroController;
import com.coti.tools.Esdia;

public class LibroView {

	LibroController controller;

	public LibroView() {
		
	}

	public void mostrarMenu() {
		System.out.println("1. Mostrar el listado de libros en formato tabla.");
		System.out.println("2. Añadir nuevo libro al modelo.");
		System.out.println("3. Eliminar libro de una lista de libros disponibles.");
		System.out.println("4. Modificar libro de una lista de libros disponibles.");
		System.out.println("5. Exportar libros en formato CSV.");
		System.out.println("6. Exportar libros en formato JSON.");
		System.out.println("7. Exportar libros en formato XML.");
		System.out.println("8. Importar libros de un fichero JSON.");
		System.out.println("9. Importar libros de un fichero XML.");
		System.out.println("10. Importar libros de un fichero CSV.");
		System.out.println("11. Salir del programa.");
			int opcion = Esdia.readInt("Seleccione una opción: ");
			boolean running = true;

			while (running) {
				
				switch (opcion) {
					case 1:
						// Mostrar el listado de libros
						mostrarLibrosTabla();
						break;
					case 2:
						// Añadir libro
						String titulo = Esdia.readString("Introduzca el título del libro: ");
						String autor = Esdia.readString("Introduzca el autor del libro: ");
						String isbn = Esdia.readString("Introduzca el ISBN del libro: ");
						controller.addLibro(titulo, autor, isbn);
						break;
					case 3:
						// Eliminar libro
						mostrarLibrosTabla();
						String nombre = Esdia.readString("Introduzca el título del libro a eliminar: ");
						controller.removeLibro(nombre);
						break;
					case 4:
						// Modificar libro
						mostrarLibrosTabla();
						String nombreModificar = Esdia.readString("Introduzca el título del libro a modificar: ");
						if(controller.updateLibro(nombreModificar)) {
							String autorNuevo = Esdia.readString("Introduzca el nuevo autor del libro: ");
							String isbnNuevo = Esdia.readString("Introduzca el nuevo ISBN del libro: ");
							controller.addLibro(nombreModificar, autorNuevo, isbnNuevo);
						}
						
						break;
					case 5:
						// Exportar libros en formato CSV
						controller.exportLibrosCSV();
						break;
					case 6:
						// Exportar libros en formato JSON
						controller.exportLibrosJSON();
						break;
					case 7:
						// Exportar libros en formato XML
						controller.exportLibrosXML();
						break;
					case 8:
						// Importar libros de un fichero JSON
						controller.importLibrosJSON();
						break;
					case 9:
						// Importar libros de un fichero XML
						controller.importLibrosXML();
						break;
					case 10:
						// Importar libros de un fichero CSV
						controller.importLibrosCSV();
						break;
					case 11:
						controller.guardarLibros();
						running = false;
						break;
					default:
						System.out.println("Opción no válida.");
				}
			}
	}

	public void mostrarLibrosTabla() {

		controller.mostrarLibrosTabla();
	}
	

	public void setController(LibroController libroController) {

		this.controller = libroController;
	}
	


}
