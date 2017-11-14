/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.Rubro;
import java.sql.SQLException;
import java.util.Map;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Franco
 */
public class PorcentajexRubro extends Observable {

    private Map<String, String> mapaValores;

    public PorcentajexRubro() {
    }

    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }

    public void actualizarEstado() throws SQLException, IllegalAccessException, InstantiationException {
        try {
            mapaValores = Rubro.getCantxNombre();
            setChanged();
            notifyObservers(mapaValores);
        } catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(PorcentajexRubro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public Map<String, String> obtenerEstado() throws SQLException, IllegalAccessException, InstantiationException {
//        return mapaValores;
//    }

//    public void cambiarMensaje(String m) {
//        mensaje = m;
//        //Marcamos el objeto observable como objeto que ha cambiado
//        setChanged();
//        //Notificamos a los observadores y le enviamos el nuevo valor
//        notifyObservers(mensaje);
//        //notifyObservers(); Este metodo solo notifica que hubo cambios en el objeto
//    }
}