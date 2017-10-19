

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:00
 */
package Logica;

import java.util.Date;


public class Establecimiento {

	private String categoria;
	private String direccion;
	private Date fechaDeCarga ;
	private String nombre;
	private int telefono;
	public Empresa m_Empresa;
	public ProductoAlimenticio m_ProductoAlimenticio;

	public Establecimiento(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param establecimiento
	 */
	public boolean guardar(Establecimiento establecimiento){
		return false;
	}
}//end Establecimiento