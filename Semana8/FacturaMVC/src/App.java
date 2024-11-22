
import model.FacturaModel;
import view.FacturasView;
import controller.FacturaController;

public class App {

	public static void main(String[] args) {
		

		FacturaModel model = new FacturaModel();
		FacturasView view = new FacturasView();
		FacturaController controller = new FacturaController(model, view);
		
		controller.run();

	}
}
