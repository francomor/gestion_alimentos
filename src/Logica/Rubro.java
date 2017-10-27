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
     * Metodo que guarda un rubro
     *
     * @param rubro Rubro
     * @return boolean Es verdadero si se cargo correctamente
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public boolean guardar(Rubro rubro) throws SQLException, InstantiationException, IllegalAccessException {

        ConexionBD con = ConexionBD.getConexion();
        boolean result = con.insertar("insert into rubro (id,nombre) values (default,'" + rubro.nombre + "')");
        return result;
    }

    /**
     * Cambia un material
     *
     * @param rubro Rubro con el nombre que tomara el valor luego del cambio
     * @param aCambiar Nombre del rubro que se va a cambiar
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public void update(Rubro rubro, String aCambiar) throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        con.update("UPDATE rubro SET nombre='" + rubro.nombre + "' WHERE nombre='" + aCambiar + "'");
    }

    /**
     * Borra un rubro
     *
     * @param rubro Rubro a borrar
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public void borrar(Rubro rubro) throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        con.update("DELETE FROM `rubro` WHERE nombre='" + rubro.getNombre() + "';");
    }

    /**
     * Recupera todos los rubros
     *
     * @return {@code Vector<String>} que contiene los
     * nombres de todos los rubros
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static Vector<String> recuperarTodosNombres() throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        String[][] valores;
        valores = new String[10][1];
        valores = con.recuperar(valores, "select nombre from rubro", 1);
        Vector<String> salida = new Vector<String>();
        for (String[] valore : valores) {
            if (valore[0] == null) {
                break;
            }
            salida.add(valore[0]);
        }

        return (Vector<String>) salida;
    }

    /**
     * Verifica la existencia de un rubro
     *
     * @param rubro_name Nombre del rubro
     * @return boolean Es verdadero si existe
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public boolean existe(String rubro_name) throws SQLException, InstantiationException, IllegalAccessException {

        ConexionBD con = ConexionBD.getConexion();
        boolean result = con.existe("select exists (select nombre from rubro where nombre='" + rubro_name + "')");
        return result;
    }
}//end Rubro
