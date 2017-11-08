/**
 * @author Francisco Herrero, Franco Morero y Mauricio Vazquez
 * @version 1.0
 */
package Logica;

import Persistencia.ConexionBD;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

public class Establecimiento {

    private int id;
    private String categoria;
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

    public Establecimiento() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
        cal_aux.set(Integer.parseInt(fecha.substring(0, 4)), Integer.parseInt(fecha.substring(5, 7)), Integer.parseInt(fecha.substring(8, 10)));
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
     * Recupera una empresa por su id
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
     * Recupera una empresa por su numero de RNE
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

}//end Establecimiento
