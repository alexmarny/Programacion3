package ejerciciocrudarrays;


import ejerciciocrudarrays.controller.ControllerRef;
import ejerciciocrudarrays.model.PersonaModel;
import ejerciciocrudarrays.view.vistaRef;

public class EjercicioCRUDArraysTiposReferencia {
    
   
    public static void main(String[] args) {
        
		vistaRef vista = new vistaRef();
		PersonaModel modelo = new PersonaModel();
		ControllerRef controlador = new ControllerRef(vista, modelo);
		
		controlador.run();


    }
}