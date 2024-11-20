package calculadoramvc.view;
import com.coti.tools.Esdia;

import calculadoramvc.controller.calculadoraController;

public class calculadoraView {

	calculadoraController controller;

	public void showMenu() {

		boolean salir = false;

		while (!salir){
		System.out.println("Calculadora MVC");
		System.out.println("1: leer numeros");		
		System.out.println("2: Calcular suma");		
		System.out.println("3: Mostar resultado");
		System.out.println("4. Salir");
		System.out.println("Seleccione una opción: ");

		int opcion = Esdia.readInt("introduzca una opción", 1, 4);

		switch(opcion){
			case 1:
				readNumbers();
				break;
			case 2:
				calculate();
				break;
			case 3:
				showResult();
				break;
			case 4:
				salir = true;
				break;
		
			}
		}
	}

	public void readNumbers(){

		int primerNumero = Esdia.readInt("Introduzca el primer número: ", 0, 100);
		int segundoNumero = Esdia.readInt("Introduzca el segundo número: ", 0, 100);
		
		//comunicar al controlador -> model

		controller.setNum1(primerNumero);
		controller.setNum2(segundoNumero);

		System.out.println("Números leídos correctamente");

	}

	public void calculate(){

		//comunicar al controlador -> model

		controller.calcResult();

		System.out.println("Suma realizada correctamente");

	}

	public void showResult(){

		//comunicar al controlador -> model

		System.err.println("Num1: " + controller.getNum1());
		System.err.println("Num2: " + controller.getNum2());

		System.out.println("El resultado es: " + controller.getResult());

	}

	public void setController(calculadoraController calculadoraController) {
		this.controller = calculadoraController;
	} 



}

