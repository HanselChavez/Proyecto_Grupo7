/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas.Trabajador.Usuarios;

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
    private List<Usuario> listaUsuario ;
    public pnlUsuarios() throws ClassNotFoundException, SQLException {
        initComponents();
        this.listaUsuario = new ArrayList<>();
        this.rol = "2";
        this.servicio =new ServiciosUsuario();    
        llenarSolicitantes();
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new RSMaterialComponent.RSTableMetroCustom();
        btnVerInfo = new RSMaterialComponent.RSButtonMaterialIconOne();
        txtBuscarusu = new RSMaterialComponent.RSTextFieldMaterialIcon();
        lblUsuarios = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelSlider.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
                "Dni", "Nombres", "Apellidos", "Telefono"
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
        tablaUsuarios.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaUsuarios.setRowHeight(40);
        tablaUsuarios.setSelectionBackground(new java.awt.Color(78, 85, 230));
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);
        if (tablaUsuarios.getColumnModel().getColumnCount() > 0) {
            tablaUsuarios.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaUsuarios.getColumnModel().getColumn(1).setPreferredWidth(100);
            tablaUsuarios.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        btnVerInfo.setBackground(new java.awt.Color(51, 102, 255));
        btnVerInfo.setText("Ver Información");
        btnVerInfo.setBackgroundHover(new java.awt.Color(0, 153, 0));
        btnVerInfo.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnVerInfo.setForegroundHover(new java.awt.Color(0, 0, 0));
        btnVerInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVerInfo.setIconTextGap(2);
        btnVerInfo.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERM_IDENTITY);
        btnVerInfo.setPaddingLeft(14);
        btnVerInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btnVerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        panelSlider.add(jPanel1, "card2");

        txtBuscarusu.setForeground(new java.awt.Color(0, 108, 255));
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
        lblUsuarios.setText("Solcitantes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscarusu, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtBuscarusuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarusuKeyReleased
        String buscar = txtBuscarusu.getText();        
        try {
            this.servicio.listarUsuarios(tablaUsuarios, rol, buscar,listaUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(pnlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarusuKeyReleased

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
       
      
           
        
        
    }//GEN-LAST:event_tablaUsuariosMouseClicked

    private void btnVerInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInfoActionPerformed
        int i =tablaUsuarios.getSelectedRow();
        if(i == -1){    
            JOptionPane.showMessageDialog(null,"Error");
        }
        Usuario user = listaUsuario.get(i);
        
        
    }//GEN-LAST:event_btnVerInfoActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconOne btnVerInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsuarios;
    private newscomponents.RSPanelEffect panelSlider;
    private RSMaterialComponent.RSTableMetroCustom tablaUsuarios;
    private RSMaterialComponent.RSTextFieldMaterialIcon txtBuscarusu;
    // End of variables declaration//GEN-END:variables
  
    public void llenarSolicitantes(){
        String buscar = txtBuscarusu.getText();        
        try {
            this.servicio.listarUsuarios(tablaUsuarios, rol, "",listaUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(pnlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
