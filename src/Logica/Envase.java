package Logica;

import Persistencia.ConexionBD;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @author Francisco Herrero, Franco Morero y Mauricio Vazquez
 * @version 1.0
 */
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
     * Devuelve el id del envase
     *
     * @return int id
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public int get_id() throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        String[][] id;
        id = new String[1][1];
        id = con.recuperar(id, "select id from envase where capacidad='" + capacidad + "' and Material_id='" + get_id_mat(material) + "' and Unidad_id='" + get_id_uni(unidad) + "'", 1);
        return Integer.parseInt(id[0][0]);

    }

    /**
     * Devuelve el id del material
     *
     * @param mat nombre de la materia
     * @return int id
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public String get_id_mat(String mat) throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        String[][] mate;
        mate = new String[1][1];
        mate = con.recuperar(mate, "select id from material where nombre='" + mat + "'", 1);
        return (mate[0][0]);

    }

    /**
     * Devuelve el id de la unidad
     *
     * @param uni nombre de la unidad
     * @return int id
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public String get_id_uni(String uni) throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        String[][] unid;
        unid = new String[1][1];
        unid = con.recuperar(unid, "select id from unidad where nombre='" + uni + "'", 1);
        return (unid[0][0]);
    }

    /**
     * Devuelve el nombre de la materia
     *
     * @param id_mat id materia
     * @return string nombre de la materia
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static String get_nom_mat(String id_mat) throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        String[][] material;
        material = new String[1][1];
        material = con.recuperar(material, "select nombre from material where id=" + id_mat, 1);
        return (material[0][0]);
    }

    /**
     * Devuelve el nombre de la unidad
     *
     * @param id_uni id unidad
     * @return string nombre de la unidad
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static String get_nom_uni(String id_uni) throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        String[][] unidad;
        unidad = new String[1][1];
        unidad = con.recuperar(unidad, "select nombre from unidad where id=" + id_uni, 1);
        return (unidad[0][0]);
    }

    /**
     * Recupera todos los materiales
     *
     * @return {@code Vector<String>} que contiene los nombres de todos los
     * materiales
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
     * Recupera todas los envases
     *
     * @return {@code Vector<String>} que contiene los nombres de todos los
     * envases
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static Vector<String> recuperarTodosEnvases() throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        String[][] valores;
        valores = new String[10][4];
        valores = con.recuperar(valores, "select * from envase", 4);
        Vector<String> salida = new Vector<String>();
        for (String[] valore : valores) {
            if (valore[0] == null) {
                break;
            }
            salida.add(valore[0]);
            salida.add(valore[1]);
            salida.add(get_nom_mat(valore[2]));
            salida.add(get_nom_uni(valore[3]));

        }

        return (Vector<String>) salida;
    }

    /**
     * Recupera todas las unidades
     *
     * @return {@code Vector<String>} que contiene los nombres de todas las
     * unidades
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

    /**
     * Borra un envase
     *
     * @param envase Envase a borrar
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public void borrar(Envase envase) throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        con.update("DELETE FROM `envase` WHERE (capacidad='" + envase.getCapacidad() + "','" + get_id_mat(envase.getMaterial()) + "','" + get_id_uni(envase.getUnidad()) + "')");
    }

    /**
     * Verifica la existencia de un material
     *
     * @param nom_mat Nombre del material
     * @return boolean Es verdadero si existe
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
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
     * Verifica la existencia de un envase
     *
     * @param cap Capacidad
     * @param nom_mat Nombre del material
     * @param nom_uni Nombre de la unidad
     * @return boolean Es verdadero si existe
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public boolean existe_envase(String cap, String nom_mat, String nom_uni) throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        String consulta;
        consulta = "select 1 from envase where exists (select * from envase where capacidad='" + cap + "'and Material_id='" + get_id_mat(nom_mat) + "'and Unidad_id='" + get_id_uni(nom_uni) + "')";
        consulta += " union ";
        consulta += "select 0 from envase where not exists (select * from envase where capacidad='" + cap + "'and Material_id='" + get_id_mat(nom_mat) + "'and Unidad_id='" + get_id_uni(nom_uni) + "')";
        boolean result = con.existe(consulta);

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
        //insertar en envase los valores obtenidos.
        System.out.println("guardar envase");

        boolean result = con.insertar("insert into envase (id,capacidad,Material_id,Unidad_id) values (default," + cap + ",'" + get_id_mat(mat) + "','" + get_id_uni(uni) + "')");
        return result;
    }
}//end Envase
