/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Logica.*;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Franco
 */
public class MateriaPrima_prueba extends javax.swing.JPanel {

    /**
     * Creates new form MateriaPrima_prueba
     */
    public MateriaPrima_prueba() {
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

        jLabel2 = new javax.swing.JLabel();
        mp_lista = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        mp_cantidad = new javax.swing.JTextField();
        mp_aniadir = new javax.swing.JButton();
        mp_cargar = new javax.swing.JButton();
        mp_nombre = new javax.swing.JTextField();
        labelComp_MateriasPrimas1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("Nombre");

        mp_lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "otro..." }));
        mp_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mp_listaActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad");

        mp_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mp_cantidadActionPerformed(evt);
            }
        });

        mp_aniadir.setText("añadir");
        mp_aniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mp_aniadirActionPerformed(evt);
            }
        });

        mp_cargar.setText("cargar");
        mp_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mp_cargarActionPerformed(evt);
            }
        });

        mp_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mp_nombreActionPerformed(evt);
            }
        });

        labelComp_MateriasPrimas1.setText("Materias Primas");

        jLabel3.setText("NO ANDA ES PARA GUARDAR EL CODIGO DE FRAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(mp_aniadir)
                        .addGap(32, 32, 32)
                        .addComponent(mp_cargar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(labelComp_MateriasPrimas1)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mp_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(mp_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(mp_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(labelComp_MateriasPrimas1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mp_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mp_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mp_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mp_aniadir)
                    .addComponent(mp_cargar))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mp_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mp_listaActionPerformed
        if (mp_lista.getSelectedItem()=="otro..."){

            mp_nombre.setEnabled(true);
        }
        else{
            mp_nombre.setText("");
            mp_nombre.setEnabled(false);
        }
    }//GEN-LAST:event_mp_listaActionPerformed

    private void mp_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mp_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mp_cantidadActionPerformed

    private void mp_aniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mp_aniadirActionPerformed
        MateriaPrima m_p = new MateriaPrima();
        String nombre;
        Boolean error=false, existe=false;
        m_p.setCantidad(this.mp_cantidad.getText());

        if(mp_nombre.isEnabled()){
            m_p.setNombre(this.mp_nombre.getText());
            nombre=this.mp_nombre.getText();
        }else{
            m_p.setNombre(this.mp_lista.getSelectedItem().toString());
            nombre=this.mp_lista.getSelectedItem().toString();
        }

        try {
            //verificar si existe ya esa mp. mysql insert da el error code 1062 duplicate entry, pero si las PK son AI, nunca se va a dar...

            existe=m_p.existe(m_p.getNombre());
            if (existe)
            {JOptionPane.showMessageDialog(null, "Ya existe una materia prima con ese nombre.");}
            else {
                //guardarlo
                error=m_p.guardar(m_p);
                if(!error){JOptionPane.showMessageDialog(null, "materia prima agregado correctamente.");}
                else {JOptionPane.showMessageDialog(null, "Hubo un error al agregar la materia prima");}
            }
            m_p.setNombre(String.valueOf(m_p.getId()));
        } catch (SQLException ex) {
            Logger.getLogger(MateriaPrima_prueba.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MateriaPrima_prueba.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MateriaPrima_prueba.class.getName()).log(Level.SEVERE, null, ex);
        }

        p_a.agregarMP(m_p);
    }//GEN-LAST:event_mp_aniadirActionPerformed

    private void mp_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mp_cargarActionPerformed
        Vector<String> mp_nom;

        try{
            mp_nom=MateriaPrima.recuperarTodosNombres();
            for(int i=0;i<mp_nom.size();i++){
                mp_lista.addItem(mp_nom.elementAt(i));
            }
        }
        catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(MateriaPrima_prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mp_cargarActionPerformed

    private void mp_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mp_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mp_nombreActionPerformed

    ProductoAlimenticio p_a = new ProductoAlimenticio();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelComp_MateriasPrimas1;
    private javax.swing.JButton mp_aniadir;
    private javax.swing.JTextField mp_cantidad;
    private javax.swing.JButton mp_cargar;
    private javax.swing.JComboBox<String> mp_lista;
    private javax.swing.JTextField mp_nombre;
    // End of variables declaration//GEN-END:variables
}