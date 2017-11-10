package Logica;

import Persistencia.ConexionBD;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @author Francisco Herrero, Franco Morero y Mauricio Vazquez
 * @version 1.0
 */
public class Empresa {

    private int CUIT;
    private String email;
    private String nombre;
    private String razon_social;
    private String direccion;
    private int telefono;
    private int id_localidad;
    private Vector<Establecimiento> establecimientos;

    public int getId_localidad() {
        return id_localidad;
    }

    public void setId_localidad(int id_localidad) {
        this.id_localidad = id_localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Empresa() {

    }

    public int getCUIT() {
        return CUIT;
    }

    public void setCUIT(int CUIT) {
        this.CUIT = CUIT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Recupera una empresa por su CUIT
     *
     * @param CUIT CUIT de la empresa
     * @return Empresa con todos sus valores cargados, en caso que no se
     * encuentre se devuelve null
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static Empresa recuperarPorCuit(String CUIT) throws SQLException, InstantiationException, IllegalAccessException {

        ConexionBD con = ConexionBD.getConexion();
        String[][] valores;
        Empresa salida = new Empresa();
        Localidad locaux = new Localidad();
        valores = new String[1][7];
        valores = con.recuperar(valores, "select * from Empresa where CUIT=" + CUIT + ";", 7);

        if (valores[0][0] == null) {
            salida = null;
        } else {
            salida.setCUIT(Integer.parseInt(valores[0][0]));
            if (valores[0][1] != null) {
                salida.setEmail(valores[0][1]);
            }

            if (valores[0][2] != null) {
                salida.setNombre(valores[0][2]);
            }
            if (valores[0][3] != null) {
                salida.setRazon_social(valores[0][3]);
            }
            if (valores[0][4] != null) {
                salida.setTelefono(Integer.parseInt(valores[0][4]));
            }
            if (valores[0][5] != null) {
                salida.setDireccion(valores[0][5]);
            }
            if (valores[0][6] != null) {
                salida.setId_localidad(Integer.parseInt(valores[0][6]));
            }
        }
        return salida;

    }

    /**
     * Recupera los establecimientos asociados a una empresa
     *
     * @param CUIT CUIT de la empresa
     * @return {@code Vector<Establecimiento>}con todos los establecimientos
     * asociados
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static Vector<Establecimiento> recuperarEstablecimientosAsociados(String CUIT) throws SQLException, InstantiationException, IllegalAccessException {

        Vector<Establecimiento> establecimientos = new Vector<>();

        String[][] valores;
        RNE RNEaux;
        boolean bandera = false;
        ConexionBD con = ConexionBD.getConexion();
        valores = new String[5][12];
        valores = con.recuperar(valores, "select * from Establecimiento where Empresa_CUIT=" + CUIT + ";", 12);

        //para cada establecimiento recuperado voy cargando los valores en el vector   
        for (String[] establecimiento : valores) {

            Establecimiento auxiliar = new Establecimiento();
            RNEaux = new RNE();

            if (establecimiento != null) {

                if (establecimiento[0] != null) {
                    auxiliar.setId(Integer.parseInt(establecimiento[0]));
                    bandera = true;
                }

                if (establecimiento[1] != null) {
                    auxiliar.setDireccion(establecimiento[1]);
                }

                if (establecimiento[2] != null) {
                    auxiliar.setFechaDeCarga(establecimiento[2]);
                }

                if (establecimiento[3] != null) {
                    auxiliar.setNombre(establecimiento[3]);
                }

                if (establecimiento[4] != null) {
                    auxiliar.setTelefono(Integer.parseInt(establecimiento[4]));
                }

                if (establecimiento[6] != null) {
                    RNEaux.setNumero(Integer.parseInt(establecimiento[6]));
                }

                if (establecimiento[7] != null) {
                    RNEaux.setFecha_vencimiento(establecimiento[7]);
                }

                auxiliar.setRne(RNEaux);

                if (establecimiento[8] != null) {
                    auxiliar.setNro_factura(Integer.parseInt(establecimiento[8]));
                }

                auxiliar.setCUIT_Empresa(Integer.parseInt(CUIT));

                if (establecimiento[10] != null) {
                    auxiliar.setId_Localidad(Integer.parseInt(establecimiento[10]));
                }

                if (establecimiento[11] != null) {
                    auxiliar.setId_Categoria(Integer.parseInt(establecimiento[11]));
                }
            }

            if (bandera) {
                establecimientos.add(auxiliar);
                bandera = false;
            }

            auxiliar = null;
        }

        return establecimientos;
    }

    /**
     * Recupera los productos alimenticios asociados a una empresa
     *
     * @param CUIT CUIT de la empresa
     * @return {@code Vector<ProductoAlimenticio>}con todos los productos
     * alimenticios asociados
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static Vector<ProductoAlimenticio> recuperarPAAsociados(String CUIT) throws SQLException, InstantiationException, IllegalAccessException {

        Vector<ProductoAlimenticio> productosAlimenticios = new Vector<>();

        //recupero los establecimientos asociados para poder obtener los Productos asociados a cada Establecimiento.
        Vector<Establecimiento> establecimientosAsociados = Empresa.recuperarEstablecimientosAsociados(CUIT);

        ProductoAlimenticio auxiliar;
        RNPA RNPAaux;
        Composicion compAux;
        Descripcion descAux;
        boolean bandera = false;
        String[][] valores;
        ConexionBD con = ConexionBD.getConexion();

        for (Establecimiento e : establecimientosAsociados) {

            valores = new String[100][22];
            valores = con.recuperar(valores, "select * from Producto_Alimenticio where Establecimiento_idEstablecimiento=" + e.getId() + ";", 22);

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

                    auxiliar.setEstablecimiento(e);
                }
                if (bandera) {
                    productosAlimenticios.add(auxiliar);
                    bandera = false;
                }

            }
        }
        return productosAlimenticios;

    }

}//end Empresa
