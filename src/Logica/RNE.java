/**
 * @author Francisco Herrero, Franco Morero y Mauricio Vazquez
 * @version 1.0
 */
package Logica;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class RNE {

    private Calendar fecha_vencimiento;
    private int numero;
    public Establecimiento m_Establecimiento;

    public RNE() {

    }

    public Calendar getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Calendar fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    /**
     * Set fecha_vencimiento
     *
     * @param fecha String con formato 2017-11-31
     */
    public void setFecha_vencimiento(String fecha) {
        Calendar cal_aux = GregorianCalendar.getInstance();
        cal_aux.set(Integer.parseInt(fecha.substring(0, 4)), Integer.parseInt(fecha.substring(5, 7)), Integer.parseInt(fecha.substring(8, 10)));
        this.fecha_vencimiento = cal_aux;
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

}//end RNE
