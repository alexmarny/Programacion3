package calculadoramvc.controller;

import calculadoramvc.model.calculadoraModel;
import calculadoramvc.view.calculadoraView;

public class calculadoraController {

	calculadoraView view;

	calculadoraModel model;

	public calculadoraController(calculadoraView view, calculadoraModel model) {
		this.view = view;
		this.model = model;

		this.view.setController(this);
		}
	
	

	public void setNum1(int primerNumero) {
		model.setNum1(primerNumero);	
	}

	public void setNum2(int segundoNumero) {	
		model.setNum2(segundoNumero);
	}

	public void calcResult() {
		model.calcResultado();
	}

	public int getResult() {
		return model.getResultado();
	}

	public int getNum1() {
		return model.getNum1();
	}

	public int getNum2() {
		return model.getNum2();
		}

	public void run() {
		this.view.showMenu();

	}
}
