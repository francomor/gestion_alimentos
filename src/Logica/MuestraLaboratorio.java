

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:03
 */
package Logica;


public class MuestraLaboratorio {

    private int numActa;
    private int numProtocolo;
    public ProductoAlimenticio m_ProductoAlimenticio;

    public MuestraLaboratorio() {

    }

    public void finalize() throws Throwable {

    }

    public int getNumActa() {
        return numActa;
    }

    public void setNumActa(int numActa) {
        this.numActa = numActa;
    }

    public int getNumProtocolo() {
        return numProtocolo;
    }

    public void setNumProtocolo(int numProtocolo) {
        this.numProtocolo = numProtocolo;
    }

    public ProductoAlimenticio getM_ProductoAlimenticio() {
        return m_ProductoAlimenticio;
    }

    public void setM_ProductoAlimenticio(ProductoAlimenticio m_ProductoAlimenticio) {
        this.m_ProductoAlimenticio = m_ProductoAlimenticio;
    }

    /**
     *
     * @param MuestraLaboratorio
     */
    public boolean guardar(MuestraLaboratorio MuestraLaboratorio) {
        return false;
    }
}//end MuestraLaboratorio