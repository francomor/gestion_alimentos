/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author Franco
 */

import java.util.Observable;
import java.util.Observer;
 
public class GraficoTorta implements Observer{
 
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Nueva Actualizacion: "+o+" -> "+arg);
    }
    
}