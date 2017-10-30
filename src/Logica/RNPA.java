

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:01
 */
package Logica;
import Persistencia.ConexionBD;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class RNPA {

    private Calendar fecha_vencimiento;
    private int numero;
    public ProductoAlimenticio m_ProductoAlimenticio;

    public RNPA() {

    }

    public void finalize() throws Throwable {

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

    public ProductoAlimenticio getM_ProductoAlimenticio() {
        return m_ProductoAlimenticio;
    }

    public void setM_ProductoAlimenticio(ProductoAlimenticio m_ProductoAlimenticio) {
        this.m_ProductoAlimenticio = m_ProductoAlimenticio;
    }

     /**
     * Metodo que actualiza RNPA en la BD. Require que el producto alimenticio halla sido cargado
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
            update += "`nro_RNPA`='" + numero ;
            //update += "`Vencimiento_RNPA`='" + fecha_vencimiento;
            update += "' WHERE id='" + m_ProductoAlimenticio.getId() + "';";
            
            con.update(update);
        }
        
    }
}//end RNPA