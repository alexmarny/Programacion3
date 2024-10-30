package calculadoramvc;

import calculadoramvc.controller.calculadoraController;
import calculadoramvc.model.calculadoraModel;
import calculadoramvc.view.calculadoraView;

public class App {

	public static void main(String[] args) {

		/*
		* Construccion instancias del MVC
		* View <--> Controller <--> Model
		*/

		calculadoraModel model = new calculadoraModel();
		calculadoraView view = new calculadoraView();
		calculadoraController controller = new calculadoraController(view, model);

		controller.run();

	}

	

}
