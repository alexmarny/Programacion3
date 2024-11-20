package sumamvc.view;
import com.coti.tools.Esdia;

import sumamvc.controller.controller;

public class vista {

	controller controller;

	public void mostrarMenu(){
		
		boolean salir = false;

		while(!salir){

			System.out.println("1. Leer los números");
			System.out.println("2. Calcular la suma");
			System.out.println("3. Mostrar el resultado");
			System.out.println("4. Salir");
			
			int opcion = Esdia.readInt("Ingrese una opción: ", 1,4);
			
			switch(opcion){
				case 1:
					System.out.println("Leer los números");
					leerNumeros();
					break;
				case 2:
					System.out.println("Calcular la suma");
					calcularSuma();
					break;
				case 3:
					System.out.println("Mostrar el resultado");
					mostrarResultado();
					break;
				case 4:
					System.out.println("Salir");
					salir = true;
					break;
				default:
					System.out.println("Opción no válida");
					break;
			}

		}
	
	}

	public void leerNumeros(){
		int num1 = Esdia.readInt("Ingrese el primer número: ");
		int num2 = Esdia.readInt("Ingrese el segundo número: ");

		controller.setNum1(num1);
		controller.setNum2(num2);

		System.out.println("Números leídos correctamente");
		
	}

	public void calcularSuma(){
		controller.sumar();
		System.out.println("Suma realizada correctamente");
	}

	public void mostrarResultado(){

		System.err.println("Num1: " + controller.getNum1());
		System.err.println("Num2: " + controller.getNum2());
		System.out.println("El resultado de la suma es: " + controller.getResultado());
	}
	
	public void setController(controller controller){
		this.controller = controller;
	}

	

}
