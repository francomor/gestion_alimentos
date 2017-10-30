

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:04
 */

package Logica;

import Persistencia.ConexionBD;
import java.sql.SQLException;

public class Descripcion {

    private String controlesycuidados;
    private String destino_producto;
    private String forma_uso_producto;
    private String informacion_adicional;
    private String intrucciones_preparacion;
    private String lugar_venta;
    private String modo_conservacion;
    private String periodo_aptitud;
    public ProductoAlimenticio m_ProductoAlimenticio;

    public Descripcion() {

    }

    public void finalize() throws Throwable {

    }

    public String getControlesycuidados() {
        return controlesycuidados;
    }

    public void setControlesycuidados(String controlesycuidados) {
        this.controlesycuidados = controlesycuidados;
    }

    public String getDestino_producto() {
        return destino_producto;
    }

    public void setDestino_producto(String destino_producto) {
        this.destino_producto = destino_producto;
    }

    public String getForma_uso_producto() {
        return forma_uso_producto;
    }

    public void setForma_uso_producto(String forma_uso_producto) {
        this.forma_uso_producto = forma_uso_producto;
    }

    public String getInformacion_adicional() {
        return informacion_adicional;
    }

    public void setInformacion_adicional(String informacion_adicional) {
        this.informacion_adicional = informacion_adicional;
    }

    public String getIntrucciones_preparacion() {
        return intrucciones_preparacion;
    }

    public void setIntrucciones_preparacion(String intrucciones_preparacion) {
        this.intrucciones_preparacion = intrucciones_preparacion;
    }

    public String getLugar_venta() {
        return lugar_venta;
    }

    public void setLugar_venta(String lugar_venta) {
        this.lugar_venta = lugar_venta;
    }

    public String getModo_conservacion() {
        return modo_conservacion;
    }

    public void setModo_conservacion(String modo_conservacion) {
        this.modo_conservacion = modo_conservacion;
    }

    public String getPeriodo_aptitud() {
        return periodo_aptitud;
    }

    public void setPeriodo_aptitud(String periodo_aptitud) {
        this.periodo_aptitud = periodo_aptitud;
    }

    public ProductoAlimenticio getM_ProductoAlimenticio() {
        return m_ProductoAlimenticio;
    }

    public void setM_ProductoAlimenticio(ProductoAlimenticio m_ProductoAlimenticio) {
        this.m_ProductoAlimenticio = m_ProductoAlimenticio;
    }

    /**
     * Metodo que guarda Descripcion en la BD. Require que el producto alimenticio halla sido cargado
     *
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public void guardar() throws SQLException, InstantiationException, IllegalAccessException {

        ConexionBD con = ConexionBD.getConexion();
        String insert;
        
        if(m_ProductoAlimenticio != null){
            insert = "UPDATE `producto_alimenticio` SET ";
            insert += "`Controles_y_cuidados`='" + controlesycuidados   +"',";
            insert += "`destino_prod`='" + destino_producto   +"',";
            insert += "`forma_uso`='" + forma_uso_producto   +"',";
            insert += "`info_adicional`='" + informacion_adicional   +"',";
            insert += "`instrucciones_preparacion`='" + intrucciones_preparacion   +"',";
            insert += "`lugar_venta`='" + lugar_venta   +"',";
            insert += "`modo_conservacion`='" + modo_conservacion   +"',";
            insert += "`periodo_aptitud`='" + periodo_aptitud +"' ";
            insert += "WHERE id='" + m_ProductoAlimenticio.getId() + "';";

            con.update(insert);
        }
        
    }
}//end Descripcion
