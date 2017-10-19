

/**
 * @author Franco
 * @version 1.0
 * @created 18-oct.-2017 19:43:59
 */

package Logica;

public class Empresa {

    private int CUIT;
    private String email;
    private String nombre;
    private String razon_social;
    private int telefono;

    public Empresa() {

    }

    public void finalize() throws Throwable {

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
     *
     * @param empresa
     */
    public boolean guardar(Empresa empresa) {
        return false;
    }
}//end Empresa
