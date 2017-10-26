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

    public ConexionBD() throws InstantiationException, IllegalAccessException {
        crearConexion();
    }

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

    static public ConexionBD getConexion() throws InstantiationException, IllegalAccessException {

        if (instanciaBD == null) {
            instanciaBD = new ConexionBD();
        }
        return instanciaBD;
    }

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

    public void borrar(String consulta) {

        try {
            s.executeUpdate(consulta);
        } catch (Exception e) {

            System.out.println("Error al Eliminar");
            e.printStackTrace();
        }
    }

    public void update(String consulta) {
        try {
            s.executeUpdate(consulta);
        } catch (Exception e) {

            System.out.println("Error al actualizar");
            e.printStackTrace();
        }
    }

//nro es la cantidad de columnas a recuperar
//vector[i][j] i es la cantidad de filas y j la cantidad de columnas
    public String[][] recuperar(String[][] vector, String consulta, int nro) {

        int i, j = 0;

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

    public void cerrarConexion() {

        try {

            conn.close();
        } catch (Exception e) {

            System.out.println("Error al CERRAR Base de Datos");
            e.printStackTrace();
        }
    }

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
