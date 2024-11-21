package ejerciciocrudarrays;

import ejerciciocrudarrays.controller.controller;
import ejerciciocrudarrays.model.modelo;
import ejerciciocrudarrays.view.vista;

public class EjercicioCRUDArraysTiposPrimitivos {
    
   
    public static void main(String[] args) {
        
		vista vista = new vista();
		modelo modelo = new modelo();
		controller controlador = new controller(vista, modelo);
		
		controlador.run();


    }
}