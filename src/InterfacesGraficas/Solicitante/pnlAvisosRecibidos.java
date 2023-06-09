/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas.Solicitante;
import Entidades.*;
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
public class pnlAvisosRecibidos extends javax.swing.JPanel {

    private final ServiciosUsuario servicio;
    private List<Mensaje> listaAviso ;
    public pnlAvisosRecibidos() throws ClassNotFoundException, SQLException {
        initComponents();       
        this.servicio = new ServiciosUsuario();
        //actualizarLista("");
       btnVolver.setVisible(false);
    }

/**
     * Creates new form pnlAvisos
     */
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSliderAviso = new rojerusan.RSPanelEffect();
        pnlListaAvisos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAvisos = new RSMaterialComponent.RSTableMetroCustom();
        btnVisualizar = new RSMaterialComponent.RSButtonMaterialIconOne();
        lblestado = new javax.swing.JLabel();
        txtBuscarAviso = new RSMaterialComponent.RSTextFieldMaterialIcon();
        pnlVisualizarAviso = new javax.swing.JPanel();
        txtnombreT = new necesario.TextField();
        txtfecha = new necesario.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtcontenidoAviso = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnVolver = new RSMaterialComponent.RSButtonMaterialIconOne();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlSliderAviso.setBackground(new java.awt.Color(255, 255, 255));

        pnlListaAvisos.setBackground(new java.awt.Color(255, 255, 255));
        pnlListaAvisos.setName("pnlListaAvisos"); // NOI18N

        jScrollPane1.setBorder(null);

        tablaAvisos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaAvisos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, "", null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Aviso", "Trabajador", "Contenido", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAvisos.setBackgoundHead(new java.awt.Color(0, 108, 255));
        tablaAvisos.setBackgoundHover(new java.awt.Color(10, 94, 208));
        tablaAvisos.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tablaAvisos.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaAvisos.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tablaAvisos.setRowHeight(40);
        tablaAvisos.setSelectionBackground(new java.awt.Color(78, 85, 230));
        jScrollPane1.setViewportView(tablaAvisos);
        if (tablaAvisos.getColumnModel().getColumnCount() > 0) {
            tablaAvisos.getColumnModel().getColumn(0).setPreferredWidth(70);
            tablaAvisos.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaAvisos.getColumnModel().getColumn(2).setPreferredWidth(400);
            tablaAvisos.getColumnModel().getColumn(3).setMinWidth(100);
            tablaAvisos.getColumnModel().getColumn(3).setPreferredWidth(120);
        }

        btnVisualizar.setBackground(new java.awt.Color(204, 204, 204));
        btnVisualizar.setText("Visualizar Aviso");
        btnVisualizar.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnVisualizar.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnVisualizar.setForegroundText(new java.awt.Color(0, 0, 0));
        btnVisualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVisualizar.setIconTextGap(29);
        btnVisualizar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.VISIBILITY);
        btnVisualizar.setPaddingLeft(15);
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        lblestado.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblestado.setText("Avisos");

        txtBuscarAviso.setForeground(new java.awt.Color(0, 108, 255));
        txtBuscarAviso.setColorIcon(new java.awt.Color(0, 108, 255));
        txtBuscarAviso.setColorMaterial(new java.awt.Color(0, 108, 255));
        txtBuscarAviso.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtBuscarAviso.setPhColor(new java.awt.Color(0, 69, 255));
        txtBuscarAviso.setPlaceholder("Buscar");
        txtBuscarAviso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarAvisoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlListaAvisosLayout = new javax.swing.GroupLayout(pnlListaAvisos);
        pnlListaAvisos.setLayout(pnlListaAvisosLayout);
        pnlListaAvisosLayout.setHorizontalGroup(
            pnlListaAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaAvisosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlListaAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlListaAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlListaAvisosLayout.createSequentialGroup()
                            .addComponent(lblestado, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscarAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlListaAvisosLayout.setVerticalGroup(
            pnlListaAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaAvisosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlListaAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pnlSliderAviso.add(pnlListaAvisos, "card2");

        pnlVisualizarAviso.setBackground(new java.awt.Color(255, 255, 255));
        pnlVisualizarAviso.setName("pnlVisualizarAviso"); // NOI18N

        txtnombreT.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        txtnombreT.setForeground(new java.awt.Color(0, 0, 0));
        txtnombreT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtnombreT.setEnabled(false);
        txtnombreT.setMargin(new java.awt.Insets(3, 10, 3, 6));
        txtnombreT.setName("txtidUsuario"); // NOI18N
        txtnombreT.setPlaceholder("");

        txtfecha.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        txtfecha.setForeground(new java.awt.Color(0, 0, 0));
        txtfecha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtfecha.setEnabled(false);
        txtfecha.setMargin(new java.awt.Insets(3, 10, 3, 6));
        txtfecha.setName("txtfecha"); // NOI18N
        txtfecha.setPlaceholder("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 45, 223));
        jLabel1.setText("Nombre Trabajador");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 45, 223));
        jLabel2.setText("Fecha");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(37, 45, 223));
        jLabel3.setText("Codigo Aviso: ");

        lbltitulo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbltitulo.setText("Visualizar Aviso");

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo.setText("cod");

        txtcontenidoAviso.setColumns(20);
        txtcontenidoAviso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcontenidoAviso.setLineWrap(true);
        txtcontenidoAviso.setRows(5);
        txtcontenidoAviso.setWrapStyleWord(true);
        txtcontenidoAviso.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        txtcontenidoAviso.setCaretColor(new java.awt.Color(153, 153, 153));
        txtcontenidoAviso.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtcontenidoAviso.setEnabled(false);
        txtcontenidoAviso.setSelectionColor(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(txtcontenidoAviso);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(37, 45, 223));
        jLabel4.setText("Contenido del Aviso");

        javax.swing.GroupLayout pnlVisualizarAvisoLayout = new javax.swing.GroupLayout(pnlVisualizarAviso);
        pnlVisualizarAviso.setLayout(pnlVisualizarAvisoLayout);
        pnlVisualizarAvisoLayout.setHorizontalGroup(
            pnlVisualizarAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualizarAvisoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlVisualizarAvisoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlVisualizarAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVisualizarAvisoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlVisualizarAvisoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVisualizarAvisoLayout.createSequentialGroup()
                        .addGroup(pnlVisualizarAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlVisualizarAvisoLayout.createSequentialGroup()
                                .addGroup(pnlVisualizarAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlVisualizarAvisoLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtnombreT, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlVisualizarAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(112, 112, 112))))
        );
        pnlVisualizarAvisoLayout.setVerticalGroup(
            pnlVisualizarAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualizarAvisoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbltitulo)
                .addGap(19, 19, 19)
                .addGroup(pnlVisualizarAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlVisualizarAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlVisualizarAvisoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombreT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlVisualizarAvisoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pnlSliderAviso.add(pnlVisualizarAviso, "card3");

        btnVolver.setBackground(new java.awt.Color(204, 204, 204));
        btnVolver.setText("Volver");
        btnVolver.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnVolver.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnVolver.setForegroundText(new java.awt.Color(0, 0, 0));
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolver.setIconTextGap(29);
        btnVolver.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KEYBOARD_ARROW_LEFT);
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
            .addComponent(pnlSliderAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSliderAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        limpiarCampos();
        this.pnlSliderAviso.setPanelNormal(pnlListaAvisos);
        btnVolver.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        int indice = tablaAvisos.getSelectedRow();
        
        if(indice!=-1){
            Mensaje aviso = listaAviso.get(indice);            
            llenarCampos(aviso);
            this.pnlSliderAviso.setPanelNormal(pnlVisualizarAviso); 
            btnVolver.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selecciones un aviso de "
                    + "la lista");
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void txtBuscarAvisoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAvisoKeyReleased
        try {
            String buscar = txtBuscarAviso.getText();            
            actualizarLista(buscar);
        } catch (SQLException ex) {
            Logger.getLogger(pnlAvisosRecibidos.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_txtBuscarAvisoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconOne btnVisualizar;
    private RSMaterialComponent.RSButtonMaterialIconOne btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JPanel pnlListaAvisos;
    private rojerusan.RSPanelEffect pnlSliderAviso;
    private javax.swing.JPanel pnlVisualizarAviso;
    private RSMaterialComponent.RSTableMetroCustom tablaAvisos;
    private RSMaterialComponent.RSTextFieldMaterialIcon txtBuscarAviso;
    private javax.swing.JTextArea txtcontenidoAviso;
    private necesario.TextField txtfecha;
    private necesario.TextField txtnombreT;
    // End of variables declaration//GEN-END:variables
    public void actualizarLista(String buscar) throws SQLException{
        this.listaAviso = new ArrayList<>();
        servicio.listarAvisos(tablaAvisos,buscar,listaAviso);
    }
    public void llenarCampos(Mensaje aviso){
        txtcontenidoAviso.setText(aviso.getContenido());
        lblCodigo.setText(aviso.getCod());
        txtnombreT.setText(aviso.getNombreUsuario());
        txtfecha.setText(aviso.getFecha().toString());        
    }
    public void limpiarCampos(){
        txtcontenidoAviso.setText("");
        lblCodigo.setText("");
        txtnombreT.setText("");
        txtfecha.setText("");
    }
}
