/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paneles;

import clases.Cliente;
import clases.Orden;
import java.awt.Component;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author programadorbipolar
 */
public class PnlNuevaOrden extends javax.swing.JPanel {

    /**
     * Creates new form PnlNuevaOrden
     */
    private Orden nuevaOrden;
    private boolean esOrdenNueva = true;
    private boolean procesoOk = false;
    private JOptionPane op;
    public PnlNuevaOrden() {
        initComponents();
        nuevaOrden = new Orden();
        this.lbShow.setVisible(false);
        this.bntImprimir.setVisible(false);
    }
    
    public PnlNuevaOrden(Orden nuevaOrden)
    {
        initComponents();
        this.nuevaOrden = nuevaOrden;
        esOrdenNueva = false;
        this.lbShow.setVisible(false);
        this.bntImprimir.setEnabled(true);
        //this.bntCancelar.setVisible(false);
        this.dcFechaRegistro.setDate(nuevaOrden.getFecha());        
        setValoresCliente();
        this.txtInspector.setText(this.nuevaOrden.getInspector());
        this.cbTipo.setSelectedItem(this.nuevaOrden.getTipo());
        this.txtaMotivo.setText(this.nuevaOrden.getMotivoCorte());
    }
    
    public JLabel getLabelEscondido()
    {
        return this.lbShow;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtMunicipio = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtRfc = new javax.swing.JTextField();
        txtTarifa = new javax.swing.JTextField();
        bntBuscarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dcFechaRegistro = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        bntImprimir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lbShow = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtInspector = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaMotivo = new javax.swing.JTextArea();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Codigo del Cliente:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 16, 0, 0);
        jPanel4.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(8, 16, 0, 0);
        jPanel4.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Direccion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(8, 16, 0, 0);
        jPanel4.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Colonia:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(8, 16, 0, 0);
        jPanel4.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Municipio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(8, 7, 0, 0);
        jPanel4.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 16, 0, 0);
        jPanel4.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Rfc:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(8, 17, 0, 0);
        jPanel4.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tarifa:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(8, 16, 13, 0);
        jPanel4.add(jLabel9, gridBagConstraints);

        txtCodigoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodigoCliente.setPreferredSize(new java.awt.Dimension(120, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 12, 0, 0);
        jPanel4.add(txtCodigoCliente, gridBagConstraints);

        txtNombreCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombreCliente.setPreferredSize(new java.awt.Dimension(240, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 12, 0, 6);
        jPanel4.add(txtNombreCliente, gridBagConstraints);

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDireccion.setPreferredSize(new java.awt.Dimension(120, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 12, 0, 6);
        jPanel4.add(txtDireccion, gridBagConstraints);

        txtColonia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtColonia.setPreferredSize(new java.awt.Dimension(120, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(8, 12, 0, 0);
        jPanel4.add(txtColonia, gridBagConstraints);

        txtMunicipio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMunicipio.setPreferredSize(new java.awt.Dimension(120, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(8, 12, 0, 9);
        jPanel4.add(txtMunicipio, gridBagConstraints);

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefono.setPreferredSize(new java.awt.Dimension(120, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(8, 12, 0, 0);
        jPanel4.add(txtTelefono, gridBagConstraints);

        txtRfc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRfc.setPreferredSize(new java.awt.Dimension(120, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(8, 12, 0, 9);
        jPanel4.add(txtRfc, gridBagConstraints);

        txtTarifa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTarifa.setPreferredSize(new java.awt.Dimension(120, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(8, 12, 13, 0);
        jPanel4.add(txtTarifa, gridBagConstraints);

        bntBuscarCliente.setText("Buscar Cliente");
        bntBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        jPanel4.add(bntBuscarCliente, gridBagConstraints);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Fecha de Registro:");
        jPanel2.add(jLabel1);

        dcFechaRegistro.setDate(Calendar.getInstance().getTime());
        dcFechaRegistro.setDateFormatString("dd/MM/yyyy");
        dcFechaRegistro.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel2.add(dcFechaRegistro);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.GridBagLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/disk.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 8, 4);
        jPanel5.add(jButton1, gridBagConstraints);

        bntImprimir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bntImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/printer.png"))); // NOI18N
        bntImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntImprimirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 8, 4);
        jPanel5.add(bntImprimir, gridBagConstraints);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/cancel.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 8, 4);
        jPanel5.add(jButton3, gridBagConstraints);

        lbShow.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(lbShow, new java.awt.GridBagConstraints());

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Inspector:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 7, 0);
        jPanel6.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Tipo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 7, 0);
        jPanel6.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Motivo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 11, 0);
        jPanel6.add(jLabel12, gridBagConstraints);

        txtInspector.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtInspector.setPreferredSize(new java.awt.Dimension(120, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 7, 0);
        jPanel6.add(txtInspector, gridBagConstraints);

        cbTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Corte", "Reconexion" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 7, 7, 0);
        jPanel6.add(cbTipo, gridBagConstraints);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(280, 50));

        txtaMotivo.setColumns(20);
        txtaMotivo.setLineWrap(true);
        txtaMotivo.setRows(5);
        txtaMotivo.setPreferredSize(new java.awt.Dimension(240, 50));
        jScrollPane1.setViewportView(txtaMotivo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 11, 8);
        jPanel6.add(jScrollPane1, gridBagConstraints);

        jPanel3.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void bntBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarClienteActionPerformed
        PnlBuscarClientes pvc = new PnlBuscarClientes();
        JLabel aviso = pvc.getLabelEscondido();
        JOptionPane.showOptionDialog(this, pvc, "Registrar Seleccionar Cliente",JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, new Object[]{aviso},null);

        Cliente cl = pvc.getNuevoCliente();
        if(cl != null)
        {

            nuevaOrden.setCliente(cl);
            setValoresCliente();
        }

    }//GEN-LAST:event_bntBuscarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(this.dcFechaRegistro.getCalendar() == null)
       {
           JOptionPane.showInternalMessageDialog(this, "Ingrese un Fecha"
                    , "Falta fecha", JOptionPane.ERROR_MESSAGE);
           return;
       }
       if(nuevaOrden.getCliente() == null)
       {
           JOptionPane.showInternalMessageDialog(this, "Seleccione un cliente"
                    , "No seleccionado un cliente", JOptionPane.ERROR_MESSAGE);
           return;
       }
       if(this.txtInspector.getText().isEmpty())
       {
           JOptionPane.showInternalMessageDialog(this, "Ingrese el nombre del Inspector"
                    , "Nombre de inspector vacio", JOptionPane.ERROR_MESSAGE);
           return;
       }
       nuevaOrden.setInspector(this.txtInspector.getText());
       nuevaOrden.setTipo(this.cbTipo.getSelectedItem().toString());
       nuevaOrden.setMotivoCorte(this.txtaMotivo.getText());
       nuevaOrden.setFecha(this.dcFechaRegistro.getCalendar().getTime());

       if(this.esOrdenNueva)
       {
           int grabar = nuevaOrden.grabar();
           if(grabar != 0)
           {
               int confirmar = JOptionPane.showConfirmDialog(this, "Orden grabado correctamente.\n ¿Desea imprimir esta Orden", "Orden Realizada correctamente", JOptionPane.YES_NO_CANCEL_OPTION);
               if(confirmar == JOptionPane.OK_OPTION)
               {
                   PnlImprimirOrden pvc = new PnlImprimirOrden(nuevaOrden);
                        JLabel aviso = pvc.getLabelEscondido();
                         JOptionPane.showOptionDialog(this, pvc, "Imprimir Orden",JOptionPane.OK_CANCEL_OPTION,
                                                             JOptionPane.QUESTION_MESSAGE, null, new Object[]{aviso},null);


                         if(pvc.getProcesoOk())
                         {            
                           int inconfirm = JOptionPane.showConfirmDialog(this, "¿Desea registrar otra Orden?", "La Impresion se realizo correctamente",JOptionPane.INFORMATION_MESSAGE); 
                           if(inconfirm != JOptionPane.OK_OPTION)
                           {
                               getOptionPane();
                               op.setValue(1);
                           }
                         }else
                         {
                             getOptionPane();
                              op.setValue(1);
                         }
               }else{
                   getOptionPane();
                   op.setValue(1);
               }
           }else
           {
               JOptionPane.showInternalMessageDialog(this, "Esta orden no se pudo guardar."
                    , "Error Desconocido", JOptionPane.ERROR_MESSAGE);
           }
       }else
       {
           int actualizar = nuevaOrden.actualizar();
           if(actualizar != 0)
           {
               int confirmar = JOptionPane.showConfirmDialog(this, "Orden Actualizada correctamente.\n ¿Desea imprimir esta Orden", "Orden Actualizada correctamente", JOptionPane.YES_NO_CANCEL_OPTION);
               if(confirmar == JOptionPane.OK_OPTION)
               {
                    procesoOk = true;
                    JOptionPane.showMessageDialog(this, "Pago Actualizado Correctamente", "Actualizacion de Pago", JOptionPane.INFORMATION_MESSAGE);
                    getOptionPane();
                    op.setValue(1);
                    this.bntImprimir.setEnabled(true); 
               }
           }else
           {
               JOptionPane.showInternalMessageDialog(this, "Esta orden no se pudo actualizar."
                    , "Error Desconocido", JOptionPane.ERROR_MESSAGE);
           }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        getOptionPane();
        op.setValue(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bntImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntImprimirActionPerformed
        
              
        if(nuevaOrden == null)
        {
            JOptionPane.showMessageDialog(this, "Imposible imprimir una Orden sin datos", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(nuevaOrden.getCliente() == null)
        {
            JOptionPane.showMessageDialog(this, "Primero debe escoger un cliente", "Orden sin cliente!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(this.dcFechaRegistro == null)
       {
           JOptionPane.showInternalMessageDialog(this, "Debe seleccionar una fecha de Registro"
                    , "fecha de Registro", JOptionPane.ERROR_MESSAGE);
           return;
       }
       
       if(this.txtInspector.getText().isEmpty())
       {
           JOptionPane.showInternalMessageDialog(this, "Debe ingresar el nombre del inspector"
                    , "nombbre de inspector vacio", JOptionPane.ERROR_MESSAGE);
           return;
       }
        
       PnlImprimirOrden pvc = new PnlImprimirOrden(nuevaOrden);
       JLabel aviso = pvc.getLabelEscondido();
        JOptionPane.showOptionDialog(this, pvc, "Imprimir Orden",JOptionPane.OK_CANCEL_OPTION,
                                            JOptionPane.QUESTION_MESSAGE, null, new Object[]{aviso},null);
       
        
        if(pvc.getProcesoOk())
        {            
            JOptionPane.showMessageDialog(this, "Orden Imprimida correctamente", "Proceso Correcto",JOptionPane.INFORMATION_MESSAGE);      
        }
    }//GEN-LAST:event_bntImprimirActionPerformed

    
    public boolean IsProcesoOk()
    {
        return procesoOk;
    }
    
    private void setValoresCliente()
    {
        this.txtCodigoCliente.setText(""+nuevaOrden.getCliente().getNumeroCuenta());
        this.txtNombreCliente.setText(nuevaOrden.getCliente().getNombre());
        this.txtDireccion.setText(nuevaOrden.getCliente().getDireccion());
        this.txtColonia.setText(nuevaOrden.getCliente().getColonia());
        this.txtMunicipio.setText(nuevaOrden.getCliente().getMunicipio());
        this.txtTelefono.setText(nuevaOrden.getCliente().getTelefono());
        this.txtTarifa.setText(nuevaOrden.getCliente().getTarifa());
        this.txtRfc.setText(nuevaOrden.getCliente().getRfc());
    }

    
    private void getOptionPane()
    {
        if(op != null)
        {
            return;
        }
        Component pdr =this.getParent(); 
        while(pdr.getParent() != null)
        {
            if(pdr instanceof JOptionPane)
            {
                op = (JOptionPane)pdr;
                break;
            }            
            pdr = pdr.getParent();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBuscarCliente;
    private javax.swing.JButton bntImprimir;
    private javax.swing.JComboBox cbTipo;
    private com.toedter.calendar.JDateChooser dcFechaRegistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbShow;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtInspector;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtRfc;
    private javax.swing.JTextField txtTarifa;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextArea txtaMotivo;
    // End of variables declaration//GEN-END:variables
}
