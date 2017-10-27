/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:43:59
 */
package Logica;

import Persistencia.ConexionBD;
import java.sql.SQLException;

public class Empresa {

    private int CUIT;
    private String email;
    private String nombre;
    private String razon_social;
    private int telefono;

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
        valores = new String[1][6];
        valores = con.recuperar(valores, "select * from empresa where CUIT=" + CUIT + ";", 6);
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
        }
        return salida;

    }
}//end Empresa
