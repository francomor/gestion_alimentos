

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:43:58
 */
package Logica;

public class ProductoAlimenticio {

    private int nro_factura;
    private String rotulo;

    public ProductoAlimenticio() {

    }

    public void finalize() throws Throwable {

    }

    public int getNro_factura() {
        return nro_factura;
    }

    public void setNro_factura(int nro_factura) {
        this.nro_factura = nro_factura;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    /**
     *
     * @param ProductoAlimenticio
     */
    public boolean guardar(ProductoAlimenticio ProductoAlimenticio) {
        return false;
    }
}//end ProductoAlimenticio