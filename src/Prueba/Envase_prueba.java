/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;;
import Logica.*;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Franco
 */
public class Envase_prueba extends javax.swing.JFrame {

    /**
     * Creates new form Rubro
     */
    public Envase_prueba() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        capacidad_textfield = new javax.swing.JTextField();
        buttonInsertar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        material_tf = new javax.swing.JTextField();
        unidad_tf = new javax.swing.JTextField();
        material_selec = new javax.swing.JComboBox<>();
        unidad_selec = new javax.swing.JComboBox<>();
        cargar_unidad = new javax.swing.JButton();
        boton_cargaEnTabla_envase = new javax.swing.JButton();
        boton_borrar_envase = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        envases = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Envase");

        capacidad_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacidad_textfieldActionPerformed(evt);
            }
        });

        buttonInsertar.setText("Insertar");
        buttonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertarActionPerformed(evt);
            }
        });

        jLabel4.setText("unidad");

        jLabel5.setText("capacidad");

        jLabel6.setText("material");

        material_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                material_tfActionPerformed(evt);
            }
        });

        unidad_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidad_tfActionPerformed(evt);
            }
        });

        material_selec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "otro..." }));
        material_selec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                material_selecActionPerformed(evt);
            }
        });

        unidad_selec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "otro..." }));
        unidad_selec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidad_selecActionPerformed(evt);
            }
        });

        cargar_unidad.setBackground(new java.awt.Color(255, 51, 51));
        cargar_unidad.setForeground(new java.awt.Color(255, 255, 255));
        cargar_unidad.setText("cargar");
        cargar_unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargar_unidadActionPerformed(evt);
            }
        });

        boton_cargaEnTabla_envase.setText("cargar");
        boton_cargaEnTabla_envase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cargaEnTabla_envaseActionPerformed(evt);
            }
        });

        boton_borrar_envase.setText("borrar seleccionado");
        boton_borrar_envase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrar_envaseActionPerformed(evt);
            }
        });

        envases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "material", "capacidad", "unidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(envases);

        jLabel2.setText("seleccione el id que quiera borrar y luego pulse el boton");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_cargaEnTabla_envase))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(capacidad_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(material_selec, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(unidad_selec, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(buttonInsertar))
                                            .addComponent(unidad_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(material_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(cargar_unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(boton_borrar_envase))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cargar_unidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidad_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(material_selec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unidad_selec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(material_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unidad_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(boton_cargaEnTabla_envase)
                        .addGap(50, 50, 50)))
                .addComponent(boton_borrar_envase)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void capacidad_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacidad_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacidad_textfieldActionPerformed

    private void buttonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertarActionPerformed
        // TODO add your handling code here:
        /*Vector<String> mat_car= new Vector<String>();
        Vector<String> uni_car= new Vector<String>();*/
        
        Envase envase=new Envase();

        Boolean error=false, existe=false,existe1=false;
        
        envase.setCapacidad(this.capacidad_textfield.getText());
       
        if(material_tf.isEnabled() && unidad_tf.isEnabled()){
            
        envase.setMaterial(this.material_tf.getText());
        envase.setUnidad(this.unidad_tf.getText());
       }
        
       if(material_tf.isEnabled() && !unidad_tf.isEnabled()){ 

        envase.setMaterial(this.material_tf.getText());
        envase.setUnidad(this.unidad_selec.getSelectedItem().toString());
       }
       if(!material_tf.isEnabled() && unidad_tf.isEnabled()){    
      
        envase.setMaterial(this.material_selec.getSelectedItem().toString());
        envase.setUnidad(this.unidad_tf.getText());
       }
       
       if(!material_tf.isEnabled() && !unidad_tf.isEnabled()){    
      
        envase.setMaterial(this.material_selec.getSelectedItem().toString());
        envase.setUnidad(this.unidad_selec.getSelectedItem().toString());
       }
       

        try {
            String unidad=envase.getUnidad();
            String material=envase.getMaterial();
            String capacidad=envase.getCapacidad();
        if(!(material.equals("null") || material.equals("")) && !(unidad.equals("null")|| unidad.equals("")) && !(capacidad.equals("null")|| capacidad.equals(""))){
                
            //material    

            if(envase.existe_material(material))
            {JOptionPane.showMessageDialog(null, "Ya existe un material con ese nombre.");}
                else {    
                    //guardarlo
                    error=envase.guardar_material(material);
                    if(!error){JOptionPane.showMessageDialog(null, "material agregado correctamente.");}
                    else {JOptionPane.showMessageDialog(null, "Hubo un error al agregar el material");}
                    }
            

            //unidad
            
            if(envase.existe_unidad(unidad))
            {JOptionPane.showMessageDialog(null, "Ya existe una unidad con ese nombre.");}
                else {    
                    //guardarlo
                    error=envase.guardar_unidad(unidad);
                    if(!error){JOptionPane.showMessageDialog(null, "unidad agregado correctamente.");}
                    else {JOptionPane.showMessageDialog(null, "Hubo un error al agregar la unidad");}
                    }
            
            //envase EXISTE ENVASE
            
             if(envase.existe_envase(capacidad,material,unidad))
            {JOptionPane.showMessageDialog(null, "Ya existe un envase con esas características");}
                else {  
                    //guardarlo*/
                    error=envase.guardar_envase(capacidad,material,unidad);
                    if(!error){JOptionPane.showMessageDialog(null, "envase agregado correctamente.");}
                    else {JOptionPane.showMessageDialog(null, "Hubo un error al agregar el envase");}
                    }
                    
        }
            else {JOptionPane.showMessageDialog(null, "Ningún campo debe ser vacío");}
            
        } catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Envase_prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        //////////////////////////////////////////
        //////////////////////////////////////////
        
       //////////////////////////////////////////
       //////////////////////////////////////////
       
    }//GEN-LAST:event_buttonInsertarActionPerformed

    private void material_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_material_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_material_tfActionPerformed

    private void material_selecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_material_selecActionPerformed

        if (material_selec.getSelectedItem()=="otro..."){
            material_tf.setEnabled(true);
        }
        else{
            material_tf.setEnabled(false);
            material_tf.setText("");
        }
    }//GEN-LAST:event_material_selecActionPerformed

    private void unidad_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidad_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidad_tfActionPerformed

    private void cargar_unidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargar_unidadActionPerformed
                // TODO add your handling code here:
        Vector<String> mat_uni;
        Vector<String> mat_car;
        
        try{
            mat_uni=Envase.recuperarTodosUnidades();
            for(int i=0;i<mat_uni.size();i++){
            unidad_selec.addItem(mat_uni.elementAt(i));
            }
            mat_car=Envase.recuperarTodosMateriales();
            for(int j=0;j<mat_car.size();j++){
            material_selec.addItem(mat_car.elementAt(j));
            }
        }
        catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Envase_prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cargar_unidadActionPerformed

    private void unidad_selecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidad_selecActionPerformed
        
        if (unidad_selec.getSelectedItem()=="otro..."){

            unidad_tf.setEnabled(true);
        }
        else{
            unidad_tf.setText("");
            unidad_tf.setEnabled(false);
        }
    }//GEN-LAST:event_unidad_selecActionPerformed

    private void boton_cargaEnTabla_envaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cargaEnTabla_envaseActionPerformed
        int i=0;
        Object []object = new Object[4]; 
        tablaModel = new DefaultTableModel();
        envases.setModel(tablaModel);
        tablaModel.addColumn("id");
        tablaModel.addColumn("material");
        tablaModel.addColumn("capacidad");
        tablaModel.addColumn("unidad");
        try {
            Vector<String> valores = Envase.recuperarTodosEnvases();
            for(String valore : valores){
                object[i]=valore;
                ++i;
                if(i==4){
                i=0;
                tablaModel.addRow(object);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Envase_prueba.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Envase_prueba.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Envase_prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boton_cargaEnTabla_envaseActionPerformed

    private void boton_borrar_envaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrar_envaseActionPerformed
        
        Envase envase=new Envase();
        int i;
        i=envases.getSelectedRow();
        envase.setCapacidad((String) envases.getValueAt(i,1));
        envase.setMaterial((String) envases.getValueAt(i,2));
        envase.setUnidad((String) envases.getValueAt(i,3));
        
        try{ 
            envase.borrar(envase);
        } catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Envase_prueba.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_boton_borrar_envaseActionPerformed

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
            java.util.logging.Logger.getLogger(Envase_prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Envase_prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Envase_prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Envase_prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Envase_prueba().setVisible(true);
        });
    }
    
    
    DefaultTableModel tablaModel;
    DefaultListModel listaNombreModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_borrar_envase;
    private javax.swing.JButton boton_cargaEnTabla_envase;
    private javax.swing.JButton buttonInsertar;
    private javax.swing.JTextField capacidad_textfield;
    private javax.swing.JButton cargar_unidad;
    private javax.swing.JTable envases;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> material_selec;
    private javax.swing.JTextField material_tf;
    private javax.swing.JComboBox<String> unidad_selec;
    private javax.swing.JTextField unidad_tf;
    // End of variables declaration//GEN-END:variables
}
