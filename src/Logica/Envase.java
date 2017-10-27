/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:08
 */
package Logica;

import Persistencia.ConexionBD;
import java.sql.SQLException;
import java.util.Vector;

public class Envase {

    private String capacidad;
    private String material;
    private String unidad;
    public ProductoAlimenticio m_ProductoAlimenticio;

    public Envase() {

    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public ProductoAlimenticio getM_ProductoAlimenticio() {
        return m_ProductoAlimenticio;
    }

    public void setM_ProductoAlimenticio(ProductoAlimenticio m_ProductoAlimenticio) {
        this.m_ProductoAlimenticio = m_ProductoAlimenticio;
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
    public static Vector<String> recuperarTodosMateriales() throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        String[][] valores;
        valores = new String[10][1];
        valores = con.recuperar(valores, "select nombre from material", 1);
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
     * Recupera todas las unidades
     *
     * @return {@code Vector<String>} que contiene los
     * nombres de todas las unidades
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static Vector<String> recuperarTodosUnidades() throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        String[][] valores;
        valores = new String[10][1];
        valores = con.recuperar(valores, "select nombre from unidad", 1);
        Vector<String> salida = new Vector<String>();
        for (String[] valore : valores) {
            if (valore[0] == null) {
                break;
            }
            salida.add(valore[0]);
        }

        return (Vector<String>) salida;
    }

    public boolean existe_material(String nom_mat) throws SQLException, InstantiationException, IllegalAccessException {

        ConexionBD con = ConexionBD.getConexion();
        boolean result = con.existe("select exists (select nombre from material where nombre='" + nom_mat + "')");
        return result;
    }

    /**
     * Verifica la existencia de una unidad
     *
     * @param nom_uni Nombre de la unidad
     * @return boolean Es verdadero si existe
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public boolean existe_unidad(String nom_uni) throws SQLException, InstantiationException, IllegalAccessException {

        ConexionBD con = ConexionBD.getConexion();
        boolean result = con.existe("select exists (select nombre from unidad where nombre='" + nom_uni + "')");
        return result;
    }

    /**
     * Metodo que guarda un material
     *
     * @param nom_mat Nombre del material
     * @return boolean Es verdadero si se cargo correctamente
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public boolean guardar_material(String nom_mat) throws SQLException, InstantiationException, IllegalAccessException {

        ConexionBD con = ConexionBD.getConexion();

        boolean result = con.insertar("insert into material (id,nombre) values (default,'" + nom_mat + "')");
        return result;
    }

    /**
     * Metodo que guarda una unidad
     *
     * @param nom_uni Nombre de la unidad
     * @return boolean Es verdadero si se cargo correctamente
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public boolean guardar_unidad(String nom_uni) throws SQLException, InstantiationException, IllegalAccessException {

        ConexionBD con = ConexionBD.getConexion();

        boolean result = con.insertar("insert into unidad (id,nombre) values (default,'" + nom_uni + "')");
        return result;
    }

    /**
     * Metodo que guarda un envase
     *
     * @param cap Capacidad del envase
     * @param mat Nombre del material
     * @param uni Nombre de la unidad
     * @return boolean Es verdadero si se cargo correctamente
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public boolean guardar_envase(String cap, String mat, String uni) throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        //obtengo los id de material y unidad, pero no es eficiente.
        String[][] materiales;
        materiales = new String[1][1];
        materiales = con.recuperar(materiales, "select id from material where nombre='" + mat + "'", 1);
        Vector<String> id_mat = new Vector<>();
        for (String[] valore : materiales) {
            if (valore[0] == null) {
                break;
            }
            id_mat.add(valore[0]);
        }

        String[][] unidades;
        unidades = new String[1][1];
        unidades = con.recuperar(unidades, "select id from unidad where nombre='" + uni + "'", 1);
        Vector<String> id_uni = new Vector<>();
        for (String[] valore1 : unidades) {
            if (valore1[0] == null) {
                break;
            }
            id_uni.add(valore1[0]);
        }

        //insertar en envase los valores obtenidos.
        boolean result = con.insertar("insert into envase (id,capacidad,Material_id,Unidad_id) values (default,'" + cap + "','" + id_mat.firstElement() + "','" + id_uni.firstElement() + "')");
        return result;
    }
}//end Envase
