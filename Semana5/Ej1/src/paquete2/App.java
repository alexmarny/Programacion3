package paquete2;

public class App {
    public static void main(String[] args) throws Exception {
		//es posible importarlo por ser de dominio publico
		paquete1.Clase1 obj = new paquete1.Clase1();
		obj.atributo1 = 1;
		obj.atributo2 = 2;
		obj.atributo3 = 3;
		obj.atributo4 = 4;

		obj.metodo1();
		obj.metodo2();
		obj.metodo3();
		obj.metodo4();

		/**
		 * no es posible importarlo por ser auto(acceso para clases del mismo paquete)
		 * paquete1.Clase2 obj2 = new paquete1.Clase2();
		 * obj2.metodo1();
		 */
		
		/*
		 * Su propósito principal es mantener los datos protegidos mediante encapsulamiento, asegurando que solo las partes
		 * del código que realmente necesitan acceder a ciertos datos o métodos puedan hacerlo. 
		 * Esto ayuda a mantener la integridad y la seguridad del código, haciéndolo más accesible y fácil de mantener.
		*/
		

    }
}
