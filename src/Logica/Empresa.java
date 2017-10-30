/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:43:59
 */
package Logica;

import Persistencia.ConexionBD;
import java.sql.SQLException;
import java.util.Vector;

public class Empresa {

    private int CUIT;
    private String email;
    private String nombre;
    private String razon_social;
    private String direccion;
    private int telefono;

    public
    String getDireccion() {
        return direccion;
    }

    public
    void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

    public Empresa() {

    }

    public int getCUIT() {
        return CUIT;
    }

    public void setCUIT(int CUIT) {
        this.CUIT = CUIT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Recupera una empresa por su CUIT
     *
     * @param CUIT CUIT de la empresa
     * @return Empresa con todos sus valores cargados, en caso que no se
     * encuentre se devuelve null
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static Empresa recuperarPorCuit(String CUIT) throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        String[][] valores;
        Empresa salida = new Empresa();
        valores = new String[1][6];
        valores = con.recuperar(valores, "select * from empresa where CUIT=" + CUIT + ";", 6);
        if (valores[0][0] == null) {
            salida = null;
        } else {
            salida.setCUIT(Integer.parseInt(valores[0][0]));
            if (valores[0][1] != null) {
                salida.setEmail(valores[0][1]);
            }
             if (valores[0][2] != null) {
                salida.setDireccion(valores[0][2]);
            }
            if (valores[0][3] != null) {
                salida.setNombre(valores[0][3]);
            }
            if (valores[0][4] != null) {
                salida.setRazon_social(valores[0][4]);
            }
            if (valores[0][5] != null) {
                salida.setTelefono(Integer.parseInt(valores[0][5]));
            }
        }
        return salida;

    }
    
    public static Vector<Establecimiento> recuperarEstablecimientosAsociados(String CUIT) throws SQLException, InstantiationException, IllegalAccessException{
    
        Vector<Establecimiento> establecimientos = new Vector<>();

        String[][] valores;
        RNE RNEaux= new RNE();
        ConexionBD con = ConexionBD.getConexion();
        valores = new String[5][12];   
        valores = con.recuperar(valores, "select * from establecimiento where Empresa_CUIT=" + CUIT + ";", 12);  
        

            
         for (String[] establecimiento : valores){
            Establecimiento auxiliar = new Establecimiento();
           if (establecimiento!= null){ 
            if(establecimiento[0]!=null){
                System.out.println(establecimiento[0]);
            auxiliar.setId(Integer.parseInt(establecimiento[0]));}
            
            if(establecimiento[1]!=null){
            auxiliar.setDireccion(establecimiento[1]);}
            
            if(establecimiento[2]!=null){
            auxiliar.setFechaDeCarga(establecimiento[2]);}
            
            if(establecimiento[3]!=null){
            auxiliar.setNombre(establecimiento[3]);}
            
            if(establecimiento[4]!=null){
            auxiliar.setTelefono(Integer.parseInt(establecimiento[4]));}
            
            if(establecimiento[6]!=null){
            RNEaux.setNumero(Integer.parseInt(establecimiento[6]));}
            
            if(establecimiento[7]!=null){
            RNEaux.setFecha_vencimiento(establecimiento[7]);}
            
            auxiliar.setRne(RNEaux);
            
            if(establecimiento[8]!=null){
            auxiliar.setNro_factura(Integer.parseInt(establecimiento[8]));}
            
            auxiliar.setCUIT_Empresa(Integer.parseInt(CUIT));
            
            if(establecimiento[10]!=null){
            auxiliar.setId_Localidad(Integer.parseInt(establecimiento[10]));}
            
            if(establecimiento[11]!=null){
            auxiliar.setId_Categoria(Integer.parseInt(establecimiento[11]));}
            }
           if(establecimiento[0]!=null)
            establecimientos.add(auxiliar);
           auxiliar=null; //esto se hace porque sino limpio la variable carga 2 veces el mismo establecimiento.
         }
        
        return establecimientos;
    }
}//end Empresa
