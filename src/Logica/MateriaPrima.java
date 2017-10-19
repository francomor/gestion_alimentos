

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:44:07
 */
package Logica;

public class MateriaPrima {

    private int cantidad;
    private String nombre;
    public ProductoAlimenticio m_ProductoAlimenticio;

    public MateriaPrima() {

    }

    public void finalize() throws Throwable {

    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ProductoAlimenticio getM_ProductoAlimenticio() {
        return m_ProductoAlimenticio;
    }

    public void setM_ProductoAlimenticio(ProductoAlimenticio m_ProductoAlimenticio) {
        this.m_ProductoAlimenticio = m_ProductoAlimenticio;
    }

    /**
     *
     * @param MateriaPrima
     */
    public boolean guardar(MateriaPrima MateriaPrima) {
        return false;
    }
}//end MateriaPrima
