

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:43:58
 */
package Logica;

import Persistencia.ConexionBD;
import java.sql.SQLException;
import java.util.List;

public class ProductoAlimenticio {

    private int nro_factura;
    private String rotulo;
    private Descripcion descripcion;
    private Composicion composicion;
    private MuestraLaboratorio muestraLaboratorio;
    private List<MateriaPrima> materiasPrimas;
    private List<Envase> Envases;
    private RNPA rnpa;
    private Establecimiento establecimiento;

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

    public
    Descripcion getDescripcion() {
        return descripcion;
    }

    public
    void setDescripcion(Descripcion descripcion) {
        this.descripcion = descripcion;
    }

    public
    Composicion getComposicion() {
        return composicion;
    }

    public
    void setComposicion(Composicion composicion) {
        this.composicion = composicion;
    }

    public
    MuestraLaboratorio getMuestraLaboratorio() {
        return muestraLaboratorio;
    }

    public
    void setMuestraLaboratorio(MuestraLaboratorio muestraLaboratorio) {
        this.muestraLaboratorio = muestraLaboratorio;
    }

    public
    List<MateriaPrima> getMateriasPrimas() {
        return materiasPrimas;
    }

    public
    void setMateriasPrimas(List<MateriaPrima> materiasPrimas) {
        this.materiasPrimas = materiasPrimas;
    }

    public
    List<Envase> getEnvases() {
        return Envases;
    }

    public
    void setEnvases(List<Envase> Envases) {
        this.Envases = Envases;
    }

    
    
    /**
     *
     * @param productoAlimenticio
     * @param ProductoAlimenticio
     * @return 
     */
    public boolean guardar(ProductoAlimenticio productoAlimenticio)throws SQLException, InstantiationException, IllegalAccessException {
        
            ConexionBD con= ConexionBD.getConexion();
        
            guardarEnvasexProducto();
            guardarMateriaPrimaxProducto();
            
           String insert = "INSERT INTO `producto_alimenticio`(`id`, `nro_factura`, `nro_RNPA`, `rotulo`, `CAA`, `contenido`, `denominacion`, `fecha_duracion`, `marca`, `nombre_comercial`, `num_y_tipo_reg_marca`, `fecha_carga_solicitud`, `Controles_y_cuidados`, `destino_prod`, `forma_uso`, `info_adicional`, `instrucciones_preparacion`, `lugar_venta`, `modo_conservacion`, `periodo_aptitud`, `Vencimiento_RNPA`, `Establecimiento_idEstablecimiento`) VALUES(default,";
           insert +=productoAlimenticio.nro_factura+",";
           insert +=productoAlimenticio.rnpa.getNumero()+",";
           insert +='"'+productoAlimenticio.composicion.getCAA()+'"'+",";
           insert +='"'+productoAlimenticio.composicion.getContenido()+'"'+",";
           insert +='"'+productoAlimenticio.composicion.getDenominacion()+'"'+",";
          // insert +='"'+//VAN LOS DATE+'"'+",";
           insert +='"'+productoAlimenticio.composicion.getMarca()+'"'+",";
           insert +='"'+productoAlimenticio.composicion.getNombre_comercial()+'"'+",";
           insert +='"'+productoAlimenticio.composicion.getNroytipo_registro_marca()+'"'+",";
           //insert += fecha carga solicitud (hoy)
           insert +='"'+productoAlimenticio.descripcion.getControlesycuidados()+'"'+",";
           insert +='"'+productoAlimenticio.descripcion.getDestino_producto()+'"'+",";
           insert +='"'+productoAlimenticio.descripcion.getForma_uso_producto()+'"'+",";
           insert +='"'+productoAlimenticio.descripcion.getInformacion_adicional()+'"'+",";
           insert +='"'+productoAlimenticio.descripcion.getIntrucciones_preparacion()+'"'+",";
           insert +='"'+productoAlimenticio.descripcion.getLugar_venta()+'"'+",";
           insert +='"'+productoAlimenticio.descripcion.getModo_conservacion()+'"'+",";
           insert +='"'+productoAlimenticio.descripcion.getPeriodo_aptitud()+'"'+",";
          // insert += fecha vencimiento rnpa 
          // insert +='"'+establecimiento.get+'"'+","; 
           insert+=1;
              

        boolean result=con.insertar(productoAlimenticio.composicion.getCAA()+"')");
        return false;
    }

    private
    void guardarEnvasexProducto() {
        
    }

    private
    void guardarMateriaPrimaxProducto() {
       
    }
}//end ProductoAlimenticio