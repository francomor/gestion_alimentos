

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:00
 */
package Logica;

import Persistencia.ConexionBD;
import java.sql.SQLException;
import java.util.Date;


public class Establecimiento {

    private String categoria;
    private String direccion;
    private Date fechaDeCarga;
    private String nombre;
    private int telefono;
    private boolean archivos_adjuntos;
    private int nro_factura;
    private int CUIT_Empresa;
    private int id_Categoria;
    private int id_Localidad;
    private RNE rne;
    
    private Empresa m_Empresa;

    public Establecimiento() {

    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaDeCarga() {
        return fechaDeCarga;
    }

    public void setFechaDeCarga(Date fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Empresa getM_Empresa() {
        return m_Empresa;
    }

    public void setM_Empresa(Empresa m_Empresa) {
        this.m_Empresa = m_Empresa;
    }

    public boolean isArchivos_adjuntos() {
        return archivos_adjuntos;
    }

    public void setArchivos_adjuntos(boolean archivos_adjuntos) {
        this.archivos_adjuntos = archivos_adjuntos;
    }

    public int getCUIT_Empresa() {
        return CUIT_Empresa;
    }

    public void setCUIT_Empresa(int id_Empresa) {
        this.CUIT_Empresa = CUIT_Empresa;
    }

    public int getId_Categoria() {
        return id_Categoria;
    }

    public void setId_Categoria(int id_Categoria) {
        this.id_Categoria = id_Categoria;
    }

    public int getId_Localidad() {
        return id_Localidad;
    }

    public void setId_Localidad(int id_Localidad) {
        this.id_Localidad = id_Localidad;
    }

    public int getNro_factura() {
        return nro_factura;
    }

    public void setNro_factura(int nro_factura) {
        this.nro_factura = nro_factura;
    }

    public RNE getRne() {
        return rne;
    }

    public void setRne(RNE rne) {
        this.rne = rne;
    }

    
    /**
     *
     * @param establecimiento
     */
    public boolean guardar(Establecimiento establecimiento) {
        return false;
    }
    
    public static Establecimiento recuperarPorId(String id) throws SQLException, InstantiationException, IllegalAccessException{
        ConexionBD con= ConexionBD.getConexion();
        String[][] valores;
        
        Establecimiento estab = new Establecimiento();
        RNE rne = new RNE();
        valores = new String[1][12];
        valores = con.recuperar(valores,"select * from establecimiento where id="+ id +";",12);
       
        if(valores[0][1]!=null)
            estab.setDireccion(valores[0][1]);
        if(valores[0][2]!=null)
            //estab.setFechaDeCarga(valores[0][2]);
        if(valores[0][3]!=null)
            estab.setNombre(valores[0][3]);
        if(valores[0][4]!=null)
            estab.setTelefono(Integer.parseInt(valores[0][4]));
        
        if(valores[0][5]!=null)
            estab.setArchivos_adjuntos(true);
        else
            estab.setArchivos_adjuntos(false);
        
        if(valores[0][6]!=null)
            rne.setNumero(Integer.parseInt(valores[0][6]));
        if(valores[0][7]!=null)
           // rne.setFecha_vencimiento(valores[0][4]);
        estab.setRne(rne);
        
        if(valores[0][8]!=null)
            estab.setNro_factura(Integer.parseInt(valores[0][4]));
        if(valores[0][9]!=null)
            estab.setCUIT_Empresa(Integer.parseInt(valores[0][4]));
        if(valores[0][9]!=null)
            estab.setId_Localidad(Integer.parseInt(valores[0][4]));
        if(valores[0][9]!=null)
            estab.setId_Categoria(Integer.parseInt(valores[0][4]));
              
        
        return estab;
    }
}//end Establecimiento