/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import javax.swing.ImageIcon;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Franco
 */
public class GraficoTorta extends javax.swing.JPanel implements Observer {

    private BufferedImage image;
    private final int IMG_WIDTH = 300;
    private final int IMG_HEIGHT = 300;

    /**
     * Creates new form GraficoBarra
     */
    public GraficoTorta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Imagen = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Imagen.setBackground(new java.awt.Color(255, 255, 255));
        add(label_Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 300));
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void update(Observable o, Object arg) {
        //Funciona con un mapa del tipo Map<String,String> con el primer valor el nombre y el segundo la cantidad
        if (arg instanceof Map) {

            //System.out.println("Nueva Actualizacion: " + o + " -> " + arg);
            // Fuente de Datos
            DefaultPieDataset data = new DefaultPieDataset();

            //Iterando sobre el mapa
            Iterator it = ((Map) arg).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                //System.out.println(pair.getKey() + " = " + pair.getValue());
                data.setValue((Comparable) pair.getKey(), Double.parseDouble((String) pair.getValue()));
                //it.remove(); // avoids a ConcurrentModificationException
            }

            // Creando el Grafico
            JFreeChart chart = ChartFactory.createPieChart(null, data, true, false, false);

            // Setear imagen en el label
            image = chart.createBufferedImage(IMG_WIDTH, IMG_HEIGHT);
            label_Imagen.setIcon(new ImageIcon(image));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_Imagen;
    // End of variables declaration//GEN-END:variables
}
