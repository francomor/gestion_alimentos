/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.Envase;
import Logica.MateriaPrima;
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
public class panelCargaMateriaPrima extends javax.swing.JPanel {

    /**
     * Creates new form panelCargaMateriaPrima
     */
    public panelCargaMateriaPrima() {
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

        labelNombre = new javax.swing.JLabel();
        comboBoxNombre = new javax.swing.JComboBox<>();
        labelCantidad = new javax.swing.JLabel();
        textFieldCantidad = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(521, 30));
        setMinimumSize(new java.awt.Dimension(521, 30));
        setPreferredSize(new java.awt.Dimension(521, 30));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre.setText("Nombre:");
        add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 20));

        comboBoxNombre.setName("comboBoxNombre"); // NOI18N
        add(comboBoxNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 68, -1));

        labelCantidad.setText("Cantidad");
        add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 20));

        textFieldCantidad.setName("textFieldCantidad"); // NOI18N
        add(textFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 65, -1));
    }// </editor-fold>//GEN-END:initComponents
 
    private void cargarValores() {
        Vector<String> mp_nom;

        try{
            mp_nom=MateriaPrima.recuperarTodosNombres();
            for(String nombre_mp:mp_nom){
                comboBoxNombre.addItem(nombre_mp);
            }
        }
        catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(panelCargaMateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
    
    
    
private HashMap componentMap;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxNombre;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JTextField textFieldCantidad;
    // End of variables declaration//GEN-END:variables
}

//CODIGO DE FRAN
//private void mp_listaActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        if (mp_lista.getSelectedItem()=="otro..."){
//
//            mp_nombre.setEnabled(true);
//        }
//        else{
//            mp_nombre.setText("");
//            mp_nombre.setEnabled(false);
//        }
//    }                                        
//
//    private void mp_cantidadActionPerformed(java.awt.event.ActionEvent evt) {                                            
//        // TODO add your handling code here:
//    }                                           
//
//    private void mp_aniadirActionPerformed(java.awt.event.ActionEvent evt) {                                           
//        MateriaPrima m_p = new MateriaPrima();
//        String nombre;
//        Boolean error=false, existe=false;
//        m_p.setCantidad(this.mp_cantidad.getText());
//
//        if(mp_nombre.isEnabled()){
//            m_p.setNombre(this.mp_nombre.getText());
//            nombre=this.mp_nombre.getText();
//        }else{
//            m_p.setNombre(this.mp_lista.getSelectedItem().toString());
//            nombre=this.mp_lista.getSelectedItem().toString();
//        }
//
//        try {
//            //verificar si existe ya esa mp. mysql insert da el error code 1062 duplicate entry, pero si las PK son AI, nunca se va a dar...
//
//            existe=m_p.existe(m_p.getNombre());
//            if (existe)
//            {JOptionPane.showMessageDialog(null, "Ya existe una materia prima con ese nombre.");}
//            else {
//                //guardarlo
//                error=m_p.guardar(m_p);
//                if(!error){JOptionPane.showMessageDialog(null, "materia prima agregado correctamente.");}
//                else {JOptionPane.showMessageDialog(null, "Hubo un error al agregar la materia prima");}
//            }
//            m_p.setNombre(m_p.get_id_mp(nombre));
//        } catch (SQLException ex) {
//            Logger.getLogger(panelCargaProducto.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            Logger.getLogger(panelCargaProducto.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(panelCargaProducto.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        p_a.agregarMP(m_p);
//    }                                          
//
//    private void mp_cargarActionPerformed(java.awt.event.ActionEvent evt) {                                          
//        Vector<String> mp_nom;
//
//        try{
//            mp_nom=MateriaPrima.recuperarTodasMp();
//            for(int i=0;i<mp_nom.size();i++){
//                mp_lista.addItem(mp_nom.elementAt(i));
//            }
//        }
//        catch (SQLException | InstantiationException | IllegalAccessException ex) {
//            Logger.getLogger(panelCargaProducto.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }                                         
//
//    private void mp_nombreActionPerformed(java.awt.event.ActionEvent evt) {                                          
//        // TODO add your handling code here:
//    }