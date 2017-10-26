

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

    public void finalize() throws Throwable {

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
    
    public boolean existe(String materiaprima) throws SQLException, InstantiationException, IllegalAccessException{
        
        ConexionBD con= ConexionBD.getConexion();
        boolean result=con.existe("select exists (select nombre from materia_prima where nombre='"+materiaprima+"')");
        return result; 
    }
    /**
     *
     * @param MateriaPrima
     */
     public boolean guardar(MateriaPrima materiaprima) throws SQLException, InstantiationException, IllegalAccessException{
        
        ConexionBD con= ConexionBD.getConexion();
        

        boolean result=con.insertar("insert into materia_prima (id,nombre) values (default,'"+materiaprima.nombre+"')");
        return result; 
    }
     
    
      public void update(MateriaPrima materiaprima,String aCambiar) throws SQLException, InstantiationException, IllegalAccessException{
        ConexionBD con=ConexionBD.getConexion();
        con.update("UPDATE materia_prima SET nombre='"+materiaprima.nombre+"' WHERE nombre='"+aCambiar+"'");
    }
       public static Vector<String> recuperarTodosNombres() throws SQLException, InstantiationException, IllegalAccessException{
        ConexionBD con= ConexionBD.getConexion();
        String[][] valores;
        valores = new String[10][1];
        valores = con.recuperar(valores,"select nombre from materia_prima",1);
        Vector<String> salida = new Vector<String>();
        for (String[] valore : valores) {
            if (valore[0]==null) {
                break;
            }
            salida.add(valore[0]);
        }
        
        return (Vector<String>) salida;
    }
    public void borrar(MateriaPrima mp) throws SQLException, InstantiationException, IllegalAccessException{
        ConexionBD con=ConexionBD.getConexion();
        con.update("DELETE FROM `materia_prima` WHERE nombre='"+mp.getNombre()+"';");
    }
}//end MateriaPrima
