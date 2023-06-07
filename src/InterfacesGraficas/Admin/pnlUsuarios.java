/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas.Admin;

import Entidades.Usuario;
import Utilidades.ServiciosUsuario;
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
public class pnlUsuarios extends javax.swing.JPanel {

    /**
     * Creates new form principal
     */
    private int cantidad;
    private final ServiciosUsuario servicio ;
    private String rol ;
    private List<Usuario> listaTrabajadores ;
    private List<Usuario> listaSolicitantes;
    public pnlUsuarios() throws ClassNotFoundException, SQLException {
        initComponents();          
        this.rol = "1";
        this.servicio =new ServiciosUsuario();       
        btnVolver.setVisible(false);
        llenarTrabajadores();
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
        pnlTabla = new javax.swing.JPanel();
        txtBuscarusu = new RSMaterialComponent.RSTextFieldMaterialIcon();
        lblUsuarios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new RSMaterialComponent.RSTableMetroCustom();
        pnlEditarRol = new javax.swing.JPanel();
        txtIdUsuario = new necesario.TextField();
        txtNombres = new necesario.TextField();
        txtApellidos = new necesario.TextField();
        cbxRolNuevo = new RSMaterialComponent.RSComboBoxMaterial();
        txtRolActual = new necesario.TextField();
        rSLabelTextIcon1 = new RSMaterialComponent.RSLabelTextIcon();
        rSLabelTextIcon2 = new RSMaterialComponent.RSLabelTextIcon();
        rSLabelTextIcon3 = new RSMaterialComponent.RSLabelTextIcon();
        rSLabelTextIcon4 = new RSMaterialComponent.RSLabelTextIcon();
        rSLabelTextIcon5 = new RSMaterialComponent.RSLabelTextIcon();
        btnActualizar = new RSMaterialComponent.RSButtonMaterialIconOne();
        lblUsuarios1 = new javax.swing.JLabel();
        btnTrabajadores = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnSolicitantes = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnEditarEstado = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnVolver = new RSMaterialComponent.RSButtonMaterialIconOne();

        setBackground(new java.awt.Color(255, 255, 255));

        panelSlider.setBackground(new java.awt.Color(255, 255, 255));

        pnlTabla.setBackground(new java.awt.Color(255, 255, 255));
        pnlTabla.setName("pnlTabla"); // NOI18N

        txtBuscarusu.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscarusu.setColorIcon(new java.awt.Color(0, 108, 255));
        txtBuscarusu.setColorMaterial(new java.awt.Color(0, 108, 255));
        txtBuscarusu.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtBuscarusu.setPhColor(new java.awt.Color(0, 69, 255));
        txtBuscarusu.setPlaceholder("Buscar");
        txtBuscarusu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarusuKeyReleased(evt);
            }
        });

        lblUsuarios.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblUsuarios.setText("Trabajadores");

        jScrollPane1.setBorder(null);

        tablaUsuarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Dni", "Nombres", "Apellidos", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.setBackgoundHead(new java.awt.Color(0, 108, 255));
        tablaUsuarios.setBackgoundHover(new java.awt.Color(10, 94, 208));
        tablaUsuarios.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tablaUsuarios.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaUsuarios.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tablaUsuarios.setRowHeight(40);
        tablaUsuarios.setSelectionBackground(new java.awt.Color(78, 85, 230));
        jScrollPane1.setViewportView(tablaUsuarios);
        if (tablaUsuarios.getColumnModel().getColumnCount() > 0) {
            tablaUsuarios.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaUsuarios.getColumnModel().getColumn(1).setPreferredWidth(100);
            tablaUsuarios.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablaLayout.createSequentialGroup()
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTablaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(pnlTablaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(txtBuscarusu, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelSlider.add(pnlTabla, "card2");

        pnlEditarRol.setBackground(new java.awt.Color(255, 255, 255));
        pnlEditarRol.setName("pnlEditarRol"); // NOI18N

        txtIdUsuario.setDisabledTextColor(new java.awt.Color(37, 45, 223));
        txtIdUsuario.setEnabled(false);
        txtIdUsuario.setName("txtidUsuario"); // NOI18N
        txtIdUsuario.setPlaceholder("IdUsuario");

        txtNombres.setDisabledTextColor(new java.awt.Color(37, 45, 223));
        txtNombres.setEnabled(false);
        txtNombres.setName("txtNombres"); // NOI18N
        txtNombres.setPlaceholder("nombres");

        txtApellidos.setDisabledTextColor(new java.awt.Color(37, 45, 223));
        txtApellidos.setEnabled(false);
        txtApellidos.setName("txtApellidos"); // NOI18N
        txtApellidos.setPlaceholder("apellidos");

        cbxRolNuevo.setForeground(new java.awt.Color(37, 45, 223));
        cbxRolNuevo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Trabajador", "Solicitante", "Administrador" }));

        txtRolActual.setDisabledTextColor(new java.awt.Color(37, 45, 223));
        txtRolActual.setEnabled(false);
        txtRolActual.setName("txtApellidos"); // NOI18N
        txtRolActual.setPlaceholder("Rol Actual");

        rSLabelTextIcon1.setText("Id Usuario");
        rSLabelTextIcon1.setColorIcon(java.awt.Color.white);

        rSLabelTextIcon2.setText("Rol Nuevo");
        rSLabelTextIcon2.setColorIcon(java.awt.Color.white);

        rSLabelTextIcon3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSLabelTextIcon3.setText("Rol Actual");
        rSLabelTextIcon3.setColorIcon(java.awt.Color.white);
        rSLabelTextIcon3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        rSLabelTextIcon4.setText("Nombres");
        rSLabelTextIcon4.setColorIcon(java.awt.Color.white);

        rSLabelTextIcon5.setText("Apellidos");
        rSLabelTextIcon5.setColorIcon(new java.awt.Color(255, 255, 255));

        btnActualizar.setBackground(new java.awt.Color(204, 204, 204));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBackgroundHover(new java.awt.Color(0, 153, 0));
        btnActualizar.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnActualizar.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        btnActualizar.setForegroundText(new java.awt.Color(0, 0, 0));
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActualizar.setIconTextGap(29);
        btnActualizar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        btnActualizar.setPaddingLeft(15);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblUsuarios1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblUsuarios1.setText("Actualizar Rol");

        javax.swing.GroupLayout pnlEditarRolLayout = new javax.swing.GroupLayout(pnlEditarRol);
        pnlEditarRol.setLayout(pnlEditarRolLayout);
        pnlEditarRolLayout.setHorizontalGroup(
            pnlEditarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarRolLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(pnlEditarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEditarRolLayout.createSequentialGroup()
                        .addGroup(pnlEditarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSLabelTextIcon5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSLabelTextIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlEditarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEditarRolLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(pnlEditarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rSLabelTextIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxRolNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditarRolLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))))
                    .addGroup(pnlEditarRolLayout.createSequentialGroup()
                        .addGroup(pnlEditarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addGroup(pnlEditarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSLabelTextIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRolActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEditarRolLayout.setVerticalGroup(
            pnlEditarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarRolLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblUsuarios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlEditarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditarRolLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEditarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSLabelTextIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEditarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRolActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlEditarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEditarRolLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(rSLabelTextIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rSLabelTextIcon5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlEditarRolLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(rSLabelTextIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxRolNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditarRolLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );

        panelSlider.add(pnlEditarRol, "card3");

        btnTrabajadores.setBackground(new java.awt.Color(204, 204, 204));
        btnTrabajadores.setForeground(new java.awt.Color(0, 0, 0));
        btnTrabajadores.setText("Trabajadores");
        btnTrabajadores.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnTrabajadores.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnTrabajadores.setForegroundText(new java.awt.Color(51, 51, 51));
        btnTrabajadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTrabajadores.setIconTextGap(29);
        btnTrabajadores.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        btnTrabajadores.setPaddingLeft(10);
        btnTrabajadores.setSelected(true);
        btnTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabajadoresActionPerformed(evt);
            }
        });

        btnSolicitantes.setBackground(new java.awt.Color(204, 204, 204));
        btnSolicitantes.setForeground(new java.awt.Color(0, 0, 0));
        btnSolicitantes.setText("Solicitantes");
        btnSolicitantes.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnSolicitantes.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnSolicitantes.setForegroundText(new java.awt.Color(0, 0, 0));
        btnSolicitantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSolicitantes.setIconTextGap(2);
        btnSolicitantes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON_OUTLINE);
        btnSolicitantes.setPaddingLeft(14);
        btnSolicitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitantesActionPerformed(evt);
            }
        });

        btnEditarEstado.setBackground(new java.awt.Color(204, 204, 204));
        btnEditarEstado.setText("Editar Rol");
        btnEditarEstado.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnEditarEstado.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnEditarEstado.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        btnEditarEstado.setForegroundText(new java.awt.Color(0, 0, 0));
        btnEditarEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditarEstado.setIconTextGap(29);
        btnEditarEstado.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnEditarEstado.setPaddingLeft(15);
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
                .addGap(19, 19, 19)
                .addComponent(btnTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSolicitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSolicitantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabajadoresActionPerformed
        btnSolicitantes.setSelected(false);
        btnTrabajadores.setSelected(true); 
        try {            
            llenarTrabajadores();
        } catch (SQLException ex) {
            Logger.getLogger(pnlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnTrabajadoresActionPerformed

    private void btnSolicitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitantesActionPerformed
        btnSolicitantes.setSelected(true);
        btnTrabajadores.setSelected(false);
         try {                
            llenarSolicitantes();
        } catch (SQLException ex) {
            Logger.getLogger(pnlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSolicitantesActionPerformed
    
    

    private void txtBuscarusuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarusuKeyReleased
        String buscar = txtBuscarusu.getText();        
        try {
            if(btnSolicitantes.isSelected())     {  
                listaSolicitantes=new ArrayList<>();
                this.servicio.listarUsuarios(tablaUsuarios,
                        rol, buscar,listaSolicitantes);
            }
            else{
                listaTrabajadores=new ArrayList<>();
                this.servicio.listarUsuarios(tablaUsuarios,
                        rol, buscar, listaTrabajadores);
            }
        } catch (SQLException ex) {
            Logger.getLogger(pnlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarusuKeyReleased

    private void btnEditarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEstadoActionPerformed
        int i = tablaUsuarios.getSelectedRow();
        if(i != -1){        
            if(btnTrabajadores.isSelected())
                llenarpnlEditar(listaTrabajadores,i);
            else 
                llenarpnlEditar(listaSolicitantes, i);
            
            this.panelSlider.setPanelNormal(this.pnlEditarRol);  
            btnEditarEstado.setVisible(false);
            btnVolver.setVisible(true);
            btnTrabajadores.setVisible(false);
            btnSolicitantes.setVisible(false);
        }
        else{
            
        
        }
        
    }//GEN-LAST:event_btnEditarEstadoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        btnEditarEstado.setVisible(true);
        this.panelSlider.setPanelNormal(this.pnlTabla);  
        btnTrabajadores.setVisible(true);
        btnVolver.setVisible(false);
        btnSolicitantes.setVisible(true);
        try {
            if(btnSolicitantes.isSelected())         
                llenarSolicitantes();            
            else            
                llenarTrabajadores();
        } catch (SQLException ex) {
            Logger.getLogger(pnlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int rolNuevo = 0;
        switch(cbxRolNuevo.getSelectedItem().toString()){
            case "Trabajador":
                rolNuevo=1;break;
            case "Solicitante":
                rolNuevo=2;break;
            case "Administrador":
                rolNuevo=3;break;
        }
        try {
         
            JOptionPane.showMessageDialog(null, "El rol del Usuario "+
                    txtIdUsuario.getText()+" a sido actualizado"
                    , "Actualizar Roles", HEIGHT);          
            servicio.actualizarRol(txtIdUsuario.getText(),rolNuevo);            
        } catch (SQLException ex) {
             
        }
    }//GEN-LAST:event_btnActualizarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconOne btnActualizar;
    private RSMaterialComponent.RSButtonMaterialIconOne btnEditarEstado;
    private RSMaterialComponent.RSButtonMaterialIconOne btnSolicitantes;
    private RSMaterialComponent.RSButtonMaterialIconOne btnTrabajadores;
    private RSMaterialComponent.RSButtonMaterialIconOne btnVolver;
    private RSMaterialComponent.RSComboBoxMaterial cbxRolNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JLabel lblUsuarios1;
    private newscomponents.RSPanelEffect panelSlider;
    private javax.swing.JPanel pnlEditarRol;
    private javax.swing.JPanel pnlTabla;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon1;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon2;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon3;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon4;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon5;
    private RSMaterialComponent.RSTableMetroCustom tablaUsuarios;
    private necesario.TextField txtApellidos;
    private RSMaterialComponent.RSTextFieldMaterialIcon txtBuscarusu;
    private necesario.TextField txtIdUsuario;
    private necesario.TextField txtNombres;
    private necesario.TextField txtRolActual;
    // End of variables declaration//GEN-END:variables
     public void llenarTrabajadores() throws SQLException {
        listaTrabajadores = new ArrayList<>();       
        cantidad=this.servicio.listarUsuarios(tablaUsuarios,"1","",listaTrabajadores);
        lblUsuarios.setText("Trabajadores ("+cantidad+")");
        rol = "1";
    }
    public void llenarSolicitantes() throws SQLException {
         listaSolicitantes = new ArrayList<>();
        cantidad= this.servicio.listarUsuarios(tablaUsuarios,"2","",listaSolicitantes);
        lblUsuarios.setText("Solicitantes ("+cantidad+")");
        rol = "2";
    }

    private void llenarpnlEditar(List<Usuario> lista,int i) {
        txtNombres.setText(lista.get(i).getNombres());
        txtApellidos.setText(lista.get(i).getApellidos());
        String nombreRol ="";
        switch(lista.get(i).getRol()){
            case 1:
                nombreRol= "Trabajador"; break;
            case 2:
                nombreRol = "Solicitante";break;            
            default:
                nombreRol = "Administrador";break;            
        }            
        txtRolActual.setText(nombreRol);
        txtIdUsuario.setText(lista.get(i).getDni());
        
    }
     public void cerrarConexion() throws SQLException{
        this.servicio.cerrarConexion();
    }

}
