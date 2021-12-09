package controlador;

import vista.VPrincipal;

public class CPrincipal {

	
	public static void main (String[] args) {
		
		CPrincipal conPrincipal;
		
		conPrincipal = new CPrincipal();
		
		conPrincipal.run();
	}
	
	public void run() {

		VPrincipal vistaPrincipal;
		
		// TODO Crear resto de controladores.
		
		CFamilia conFamilia;

		vistaPrincipal = new VPrincipal();
		
		vistaPrincipal.pintarMenu();
		
		String opcion = vistaPrincipal.getOpcion();
		
		System.out.println(opcion);
		if(/*vistaPrincipal.getOpcion()*/opcion.equals(vistaPrincipal.familia)) {
			
			conFamilia = new CFamilia();
			conFamilia.run();
		} else {
			
		}
		
		
		
		
	}
}
