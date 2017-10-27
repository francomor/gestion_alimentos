/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:07
 */
package Logica;

import Persistencia.ConexionBD;
import java.sql.SQLException;
import java.util.Vector;

public class MateriaPrima {

    private int cantidad;
    private String nombre;
    public ProductoAlimenticio m_ProductoAlimenticio;

    public MateriaPrima() {

    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ProductoAlimenticio getM_ProductoAlimenticio() {
        return m_ProductoAlimenticio;
    }

    public void setM_ProductoAlimenticio(ProductoAlimenticio m_ProductoAlimenticio) {
        this.m_ProductoAlimenticio = m_ProductoAlimenticio;
    }

    /**
     * Verifica la existencia de un material
     *
     * @param materiaprima Nombre del material
     * @return boolean Es verdadero si existe
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public boolean existe(String materiaprima) throws SQLException, InstantiationException, IllegalAccessException {

        ConexionBD con = ConexionBD.getConexion();
        boolean result = con.existe("select exists (select nombre from materia_prima where nombre='" + materiaprima + "')");
        return result;
    }

    /**
     * Metodo que guarda un material
     *
     * @param materiaprima Nombre del material
     * @return boolean Es verdadero si se cargo correctamente
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public boolean guardar(MateriaPrima materiaprima) throws SQLException, InstantiationException, IllegalAccessException {

        ConexionBD con = ConexionBD.getConexion();

        boolean result = con.insertar("insert into materia_prima (id,nombre) values (default,'" + materiaprima.nombre + "')");
        return result;
    }

    /**
     * Cambia un material
     *
     * @param materiaprima Materia prima con el nombre que tomara el valor luego
     * del cambio
     * @param aCambiar Nombre de la materia prima que se va a cambiar
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public void update(MateriaPrima materiaprima, String aCambiar) throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        con.update("UPDATE materia_prima SET nombre='" + materiaprima.nombre + "' WHERE nombre='" + aCambiar + "'");
    }

    /**
     * Recupera todos los materiales
     *
     * @return {@code Vector<String>} que contiene los
     * nombres de todos los materiales
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static Vector<String> recuperarTodosNombres() throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        String[][] valores;
        valores = new String[10][1];
        valores = con.recuperar(valores, "select nombre from materia_prima", 1);
        Vector<String> salida = new Vector<>();
        for (String[] valore : valores) {
            if (valore[0] == null) {
                break;
            }
            salida.add(valore[0]);
        }

        return (Vector<String>) salida;
    }

    /**
     * Borra un material
     *
     * @param mp Materia prima a borrar
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public void borrar(MateriaPrima mp) throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        con.update("DELETE FROM `materia_prima` WHERE nombre='" + mp.getNombre() + "';");
    }
}//end MateriaPrima
