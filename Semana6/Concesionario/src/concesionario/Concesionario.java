/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concesionario;

import modelo.Coche;
import com.coti.tools.Esdia;

/**
 *
 * @author alfonso
 */
public class Concesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean flag = false;
        boolean decision = false, salir = false;
        String matricula = null;
        int contador = 0;



        bienvenida();

        Coche[] coches = abrirConcesionario();
      

        while (!flag) {
            System.out.println("\n ");

            matricula = Esdia.readString_ne("Por favor, introduzca la matricula del coche: ");
            decision = Esdia.yesOrNo("¿Desea incluir el resto de información del coche?");

            if (!decision) {
                Coche coche = new Coche(matricula);
                coches[contador] = coche;
            } else {
                String marca = Esdia.readString_ne("Por favor, introduzca la marca del coche: ");
                String modelo = Esdia.readString_ne("Por favor, introduzca el modelo del coche: ");
                int anio = Esdia.readInt("Por favor, introduzca el año de fabricación del coche: ");
                double precioSinIVA = Esdia.readDouble("Por favor, introduzca el precio sin iva del coche: ");

                Coche coche = new Coche(modelo, marca, matricula, anio, precioSinIVA);
                coches[contador] = coche;
            }
            contador++;
            salir = Esdia.yesOrNo("¿Desea Salir?");
            if (salir == true) {
                flag = true;
            }
        }

        System.out.println("\n\n\tCATALOGO DE AUTOS-SALAMANCA");
        System.out.println("\t---------------------------\n\n ");
        System.out.println("Marca \t\tModelo \t\tMatricula \t\tAño \t\tPrecio con IVA");

        for (int i = 0; i < coches.length; i++) {
            if (coches[i] != null) {
                System.out.printf("%-15s %-15s %-10s \t\t%-15d %-15.2f%n", coches[i].getMarca(), coches[i].getModelo(), coches[i].getMatricula(), coches[i].getAnio(), coches[i].getPrecioConIVA());
            }
        }
    }

    private static Coche[] abrirConcesionario() {
        final int NUM_COCHES = Esdia.readInt("Por favor, introduzca el número de posibles coches: ");
        Coche[] coches = new Coche[NUM_COCHES];
        return coches;
    }

    private static void bienvenida() {
        System.out.println("\t-----------------------------\n ");
        System.out.println("\tBIENVENIDOS A AUTOS-SALAMANCA");
        System.out.println("\t-----------------------------\n ");
    }
}
