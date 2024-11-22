
import model.LibroModel;
import view.LibroView;
import controller.LibroController;


public class App {
	public static void main(String[] args) throws Exception {
		LibroModel model = new LibroModel();
		LibroView view = new LibroView();
		LibroController controller = new LibroController(model, view);
		controller.run();


	}
}









