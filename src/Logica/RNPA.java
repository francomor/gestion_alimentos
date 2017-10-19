

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:01
 */
package Logica;

import java.util.Date;

public class RNPA {

    private Date fecha_vencimiento;
    private int numero;
    public ProductoAlimenticio m_ProductoAlimenticio;

    public RNPA() {

    }

    public void finalize() throws Throwable {

    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ProductoAlimenticio getM_ProductoAlimenticio() {
        return m_ProductoAlimenticio;
    }

    public void setM_ProductoAlimenticio(ProductoAlimenticio m_ProductoAlimenticio) {
        this.m_ProductoAlimenticio = m_ProductoAlimenticio;
    }

    /**
     *
     * @param RNPA
     */
    public boolean guardar(RNPA RNPA) {
        return false;
    }
}//end RNPA