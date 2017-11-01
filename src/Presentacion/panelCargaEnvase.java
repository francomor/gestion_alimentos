/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.Envase;
import java.awt.Component;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Franco
 */
public class panelCargaEnvase extends javax.swing.JPanel {

    /**
     * Creates new form panelEnvase
     */
    public panelCargaEnvase() {
        initComponents();
        createComponentMap();
        cargarValores();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCapacidad = new javax.swing.JLabel();
        textFieldCapacidad = new javax.swing.JTextField();
        comboBoxMaterial = new javax.swing.JComboBox<>();
        labelMaterial = new javax.swing.JLabel();
        labelUnidad = new javax.swing.JLabel();
        comboBoxUnidad = new javax.swing.JComboBox<>();
        buttonAddUnidad = new javax.swing.JButton();
        buttonAddCapacidad = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(521, 35));
        setMinimumSize(new java.awt.Dimension(521, 35));
        setPreferredSize(new java.awt.Dimension(521, 35));

        labelCapacidad.setText("Capacidad:");
        labelCapacidad.setName("labelCapacidad"); // NOI18N

        textFieldCapacidad.setName("textFieldCapacidad"); // NOI18N
        textFieldCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCapacidadActionPerformed(evt);
            }
        });

        comboBoxMaterial.setName("comboBoxMaterial"); // NOI18N
        comboBoxMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMaterialActionPerformed(evt);
            }
        });

        labelMaterial.setText("Material");
        labelMaterial.setName("labelMaterial"); // NOI18N

        labelUnidad.setText("Unidad:");
        labelUnidad.setName("labelUnidad"); // NOI18N

        comboBoxUnidad.setName("comboBoxUnidad"); // NOI18N

        buttonAddUnidad.setText("+");
        buttonAddUnidad.setName("buttonAddUnidad"); // NOI18N

        buttonAddCapacidad.setText("+");
        buttonAddCapacidad.setName("buttonAddCapacidad"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(labelCapacidad)
                .addGap(6, 6, 6)
                .addComponent(textFieldCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(labelMaterial)
                .addGap(2, 2, 2)
                .addComponent(comboBoxMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonAddCapacidad)
                .addGap(39, 39, 39)
                .addComponent(labelUnidad)
                .addGap(13, 13, 13)
                .addComponent(comboBoxUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(buttonAddUnidad))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCapacidadActionPerformed

    private void comboBoxMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxMaterialActionPerformed

    private void createComponentMap() {
        componentMap = new HashMap<>();
        Component[] components;
        components = this.getComponents();
        for (Component component : components) {
            componentMap.put(component.getName(), component);
        }
    }

    public Component getComponentByName(String name) {
        if (componentMap.containsKey(name)) {
            return (Component) componentMap.get(name);
        } else {
            return null;
        }
    }

    private void cargarValores() {
        // TODO add your handling code here:
        Vector<String> mat_uni;
        Vector<String> mat_car;

        try {
            mat_uni = Envase.recuperarTodosUnidades();
            for (int i = 0; i < mat_uni.size(); i++) {
                comboBoxUnidad.addItem(mat_uni.elementAt(i));
            }
            mat_car = Envase.recuperarTodosMateriales();
            for (int j = 0; j < mat_car.size(); j++) {
                comboBoxMaterial.addItem(mat_car.elementAt(j));
            }
        } catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(panelCargaEnvase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private HashMap componentMap;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddCapacidad;
    private javax.swing.JButton buttonAddUnidad;
    private javax.swing.JComboBox<String> comboBoxMaterial;
    private javax.swing.JComboBox<String> comboBoxUnidad;
    private javax.swing.JLabel labelCapacidad;
    private javax.swing.JLabel labelMaterial;
    private javax.swing.JLabel labelUnidad;
    private javax.swing.JTextField textFieldCapacidad;
    // End of variables declaration//GEN-END:variables
}
