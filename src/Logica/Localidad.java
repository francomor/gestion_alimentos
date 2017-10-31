/**
 * @author Francisco Herrero, Franco Morero y Mauricio Vazquez
 * @version 1.0
 */
package Logica;

import Persistencia.ConexionBD;
import java.sql.SQLException;

class Localidad {

    private int id;
    private String nombre;
    private Provincia provincia;

    public Localidad() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public boolean existe(String localidad_name) throws SQLException, InstantiationException, IllegalAccessException {

        ConexionBD con = ConexionBD.getConexion();
        boolean result = con.existe("select exists (select nombre from Localidad where nombre='" + localidad_name + "')");
        return result;
    }

    public Localidad recuperarLocalidadporID(String id) throws SQLException, InstantiationException, IllegalAccessException {

        Localidad salida = new Localidad();
        Provincia prov;
        ConexionBD con = ConexionBD.getConexion();

        String[][] valores;
        valores = new String[1][3];
        valores = con.recuperar(valores, "select * from Localidad where id=" + id + ";", 3);

        //si es nulo es porque no lo encontro.
        if (valores[0][0] == null) {
            salida = null;
        } else {
            salida.setId(Integer.parseInt(valores[0][0]));
            salida.setNombre(valores[0][1]);
            prov = Provincia.recuperarProvinciaporID(valores[0][2]);
            salida.setProvincia(prov);

        }
        return salida;
    }

}
