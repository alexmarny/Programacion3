package PersonaLista;


import PersonaLista.controller.ControllerRef;
import PersonaLista.model.PersonaModel;
import PersonaLista.view.vistaRef;

public class EjercicioCRUDArraysTiposReferencia {
    
   
    public static void main(String[] args) {
        
		vistaRef vista = new vistaRef();
		PersonaModel modelo = new PersonaModel();
		ControllerRef controlador = new ControllerRef(vista, modelo);
		
		controlador.run();


    }
}