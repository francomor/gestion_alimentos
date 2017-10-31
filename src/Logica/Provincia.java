/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.ConexionBD;
import java.sql.SQLException;

/**
 *
 * @author mauri
 */
class Provincia {
    
    private int id;
    private String nombre;

    public Provincia() {
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
    
    static Provincia recuperarProvinciaporID(String id)throws SQLException, InstantiationException, IllegalAccessException {
    
        Provincia salida=new Provincia();
        ConexionBD con = ConexionBD.getConexion();
        
        String[][] valores;
        valores = new String[1][2];
        valores = con.recuperar(valores, "select * from provincia where id=" + id + ";", 2);
        
        //si es nulo es porque no lo encontro.
        if(valores[0][0]==null)
            salida=null;
        else{
                salida.setId(Integer.parseInt(valores[0][0]));
                salida.setNombre(valores[0][1]);
        
        }
        return salida;
    
    }
}
