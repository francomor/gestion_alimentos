package Logica;

import Persistencia.ConexionBD;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

/**
 * @author Francisco Herrero, Franco Morero y Mauricio Vazquez
 * @version 1.0
 */
public class Establecimiento {

    private int id;
    private String direccion;
    private Calendar fechaDeCarga;
    private String nombre;
    private int telefono;
    private boolean archivos_adjuntos;
    private int nro_factura;
    private int CUIT_Empresa;
    private int id_Categoria;
    private int id_Localidad;
    private RNE rne;
    private Empresa m_Empresa;
    private Vector<ProductoAlimenticio> productosAlimenticios;

    public Establecimiento() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Calendar getFechaDeCarga() {
        return fechaDeCarga;
    }

    public void setFechaDeCarga(Calendar fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }

    /**
     * Set fechaDeCarga
     *
     * @param fecha String con formato 2017-11-31
     */
    public void setFechaDeCarga(String fecha) {
        Calendar cal_aux = GregorianCalendar.getInstance();
        cal_aux.set(Integer.parseInt(fecha.substring(0, 4)), Integer.parseInt(fecha.substring(5, 7))-1, Integer.parseInt(fecha.substring(8, 10)));
        this.fechaDeCarga = cal_aux;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * getEmpresa asociada
     *
     * @return Empresa asociada al establecimiento
     * @throws SQLException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public Empresa getM_Empresa() throws SQLException, InstantiationException, IllegalAccessException {
        return Empresa.recuperarPorCuit(String.valueOf(CUIT_Empresa));
    }

    public void setM_Empresa(Empresa m_Empresa) {
        this.m_Empresa = m_Empresa;
    }

    public boolean isArchivos_adjuntos() {
        return archivos_adjuntos;
    }

    public void setArchivos_adjuntos(boolean archivos_adjuntos) {
        this.archivos_adjuntos = archivos_adjuntos;
    }

    public int getCUIT_Empresa() {
        return CUIT_Empresa;
    }

    public void setCUIT_Empresa(int CUIT_Empresa) {
        this.CUIT_Empresa = CUIT_Empresa;
    }

    public int getId_Categoria() {
        return id_Categoria;
    }

    public void setId_Categoria(int id_Categoria) {
        this.id_Categoria = id_Categoria;
    }

    public int getId_Localidad() {
        return id_Localidad;
    }

    public void setId_Localidad(int id_Localidad) {
        this.id_Localidad = id_Localidad;
    }

    public int getNro_factura() {
        return nro_factura;
    }

    public void setNro_factura(int nro_factura) {
        this.nro_factura = nro_factura;
    }

    public RNE getRne() {
        return rne;
    }

    public void setRne(RNE rne) {
        this.rne = rne;
    }

    /**
     * Recupera una Establecimiento por su id
     *
     * @param id id de la empresa
     * @return Establecimiento con todos sus valores cargados, en caso que no se
     * encuentre devuelve null
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static Establecimiento recuperarPorId(String id) throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        String[][] valores;

        Establecimiento estab = new Establecimiento();
        RNE rne = new RNE();

        valores = new String[1][12];
        valores = con.recuperar(valores, "select * from establecimiento where id=" + id + ";", 12);

        //si es null es porque no lo encontro
        if (valores[0][0] == null) {
            estab = null;
        } else {
            estab.setId(Integer.parseInt(valores[0][0]));
            if (valores[0][1] != null) {
                estab.setDireccion(valores[0][1]);
            }
            if (valores[0][2] != null) {
                estab.setFechaDeCarga(valores[0][2]);
            }
            if (valores[0][3] != null) {
                estab.setNombre(valores[0][3]);
            }
            if (valores[0][4] != null) {
                estab.setTelefono(Integer.parseInt(valores[0][4]));
            }

            if (valores[0][5] != null) {
                estab.setArchivos_adjuntos(true);
            } else {
                estab.setArchivos_adjuntos(false);
            }

            if (valores[0][6] != null) {
                rne.setNumero(Integer.parseInt(valores[0][6]));
            }
            if (valores[0][7] != null) {
                rne.setFecha_vencimiento(valores[0][7]);
            }
            estab.setRne(rne);

            if (valores[0][8] != null) {
                estab.setNro_factura(Integer.parseInt(valores[0][8]));
            }
            if (valores[0][9] != null) {
                estab.setCUIT_Empresa(Integer.parseInt(valores[0][9]));
            }
            if (valores[0][10] != null) {
                estab.setId_Localidad(Integer.parseInt(valores[0][10]));
            }
            if (valores[0][11] != null) {
                estab.setId_Categoria(Integer.parseInt(valores[0][11]));
            }
        }

        return estab;

    }

    /**
     * Recupera una Establecimiento por su numero de RNE
     *
     * @param nro_rne nro_rne de la empresa
     * @return Establecimiento con todos sus valores cargados, en caso que no se
     * encuentre devuelve null
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static Establecimiento recuperarPorNroRNE(String nro_rne) throws SQLException, InstantiationException, IllegalAccessException {
        
        ConexionBD con = ConexionBD.getConexion();
        String[][] valores;

        Establecimiento estab = new Establecimiento();
        RNE rne = new RNE();
        valores = new String[1][12];
        valores = con.recuperar(valores, "SELECT * FROM `establecimiento` WHERE `nro_RNE`=" + nro_rne + ";", 12);

        //si es null es porque no lo encontro
        if (valores[0][0] == null) {
            estab = null;
        } else {
            estab.setId(Integer.parseInt(valores[0][0]));
            if (valores[0][1] != null) {
                estab.setDireccion(valores[0][1]);
            }
            if (valores[0][2] != null) {
                estab.setFechaDeCarga(valores[0][2]);
            }
            if (valores[0][3] != null) {
                estab.setNombre(valores[0][3]);
            }
            if (valores[0][4] != null) {
                estab.setTelefono(Integer.parseInt(valores[0][4]));
            }

            if (valores[0][5] != null) {
                estab.setArchivos_adjuntos(true);
            } else {
                estab.setArchivos_adjuntos(false);
            }

            if (valores[0][6] != null) {
                rne.setNumero(Integer.parseInt(valores[0][6]));
            }
            if (valores[0][7] != null) {
                rne.setFecha_vencimiento(valores[0][7]);
            }
            estab.setRne(rne);

            if (valores[0][8] != null) {
                estab.setNro_factura(Integer.parseInt(valores[0][8]));
            }
            if (valores[0][9] != null) {
                estab.setCUIT_Empresa(Integer.parseInt(valores[0][9]));
            }
            if (valores[0][10] != null) {
                estab.setId_Localidad(Integer.parseInt(valores[0][10]));
            }
            if (valores[0][11] != null) {
                estab.setId_Categoria(Integer.parseInt(valores[0][11]));
            }
        }
        //si es 0 es porque no lo encontro pues siempre el autoincremental arranca en 1
        return estab;

    }

    /**
     * Recupera los rubros asociados a un establecimiento
     *
     * @param estab_id id del establecimiento
     * @return {@code Vector<Rubro>}con todos los rubros alimenticios asociados
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static Vector<Rubro> recuperarRubrosAsociados(String estab_id) throws SQLException, InstantiationException, IllegalAccessException {
        ConexionBD con = ConexionBD.getConexion();
        String[][] valores;

        Vector<Rubro> RubrosAsociados = new Vector<>();

        valores = new String[10][1];
        valores = con.recuperar(valores, "SELECT Rubro_id FROM `Establecimiento_has_Rubro` WHERE `Establecimiento_id`=" + estab_id + ";", 1);

        //para cada id recuperado busco el Rubro y lo añado al vector.
        for (String[] id_r : valores) {
            if (Rubro.recuperarRubroporID(id_r[0]) != null) {
                RubrosAsociados.add(Rubro.recuperarRubroporID(id_r[0]));
            }
        }

        return RubrosAsociados;

    }
    
    public boolean existe_RNE(String num_rne) throws SQLException, InstantiationException, IllegalAccessException {

        ConexionBD con = ConexionBD.getConexion();
        boolean result = con.existe("select exists (select id from establecimiento where nro_rne='" + num_rne + "')");
        return result;
    }

    public
    Vector<ProductoAlimenticio> getProductosAsociados() throws SQLException, InstantiationException, IllegalAccessException 
    {
             Vector<ProductoAlimenticio> productosAlimenticios = new Vector<>();

        //recupero los establecimientos asociados para poder obtener los Productos asociados a cada Establecimiento.
        

        ProductoAlimenticio auxiliar;
        RNPA RNPAaux;
        Composicion compAux;
        Descripcion descAux;
        boolean bandera = false;
        String[][] valores;
        ConexionBD con = ConexionBD.getConexion();

 

            valores = new String[100][22];
            valores = con.recuperar(valores, "select * from Producto_Alimenticio where Establecimiento_idEstablecimiento=" + this.getId() + ";", 22);

            //para cada PA recuperado se va guardando en el vector productos alimenticios
            for (String[] PA : valores) {
                auxiliar = new ProductoAlimenticio();
                RNPAaux = new RNPA();
                compAux = new Composicion();
                descAux = new Descripcion();

                if (PA != null) {

                    if (PA[0] != null) {
                        auxiliar.setId(Integer.parseInt(PA[0]));
                        bandera = true;
                    }
                    if (PA[1] != null) {
                        auxiliar.setNro_factura(Integer.parseInt(PA[1]));
                    }
                    if (PA[2] != null) {
                        RNPAaux.setNumero(Integer.parseInt(PA[2]));
                    }
                    if (PA[3] != null) {
                        auxiliar.setRotulo(PA[3]);
                    }
                    if (PA[4] != null) {
                        compAux.setCAA(PA[4]);
                    }
                    if (PA[5] != null) {
                        compAux.setContenido(PA[5]);
                    }
                    if (PA[6] != null) {
                        compAux.setDenominacion(PA[6]);
                    }
                    if (PA[7] != null) {
                        compAux.setFecha_duracion(PA[7]);
                    }
                    if (PA[8] != null) {
                        compAux.setMarca(PA[8]);
                    }
                    if (PA[9] != null) {
                        compAux.setNombre_comercial(PA[9]);
                    }
                    if (PA[10] != null) {
                        compAux.setNroytipo_registro_marca(PA[10]);
                    }
                    auxiliar.setComposicion(compAux);
                    if (PA[11] != null) {
                        auxiliar.setFecha_carga_solicitud(PA[0]);
                    }
                    if (PA[12] != null) {
                        descAux.setControlesycuidados(PA[12]);
                    }
                    if (PA[13] != null) {
                        descAux.setDestino_producto(PA[13]);
                    }
                    if (PA[14] != null) {
                        descAux.setForma_uso_producto(PA[14]);
                    }
                    if (PA[15] != null) {
                        descAux.setInformacion_adicional(PA[15]);
                    }
                    if (PA[16] != null) {
                        descAux.setIntrucciones_preparacion(PA[16]);
                    }
                    if (PA[17] != null) {
                        descAux.setLugar_venta(PA[17]);
                    }
                    if (PA[18] != null) {
                        descAux.setModo_conservacion(PA[18]);
                    }
                    if (PA[19] != null) {
                        descAux.setPeriodo_aptitud(PA[19]);
                    }
                    auxiliar.setDescripcion(descAux);
                    if (PA[20] != null) {
                        RNPAaux.setFecha_vencimiento(PA[20]);
                    }
                    auxiliar.setRnpa(RNPAaux);

                    auxiliar.setEstablecimiento(this);
                }
                if (bandera) {
                    productosAlimenticios.add(auxiliar);
                    bandera = false;
                }

            }
       
        return productosAlimenticios;
    }
    
    public String getNombreCategoria() throws SQLException, InstantiationException, IllegalAccessException
    {
 
        String[][] valores;
        ConexionBD con = ConexionBD.getConexion();
       
        valores = new String[1][2];
        valores = con.recuperar(valores, "select * from categoria where id=" + this.getId_Categoria()+ ";", 2);
        
    
        return valores[0][1];
    }
    
    public String getNombreLocalidad()throws SQLException, InstantiationException, IllegalAccessException
    {
        String[][] valores;
        ConexionBD con = ConexionBD.getConexion();
       
        valores = new String[1][3];
        valores = con.recuperar(valores, "select * from localidad where id=" + this.getId_Localidad()+ ";", 3);
        
    
        return valores[0][1];
    
    }
}//end Establecimiento
