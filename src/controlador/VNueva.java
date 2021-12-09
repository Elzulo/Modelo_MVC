package controlador;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VNueva {

	Scanner teclado;
	private int codigo;
	private String nombre;
	private BigDecimal porcentaje;
	
	public void isertarDatos() {
		
		System.out.println("Inserte los datos de la tienda:");
		System.out.println("Codigo.");
		System.out.println("Nombre.");
		System.out.println("Porcentaje.");
		System.out.println("Para salir pulse escape.");
	}
	
	public boolean tomarDatos() {
		
		teclado = new Scanner(System.in);
		
		boolean salir;
		salir = false;
		
		// codigo = 0 para salir
		
		
		
		try {
			
			
			codigo = teclado.nextInt();
			if(codigo == 0) {
				
				salir = true;
			} else {
			teclado.nextLine();
			nombre = teclado.nextLine();
			porcentaje = teclado.nextBigDecimal();
			}
			
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("El formato del porcentaje no es correcto.");
		}
		
		return salir;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public BigDecimal getPorcentaje() {
		return porcentaje;
	}


	
	
}
