

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:08
 */
package Logica;
import Persistencia.ConexionBD;
import java.sql.SQLException;

public class Rubro {

    private String nombre;
    public Establecimiento m_Establecimiento;

    public Rubro() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Establecimiento getM_Establecimiento() {
        return m_Establecimiento;
    }

    public void setM_Establecimiento(Establecimiento m_Establecimiento) {
        this.m_Establecimiento = m_Establecimiento;
    }

    /**
     *
     * @param rubro
     * @return 
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
     public boolean guardar(Rubro rubro) throws SQLException, InstantiationException, IllegalAccessException{
        
        ConexionBD con= ConexionBD.getConexion();
        

        boolean result=con.insertar("insert into rubro (id,nombre) values (default,'"+rubro.nombre+"')");
        return result; 
    }
     
    public boolean existe(String rubro_name) throws SQLException, InstantiationException, IllegalAccessException{
        
        ConexionBD con= ConexionBD.getConexion();
        boolean result=con.existe("select exists (select nombre from rubro where nombre='"+rubro_name+"')");
        return result; 
    }
}//end Rubro