/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas.Admin.Solicitudes;



import Entidades.EstadoSolicitud;
import Utilidades.ServiciosUsuario;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author chave
 */
public class pnlEstadoSolicitud extends javax.swing.JPanel {
    private final ServiciosUsuario servicio ;
   
    /**
     * Creates new form principal
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
     private List<EstadoSolicitud> listaEstados;
    public pnlEstadoSolicitud() throws ClassNotFoundException, SQLException {
        initComponents();
        servicio =new ServiciosUsuario();     
        listarEstados("");
        this.panelSlider.setPanelNormal(this.pnlTablaEstado);
        btnVolver.setVisible(false);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSlider = new newscomponents.RSPanelEffect();
        pnlTablaEstado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstados = new RSMaterialComponent.RSTableMetroCustom();
        txtBuscarEstado = new RSMaterialComponent.RSTextFieldMaterialIcon();
        lblestado = new javax.swing.JLabel();
        pnlEditarEstado = new javax.swing.JPanel();
        rSLabelTextIcon1 = new RSMaterialComponent.RSLabelTextIcon();
        rSLabelTextIcon3 = new RSMaterialComponent.RSLabelTextIcon();
        rSLabelTextIcon4 = new RSMaterialComponent.RSLabelTextIcon();
        rSLabelTextIcon5 = new RSMaterialComponent.RSLabelTextIcon();
        btnActualizarEstado = new RSMaterialComponent.RSButtonMaterialIconOne();
        txtIdEstado = new necesario.TextField();
        lblUsuarios1 = new javax.swing.JLabel();
        txtNombre = new necesario.TextField();
        rSLabelTextIcon6 = new RSMaterialComponent.RSLabelTextIcon();
        txtNuevoNombre = new necesario.TextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNuevaDescrip = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnEditarEstado = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnVolver = new RSMaterialComponent.RSButtonMaterialIconOne();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlTablaEstado.setBackground(new java.awt.Color(255, 255, 255));
        pnlTablaEstado.setName("pnlTablaEstado"); // NOI18N

        jScrollPane1.setBorder(null);

        tablaEstados.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaEstados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEstados.setBackgoundHead(new java.awt.Color(0, 108, 255));
        tablaEstados.setBackgoundHover(new java.awt.Color(10, 94, 208));
        tablaEstados.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaEstados.setRowHeight(40);
        tablaEstados.setSelectionBackground(new java.awt.Color(78, 85, 230));
        jScrollPane1.setViewportView(tablaEstados);
        if (tablaEstados.getColumnModel().getColumnCount() > 0) {
            tablaEstados.getColumnModel().getColumn(0).setPreferredWidth(5);
            tablaEstados.getColumnModel().getColumn(1).setPreferredWidth(30);
            tablaEstados.getColumnModel().getColumn(2).setPreferredWidth(500);
        }

        txtBuscarEstado.setForeground(new java.awt.Color(0, 108, 255));
        txtBuscarEstado.setColorIcon(new java.awt.Color(0, 108, 255));
        txtBuscarEstado.setColorMaterial(new java.awt.Color(0, 108, 255));
        txtBuscarEstado.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtBuscarEstado.setPhColor(new java.awt.Color(0, 69, 255));
        txtBuscarEstado.setPlaceholder("Buscar");
        txtBuscarEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarEstadoKeyReleased(evt);
            }
        });

        lblestado.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblestado.setText("Estados de Solicitud");

        javax.swing.GroupLayout pnlTablaEstadoLayout = new javax.swing.GroupLayout(pnlTablaEstado);
        pnlTablaEstado.setLayout(pnlTablaEstadoLayout);
        pnlTablaEstadoLayout.setHorizontalGroup(
            pnlTablaEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaEstadoLayout.createSequentialGroup()
                .addGroup(pnlTablaEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTablaEstadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
                    .addGroup(pnlTablaEstadoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblestado, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlTablaEstadoLayout.setVerticalGroup(
            pnlTablaEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTablaEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblestado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        panelSlider.add(pnlTablaEstado, "card2");

        pnlEditarEstado.setBackground(new java.awt.Color(255, 255, 255));
        pnlEditarEstado.setName("pnlEditarEstado"); // NOI18N

        rSLabelTextIcon1.setText("Id Estado");
        rSLabelTextIcon1.setColorIcon(java.awt.Color.white);

        rSLabelTextIcon3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSLabelTextIcon3.setText("Nueva Descripcion");
        rSLabelTextIcon3.setColorIcon(java.awt.Color.white);
        rSLabelTextIcon3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        rSLabelTextIcon4.setText("Nombre");
        rSLabelTextIcon4.setColorIcon(java.awt.Color.white);

        rSLabelTextIcon5.setText("Descripcion");
        rSLabelTextIcon5.setColorIcon(new java.awt.Color(255, 255, 255));

        btnActualizarEstado.setBackground(new java.awt.Color(204, 204, 204));
        btnActualizarEstado.setText("Actualizar");
        btnActualizarEstado.setBackgroundHover(new java.awt.Color(0, 153, 0));
        btnActualizarEstado.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnActualizarEstado.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        btnActualizarEstado.setForegroundText(new java.awt.Color(0, 0, 0));
        btnActualizarEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActualizarEstado.setIconTextGap(29);
        btnActualizarEstado.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        btnActualizarEstado.setPaddingLeft(15);
        btnActualizarEstado.setSelected(true);
        btnActualizarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEstadoActionPerformed(evt);
            }
        });

        txtIdEstado.setDisabledTextColor(new java.awt.Color(37, 45, 223));
        txtIdEstado.setEnabled(false);
        txtIdEstado.setName("txtIdEstado"); // NOI18N
        txtIdEstado.setPlaceholder("idEstado");

        lblUsuarios1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        txtNombre.setDisabledTextColor(new java.awt.Color(37, 45, 223));
        txtNombre.setEnabled(false);
        txtNombre.setName("txtNombre"); // NOI18N
        txtNombre.setPlaceholder("nombre");

        rSLabelTextIcon6.setText("Nuevo Nombre");
        rSLabelTextIcon6.setColorIcon(java.awt.Color.white);

        txtNuevoNombre.setDisabledTextColor(new java.awt.Color(37, 45, 223));
        txtNuevoNombre.setName("txtNuevoNombre"); // NOI18N
        txtNuevoNombre.setPlaceholder("Nuevo nombre");

        txtNuevaDescrip.setColumns(20);
        txtNuevaDescrip.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNuevaDescrip.setForeground(new java.awt.Color(37, 45, 223));
        txtNuevaDescrip.setLineWrap(true);
        txtNuevaDescrip.setRows(5);
        txtNuevaDescrip.setName("txtNuevaDescrip"); // NOI18N
        jScrollPane2.setViewportView(txtNuevaDescrip);

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        txtDescripcion.setDisabledTextColor(new java.awt.Color(37, 45, 223));
        txtDescripcion.setEnabled(false);
        txtDescripcion.setName("txtDescrip"); // NOI18N
        jScrollPane3.setViewportView(txtDescripcion);

        javax.swing.GroupLayout pnlEditarEstadoLayout = new javax.swing.GroupLayout(pnlEditarEstado);
        pnlEditarEstado.setLayout(pnlEditarEstadoLayout);
        pnlEditarEstadoLayout.setHorizontalGroup(
            pnlEditarEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarEstadoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(pnlEditarEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEditarEstadoLayout.createSequentialGroup()
                        .addGroup(pnlEditarEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(409, 409, Short.MAX_VALUE))
                    .addGroup(pnlEditarEstadoLayout.createSequentialGroup()
                        .addGroup(pnlEditarEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rSLabelTextIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSLabelTextIcon5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlEditarEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditarEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rSLabelTextIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rSLabelTextIcon6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditarEstadoLayout.createSequentialGroup()
                                .addComponent(btnActualizarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))))
        );
        pnlEditarEstadoLayout.setVerticalGroup(
            pnlEditarEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarEstadoLayout.createSequentialGroup()
                .addGroup(pnlEditarEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEditarEstadoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSLabelTextIcon6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEditarEstadoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblUsuarios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(pnlEditarEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSLabelTextIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelTextIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditarEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditarEstadoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEditarEstadoLayout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSLabelTextIcon5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addGap(7, 7, 7)))
                .addGap(37, 37, 37))
        );

        panelSlider.add(pnlEditarEstado, "card3");

        btnEditarEstado.setBackground(new java.awt.Color(204, 204, 204));
        btnEditarEstado.setText("Editar Estado");
        btnEditarEstado.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnEditarEstado.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnEditarEstado.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        btnEditarEstado.setForegroundText(new java.awt.Color(0, 0, 0));
        btnEditarEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditarEstado.setIconTextGap(29);
        btnEditarEstado.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnEditarEstado.setPaddingLeft(15);
        btnEditarEstado.setSelected(true);
        btnEditarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEstadoActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(204, 204, 204));
        btnVolver.setText("Volver");
        btnVolver.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnVolver.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnVolver.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        btnVolver.setForegroundText(new java.awt.Color(0, 0, 0));
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolver.setIconTextGap(29);
        btnVolver.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CHEVRON_LEFT);
        btnVolver.setPaddingLeft(15);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnEditarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(panelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEstadoActionPerformed
        int indice = tablaEstados.getSelectedRow();
        
        if(indice!=-1){
            this.panelSlider.setPanelNormal(this.pnlEditarEstado);            
            btnEditarEstado.setVisible(false);
            llenarpnlEditarEstado(listaEstados,indice);
            btnVolver.setVisible(true);
        }
        
    }//GEN-LAST:event_btnEditarEstadoActionPerformed

    private void txtBuscarEstadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEstadoKeyReleased
        String buscar = txtBuscarEstado.getText();
        try {
            this.listarEstados(buscar);
        } catch (SQLException ex) {
            Logger.getLogger(pnlEstadoSolicitud.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_txtBuscarEstadoKeyReleased

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        btnVolver.setVisible(false);
        try {
            listarEstados("");
        } catch (SQLException ex) {
            Logger.getLogger(pnlEstadoSolicitud.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.panelSlider.setPanelNormal(this.pnlTablaEstado);
        btnEditarEstado.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnActualizarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEstadoActionPerformed
        String nuevoNombre =txtNuevoNombre.getText() ;
        String nuevaDescrip =txtNuevaDescrip.getText();
        String id = txtIdEstado.getText();
        try {
            if(!nuevoNombre.isEmpty()&&!nuevaDescrip.isEmpty()){      
           
                JOptionPane.showMessageDialog(null, "El nombre y/o descripcion "
                + "del Estado: "+ id+" a sido editado."
                , "Editar Estado", 1);    
                servicio.actualizarEstados(id,nuevoNombre,nuevaDescrip);            
            }else{
                JOptionPane.showMessageDialog(null, "Complete los campos vacios"
                        , "Editar Estado", 1);

            }
        } catch (SQLException ex) {
              Logger.getLogger(pnlEstadoSolicitud.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_btnActualizarEstadoActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconOne btnActualizarEstado;
    private RSMaterialComponent.RSButtonMaterialIconOne btnEditarEstado;
    private RSMaterialComponent.RSButtonMaterialIconOne btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblUsuarios1;
    private javax.swing.JLabel lblestado;
    private newscomponents.RSPanelEffect panelSlider;
    private javax.swing.JPanel pnlEditarEstado;
    private javax.swing.JPanel pnlTablaEstado;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon1;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon3;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon4;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon5;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon6;
    private RSMaterialComponent.RSTableMetroCustom tablaEstados;
    private RSMaterialComponent.RSTextFieldMaterialIcon txtBuscarEstado;
    private javax.swing.JTextArea txtDescripcion;
    private necesario.TextField txtIdEstado;
    private necesario.TextField txtNombre;
    private javax.swing.JTextArea txtNuevaDescrip;
    private necesario.TextField txtNuevoNombre;
    // End of variables declaration//GEN-END:variables
  
   private void llenarpnlEditarEstado(List<EstadoSolicitud> lista,int i) {
        txtNombre.setText(lista.get(i).getNombre());
        txtIdEstado.setText(String.valueOf(lista.get(i).getCodigo()));
        txtDescripcion.setText(lista.get(i).getDescripcion());
                   
    }
 

    
    public void listarEstados(String buscar) throws SQLException {
        listaEstados = new ArrayList<>();
        this.servicio.listarEstados(tablaEstados,buscar,listaEstados);              
    }
  
}
