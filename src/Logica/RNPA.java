

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:01
 */
package Logica;
import Persistencia.ConexionBD;
import java.sql.SQLException;
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
     * Metodo que guarda RNPA en la BD. Require que el producto alimenticio halla sido cargado
     *
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public void guardar() throws SQLException, InstantiationException, IllegalAccessException {

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