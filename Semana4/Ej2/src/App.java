import datos.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        
		if ((args.length < 3)) { 
			System.out.println("uso: java App <nombre> <peso> <altura>");
			return;
		}

		try {
			Double.parseDouble(args[1]);
			Double.parseDouble(args[2]);
		} catch (NumberFormatException e) {
			System.out.println("El peso y la altura deben ser números");
			return;
		}

		Usuario usuario = Usuario.createUsuarioFromArray(args);
		
		System.out.printf("%-10s %-10s %-10s %-10s%n", "Nombre", "Peso", "Altura", "IMC");
	System.out.printf("%-10s %-10.2f %-10.2f %-10.2f%n", usuario.getNombre(), usuario.getPeso(), usuario.getAltura(), usuario.calcularIMC());
	}
}
