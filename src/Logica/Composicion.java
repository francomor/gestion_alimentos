

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:02
 */

package Logica;

import Persistencia.ConexionBD;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Composicion {

    private String CAA;
    private String contenido;
    private String denominacion;
    private Calendar fecha_duracion;
    private String marca;
    private String nombre_comercial;
    private String nroytipo_registro_marca;
    private ProductoAlimenticio m_ProductoAlimenticio;

    public Composicion() {

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

    public Calendar getFecha_duracion() {
        return fecha_duracion;
    }

    public void setFecha_duracion(Calendar fecha_duracion) {
        this.fecha_duracion = fecha_duracion;
    }
    /**
     * Set fecha_duracion
     *
     * @param fecha String con formato 2017-11-31
     */
    public void setFecha_duracion(String fecha) {
        Calendar cal_aux = GregorianCalendar.getInstance();
        cal_aux.set(Integer.parseInt(fecha.substring(0, 4)), Integer.parseInt(fecha.substring(5, 7)), Integer.parseInt(fecha.substring(8, 10)));
        this.fecha_duracion = cal_aux;
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
     * Metodo que actualiza Composicion en la BD. Require que el producto alimenticio halla sido cargado
     *
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public void update() throws SQLException, InstantiationException, IllegalAccessException {

        ConexionBD con = ConexionBD.getConexion();
        String update;
        if(m_ProductoAlimenticio != null){
            update = "UPDATE `producto_alimenticio` SET ";
            update += "`CAA`='" + CAA   +"',";
            update += "`contenido`='" + contenido   +"',";
            update += "`denominacion`='" + denominacion   +"',";
            //insert += "`fecha_duracion`='" + fecha_duracion   +"',";
            update += "`marca`='" + marca   +"',";
            update += "`nombre_comercial`='" + nombre_comercial   +"',";
            update += "`num_y_tipo_reg_marca`='" + nroytipo_registro_marca +"' "; ;
            update += "WHERE id='" + m_ProductoAlimenticio.getId() + "';";

            con.update(update);
        }
        
    }
}//end Composicion
