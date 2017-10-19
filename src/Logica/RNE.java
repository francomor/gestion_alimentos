

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:00
 */
package Logica;
import java.util.Date;

public class RNE {

    private Date fecha_vencimiento;
    private int numero;
    public Establecimiento m_Establecimiento;

    public RNE() {

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

    public Establecimiento getM_Establecimiento() {
        return m_Establecimiento;
    }

    public void setM_Establecimiento(Establecimiento m_Establecimiento) {
        this.m_Establecimiento = m_Establecimiento;
    }

    /**
     *
     * @param rne
     */
    public boolean guardar(RNE rne) {
        return false;
    }
}//end RNE
