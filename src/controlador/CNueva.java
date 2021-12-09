package controlador;

import java.math.BigDecimal;

import modelo.Familia;

public class CNueva {
	
	Familia familia;
	VNueva vistaNuevaFamilia;
	int codigo;
	String nombre;
	BigDecimal porcentaje;
	
	
	// Queremos crear una familia, 
	// Para eso necesitamos pedir los datos
	// Para pedir los datos necesitamos mostrarlos por pantalla
	
	public void run() {
		
		vistaNuevaFamilia = new VNueva();
		
		boolean salir;
		
		salir = false;
		// TODO 
		while(!salir) {
					
		vistaNuevaFamilia.isertarDatos();
		
		vistaNuevaFamilia.tomarDatos();
		
		codigo = vistaNuevaFamilia.getCodigo();
		nombre = vistaNuevaFamilia.getNombre();
		porcentaje = vistaNuevaFamilia.getPorcentaje();
		
		familia = new Familia();
		
		familia.setCodigo(codigo);
		familia.setNombre(nombre);
		familia.setPorcentaje(porcentaje);
		
		familia.aniadirFamilia();
		}
	}
}
