import com.coti.tools.Esdia;

import Modelo.Libros;
import Modelo.Almacen;
import Modelo.Autor;

public class App {
    public static void main(String[] args) throws Exception {
        
		mostrarMenu();
		// Variable para almacenar la opción seleccionada por el usuario
		int opcion = 0;
		// Variable para almacenar el ritmo de lectura del usuario
		int ritmoLectura = 1;
		// Variable para almacenar el almacén de libros
		Almacen almacen = null;


		// Bucle para que el usuario pueda seleccionar una opción
		do {
			// Leer la opción seleccionada por el usuario
			opcion = Esdia.readInt("Seleccione una opción: ");
			// Switch para seleccionar la opción
			switch (opcion) {
			case 1:
				//elimina el almacen de libros anterior
				almacen = null;
				// Nuevo almacén de libros
				almacen = new Almacen();
				
				break;
			case 2:
			
				ritmoLectura = Esdia.readInt("Introduce tu ritmo de lectura (páginas por minuto): ");
				break;	
			case 3:
				// Añadir un nuevo libro al almacén
					if(almacen != null) {
					
						//introducir los datos del libro
					String titulo = Esdia.readString_ne("Introduce el título del libro: ");
					int añoDePublicacion = Esdia.readInt("Introduce el año de publicación del libro: ");
					int numeroDePaginas = Esdia.readInt("Introduce el número de páginas del libro: ");
					int precio = Esdia.readInt("Introduce el precio del libro: ");
					//introducir datos del autor
					String nombreAutor = Esdia.readString_ne("Introduce el nombre del autor: ");
					String apellidos = Esdia.readString_ne("Introduce los apellidos del autor: ");
					boolean premioPlaneta = Esdia.siOno("¿El autor ha ganado el premio planeta? (SsNn): ");

					//crear el libro
					Libros libro = new Libros(titulo,nombreAutor, añoDePublicacion, numeroDePaginas, precio);
					//crear el autor
					Autor autor = new Autor(nombreAutor, apellidos, premioPlaneta);
					almacen.setLibro(libro, autor);} else {
						System.out.println("Primero debes crear un almacén de libros");
					}
					
				break;
			case 4:
				// Mostrar información actual de libros

				if(almacen != null) {
					mostrarLibros(almacen, ritmoLectura);
				} else {
					System.out.println("Primero debes crear un almacén de libros");
				}

				break;
				
			case 5:
				// Salir (se borrará toda la información)
				System.out.println("Saliendo del programa...");
				break;
			default:
				// Opción no válida
				System.out.println("Opción no válida");
				break;
			}
    } while(opcion != 5);

	}

private static void mostrarMenu() {

	// Linea superior 46 - y 2 |
	String lineaSeparacion = "|" + "-".repeat(50) + "|";
	

	// Linea de titulo
	System.out.println(lineaSeparacion);
	System.out.println(String.format("|" + "%-50.10s"+ "|", "MIS LIBROS"));
	System.out.println(lineaSeparacion);
	System.out.println(String.format("|" + "%-50.50s" + "|", "1) Nuevo almacén de libros"));
	System.out.println(String.format("|" + "%-50.50s" + "|", "2) Establecer ritmo de lectura (páginas por minuto)"));
	System.out.println(String.format("|" + "%-50.50s" + "|", "3) Añadir un nuevo libro al almacén"));
	System.out.println(String.format("|" + "%-50.50s" + "|", "4) Mostrar información actual de libros"));
	System.out.println(String.format("|" + "%-50.50s" + "|", "5) Salir (se borrará toda la información)"));
	System.out.println(lineaSeparacion);
	System.out.println(" ");

}

private static void mostrarLibros(Almacen almacen, int ritmoLectura) {

	// Linea superior
	String lineaSeparacion = "|" + "-".repeat(140) + "|";
	System.out.println(lineaSeparacion);
	System.out.println(String.format("|" + "%-140.140s" + "|", " LIBROS EN EL ALMACÉN "));
	System.out.println(lineaSeparacion);
	System.out.println(String.format("| %-30.30s | %-15.15s | %-15.15s | %-15.15s | %-10.10s | %-25.25s | %-10.10s |", 
									  "Título", "Año Publicación", "Autor", "Premio planeta", "Páginas", "Tiempo lectura minutos", "Precio"));
	System.out.println(lineaSeparacion);

	int tiempoTotalLectura = 0;
	double valorTotalAlmacen = 0.0;

	for (Libros libro : almacen.getLibros()) {
		if (libro != null) {

			int tiempoLectura = libro.getNumeroDePaginas() / ritmoLectura;
			tiempoTotalLectura += tiempoLectura;
			valorTotalAlmacen += libro.getPrecio();

			System.out.println(String.format("| %-30.30s | %-15.15s | %-15.15s | %-15.15s | %-10.10s | %-25.25s | %-10.10s |", 
											  libro.getTitulo(), 
											  libro.getAñoDePublicacion(), 
											  almacen.getAutor(libro).getNombre() + " " + almacen.getAutor(libro).getApellidos(), 
											  almacen.getAutor(libro).isPremioPlaneta() ? "Sí" : "No", 
											  libro.getNumeroDePaginas(), 
											  tiempoLectura, 
											  libro.getPrecio()));
											  
	}

}

	System.out.println(lineaSeparacion);
	System.out.println(String.format("|%-58.60s|%-25.25s|%-55.55s|", 
									  "Tiempo de lectura total del almacén:" + tiempoTotalLectura + "min", 
									  " ", 
									  "Valor total del almacén:" + valorTotalAlmacen + "€"));
	System.out.println(lineaSeparacion);
	System.out.println(" ");
	
		
	}
}