package datos;

public class Usuario {

    private String nombre;

    private double peso;

    private double altura;



    // Constructor

    public Usuario(String nombre, double peso, double altura) {

        this.nombre = nombre;

        this.peso = peso;

        this.altura = altura;

    }



    // Getters

    public String getNombre() {

        return nombre;

    }



    public double getPeso() {

        return peso;

    }



    public double getAltura() {

        return altura;

    }



    // Method to calculate IMC

    public double calcularIMC() {

        return peso / ((altura * altura)/10000);

    }



    // Static method to create Usuario from array

    public static Usuario createUsuarioFromArray(String[] args) {

        String nombre;
        double peso;
        double altura;

        try {
            nombre = args[0];
            peso = Double.parseDouble(args[1]);
            altura = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Peso and altura must be valid numbers", e);
        }

        return new Usuario(nombre, peso, altura);

    }

}