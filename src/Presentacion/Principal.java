/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author mauri
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.PanelCargaPA.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCargaPA = new javax.swing.JTabbedPane();
        CargaBasica = new javax.swing.JPanel();
        NumRNE = new javax.swing.JLabel();
        TextFieldRNE = new javax.swing.JTextField();
        BuscarRNE = new javax.swing.JButton();
        SeparadorDatosEmpresa = new javax.swing.JSeparator();
        EtiquetaTituloDatoEmpresa = new javax.swing.JLabel();
        EtiquetaCUIL = new javax.swing.JLabel();
        EtiquetaNombreEmpresa = new javax.swing.JLabel();
        EtiquetaRazonSocial = new javax.swing.JLabel();
        EtiquetaEmail = new javax.swing.JLabel();
        EtiquetaTelefono = new javax.swing.JLabel();
        CampoCUIL = new javax.swing.JTextField();
        CampoNombreEmpresa = new javax.swing.JTextField();
        CampoRazonSocial = new javax.swing.JTextField();
        CampoEmail = new javax.swing.JTextField();
        CampoTelefono = new javax.swing.JTextField();
        SeparadorRegistroRNPA = new javax.swing.JSeparator();
        EtiquetaDatosPA = new javax.swing.JLabel();
        EtiquetaNroFactura = new javax.swing.JLabel();
        CampoNroFactura = new javax.swing.JTextField();
        SeparadorDatosProducto = new javax.swing.JSeparator();
        EtiquetaRegistroRNPA = new javax.swing.JLabel();
        EtiquetaRNPA = new javax.swing.JLabel();
        CampoRNPA = new javax.swing.JTextField();
        CampoFechaVencimiento = new javax.swing.JFormattedTextField();
        EtiquetaFechaVencimiento = new javax.swing.JLabel();
        EtiquetaRotulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CampoRotulo = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        EtiquetaDatosDeLab = new javax.swing.JLabel();
        EtiquetaCargaProdAlimenticio = new javax.swing.JLabel();
        jScrollBar3 = new javax.swing.JScrollBar();
        EtiquetaNumProtocolo = new javax.swing.JLabel();
        CampoNumProtocolo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        CargaCompsicion = new javax.swing.JPanel();
        CargaDescripcion = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuCarga = new javax.swing.JMenu();
        MenuItemCargaProductoA = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelCargaPA.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                PanelCargaPAComponentAdded(evt);
            }
        });

        NumRNE.setText("Numero RNE: ");

        TextFieldRNE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldRNEActionPerformed(evt);
            }
        });

        BuscarRNE.setText("Buscar");
        BuscarRNE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarRNEActionPerformed(evt);
            }
        });

        EtiquetaTituloDatoEmpresa.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        EtiquetaTituloDatoEmpresa.setText("Datos de la empresa");

        EtiquetaCUIL.setText("CUIT: ");

        EtiquetaNombreEmpresa.setText("Nombre: ");

        EtiquetaRazonSocial.setText("Razon Social: ");

        EtiquetaEmail.setText("Email: ");

        EtiquetaTelefono.setText("Telefono: ");

        CampoCUIL.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        CampoCUIL.setText("2345678");
        CampoCUIL.setEnabled(false);

        CampoNombreEmpresa.setEnabled(false);

        CampoRazonSocial.setEnabled(false);

        CampoEmail.setEnabled(false);
        CampoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEmailActionPerformed(evt);
            }
        });

        CampoTelefono.setEnabled(false);

        EtiquetaDatosPA.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        EtiquetaDatosPA.setText("Datos del producto alimenticio");

        EtiquetaNroFactura.setText("Nro factura: ");

        EtiquetaRegistroRNPA.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        EtiquetaRegistroRNPA.setText("Registro numero RNPA");

        EtiquetaRNPA.setText("RNPA: ");

        CampoFechaVencimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        EtiquetaFechaVencimiento.setText("Fecha Vencimiento: ");

        EtiquetaRotulo.setText("Rotulo: ");

        CampoRotulo.setColumns(20);
        CampoRotulo.setRows(5);
        jScrollPane1.setViewportView(CampoRotulo);

        EtiquetaDatosDeLab.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        EtiquetaDatosDeLab.setText("Datos de la muestra de laboratorio");

        EtiquetaCargaProdAlimenticio.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        EtiquetaCargaProdAlimenticio.setText("Carga de Producto Alimenticio");

        EtiquetaNumProtocolo.setText("Numero Protocolo: ");

        jLabel1.setText("Numero de Acta: ");

        javax.swing.GroupLayout CargaBasicaLayout = new javax.swing.GroupLayout(CargaBasica);
        CargaBasica.setLayout(CargaBasicaLayout);
        CargaBasicaLayout.setHorizontalGroup(
            CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargaBasicaLayout.createSequentialGroup()
                .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargaBasicaLayout.createSequentialGroup()
                        .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CargaBasicaLayout.createSequentialGroup()
                                .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CargaBasicaLayout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(EtiquetaTituloDatoEmpresa))
                                    .addGroup(CargaBasicaLayout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EtiquetaCargaProdAlimenticio)
                                            .addGroup(CargaBasicaLayout.createSequentialGroup()
                                                .addComponent(NumRNE, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(174, 174, 174)
                                                .addComponent(BuscarRNE))
                                            .addComponent(TextFieldRNE, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(CargaBasicaLayout.createSequentialGroup()
                                .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CargaBasicaLayout.createSequentialGroup()
                                        .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(CargaBasicaLayout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(EtiquetaDatosPA))
                                            .addGroup(CargaBasicaLayout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(EtiquetaRegistroRNPA))
                                            .addGroup(CargaBasicaLayout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(EtiquetaRotulo)
                                                    .addGroup(CargaBasicaLayout.createSequentialGroup()
                                                        .addComponent(EtiquetaNroFactura)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(CampoNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(80, 80, 80))
                                    .addGroup(CargaBasicaLayout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(EtiquetaRNPA, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoRNPA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EtiquetaFechaVencimiento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(CampoFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SeparadorDatosEmpresa)
                            .addGroup(CargaBasicaLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CampoNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(EtiquetaCUIL)
                                        .addComponent(EtiquetaNombreEmpresa)
                                        .addComponent(EtiquetaRazonSocial)
                                        .addComponent(CampoCUIL, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CampoRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(CargaBasicaLayout.createSequentialGroup()
                                        .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EtiquetaTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(EtiquetaEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(142, 142, 142))
                                    .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(30, 30, 30))
                    .addComponent(jSeparator1)
                    .addComponent(SeparadorDatosProducto)
                    .addComponent(SeparadorRegistroRNPA, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CargaBasicaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EtiquetaDatosDeLab)
                            .addGroup(CargaBasicaLayout.createSequentialGroup()
                                .addComponent(EtiquetaNumProtocolo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoNumProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CargaBasicaLayout.setVerticalGroup(
            CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargaBasicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CargaBasicaLayout.createSequentialGroup()
                        .addComponent(EtiquetaCargaProdAlimenticio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumRNE)
                            .addComponent(BuscarRNE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldRNE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SeparadorDatosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EtiquetaTituloDatoEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiquetaCUIL)
                            .addComponent(EtiquetaEmail))
                        .addGap(5, 5, 5)
                        .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoCUIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiquetaNombreEmpresa)
                            .addComponent(EtiquetaTelefono))
                        .addGap(4, 4, 4)
                        .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EtiquetaRazonSocial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SeparadorRegistroRNPA, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EtiquetaRegistroRNPA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiquetaRNPA)
                            .addComponent(CampoRNPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaFechaVencimiento))
                        .addGap(24, 24, 24)
                        .addComponent(SeparadorDatosProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EtiquetaDatosPA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaNroFactura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EtiquetaRotulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EtiquetaDatosDeLab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiquetaNumProtocolo)
                            .addComponent(CampoNumProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelCargaPA.addTab("Informacion General", CargaBasica);

        javax.swing.GroupLayout CargaCompsicionLayout = new javax.swing.GroupLayout(CargaCompsicion);
        CargaCompsicion.setLayout(CargaCompsicionLayout);
        CargaCompsicionLayout.setHorizontalGroup(
            CargaCompsicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 764, Short.MAX_VALUE)
        );
        CargaCompsicionLayout.setVerticalGroup(
            CargaCompsicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );

        PanelCargaPA.addTab("Composicion", CargaCompsicion);

        javax.swing.GroupLayout CargaDescripcionLayout = new javax.swing.GroupLayout(CargaDescripcion);
        CargaDescripcion.setLayout(CargaDescripcionLayout);
        CargaDescripcionLayout.setHorizontalGroup(
            CargaDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 764, Short.MAX_VALUE)
        );
        CargaDescripcionLayout.setVerticalGroup(
            CargaDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );

        PanelCargaPA.addTab("Descripcion", CargaDescripcion);

        jMenu1.setText("File");

        MenuSalir.setText("Salir");
        MenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(MenuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        MenuCarga.setText("Cargar");

        MenuItemCargaProductoA.setText("Cargar Producto Alimenticio");
        MenuItemCargaProductoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCargaProductoAActionPerformed(evt);
            }
        });
        MenuCarga.add(MenuItemCargaProductoA);

        jMenuBar1.add(MenuCarga);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCargaPA, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCargaPA, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_MenuSalirActionPerformed

    private void MenuItemCargaProductoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCargaProductoAActionPerformed
        // TODO add your handling code here:
        this.PanelCargaPA.setVisible(true);
      
    }//GEN-LAST:event_MenuItemCargaProductoAActionPerformed

    private void PanelCargaPAComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_PanelCargaPAComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelCargaPAComponentAdded

    private void CampoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEmailActionPerformed

    private void BuscarRNEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarRNEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarRNEActionPerformed

    private void TextFieldRNEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldRNEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldRNEActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarRNE;
    private javax.swing.JTextField CampoCUIL;
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JFormattedTextField CampoFechaVencimiento;
    private javax.swing.JTextField CampoNombreEmpresa;
    private javax.swing.JTextField CampoNroFactura;
    private javax.swing.JTextField CampoNumProtocolo;
    private javax.swing.JTextField CampoRNPA;
    private javax.swing.JTextField CampoRazonSocial;
    private javax.swing.JTextArea CampoRotulo;
    private javax.swing.JTextField CampoTelefono;
    private javax.swing.JPanel CargaBasica;
    private javax.swing.JPanel CargaCompsicion;
    private javax.swing.JPanel CargaDescripcion;
    private javax.swing.JLabel EtiquetaCUIL;
    private javax.swing.JLabel EtiquetaCargaProdAlimenticio;
    private javax.swing.JLabel EtiquetaDatosDeLab;
    private javax.swing.JLabel EtiquetaDatosPA;
    private javax.swing.JLabel EtiquetaEmail;
    private javax.swing.JLabel EtiquetaFechaVencimiento;
    private javax.swing.JLabel EtiquetaNombreEmpresa;
    private javax.swing.JLabel EtiquetaNroFactura;
    private javax.swing.JLabel EtiquetaNumProtocolo;
    private javax.swing.JLabel EtiquetaRNPA;
    private javax.swing.JLabel EtiquetaRazonSocial;
    private javax.swing.JLabel EtiquetaRegistroRNPA;
    private javax.swing.JLabel EtiquetaRotulo;
    private javax.swing.JLabel EtiquetaTelefono;
    private javax.swing.JLabel EtiquetaTituloDatoEmpresa;
    private javax.swing.JMenu MenuCarga;
    private javax.swing.JMenuItem MenuItemCargaProductoA;
    private javax.swing.JMenuItem MenuSalir;
    private javax.swing.JLabel NumRNE;
    private javax.swing.JTabbedPane PanelCargaPA;
    private javax.swing.JSeparator SeparadorDatosEmpresa;
    private javax.swing.JSeparator SeparadorDatosProducto;
    private javax.swing.JSeparator SeparadorRegistroRNPA;
    private javax.swing.JTextField TextFieldRNE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollBar jScrollBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
