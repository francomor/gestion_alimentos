

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:00
 */
package Logica;

import java.util.Date;


public class Establecimiento {

    private String categoria;
    private String direccion;
    private Date fechaDeCarga;
    private String nombre;
    private int telefono;
    public Empresa m_Empresa;
    public ProductoAlimenticio m_ProductoAlimenticio;

    public Establecimiento() {

    }

    public void finalize() throws Throwable {

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

    public ProductoAlimenticio getM_ProductoAlimenticio() {
        return m_ProductoAlimenticio;
    }

    public void setM_ProductoAlimenticio(ProductoAlimenticio m_ProductoAlimenticio) {
        this.m_ProductoAlimenticio = m_ProductoAlimenticio;
    }

    /**
     *
     * @param establecimiento
     */
    public boolean guardar(Establecimiento establecimiento) {
        return false;
    }
}//end Establecimiento