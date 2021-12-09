package controlador;

import vista.VFamilia;

public class CFamilia {

	VFamilia vistaFamilia;
	CNueva cNueva;
	String opcion;
	
	public void run() {
		
		vistaFamilia = new VFamilia();
		
		vistaFamilia.pintarFamilia();
		
		opcion = vistaFamilia.getOpcion();
		
		if(opcion.equals(vistaFamilia.nueva)) {
			
			cNueva = new CNueva();
			cNueva.run();
	}

}
}
