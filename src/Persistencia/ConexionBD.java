package Persistencia;

import java.sql.*;

public final class ConexionBD {

    private final String url = "jdbc:mysql://localhost/";
    private final String bd = "uresa";
    private final String usuario = "root";
    private final String password = "admin";
    private Connection conn;
    private Statement s;

    private static ConexionBD instanciaBD = null;

    private ConexionBD() throws InstantiationException, IllegalAccessException {
        crearConexion();
    }

    /**
     * Crea una conexion a la base de datos
     *
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public void crearConexion() throws InstantiationException, IllegalAccessException {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url + bd, usuario, password);
            s = conn.createStatement();
            if (conn != null) {
                System.out.println("Conexión a base de datos " + url + bd + " ... Ok");
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos " + url);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    /**
     * Obtiene la conexion a la base de datos
     *
     * @return ConexionBD
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    static public ConexionBD getConexion() throws InstantiationException, IllegalAccessException {

        if (instanciaBD == null) {
            instanciaBD = new ConexionBD();
        }
        return instanciaBD;
    }

    /**
     * Inserta en la base de datos
     *
     * @param consulta consulta a realizar
     * @return ConexionBD
     */
    public boolean insertar(String consulta) {
        boolean error = false;
        try {
            s.executeUpdate(consulta);
        } catch (SQLException e) {

            System.out.println("Error al Insertar Code=" + e.getErrorCode());
            e.printStackTrace();
            if (e.getErrorCode() == 1062) {
                error = true;

            }
        }
        return error;
    }

    /**
     * Recupera el ultimo id de una tabla
     *
     * @param nombre_tabla nombre de la tabla
     * @return int ultimo id
     */
    public int recuperarUltimoIdIngresado(String nombre_tabla) {
        int salida = 0;
        try {
            ResultSet res = s.executeQuery("SELECT MAX(id) AS id FROM " + nombre_tabla);
            res.next();
            salida = res.getInt(1);

        } catch (Exception e) {

            System.out.println("Error Base de Datos" + e.getLocalizedMessage());
            e.printStackTrace();
        }
        return salida;
    }

    /**
     * Actualiza en la base de datos
     *
     * @param consulta consulta a realizar
     */
    public void update(String consulta) {
        try {
            s.executeUpdate(consulta);
        } catch (Exception e) {

            System.out.println("Error al actualizar");
            e.printStackTrace();
        }
    }

    /**
     * Recupera de la base de datos
     *
     * @param vector donde se guardaran
     * @param consulta consulta a realizar
     * @param nro cantidad de columnas a recuperar
     * @return String[][]
     */
    public String[][] recuperar(String[][] vector, String consulta, int nro) {

        int i, j = 0;
        //vector[i][j] i es la cantidad de filas y j la cantidad de columnas
        try {

            ResultSet res = s.executeQuery(consulta);
            while (res.next()) {

                for (i = 1; i <= nro; i++) {
                    vector[j][i - 1] = res.getString(i);
                }
                j++;
            }
        } catch (Exception e) {

            System.out.println("Error Base de Datos" + e.getLocalizedMessage());
            e.printStackTrace();
        }
        return vector;

    }

    /**
     * Obtiene la cantidad de registros
     *
     * @param consulta consulta a realizar
     * @return int cantidad de registros
     */
    public int getCantidadRegistros(String consulta) {

        int cant = 0;
        try {

            ResultSet res = s.executeQuery(consulta);
            while (res.next()) {
                cant++;
            }
        } catch (Exception e) {

            System.out.println("Error al retornar Cantidad de Registros de Base de Datos");
            e.printStackTrace();
        }
        return cant;
    }

    /**
     * Cierra la conexion a la base de datos
     */
    public void cerrarConexion() {

        try {

            conn.close();
        } catch (Exception e) {

            System.out.println("Error al CERRAR Base de Datos");
            e.printStackTrace();
        }
    }

    /**
     * Verifica existencia en la base de datos
     *
     * @param consulta consulta a realizar
     * @return boolean
     * @throws java.sql.SQLException
     */
    public boolean existe(String consulta) throws SQLException {
        ResultSet rs = s.executeQuery(consulta);
        try {
            rs.next();                // move to the first row
            return rs.getBoolean(1);  // first column is 1
        } finally {
            rs.close();
        }
    }

}
