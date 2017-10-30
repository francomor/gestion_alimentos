

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

    private int id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public RNPA getRnpa() {
        return rnpa;
    }

    public void setRnpa(RNPA rnpa) {
        this.rnpa = rnpa;
    }

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }

    
    
    /**
     * Metodo que guarda ProductoAlimenticio en la BD.
     *
     * @return boolean
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public boolean guardar()throws SQLException, InstantiationException, IllegalAccessException {
        
            ConexionBD con= ConexionBD.getConexion();
            String insert;
            //guardarEnvasexProducto();
            //guardarMateriaPrimaxProducto();
            
            insert = "INSERT INTO `producto_alimenticio`(`id`, `nro_factura`, `rotulo`, `Establecimiento_idEstablecimiento`) VALUES (default,";
            insert += "'"+ String.valueOf(nro_factura)+"',";
            insert += "'"+ rotulo+"',";
            insert += "'"+establecimiento.getId()+"');";
           //insert +=.rnpa.getNumero()+",";
           
          // insert +='"'+//VAN LOS DATE+'"'+",";
           
          // insert += fecha vencimiento rnpa 
          // insert +='"'+establecimiento.get+'"'+",";               

            boolean result=con.insertar(insert);
            
            id=con.recuperarUltimoIdIngresado("producto_alimenticio");
            descripcion.setM_ProductoAlimenticio(this);
            descripcion.guardar();
            composicion.setM_ProductoAlimenticio(this);
            composicion.guardar();
            rnpa.setM_ProductoAlimenticio(this);
            rnpa.guardar();
            return !result;
    }
    
    //preguntar cual les parece mejor
    /**
     * Metodo que guarda ProductoAlimenticio en la BD.
     *
     * @return boolean
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public boolean guardarTODOJUNTO()throws SQLException, InstantiationException, IllegalAccessException {
        
            ConexionBD con= ConexionBD.getConexion();
            String insert;
            //guardarEnvasexProducto();
            //guardarMateriaPrimaxProducto();
            insert = "INSERT INTO `producto_alimenticio`(`id`, `nro_factura`, `nro_RNPA`, `rotulo`, `CAA`,"
                    + " `contenido`, `denominacion`, "
                    //+ "`fecha_duracion`, "
                    + "`marca`, `nombre_comercial`, `num_y_tipo_reg_marca`,"
                   // + " `fecha_carga_solicitud`, "
                    + "`Controles_y_cuidados`, `destino_prod`, `forma_uso`, `info_adicional`, "
                    + "`instrucciones_preparacion`, `lugar_venta`, `modo_conservacion`, `periodo_aptitud`, "
                    //+ "`Vencimiento_RNPA`, "
                    + "`Establecimiento_idEstablecimiento`) VALUES (default,";
            insert += "'"+ String.valueOf(nro_factura)+"',";
            insert += "'"+ String.valueOf(rnpa.getNumero()) +"',";
            insert += "'"+ rotulo+"',";
            
            insert += "'"+ composicion.getCAA()   +"',";
            insert += "'"+ composicion.getContenido() +"',";
            insert += "'"+ composicion.getDenominacion() +"',";
            //insert += "`fecha_duracion`='" + fecha_duracion   +"',";
            insert += "'"+ composicion.getMarca() +"',";
            insert += "'"+ composicion.getNombre_comercial() +"',";
            insert += "'"+ composicion.getNroytipo_registro_marca() +"',"; ;
            
            //insert fecha carga solicitud hay que poner la del dia actual
            insert += "'"+ descripcion.getControlesycuidados() +"',";
            insert += "'"+ descripcion.getDestino_producto() +"',";
            insert += "'"+ descripcion.getForma_uso_producto() +"',";
            insert += "'"+ descripcion.getInformacion_adicional() +"',";
            insert += "'"+ descripcion.getIntrucciones_preparacion() +"',";
            insert += "'"+ descripcion.getLugar_venta() +"',";
            insert += "'"+ descripcion.getModo_conservacion() +"',";
            insert += "'"+ descripcion.getPeriodo_aptitud() +"',";
            
            //insert += "'"+ rnpa.getFecha_vencimiento() +"',";
            
            insert += "'"+ establecimiento.getId()+"');";
           //insert +=.rnpa.getNumero()+",";
           
          // insert +='"'+//VAN LOS DATE+'"'+",";
           
          // insert += fecha vencimiento rnpa 
          // insert +='"'+establecimiento.get+'"'+",";               

            boolean result=con.insertar(insert);
            
            
            return !result;
    }
    
    private void guardarEnvasexProducto() {
        
    }

    private void guardarMateriaPrimaxProducto() {
       
    }
}//end ProductoAlimenticio