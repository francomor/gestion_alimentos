/**
 * @author Francisco Herrero, Franco Morero y Mauricio Vazquez
 * @version 1.0
 */
package Presentacion;

import Logica.Empresa;
import Logica.Establecimiento;
import Logica.ProductoAlimenticio;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Este panel es el encargado de mostrar una consulta por numero de CUIT
 *
 * @author Mauricio
 *
 */
public
        class ConsultaPorCuit extends javax.swing.JPanel {

    /**
     * Creates new form ConsultaPorCuit
     */
    public
            ConsultaPorCuit() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        InfoAdicional = new javax.swing.JMenuItem();
        LimpiarTablas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        EtiquetaConsultaPorCUIT = new javax.swing.JLabel();
        CampoCUIT = new javax.swing.JTextField();
        SeparadorDatosEmpresa = new javax.swing.JSeparator();
        EtiquetaDatosEmpresa = new javax.swing.JLabel();
        ScrollPanelDatosEmpresa = new javax.swing.JScrollPane();
        TablaDatosEmpresa = new javax.swing.JTable();
        SeparadorEstablecimientoAsociado = new javax.swing.JSeparator();
        EtiquetaEstablecimientoAsociado = new javax.swing.JLabel();
        ScrollpanelEstablecimientoAsociado = new javax.swing.JScrollPane();
        TablaEstablecimientoAsociado = new javax.swing.JTable();
        SeparadorPAAsociado = new javax.swing.JSeparator();
        EtiquetaPAAsociado = new javax.swing.JLabel();
        ScrollpanelPAAsociado = new javax.swing.JScrollPane();
        TablaPAAsociado = new javax.swing.JTable();
        botonBuscar = new javax.swing.JButton();
        EtiquetaNumerCuil = new javax.swing.JLabel();

        InfoAdicional.setText("Informacion Adicional");
        InfoAdicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoAdicionalActionPerformed(evt);
            }
        });
        jPopupMenu1.add(InfoAdicional);

        LimpiarTablas.setText("Limpiar Tablas");
        LimpiarTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarTablasActionPerformed(evt);
            }
        });
        jPopupMenu1.add(LimpiarTablas);

        setBackground(new java.awt.Color(255, 255, 255));

        EtiquetaConsultaPorCUIT.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        EtiquetaConsultaPorCUIT.setForeground(new java.awt.Color(0, 51, 0));
        EtiquetaConsultaPorCUIT.setText("Consulta por CUIT ");

        CampoCUIT.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CampoCUIT.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CampoCUIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        CampoCUIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CampoCUITKeyPressed(evt);
            }
        });

        EtiquetaDatosEmpresa.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        EtiquetaDatosEmpresa.setForeground(new java.awt.Color(0, 51, 0));
        EtiquetaDatosEmpresa.setText("Datos de la empresa ");

        TablaDatosEmpresa.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TablaDatosEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Razon Social", "Direccion", "Email", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDatosEmpresa.setSelectionBackground(new java.awt.Color(76, 140, 74));
        ScrollPanelDatosEmpresa.setViewportView(TablaDatosEmpresa);
        if (TablaDatosEmpresa.getColumnModel().getColumnCount() > 0) {
            TablaDatosEmpresa.getColumnModel().getColumn(0).setResizable(false);
            TablaDatosEmpresa.getColumnModel().getColumn(1).setResizable(false);
            TablaDatosEmpresa.getColumnModel().getColumn(2).setResizable(false);
            TablaDatosEmpresa.getColumnModel().getColumn(3).setResizable(false);
            TablaDatosEmpresa.getColumnModel().getColumn(4).setResizable(false);
        }

        EtiquetaEstablecimientoAsociado.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        EtiquetaEstablecimientoAsociado.setForeground(new java.awt.Color(0, 51, 0));
        EtiquetaEstablecimientoAsociado.setText("Establecimientos Asociados ");

        TablaEstablecimientoAsociado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TablaEstablecimientoAsociado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero RNE", "Nombre establecimiento", "Telefono", "Vencimiento RNE", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaEstablecimientoAsociado.setComponentPopupMenu(jPopupMenu1);
        TablaEstablecimientoAsociado.setSelectionBackground(new java.awt.Color(76, 140, 74));
        TablaEstablecimientoAsociado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEstablecimientoAsociadoMouseClicked(evt);
            }
        });
        ScrollpanelEstablecimientoAsociado.setViewportView(TablaEstablecimientoAsociado);
        if (TablaEstablecimientoAsociado.getColumnModel().getColumnCount() > 0) {
            TablaEstablecimientoAsociado.getColumnModel().getColumn(0).setResizable(false);
            TablaEstablecimientoAsociado.getColumnModel().getColumn(1).setResizable(false);
            TablaEstablecimientoAsociado.getColumnModel().getColumn(2).setResizable(false);
            TablaEstablecimientoAsociado.getColumnModel().getColumn(3).setResizable(false);
            TablaEstablecimientoAsociado.getColumnModel().getColumn(4).setResizable(false);
        }

        EtiquetaPAAsociado.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        EtiquetaPAAsociado.setForeground(new java.awt.Color(0, 51, 0));
        EtiquetaPAAsociado.setText("Producto Alimenticio Asociado");

        TablaPAAsociado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TablaPAAsociado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero RNPA", "Numero RNE", "Nombre Producto", "Vencimiento RNPA", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPAAsociado.setComponentPopupMenu(jPopupMenu1);
        TablaPAAsociado.setSelectionBackground(new java.awt.Color(76, 140, 74));
        ScrollpanelPAAsociado.setViewportView(TablaPAAsociado);
        if (TablaPAAsociado.getColumnModel().getColumnCount() > 0) {
            TablaPAAsociado.getColumnModel().getColumn(0).setResizable(false);
            TablaPAAsociado.getColumnModel().getColumn(1).setResizable(false);
            TablaPAAsociado.getColumnModel().getColumn(2).setResizable(false);
            TablaPAAsociado.getColumnModel().getColumn(3).setResizable(false);
            TablaPAAsociado.getColumnModel().getColumn(4).setResizable(false);
        }

        botonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Search_sombrapx.png"))); // NOI18N
        botonBuscar.setBorder(null);
        botonBuscar.setBorderPainted(false);
        botonBuscar.setContentAreaFilled(false);
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBuscarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBuscarMousePressed(evt);
            }
        });
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        EtiquetaNumerCuil.setText("N° CUIT:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SeparadorDatosEmpresa)
                    .addComponent(SeparadorEstablecimientoAsociado)
                    .addComponent(SeparadorPAAsociado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EtiquetaDatosEmpresa)
                                    .addComponent(EtiquetaEstablecimientoAsociado)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(EtiquetaPAAsociado))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(EtiquetaConsultaPorCUIT))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(EtiquetaNumerCuil)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoCUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20)
                                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollpanelPAAsociado, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollpanelEstablecimientoAsociado)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPanelDatosEmpresa)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(EtiquetaConsultaPorCUIT)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoCUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaNumerCuil))
                        .addGap(35, 35, 35)
                        .addComponent(SeparadorDatosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EtiquetaDatosEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ScrollPanelDatosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SeparadorEstablecimientoAsociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EtiquetaEstablecimientoAsociado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ScrollpanelEstablecimientoAsociado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(SeparadorPAAsociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EtiquetaPAAsociado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ScrollpanelPAAsociado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed

        consultaCuit(CampoCUIT.getText());

    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseEntered
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Search_24px.png")));
    }//GEN-LAST:event_botonBuscarMouseEntered

    private void botonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseExited
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Search_sombrapx.png")));
    }//GEN-LAST:event_botonBuscarMouseExited

    private void botonBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMousePressed
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Search_24px.png")));
    }//GEN-LAST:event_botonBuscarMousePressed

    private void CampoCUITKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoCUITKeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            consultaCuit(CampoCUIT.getText());
        }
    }//GEN-LAST:event_CampoCUITKeyPressed

    private void InfoAdicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoAdicionalActionPerformed
        if (TablaEstablecimientoAsociado.getSelectedRowCount() == 1) {

            DefaultTableModel tm = (DefaultTableModel) TablaEstablecimientoAsociado.getModel();
            String dato = String.valueOf(tm.getValueAt(TablaEstablecimientoAsociado.getSelectedRow(), 0));

            try {
                Establecimiento est = Establecimiento.recuperarPorNroRNE(dato);
                JFrame jf = new InformacionAdicional(est);
                jf.setVisible(true);
            }
            catch (SQLException | InstantiationException | IllegalAccessException ex) {

                Logger.getLogger(ConsultaPorCuit.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_InfoAdicionalActionPerformed

    private void TablaEstablecimientoAsociadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEstablecimientoAsociadoMouseClicked

    }//GEN-LAST:event_TablaEstablecimientoAsociadoMouseClicked

    private void LimpiarTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarTablasActionPerformed
        clearPanel();
    }//GEN-LAST:event_LimpiarTablasActionPerformed

    /**
     * esta funcion carga informacion a los campos que sean necesarios del panel
     *
     * @param empresa parametro que trae informacion sobre una Empresa
     * @param establecimientos parametro que contiene todos los establecimientos
     * asociados a una empresa
     * @param ProductosAlimenticios parametro que trae todos los productos
     * alimenticios asociados a una empresa
     */
    public
            void cargarTablas(Empresa empresa, Vector<Establecimiento> establecimientos, Vector<ProductoAlimenticio> ProductosAlimenticios) {

        TablaDatosEmpresa.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {empresa.getNombre(),
                        empresa.getRazon_social(),
                        empresa.getDireccion(),
                        empresa.getEmail(),
                        empresa.getTelefono()}
                },
                new String[]{
                    "Nombre", "Razon Social", "Direccion", "Email", "Telefono"
                }) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public
                    Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public
                    boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //cargo tabla con datos de establecimiento
        Object[][] datosDeEstablecimientos = new Object[establecimientos.size()][5];

        for (int i = 0; i < establecimientos.size(); i++) {

            datosDeEstablecimientos[i][0] = establecimientos.elementAt(i).getRne().getNumero();
            datosDeEstablecimientos[i][1] = establecimientos.elementAt(i).getNombre();
            datosDeEstablecimientos[i][2] = establecimientos.elementAt(i).getTelefono();
            if (establecimientos.elementAt(i).getRne().getFecha_vencimiento() != null) {
                datosDeEstablecimientos[i][3] = sdf.format(establecimientos.elementAt(i).getRne().getFecha_vencimiento().getTime());
            }
            else {
                datosDeEstablecimientos[i][3] = "";
            }
            datosDeEstablecimientos[i][4] = establecimientos.elementAt(i).getDireccion();

        }

        //seteo modelo de tabla
        TablaEstablecimientoAsociado.setModel(new javax.swing.table.DefaultTableModel(
                datosDeEstablecimientos,
                new String[]{
                    "Numero RNE", "Nombre establecimiento", "Telefono", "Vencimiento RNE", "Direccion"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public
                    Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public
                    boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        Object[][] datosDePAAsociados = new Object[ProductosAlimenticios.size()][5];

        //System.out.println(ProductosAlimenticios.size());
        for (int i = 0; i < ProductosAlimenticios.size(); i++) {
            datosDePAAsociados[i][0] = ProductosAlimenticios.elementAt(i).getRnpa().getNumero();
            datosDePAAsociados[i][1] = ProductosAlimenticios.elementAt(i).getEstablecimiento().getRne().getNumero();
            datosDePAAsociados[i][2] = ProductosAlimenticios.elementAt(i).getComposicion().getNombre_comercial();
            datosDePAAsociados[i][3] = sdf.format(ProductosAlimenticios.elementAt(i).getRnpa().getFecha_vencimiento().getTime());
            datosDePAAsociados[i][4] = ProductosAlimenticios.elementAt(i).getComposicion().getMarca();
        }

        TablaPAAsociado.setModel(new javax.swing.table.DefaultTableModel(
                datosDePAAsociados,
                new String[]{
                    "Numero RNPA", "Numero RNE", "Nombre Producto", "Vencimiento RNPA", "Marca"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public
                    boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

    }

    /**
     * esta funcion limpia todos los campos del panel ConsultaPorCuit.
     */
    public
            void clearPanel() {
        CampoCUIT.setText("");

        //reseteo las tablas
        TablaDatosEmpresa.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null, null}
                },
                new String[]{
                    "Nombre", "Razon Social", "Direccion", "Email", "Telefono"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public
                    Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public
                    boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        TablaEstablecimientoAsociado.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null, null}
                },
                new String[]{
                    "Numero RNE", "Nombre establecimiento", "Telefono", "Vencimiento RNE", "Direccion"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public
                    Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public
                    boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        TablaPAAsociado.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null, null},},
                new String[]{
                    "Numero RNPA", "Numero RNE", "Nombre Producto", "Vencimiento RNPA", "Marca"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public
                    boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

    }

    /**
     * esta funcion realiza todo el procedimiento de busqueda para que sea
     * mostrado por pantalla
     *
     * @param cuit parametro que se usara para buscar en la base de datos
     */
    public
            void consultaCuit(String cuit) {

        if (!cuit.equals("")) {
            Vector<Establecimiento> establecimientos;
            Vector<ProductoAlimenticio> ProductosAlimenticios;

            try {

                Empresa empresa;
                empresa = Empresa.recuperarPorCuit(cuit);

                //CARGA DE TABLAS
                if (empresa != null) {

                    establecimientos = Empresa.recuperarEstablecimientosAsociados(cuit);
                    ProductosAlimenticios = Empresa.recuperarPAAsociados(cuit);

                    cargarTablas(empresa, establecimientos, ProductosAlimenticios);
                    CampoCUIT.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 1));
                }
                else {
                    CampoCUIT.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                    JOptionPane.showMessageDialog(null, "CUIT no encontrado.");
                    clearPanel();
                }
            }
            catch (SQLException | InstantiationException | IllegalAccessException ex) {
            }

        }
        else {
            CampoCUIT.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            JOptionPane.showMessageDialog(null, "Escriba un CUIT.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoCUIT;
    private javax.swing.JLabel EtiquetaConsultaPorCUIT;
    private javax.swing.JLabel EtiquetaDatosEmpresa;
    private javax.swing.JLabel EtiquetaEstablecimientoAsociado;
    private javax.swing.JLabel EtiquetaNumerCuil;
    private javax.swing.JLabel EtiquetaPAAsociado;
    private javax.swing.JMenuItem InfoAdicional;
    private javax.swing.JMenuItem LimpiarTablas;
    private javax.swing.JScrollPane ScrollPanelDatosEmpresa;
    private javax.swing.JScrollPane ScrollpanelEstablecimientoAsociado;
    private javax.swing.JScrollPane ScrollpanelPAAsociado;
    private javax.swing.JSeparator SeparadorDatosEmpresa;
    private javax.swing.JSeparator SeparadorEstablecimientoAsociado;
    private javax.swing.JSeparator SeparadorPAAsociado;
    private javax.swing.JTable TablaDatosEmpresa;
    private javax.swing.JTable TablaEstablecimientoAsociado;
    private javax.swing.JTable TablaPAAsociado;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
