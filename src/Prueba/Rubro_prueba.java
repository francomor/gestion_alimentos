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
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Franco
 */
public class Rubro_prueba extends javax.swing.JFrame {

    /**
     * Creates new form Rubro
     */
    public Rubro_prueba() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        buttonInsertar = new javax.swing.JButton();
        buttonCargaLista = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        jTextFieldModifica = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaNombreModel = new DefaultListModel();
        listaNombres = new javax.swing.JList(listaNombreModel);
        buttonRemover = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        buttonInsertar.setText("Insertar");
        buttonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertarActionPerformed(evt);
            }
        });

        buttonCargaLista.setText("Cargar lista");
        buttonCargaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCargaListaActionPerformed(evt);
            }
        });

        buttonModificar.setText("Modificar");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaNombres);

        buttonRemover.setText("Remover");
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });

        jLabel2.setText("Modifica el valor seleccionado en al lista");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Rubro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonRemover)
                    .addComponent(buttonCargaLista)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonInsertar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldModifica, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonModificar)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonInsertar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(buttonCargaLista)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldModifica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonModificar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRemover)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void buttonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertarActionPerformed
        // TODO add your handling code here:
        Rubro rubro=new Rubro();
        Boolean error=false, existe=false;
        rubro.setNombre(this.jTextField1.getText());
        try {
            //verificar si existe ya ese producto. mysql insert da el error code 1062 duplicate entry, pero si las PK son AI, nunca se va a dar...
           
            existe=rubro.existe(rubro.getNombre());
            System.out.println("existe="+existe);
            if (existe)
            {JOptionPane.showMessageDialog(null, "Ya existe un rubro con ese nombre.");}
            else {    
            //guardarlo
            error=rubro.guardar(rubro);
            if(!error){JOptionPane.showMessageDialog(null, "rubro agregado correctamente.");}
            else {JOptionPane.showMessageDialog(null, "Hubo un error al agregar el rubro");}
            }
        } catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Rubro_prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_buttonInsertarActionPerformed

    private void buttonCargaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCargaListaActionPerformed
        // TODO add your handling code here:
        
       listaNombreModel.removeAllElements();
        try {
            Vector<String> valores = Rubro.recuperarTodosNombres();
            for (String valor : valores) {
                listaNombreModel.addElement(valor);
            }
            
        } catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Rubro_prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonCargaListaActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        // TODO add your handling code here:
        Rubro rubro=new Rubro();
        rubro.setNombre(jTextFieldModifica.getText());
        try{ 
            rubro.update(rubro, this.listaNombres.getSelectedValue());
        } catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Rubro_prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonModificarActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed
        // TODO add your handling code here:
        Rubro rubro=new Rubro();
        rubro.setNombre(this.listaNombres.getSelectedValue());
        try{ 
            rubro.borrar(rubro);
        } catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Rubro_prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonRemoverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Rubro_prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rubro_prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rubro_prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rubro_prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Rubro_prueba().setVisible(true);
        });
    }
    
    
    
    DefaultListModel listaNombreModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCargaLista;
    private javax.swing.JButton buttonInsertar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldModifica;
    private javax.swing.JList<String> listaNombres;
    // End of variables declaration//GEN-END:variables
}
