package ejerciciocrudarrays.controller;
import ejerciciocrudarrays.view.vista;
import ejerciciocrudarrays.model.modelo;


public class controller {

	vista vista;
	modelo modelo;

	public controller(vista vista, modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
			
		this.vista.setController(this);
	}


	public int getNum(int num) {

		return modelo.getNum(num);

	}

	public int getNumCount() {
	
		return modelo.getNumCount();
	}

	public int getMaxSize() {
		return modelo.getMAX_SIZE();
	}

	public int[] getNumeros() {

		return modelo.getNumeros();
	}

	public void setNum(int num) {
	
		modelo.setNum(num);
	}

	public boolean eliminarNumero(int num) {
	
		return modelo.eliminarNumero(num);
	}

	public void run() {
	
		vista.mostrarMenu();
	}


	public void cambiarNumero(int i, int nuevoNum) {
		modelo.cambiarNumero(i, nuevoNum);
	}


	

}
