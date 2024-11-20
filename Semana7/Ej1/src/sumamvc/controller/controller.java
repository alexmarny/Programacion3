package sumamvc.controller;
import sumamvc.model.modelo;
import sumamvc.view.vista;

public class controller {

	vista vista;

	modelo modelo;

	public controller(vista vista, modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;

		this.vista.setController(this);
	}

	public void setNum1(int num1) {
		modelo.setNum1(num1);
	}

	public int getNum1() {
		return modelo.getNum1();
	}

	public int getNum2() {
		return modelo.getNum2();
	}

	public void setNum2(int num2) {
		modelo.setNum2(num2);
	}

	public void sumar() {
		modelo.sumar();
	}

	public int getResultado() {
		return modelo.getResultado();
	}

	public void run() {
		vista.mostrarMenu();
	}


}
