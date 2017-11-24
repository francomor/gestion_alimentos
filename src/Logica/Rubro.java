package Logica;

import Persistencia.ConexionBD;
import java.sql.SQLException;
import java.util.Vector;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Francisco Herrero, Franco Morero y Mauricio Vazquez
 * @version 1.0
 */
public class Rubro {

    private int id;
    private String nombre;
    private Establecimiento m_Establecimiento;

    public Rubro() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return !result;
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
     * @return {@code Vector<String>} que contiene los nombres de todos los
     * rubros
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

    /**
     * Recupera un rubro por su id
     *
     * @param id id del rubro
     * @return Rubro con su nombre
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    static Rubro recuperarRubroporID(String id) throws SQLException, InstantiationException, IllegalAccessException {

        Rubro salida = new Rubro();
        ConexionBD con = ConexionBD.getConexion();
        String[][] valores;
        valores = new String[1][2];
        valores = con.recuperar(valores, "select * from rubro `id`=" + id + ";", 1);

        if (valores[0][0] == null) {
            salida = null;
        } else {
            if (valores[0][0] != null) {
                salida.setId(Integer.parseInt(valores[0][0]));
            }

            if (valores[0][1] != null) {
                salida.setNombre(valores[0][1]);
            }
        }

        return salida;
    }
    
    
    /**
     * Obtiene la cantidad de veces que aparece el nombre de un rubro en la base
     * de datos.
     *
     * @return Map con par [nombre,cantidad]
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static Map<String,String> getCantxNombre() throws SQLException, InstantiationException, IllegalAccessException {

        
        ConexionBD con = ConexionBD.getConexion();
        Map<String,String> salida;

        String consulta;
        String[][] valores;
        valores = new String[50][2];

        /*  Consulta que nos devuelve todos los nombres de los rubros con la cantidad de cada uno relacionada con los establecimientos
        
                (select rubro.nombre as nombre, count(rubro.nombre) as cant 
                from rubro INNER JOIN establecimiento_has_rubro ON establecimiento_has_rubro.Rubro_id=rubro.id  
                group by rubro.nombre)

            UNION

                (select R.nombre as nombre, 0 as cant 
                FROM   rubro R
                WHERE  NOT EXISTS (SELECT 1
                                   FROM   establecimiento_has_rubro e
                                   WHERE  r.id = e.Rubro_id) )

            order by nombre asc;
        
        */
        
        
        consulta = "(select rubro.nombre as nombre, count(rubro.nombre) as cant";
        consulta += " from rubro INNER JOIN establecimiento_has_rubro ON establecimiento_has_rubro.Rubro_id=rubro.id";
        consulta += " group by rubro.nombre)";
        consulta += " UNION";
        consulta += " (select R.nombre as nombre, 0 as cant";
        consulta += " FROM rubro R";
        consulta += " WHERE NOT EXISTS (SELECT 1";
        consulta += " FROM establecimiento_has_rubro e";
        consulta += " WHERE r.id = e.Rubro_id))";
        consulta += " order by nombre asc;";

        valores = con.recuperar(valores, consulta, 2);

        salida = new LinkedHashMap<>();
        
        for (String[] valore : valores) {
            if (valore[0] == null) {
                break;
            }
            salida.put(valore[0],valore[1]);
        }

        return salida;
    }

}//end Rubro
