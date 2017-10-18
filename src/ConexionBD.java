

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:43:56
 */
public class ConexionBD {

	private String database;
	private DBManager instance;
	public ConexionBD m_ConexionBD;

	public ConexionBD(){

	}

	public void finalize() throws Throwable {

	}
	public void cerrarConexion(){

	}

	public void crearConexion(){

	}

	/**
	 * 
	 * @param consulta
	 */
	public boolean existe(String consulta){
		return false;
	}

	public static DBManagaer getInstance(){
		return null;
	}

	/**
	 * 
	 * @param consulta
	 */
	public boolean insertar(String consulta){
		return false;
	}
}//end ConexionBD