package vista;

import java.util.Scanner;

public class VFamilia {
	
	private String opcion;
	public static final String nueva = "N";
	private final String editar = "E";
	private final String borrar = "B";
	private final String mostrar = "M";
	
	public String getOpcion() {
		
		return opcion.toUpperCase();
	}

	public void pintarFamilia() {
		
			boolean salir = false;
		
			Scanner scan = new Scanner(System.in);
		
			while(!salir) {
			
			System.out.println("\n Familias:\n - &Nueva\n - &Editar\n - &Borrar\n "
					+ "- &Mostrar\n - &Salir");
			
			
			System.out.println("Elija una opción:");
			opcion = scan.nextLine();
			
			switch(getOpcion()) {
				case nueva:
					salir = true;
					break;
				case editar:
					break;
				case borrar:
					break;
				case mostrar:
					
					break;
				default:
				//TODO case VK_ESC:
					
					salir = true;
					break;
					
				
			}
			
		}
		
		
	}

	

}
