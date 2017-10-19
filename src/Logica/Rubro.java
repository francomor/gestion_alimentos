

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:08
 */
package Logica;

public class Rubro {

    private String nombre;
    public Establecimiento m_Establecimiento;

    public Rubro() {

    }

    public void finalize() throws Throwable {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Establecimiento getM_Establecimiento() {
        return m_Establecimiento;
    }

    public void setM_Establecimiento(Establecimiento m_Establecimiento) {
        this.m_Establecimiento = m_Establecimiento;
    }

    /**
     *
     * @param rubro
     */
    public boolean guardar(Rubro rubro) {
        return false;
    }
}//end Rubro