

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

    public void finalize() throws Throwable {

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
     *
     * @param Envase
     */
    /*public boolean guardar(Envase envase) throws SQLException, InstantiationException, IllegalAccessException{
        
        ConexionBD con= ConexionBD.getConexion();
        

        boolean result=con.insertar("insert into rubro (id,nombre) values (default,'"+rubro.nombre+"')");
        return result; 
    }
     
    public void update(Rubro rubro,String aCambiar) throws SQLException, InstantiationException, IllegalAccessException{
        ConexionBD con=ConexionBD.getConexion();
        con.update("UPDATE rubro SET nombre='"+rubro.nombre+"' WHERE nombre='"+aCambiar+"'");
    }*/
     
    public void borrar(Rubro rubro) throws SQLException, InstantiationException, IllegalAccessException{
        ConexionBD con=ConexionBD.getConexion();
        con.update("DELETE FROM `rubro` WHERE nombre='"+rubro.getNombre()+"';");
    }
    
    public static Vector<String> recuperarTodosMateriales() throws SQLException, InstantiationException, IllegalAccessException{
        ConexionBD con= ConexionBD.getConexion();
        String[][] valores;
        valores = new String[10][1];
        valores = con.recuperar(valores,"select nombre from material",1);
        Vector<String> salida = new Vector<String>();
        for (String[] valore : valores) {
            if (valore[0]==null) {
                break;
            }
            salida.add(valore[0]);
        }
        
        return (Vector<String>) salida;
    }
       public static Vector<String> recuperarTodosUnidades() throws SQLException, InstantiationException, IllegalAccessException{
        ConexionBD con= ConexionBD.getConexion();
        String[][] valores;
        valores = new String[10][1];
        valores = con.recuperar(valores,"select nombre from unidad",1);
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
    
        public boolean existe_material(String nom_mat) throws SQLException, InstantiationException, IllegalAccessException{
        
        ConexionBD con= ConexionBD.getConexion();
        boolean result=con.existe("select exists (select nombre from material where nombre='"+nom_mat+"')");
        return result; 
    }
    public boolean existe_unidad(String nom_uni) throws SQLException, InstantiationException, IllegalAccessException{
       
        ConexionBD con= ConexionBD.getConexion();
        boolean result=con.existe("select exists (select nombre from unidad where nombre='"+nom_uni+"')");
        return result; 
    }
    
    public boolean guardar_material(String nom_mat) throws SQLException, InstantiationException, IllegalAccessException{
        
        ConexionBD con= ConexionBD.getConexion();
        

        boolean result=con.insertar("insert into material (id,nombre) values (default,'"+nom_mat+"')");
        return result; 
    }
    public boolean guardar_unidad(String nom_uni) throws SQLException, InstantiationException, IllegalAccessException{
       
        ConexionBD con= ConexionBD.getConexion();
        

        boolean result=con.insertar("insert into unidad (id,nombre) values (default,'"+nom_uni+"')");
        return result; 
    }
    
    public boolean guardar_envase(String cap,String mat,String uni) throws SQLException, InstantiationException, IllegalAccessException{
        ConexionBD con= ConexionBD.getConexion();
        //obtengo los id de material y unidad, pero no es eficiente.
        String[][] material;
        material = new String[1][1];
        material = con.recuperar(material,"select id from material where nombre='"+mat+"'",1);
        Vector<String> id_mat = new Vector<String>();
        for (String[] valore : material) {
            if (valore[0]==null) {
                break;
            }
            id_mat.add(valore[0]);
        }
        
        String[][] unidad;
        unidad = new String[1][1];
        unidad = con.recuperar(unidad,"select id from unidad where nombre='"+uni+"'",1);
        Vector<String> id_uni = new Vector<String>();
        for (String[] valore1 : unidad) {
            if (valore1[0]==null) {
                break;
            }
            id_uni.add(valore1[0]);
        }
        
        //insertar en envase los valores obtenidos.
        boolean result=con.insertar("insert into envase (id,capacidad,Material_id,Unidad_id) values (default,'"+cap+"','"+id_mat.firstElement()+"','"+id_uni.firstElement()+"')");
        return result; 
    }
}//end Envase
