

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:02
 */

package Logica;

import java.util.Date;

public class Composicion {

    private String CAA;
    private String contenido;
    private String denominacion;
    private Date fecha_duracion;
    private String marca;
    private String nombre_comercial;
    private String nroytipo_registro_marca;
    public ProductoAlimenticio m_ProductoAlimenticio;

    public Composicion() {

    }

    public void finalize() throws Throwable {

    }
    
    public String getCAA() {
        return CAA;
    }

    public void setCAA(String CAA) {
        this.CAA = CAA;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Date getFecha_duracion() {
        return fecha_duracion;
    }

    public void setFecha_duracion(Date fecha_duracion) {
        this.fecha_duracion = fecha_duracion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre_comercial() {
        return nombre_comercial;
    }

    public void setNombre_comercial(String nombre_comercial) {
        this.nombre_comercial = nombre_comercial;
    }

    public String getNroytipo_registro_marca() {
        return nroytipo_registro_marca;
    }

    public void setNroytipo_registro_marca(String nroytipo_registro_marca) {
        this.nroytipo_registro_marca = nroytipo_registro_marca;
    }

    public ProductoAlimenticio getM_ProductoAlimenticio() {
        return m_ProductoAlimenticio;
    }

    public void setM_ProductoAlimenticio(ProductoAlimenticio m_ProductoAlimenticio) {
        this.m_ProductoAlimenticio = m_ProductoAlimenticio;
    }


    /**
     *
     * @param Composicion
     */
    public boolean guardar(Composicion Composicion) {
        return false;
    }
}//end Composicion
