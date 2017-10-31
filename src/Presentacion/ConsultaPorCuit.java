/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.Empresa;
import Logica.Establecimiento;
import Logica.ProductoAlimenticio;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;


/**
 *
 * @author mauri
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

        EtiquetaConsultaPorCUIT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EtiquetaConsultaPorCUIT.setText("Consulta por CUIT ");

        EtiquetaDatosEmpresa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EtiquetaDatosEmpresa.setText("Datos de la empresa ");

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
        ScrollPanelDatosEmpresa.setViewportView(TablaDatosEmpresa);
        if (TablaDatosEmpresa.getColumnModel().getColumnCount() > 0) {
            TablaDatosEmpresa.getColumnModel().getColumn(0).setResizable(false);
            TablaDatosEmpresa.getColumnModel().getColumn(1).setResizable(false);
            TablaDatosEmpresa.getColumnModel().getColumn(2).setResizable(false);
            TablaDatosEmpresa.getColumnModel().getColumn(3).setResizable(false);
            TablaDatosEmpresa.getColumnModel().getColumn(4).setResizable(false);
        }

        EtiquetaEstablecimientoAsociado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EtiquetaEstablecimientoAsociado.setText("Establecimientos Asociados ");

        TablaEstablecimientoAsociado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero RNE", "Nombre establecimiento", "Rubro", "Vencimiento RNE", "Informacion Adicional"
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
        ScrollpanelEstablecimientoAsociado.setViewportView(TablaEstablecimientoAsociado);
        if (TablaEstablecimientoAsociado.getColumnModel().getColumnCount() > 0) {
            TablaEstablecimientoAsociado.getColumnModel().getColumn(0).setResizable(false);
            TablaEstablecimientoAsociado.getColumnModel().getColumn(1).setResizable(false);
            TablaEstablecimientoAsociado.getColumnModel().getColumn(2).setResizable(false);
            TablaEstablecimientoAsociado.getColumnModel().getColumn(3).setResizable(false);
            TablaEstablecimientoAsociado.getColumnModel().getColumn(4).setResizable(false);
        }

        EtiquetaPAAsociado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EtiquetaPAAsociado.setText("Producto Alimenticio Asociado");

        TablaPAAsociado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero RNPA", "Numero RNE", "Nombre Producto", "Vencimiento RNPA", "Informacion Adicional"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollpanelPAAsociado.setViewportView(TablaPAAsociado);
        if (TablaPAAsociado.getColumnModel().getColumnCount() > 0) {
            TablaPAAsociado.getColumnModel().getColumn(0).setResizable(false);
            TablaPAAsociado.getColumnModel().getColumn(1).setResizable(false);
            TablaPAAsociado.getColumnModel().getColumn(2).setResizable(false);
            TablaPAAsociado.getColumnModel().getColumn(3).setResizable(false);
            TablaPAAsociado.getColumnModel().getColumn(4).setResizable(false);
        }

        botonBuscar.setText("Buscar");
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
                                .addGap(56, 56, 56)
                                .addComponent(EtiquetaConsultaPorCUIT))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(EtiquetaNumerCuil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoCUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(botonBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EtiquetaDatosEmpresa)
                                    .addComponent(EtiquetaEstablecimientoAsociado)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(EtiquetaPAAsociado)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CampoCUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EtiquetaNumerCuil))
                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(17, 17, 17)
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
                .addGap(39, 39, 39)
                .addComponent(SeparadorPAAsociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EtiquetaPAAsociado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollpanelPAAsociado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed

        Vector<Establecimiento> establecimientos;
        Vector<ProductoAlimenticio> ProductosAlimenticios;
        try {
            Empresa empresa;
            empresa = Empresa.recuperarPorCuit(CampoCUIT.getText());
            //CARGO DATOS DE LA EMPRESA EN LA TABLA SI ENECUENTRO
            if (empresa != null){
                TablaDatosEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {   empresa.getNombre(), 
                    empresa.getRazon_social(), 
                    empresa.getDireccion(), 
                    empresa.getEmail(), 
                    empresa.getTelefono()}
            },
            new String [] {
                "Nombre", "Razon Social", "Direccion", "Email", "Telefono"
            }){
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
                
            establecimientos = Empresa.recuperarEstablecimientosAsociados(CampoCUIT.getText());
            Object [][] datosDeEstablecimientos= new Object[establecimientos.size()][5]; 
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(establecimientos.size());
            for(int i=0;i<establecimientos.size(); i++){
                datosDeEstablecimientos[i][0]= establecimientos.elementAt(i).getRne().getNumero();
                datosDeEstablecimientos[i][1]= establecimientos.elementAt(i).getNombre();
                datosDeEstablecimientos[i][2]= "aca va el rubro falta implementar.";
                if(establecimientos.elementAt(i).getRne().getFecha_vencimiento()!=null)
                    datosDeEstablecimientos[i][3]= sdf.format(establecimientos.elementAt(i).getRne().getFecha_vencimiento().getTime());
                else 
                    datosDeEstablecimientos[i][3]="";
                datosDeEstablecimientos[i][4]= "informacion Adicional";
            }
            

            TablaEstablecimientoAsociado.setModel(new javax.swing.table.DefaultTableModel(
            datosDeEstablecimientos,
            new String [] {
                "Numero RNE", "Nombre establecimiento", "Rubro", "Vencimiento RNE", "Informacion Adicional"
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
            //cargo tabla de producto alimenticio
            
            ProductosAlimenticios= Empresa.recuperarPAAsociados(CampoCUIT.getText());
            Object [][] datosDePAAsociados= new Object[ProductosAlimenticios.size()][5];
            System.out.println(ProductosAlimenticios.size());
            for(int i=0;i<ProductosAlimenticios.size(); i++){
                datosDePAAsociados[i][0]= ProductosAlimenticios.elementAt(i).getRnpa().getNumero();
                datosDePAAsociados[i][1]= ProductosAlimenticios.elementAt(i).getEstablecimiento().getRne().getNumero();
                datosDePAAsociados[i][2]= ProductosAlimenticios.elementAt(i).getComposicion().getNombre_comercial();
                datosDePAAsociados[i][3]= sdf.format(ProductosAlimenticios.elementAt(i).getRnpa().getFecha_vencimiento().getTime());
                datosDePAAsociados[i][4]= "informacion Adicional";
            }
                
            TablaPAAsociado.setModel(new javax.swing.table.DefaultTableModel(
            datosDePAAsociados,
            new String [] {
                "Numero RNPA", "Numero RNE", "Nombre Producto", "Vencimiento RNPA", "Informacion Adicional"
                    }
                ) {
                    boolean[] canEdit = new boolean [] {
                        false, false, false, false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });
                ScrollpanelPAAsociado.setViewportView(TablaPAAsociado);
                if (TablaPAAsociado.getColumnModel().getColumnCount() > 0) {
                    TablaPAAsociado.getColumnModel().getColumn(0).setResizable(false);
                    TablaPAAsociado.getColumnModel().getColumn(1).setResizable(false);
                    TablaPAAsociado.getColumnModel().getColumn(2).setResizable(false);
                    TablaPAAsociado.getColumnModel().getColumn(3).setResizable(false);
                    TablaPAAsociado.getColumnModel().getColumn(4).setResizable(false);
                }

                botonBuscar.setText("Buscar");
                botonBuscar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonBuscarActionPerformed(evt);
                    }
                });
            
            } else
                 {
                JOptionPane.showMessageDialog(null, "CUIT no encontrado.");
            }
        } catch (SQLException | InstantiationException | IllegalAccessException ex){
        }
            
    }//GEN-LAST:event_botonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoCUIT;
    private javax.swing.JLabel EtiquetaConsultaPorCUIT;
    private javax.swing.JLabel EtiquetaDatosEmpresa;
    private javax.swing.JLabel EtiquetaEstablecimientoAsociado;
    private javax.swing.JLabel EtiquetaNumerCuil;
    private javax.swing.JLabel EtiquetaPAAsociado;
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
    // End of variables declaration//GEN-END:variables
}
