package vista;

import java.util.Scanner;

public class VPrincipal {
	
	private String opcion;
	
	private final String cliente = "C";
	private final String factura = "F";
	public static final String familia = "G";
	private final String articulo = "A";
	private final String oferta = "O";
	
	public String getOpcion() {
		return opcion.toUpperCase();
	}

	public void pintarMenu() {
		
		boolean salir = false;
		
		Scanner scan = new Scanner(System.in);
		
		
		
		/*
		 * -Menú: Clientes, Familias, Ofertas, Facturas, Articulos
		 * -Familias: Nueva, Editar, Borrar, Mostrar
		 */
		
		while(!salir) {
			
			System.out.println("\n Menú:\n - &Clientes\n - &Facturas\n - &Familias\n "
					+ "- &Artículos\n - &Ofertas\n - &salir");
			
			
			System.out.println("Elija una opción:");
			opcion = scan.nextLine();
			
			switch(getOpcion()) {
				case cliente:
					break;
				case factura:
					break;
				case familia:
					salir = true;
					break;
				case articulo:
					break;
				case oferta:
					break;
				default:
					salir = true;
					break;
					
					
				
			}
			
		}
	}
}
