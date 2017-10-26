

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:08
 */
package Logica;
import Persistencia.ConexionBD;
import java.sql.SQLException;
import java.util.Vector;

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
     
    public void update(Rubro rubro,String aCambiar) throws SQLException, InstantiationException, IllegalAccessException{
        ConexionBD con=ConexionBD.getConexion();
        con.update("UPDATE rubro SET nombre='"+rubro.nombre+"' WHERE nombre='"+aCambiar+"'");
    }
     
    public void borrar(Rubro rubro) throws SQLException, InstantiationException, IllegalAccessException{
        ConexionBD con=ConexionBD.getConexion();
        con.update("DELETE FROM `rubro` WHERE nombre='"+rubro.getNombre()+"';");
    }
    
    public static Vector<String> recuperarTodosNombres() throws SQLException, InstantiationException, IllegalAccessException{
        ConexionBD con= ConexionBD.getConexion();
        String[][] valores;
        valores = new String[10][1];
        valores = con.recuperar(valores,"select nombre from rubro",1);
        Vector<String> salida = new Vector<String>();
        for (String[] valore : valores) {
            if (valore[0]==null) {
                break;
            }
            salida.add(valore[0]);
        }
        
        return (Vector<String>) salida;
    }
    
    public boolean existe(String rubro_name) throws SQLException, InstantiationException, IllegalAccessException{
        
        ConexionBD con= ConexionBD.getConexion();
        boolean result=con.existe("select exists (select nombre from rubro where nombre='"+rubro_name+"')");
        return result; 
    }
}//end Rubro