package sumamvc;
import sumamvc.controller.controller;
import sumamvc.model.modelo;
import sumamvc.view.vista;

public class App {

	public static void main(String[] args) {

		/*
		* Construccion instancias del MVC
		* View <--> Controller <--> Model
		*/

		modelo model = new modelo();
		vista view = new vista();
		controller controller = new controller(view, model);

		controller.run();

	}

	

}