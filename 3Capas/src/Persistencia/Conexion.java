/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bele
 */
public class Conexion {
    
        String bd = "test";
        String url = "jdbc:mysql://localhost/"+bd;
        String user = "root";
        String pass = "39386558";
        public Statement s;
    
    private static Connection con = null;

    public void crearConexion() throws InstantiationException, IllegalAccessException {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, pass);
            s = con.createStatement();
            if (con != null) {
                System.out.println("Conexión a base de datos " + url + bd + " ... Ok");
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos " + url);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    public void cerrarConexion() {

        try {

            con.close();
        } catch (Exception e) {

            System.out.println("Error al CERRAR Base de Datos");
            e.printStackTrace();
        }
    }
    
    
    public boolean insertar(String consulta) { //cuando es para insertar, executeUpdate devuelve 1 (OK)
       boolean error=false;
        try {
           int i= s.executeUpdate(consulta);
           if(i>0)
             {
              System.out.println("Se insertó OK");
             }
            else
             {
             System.out.println("Problema..");
             }   
        } catch (SQLException e) {

            System.out.println("Error al Insertar Code="+e.getErrorCode());
            e.printStackTrace();
            if (e.getErrorCode()==1062){
                error=true;
            }
        }
        return error;
    }
    
    public boolean existe (String consulta) throws SQLException{
             ResultSet rs = s.executeQuery(consulta);
            try{
            rs.next();                // move to the first row
            return rs.getBoolean(1);  // first column is 1
            }
            finally{
             rs.close();
            }
       }
    
}
