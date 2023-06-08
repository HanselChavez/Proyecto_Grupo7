/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas.Trabajador;

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
        pnlTablaUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUSolicitantes = new RSMaterialComponent.RSTableMetroCustom();
        btnVerInfo = new RSMaterialComponent.RSButtonMaterialIconOne();
        txtBuscarusu = new RSMaterialComponent.RSTextFieldMaterialIcon();
        Solcitantes = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelSlider.setBackground(new java.awt.Color(255, 255, 255));

        pnlTablaUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        tablaUSolicitantes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaUSolicitantes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaUSolicitantes.setBackgoundHead(new java.awt.Color(0, 108, 255));
        tablaUSolicitantes.setBackgoundHover(new java.awt.Color(10, 94, 208));
        tablaUSolicitantes.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaUSolicitantes.setRowHeight(40);
        tablaUSolicitantes.setSelectionBackground(new java.awt.Color(78, 85, 230));
        tablaUSolicitantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUSolicitantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUSolicitantes);
        if (tablaUSolicitantes.getColumnModel().getColumnCount() > 0) {
            tablaUSolicitantes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaUSolicitantes.getColumnModel().getColumn(1).setPreferredWidth(100);
            tablaUSolicitantes.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        btnVerInfo.setBackground(new java.awt.Color(204, 204, 204));
        btnVerInfo.setText("Ver Información");
        btnVerInfo.setBackgroundHover(new java.awt.Color(0, 153, 0));
        btnVerInfo.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnVerInfo.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnVerInfo.setForegroundText(new java.awt.Color(0, 0, 0));
        btnVerInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVerInfo.setIconTextGap(2);
        btnVerInfo.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERM_IDENTITY);
        btnVerInfo.setPaddingLeft(14);
        btnVerInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTablaUsuariosLayout = new javax.swing.GroupLayout(pnlTablaUsuarios);
        pnlTablaUsuarios.setLayout(pnlTablaUsuariosLayout);
        pnlTablaUsuariosLayout.setHorizontalGroup(
            pnlTablaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTablaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                    .addGroup(pnlTablaUsuariosLayout.createSequentialGroup()
                        .addComponent(btnVerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTablaUsuariosLayout.setVerticalGroup(
            pnlTablaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablaUsuariosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        panelSlider.add(pnlTablaUsuarios, "card2");

        txtBuscarusu.setForeground(new java.awt.Color(0, 108, 255));
        txtBuscarusu.setColorIcon(new java.awt.Color(0, 108, 255));
        txtBuscarusu.setColorMaterial(new java.awt.Color(0, 108, 255));
        txtBuscarusu.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtBuscarusu.setPhColor(new java.awt.Color(0, 69, 255));
        txtBuscarusu.setPlaceholder("Buscar por idUsuario");
        txtBuscarusu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarusuKeyReleased(evt);
            }
        });

        Solcitantes.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Solcitantes.setText("Solcitantes");

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
                        .addComponent(Solcitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(Solcitantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtBuscarusuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarusuKeyReleased
        String buscar = txtBuscarusu.getText();        
        try {
            this.servicio.listarUsuarios(tablaUSolicitantes, rol, buscar,listaUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(pnlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarusuKeyReleased

    private void tablaUSolicitantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUSolicitantesMouseClicked
       
      
           
        
        
    }//GEN-LAST:event_tablaUSolicitantesMouseClicked

    private void btnVerInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInfoActionPerformed
        int i =tablaUSolicitantes.getSelectedRow();
        if(i == -1){    
            JOptionPane.showMessageDialog(null,"Error");
        }
        Usuario user = listaUsuario.get(i);
        
        
    }//GEN-LAST:event_btnVerInfoActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Solcitantes;
    private RSMaterialComponent.RSButtonMaterialIconOne btnVerInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private newscomponents.RSPanelEffect panelSlider;
    private javax.swing.JPanel pnlTablaUsuarios;
    private RSMaterialComponent.RSTableMetroCustom tablaUSolicitantes;
    private RSMaterialComponent.RSTextFieldMaterialIcon txtBuscarusu;
    // End of variables declaration//GEN-END:variables
  
    public void llenarSolicitantes(){
        String buscar = txtBuscarusu.getText();        
        try {
            this.servicio.listarUsuarios(tablaUSolicitantes, rol, "",listaUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(pnlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
