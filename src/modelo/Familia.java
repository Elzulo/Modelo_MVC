package modelo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexion.Conexion;

public class Familia {
	
	private int codigo;
	private String nombre;
	private BigDecimal porcentaje;
	Connection con;
	
	public void aniadirFamilia() {
		
		try {
			//a21_abarfe?currentSchema=Ejercicio_MVC"
			con = DriverManager.getConnection("jdbc:postgresql://ns3034756.ip-91-121-81.eu/a21_abarfe", "a21_abarfe", "a21_abarfe");
			
			PreparedStatement prstmt; 
			prstmt = con.prepareStatement("insert into ejercicio_mvc.familia(codigo, nombre, porcentaje) values(?,?,?)");
			
			prstmt.setInt(1, codigo);
			prstmt.setString(2, nombre);
			prstmt.setBigDecimal(3, porcentaje);
			
			prstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.out.println("No se ha podido conectar con la base de datos.");
			e.printStackTrace();
		}
		
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(BigDecimal porcentaje) {
		this.porcentaje = porcentaje;
	}

	
	
	/*public Familia() {
		super();
		this.codigo = 0;
		this.nombre = "";
		this.porcentaje = null;
	}
	
	public Familia(int codigo, String tipo) {
		super();
		this.codigo = codigo;
		this.nombre = tipo;
		this.porcentaje
	}
*/

	
}
