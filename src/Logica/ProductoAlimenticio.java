package Logica;

import Persistencia.ConexionBD;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

/**
 * @author Francisco Herrero, Franco Morero y Mauricio Vazquez
 * @version 1.0
 */
public class ProductoAlimenticio {

    private int id;
    private int nro_factura;
    private String rotulo;
    private Calendar fecha_carga_solicitud;
    private Descripcion descripcion;
    private Composicion composicion;
    private MuestraLaboratorio muestraLaboratorio;
    private Vector<MateriaPrima> materiasPrimas;
    private Vector<Envase> Envases;
    private RNPA rnpa;
    private Establecimiento establecimiento;

    public ProductoAlimenticio() {
        materiasPrimas = new Vector();
        Envases = new Vector();
    }

    public Calendar getFecha_carga_solicitud() {
        return fecha_carga_solicitud;
    }

    public void setFecha_carga_solicitud(Calendar fecha_carga_solicitud) {
        this.fecha_carga_solicitud = fecha_carga_solicitud;
    }

    /**
     * Set fecha_carga_solicitud
     *
     * @param fecha String con formato 2017-11-31
     */
    public void setFecha_carga_solicitud(String fecha) {
        Calendar cal_aux = GregorianCalendar.getInstance();
        cal_aux.set(Integer.parseInt(fecha.substring(0, 4)), Integer.parseInt(fecha.substring(5, 7)), Integer.parseInt(fecha.substring(8, 10)));
        this.fecha_carga_solicitud = cal_aux;
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

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Descripcion descripcion) {
        this.descripcion = descripcion;
    }

    public Composicion getComposicion() {
        return composicion;
    }

    public void setComposicion(Composicion composicion) {
        this.composicion = composicion;
    }

    public MuestraLaboratorio getMuestraLaboratorio() {
        return muestraLaboratorio;
    }

    public void setMuestraLaboratorio(MuestraLaboratorio muestraLaboratorio) {
        this.muestraLaboratorio = muestraLaboratorio;
    }

    public Vector<MateriaPrima> getMateriasPrimas() {
        return materiasPrimas;
    }

    public void setMateriasPrimas(Vector<MateriaPrima> materiasPrimas) {
        this.materiasPrimas = materiasPrimas;
    }

    public void agregarMP(MateriaPrima mp) {
        this.materiasPrimas.add(mp);
    }

    public void addEnvase(Envase envase) {
        Envases.add(envase);
    }

    public Vector<Envase> getEnvases() {
        return Envases;
    }

    public void setEnvases(Vector<Envase> Envases) {
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
     * @return boolean verdadero si se guardo correctamente
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public boolean guardar() throws SQLException, InstantiationException, IllegalAccessException {

        ConexionBD con = ConexionBD.getConexion();
        String insert;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        insert = "INSERT INTO `producto_alimenticio`(`id`, `nro_factura`, `nro_RNPA`, `rotulo`, `CAA`,"
                + " `contenido`, `denominacion`, "
                + "`fecha_duracion`, "
                + "`marca`, `nombre_comercial`, `num_y_tipo_reg_marca`,"
                + " `fecha_carga_solicitud`, "
                + "`Controles_y_cuidados`, `destino_prod`, `forma_uso`, `info_adicional`, "
                + "`instrucciones_preparacion`, `lugar_venta`, `modo_conservacion`, `periodo_aptitud`, "
                + "`Vencimiento_RNPA`, "
                + "`ml_nroActa`, `ml_nroProtocolo`, "
                + "`Establecimiento_idEstablecimiento`) VALUES (default,";

        insert += "'" + String.valueOf(nro_factura) + "',";
        insert += "'" + String.valueOf(rnpa.getNumero()) + "',";
        insert += "'" + rotulo + "',";

        insert += "'" + composicion.getCAA() + "',";
        insert += "'" + composicion.getContenido() + "',";
        insert += "'" + composicion.getDenominacion() + "',";
        insert += "'" + sdf.format(composicion.getFecha_duracion().getTime()) + "',";
        insert += "'" + composicion.getMarca() + "',";
        insert += "'" + composicion.getNombre_comercial() + "',";
        insert += "'" + composicion.getNroytipo_registro_marca() + "',";

        insert += "'" + sdf.format(this.getFecha_carga_solicitud().getTime()) + "',";

        insert += "'" + descripcion.getControlesycuidados() + "',";
        insert += "'" + descripcion.getDestino_producto() + "',";
        insert += "'" + descripcion.getForma_uso_producto() + "',";
        insert += "'" + descripcion.getInformacion_adicional() + "',";
        insert += "'" + descripcion.getIntrucciones_preparacion() + "',";
        insert += "'" + descripcion.getLugar_venta() + "',";
        insert += "'" + descripcion.getModo_conservacion() + "',";
        insert += "'" + descripcion.getPeriodo_aptitud() + "',";

        insert += "'" + sdf.format(rnpa.getFecha_vencimiento().getTime()) + "',";

        insert += "'" + String.valueOf(muestraLaboratorio.getNumActa()) + "',";
        insert += "'" + String.valueOf(muestraLaboratorio.getNumProtocolo()) + "',";

        insert += "'" + establecimiento.getId() + "');";

        boolean result;
        result = !con.insertar(insert);

        id = con.recuperarUltimoIdIngresado("producto_alimenticio");

        if (result == true) {
            result = guardarEnvasexProducto();
            if (result == true) {
                result = guardarMateriaPrimaxProducto();
            }
        }

        return result;
    }

    /**
     * Metodo que guarda EnvasexProducto en la BD.
     *
     * @return boolean verdadero si se carga bien
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    private boolean guardarEnvasexProducto() throws SQLException, InstantiationException, IllegalAccessException {
        int e_id;
        ConexionBD con = ConexionBD.getConexion();
        boolean result = false;
        for (Envase e : Envases) {
            if (!e.existe_envase(e.getCapacidad(), e.getMaterial(), e.getUnidad())) {
                e.guardar_envase(e.getCapacidad(), e.getMaterial(), e.getUnidad());
                e_id = con.recuperarUltimoIdIngresado("envase");
            } else {
                e_id = e.get_id();
            }
            result = !con.insertar("INSERT INTO `producto_alimenticio_has_envase`(`Producto_Alimenticio_id`, `Envase_id`) VALUES (" + id + "," + e_id + ");");

            //si hay un error salir
            if (result == false) {
                break;
            }
        }
        return result;
    }

    /**
     * Metodo que guarda MateriaPrimaxProducto en la BD.
     *
     * @return boolean verdadero si se carga bien
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    private boolean guardarMateriaPrimaxProducto() throws InstantiationException, IllegalAccessException, SQLException {
        int mp_id;
        ConexionBD con = ConexionBD.getConexion();
        boolean result = false;

        for (MateriaPrima mp : materiasPrimas) {
            mp_id = mp.getId();
            result = !con.insertar("INSERT INTO `producto_alimenticio_has_materia_prima`(`Producto_Alimenticio_id`, `materia_prima_id`,`cantidad_mat_prima`) VALUES (" + id + "," + mp_id + ",'" + mp.getCantidad() + "');");

            //si hay un error salir
            if (result == false) {
                break;
            }
        }
        return result;
    }

}//end ProductoAlimenticio
