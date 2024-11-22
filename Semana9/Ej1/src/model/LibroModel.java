package model;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;



public class LibroModel {
	private ArrayList<Libro> libros;

	public LibroModel() {
		libros = new ArrayList<>();
		cargarLibros();
	}

	public void cargarLibros() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(System.getProperty("user.home") + File.separator +"Desktop" + File.separator+ "libros.bin"))) {
			libros = (ArrayList<Libro>) ois.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("No se encontró el archivo libros.bin");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void guardarLibros() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.home") + File.separator +"Desktop" + File.separator+ "libros.bin"))) {
			oos.writeObject(libros);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addLibro(String titulo, String autor, String isbn) {
		Libro libro = new Libro(titulo, autor, isbn);
		libros.add(libro);
	}

	public void removeLibro(String nombre) {
		for (Libro libro : libros) {
			if (libro.getTitulo().equals(nombre)) {
				libros.remove(libro);
				break;
			}
		}
	}

	public boolean updateLibro(String titulo) {

		boolean encontrado = false;
		for (Libro libro : libros) {
			if (libro.getTitulo().equals(titulo)) {
				libros.remove(libro);
				encontrado = true;
			} 
		} 
		if(libros.isEmpty()) {
			System.out.println("No hay libros en la lista");
		} else {
			System.out.println("No se ha encontrado el libro");
		}
		return encontrado;
		
	}

	public void exportLibrosCSV() {
		
		try (PrintWriter pw = new PrintWriter(new FileWriter(System.getProperty("user.home") + File.separator +"Desktop" + File.separator+ "libros.csv"))) {
			for (Libro libro : libros) {
				pw.println(libro.getTitulo() + ";" + libro.getAutor() + ";" + libro.getIsbn());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void exportLibrosJSON() {
			
		Gson gson = new Gson();
		String json = gson.toJson(libros);
		File f = new File(System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "libros.json");
		try {
			Files.write(f.toPath(), json.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void exportLibrosXML() {
		
		XmlMapper xmlMapper = new XmlMapper();
		try {
			String xml = xmlMapper.writeValueAsString(libros);
			File f = new File(System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "libros.xml");
			Files.write(f.toPath(), xml.getBytes(StandardCharsets.UTF_8));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void importLibrosJSON() {
		
		Gson gson = new Gson();
		try {
			Libro[] libros = gson.fromJson(new FileReader(System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "libros.json"), Libro[].class);
			for (Libro libro : libros) {
				this.libros.add(libro);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void importLibrosXML() {
		
		XmlMapper xmlMapper = new XmlMapper();
		try {
			Libro[] libros = xmlMapper.readValue(new File(System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "libros.xml"), Libro[].class);
			for (Libro libro : libros) {
				this.libros.add(libro);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void importLibrosCSV() {

		try (BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "libros.csv"))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] campos = linea.split(";");
				addLibro(campos[0], campos[1], campos[2]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public void mostrarLibros() {
		for (Libro libro : libros) {
			System.out.println(libro);
		}
	}

	public void mostrarLibrosTabla() {
		System.out.println("Título\tAutor\tISBN");
		for (Libro libro : libros) {
			System.out.println(libro.getTitulo() + "\t" + libro.getAutor() + "\t" + libro.getIsbn());
		}
	}

	public void mostrarLibrosCSV() {
		for (Libro libro : libros) {
			System.out.println(libro.getTitulo() + ";" + libro.getAutor() + ";" + libro.getIsbn());
		}
	}

	public void mostrarLibrosJSON() {

		Gson gson = new Gson();
		String json = gson.toJson(libros);
		System.out.println(json);
	}

	public void mostrarLibrosXML() {

		XmlMapper xmlMapper = new XmlMapper();
		try {
			String xml = xmlMapper.writeValueAsString(libros);
			System.out.println(xml);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}




}

