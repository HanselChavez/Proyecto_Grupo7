/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas.Solicitante;

import Entidades.*;
import InterfacesGraficas.Login.IniciarSesion;
import Utilidades.Foto;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chave
 */
public class PrincipalSolicitante extends javax.swing.JFrame {

    Usuario user;    
    IniciarSesion login;
    HistorialSolicitudes hSolicitudes; 
    public PrincipalSolicitante(Usuario user,IniciarSesion padre )
            throws SQLException, IOException {
        initComponents();       
        this.user = user;       
        this.login = padre;       
        pnlSolicitudesUsuario.cargarUsuario(this.user);    
        iniciarValores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalir = new newscomponents.RSButtonGradientIcon_new();
        btnSolicitudes = new newscomponents.RSButtonGradientIcon_new();
        btnRetroalimentacion = new newscomponents.RSButtonGradientIcon_new();
        btnAvisos = new newscomponents.RSButtonGradientIcon_new();
        btnPerfil = new newscomponents.RSButtonGradientIcon_new();
        lblnombres = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        lblFotoPrincipal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnMinimize = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panslid = new newscomponents.RSPanelEffect();
        try {
            pnlPerfiles = new InterfacesGraficas.Perfil.pnlPerfiles();
        } catch (java.lang.ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (java.sql.SQLException e2) {
            e2.printStackTrace();
        }
        try {
            pnlSolicitudesUsuario = new InterfacesGraficas.Solicitante.pnlSolicitudesUsuario();
        } catch (java.lang.ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (java.sql.SQLException e2) {
            e2.printStackTrace();
        }
        try {
            pnlAvisos = new InterfacesGraficas.Solicitante.pnlAvisos();
        } catch (java.lang.ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (java.sql.SQLException e2) {
            e2.printStackTrace();
        }
        try {
            pnlRetroalimentacion = new InterfacesGraficas.Solicitante.pnlRetroalimentacion();
        } catch (java.lang.ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (java.sql.SQLException e2) {
            e2.printStackTrace();
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(0, 87, 151));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(12, 140, 233));
        rSPanelGradiente1.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.VERTICAL);

        btnSalir.setText("SALIR");
        btnSalir.setColorPrimario(new java.awt.Color(0, 87, 151));
        btnSalir.setColorPrimarioHover(new java.awt.Color(0, 176, 73));
        btnSalir.setColorSecundario(new java.awt.Color(12, 140, 233));
        btnSalir.setColorSecundarioHover(new java.awt.Color(0, 176, 73));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIconTextGap(10);
        btnSalir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SETTINGS_POWER);
        btnSalir.setSizeIcon(40.0F);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        btnSolicitudes.setText("SOLICITUDES");
        btnSolicitudes.setColorPrimario(new java.awt.Color(0, 87, 151));
        btnSolicitudes.setColorPrimarioHover(new java.awt.Color(0, 176, 73));
        btnSolicitudes.setColorSecundario(new java.awt.Color(12, 140, 233));
        btnSolicitudes.setColorSecundarioHover(new java.awt.Color(0, 176, 73));
        btnSolicitudes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSolicitudes.setIconTextGap(10);
        btnSolicitudes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DESCRIPTION);
        btnSolicitudes.setSelected(true);
        btnSolicitudes.setSizeIcon(40.0F);
        btnSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitudesActionPerformed(evt);
            }
        });

        btnRetroalimentacion.setText("RETROALIMENTACION");
        btnRetroalimentacion.setColorPrimario(new java.awt.Color(0, 87, 151));
        btnRetroalimentacion.setColorPrimarioHover(new java.awt.Color(0, 176, 73));
        btnRetroalimentacion.setColorSecundario(new java.awt.Color(12, 140, 233));
        btnRetroalimentacion.setColorSecundarioHover(new java.awt.Color(0, 176, 73));
        btnRetroalimentacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRetroalimentacion.setIconTextGap(10);
        btnRetroalimentacion.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.COMMENT);
        btnRetroalimentacion.setSizeIcon(40.0F);
        btnRetroalimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetroalimentacionActionPerformed(evt);
            }
        });

        btnAvisos.setText("AVISOS");
        btnAvisos.setColorPrimario(new java.awt.Color(0, 87, 151));
        btnAvisos.setColorPrimarioHover(new java.awt.Color(0, 176, 73));
        btnAvisos.setColorSecundario(new java.awt.Color(12, 140, 233));
        btnAvisos.setColorSecundarioHover(new java.awt.Color(0, 176, 73));
        btnAvisos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAvisos.setIconTextGap(10);
        btnAvisos.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ANNOUNCEMENT);
        btnAvisos.setSizeIcon(40.0F);
        btnAvisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvisosActionPerformed(evt);
            }
        });

        btnPerfil.setText("PERFIL");
        btnPerfil.setColorPrimario(new java.awt.Color(0, 87, 151));
        btnPerfil.setColorPrimarioHover(new java.awt.Color(0, 176, 73));
        btnPerfil.setColorSecundario(new java.awt.Color(12, 140, 233));
        btnPerfil.setColorSecundarioHover(new java.awt.Color(0, 176, 73));
        btnPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPerfil.setIconTextGap(10);
        btnPerfil.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_BOX);
        btnPerfil.setInheritsPopupMenu(true);
        btnPerfil.setSizeIcon(40.0F);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        lblnombres.setBackground(new java.awt.Color(255, 255, 255));
        lblnombres.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblnombres.setForeground(new java.awt.Color(255, 255, 255));
        lblnombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblapellidos.setBackground(new java.awt.Color(255, 255, 255));
        lblapellidos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblapellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblapellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblFotoPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        lblFotoPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        lblFotoPrincipal.setOpaque(true);

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnRetroalimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAvisos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelGradiente1Layout.createSequentialGroup()
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblapellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblFotoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblFotoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnRetroalimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(12, 140, 233));

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/32wtminimize-sign.png"))); // NOI18N
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/32wtclose.png"))); // NOI18N
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimize)
                .addGap(8, 8, 8)
                .addComponent(btnClose)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMinimize)
                    .addComponent(btnClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        panslid.setBackground(new java.awt.Color(255, 255, 255));

        pnlPerfiles.setName("pnlPerfiles"); // NOI18N
        pnlPerfiles.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlPerfilesMouseMoved(evt);
            }
        });
        panslid.add(pnlPerfiles, "card4");

        pnlSolicitudesUsuario.setName("pnlSolicitudesUsuario"); // NOI18N
        panslid.add(pnlSolicitudesUsuario, "card3");

        pnlAvisos.setName("pnlAvisos"); // NOI18N
        panslid.add(pnlAvisos, "card4");

        pnlRetroalimentacion.setName("pnlRetroalimentacion"); // NOI18N
        panslid.add(pnlRetroalimentacion, "card5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panslid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panslid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        cerrarForm();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        cerrarForm();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void pnlPerfilesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPerfilesMouseMoved
        try {
            
            cargarUsuario();
        } catch (IOException ex) {
            Logger.getLogger(PrincipalSolicitante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pnlPerfilesMouseMoved

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        try {
            pnlPerfiles.cargarDatos(user, this,login);
            pnlPerfiles.cargarPerfil();
            btnSolicitudes.setSelected(false);
            btnAvisos.setSelected(false);
            btnRetroalimentacion.setSelected(false);
            btnPerfil.setSelected(true);
            pnlPerfiles.cargarDatos(user, this, login);    
            this.panslid.setPanelNormal(pnlPerfiles);
        } catch (IOException ex) {
            Logger.getLogger(PrincipalSolicitante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudesActionPerformed
        try {
            btnSolicitudes.setSelected(true);
            btnAvisos.setSelected(false);
            btnRetroalimentacion.setSelected(false);
            btnPerfil.setSelected(false);
            pnlSolicitudesUsuario.cargarUsuario(user);
            this.panslid.setPanelNormal(pnlSolicitudesUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalSolicitante.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSolicitudesActionPerformed

    private void btnAvisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvisosActionPerformed
        try {
            btnSolicitudes.setSelected(false);
            btnAvisos.setSelected(true);
            btnRetroalimentacion.setSelected(false);
            btnPerfil.setSelected(false);
            pnlAvisos.actualizarLista("");
            this.panslid.setPanelNormal(pnlAvisos);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalSolicitante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAvisosActionPerformed

    private void btnRetroalimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetroalimentacionActionPerformed
         try {
            btnSolicitudes.setSelected(false);
            btnAvisos.setSelected(false);
            btnRetroalimentacion.setSelected(true);
            btnPerfil.setSelected(false);
            pnlRetroalimentacion.cargarUsuario(user);
            this.panslid.setPanelNormal(pnlRetroalimentacion);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalSolicitante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRetroalimentacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonGradientIcon_new btnAvisos;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnMinimize;
    private newscomponents.RSButtonGradientIcon_new btnPerfil;
    private newscomponents.RSButtonGradientIcon_new btnRetroalimentacion;
    private newscomponents.RSButtonGradientIcon_new btnSalir;
    private newscomponents.RSButtonGradientIcon_new btnSolicitudes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFotoPrincipal;
    private javax.swing.JLabel lblapellidos;
    private javax.swing.JLabel lblnombres;
    private newscomponents.RSPanelEffect panslid;
    private InterfacesGraficas.Solicitante.pnlAvisos pnlAvisos;
    private InterfacesGraficas.Perfil.pnlPerfiles pnlPerfiles;
    private InterfacesGraficas.Solicitante.pnlRetroalimentacion pnlRetroalimentacion;
    private InterfacesGraficas.Solicitante.pnlSolicitudesUsuario pnlSolicitudesUsuario;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    // End of variables declaration//GEN-END:variables
    
    public void cerrarForm(){
        System.exit(0);
    }

    private void cargarUsuario() throws IOException {         
        lblnombres.setText(user.getNombres());
        lblapellidos.setText(user.getApellidos());
        Foto.cargarFoto(lblFotoPrincipal, user.getFoto());   
    }
    public void iniciarValores() throws IOException {
        this.setLocationRelativeTo(null);
        //RSEffectFade.setFadeWindowIn(this, 30,0.1f);
        this.panslid.setPanelNormal(this.pnlSolicitudesUsuario);
        lblnombres.setText(user.getNombres());
        lblapellidos.setText(user.getApellidos());
        Foto.cargarFoto(lblFotoPrincipal, user.getFoto());    
    }


}
