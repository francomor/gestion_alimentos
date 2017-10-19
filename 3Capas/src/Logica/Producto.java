/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.Base_de_Datos;
import java.sql.SQLException;


public class Producto {
    private String nombre;
public Producto (){
     this.nombre = null;
}


 public Producto(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre_Producto() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
    
    public boolean guardar(Producto producto) throws SQLException, InstantiationException, IllegalAccessException{
        
        Base_de_Datos con= Base_de_Datos.getConexion();
        boolean result=con.insertar("insert into producto values ('"+producto.nombre+"')");
        return result; 
    }
    
       public boolean existe(String producto_name) throws SQLException, InstantiationException, IllegalAccessException{
        
        Base_de_Datos con= Base_de_Datos.getConexion();
        boolean result=con.existe("select exists (select nombre from producto where nombre='"+producto_name+"')");
        return result; 
    }
    
    
}