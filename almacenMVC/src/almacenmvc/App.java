package almacenmvc;

import almacenmvc.controller.almacenController;
import almacenmvc.model.almacenModel;
import almacenmvc.view.almacenView;

public class App {

public static void main(String[] args) {

	almacenView view = new almacenView();
	almacenModel model = new almacenModel();
	almacenController controller = new almacenController(view, model);

	controller.run();
	}
}