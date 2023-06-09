/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas.Login;

/**
 *
 * @author chave
 */
public class RestablecerContraseña extends javax.swing.JFrame {

    /**
     * Creates new form RestablecerContraseña
     */
    IniciarSesion padre;
    public RestablecerContraseña(IniciarSesion padre) {
        initComponents();
        this.padre = padre;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblcrearCuenta = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblcontraseña2 = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        txtCodigo = new javax.swing.JTextField();
        btnMinimize = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        txtContraseña2 = new javax.swing.JPasswordField();
        btnEnviarCodigo = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(12, 140, 233));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcrearCuenta.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        lblcrearCuenta.setForeground(new java.awt.Color(30, 30, 30));
        lblcrearCuenta.setText("Restablecer Contraseña");
        jPanel1.add(lblcrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        lblcorreo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblcorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblcorreo.setText("Correo");
        jPanel1.add(lblcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 10, 2, 2));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 300, 32));

        jLabel1.setToolTipText("");
        jLabel1.setName("btnShow"); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 315, -1, -1));

        lblCodigo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Ingrese Código");
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, 20));

        lblcontraseña2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblcontraseña2.setForeground(new java.awt.Color(255, 255, 255));
        lblcontraseña2.setText("Contraseña");
        jPanel1.add(lblcontraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        lblContraseña.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Ingrese Nueva Contraseña");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, 20));

        txtContraseña.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 10, 2, 2));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 300, 30));

        txtCodigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 10, 2, 2));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 300, 32));

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/32wtminimize-sign.png"))); // NOI18N
        jPanel1.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/32wtclose.png"))); // NOI18N
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        txtContraseña2.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 10, 2, 2));
        jPanel1.add(txtContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 300, 30));

        btnEnviarCodigo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnEnviarCodigo.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEnviarCodigo.setText("Enviar Código");
        btnEnviarCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnEnviarCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarCodigoMouseClicked(evt);
            }
        });
        jPanel1.add(btnEnviarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 260, 40));

        btnAceptar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 150, 40));

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarCodigoMouseClicked
       
    }//GEN-LAST:event_btnEnviarCodigoMouseClicked

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
        padre.setVisible(true);
    }//GEN-LAST:event_btnCancelarMouseClicked




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAceptar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnEnviarCodigo;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblcontraseña2;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lblcrearCuenta;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JPasswordField txtContraseña2;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
