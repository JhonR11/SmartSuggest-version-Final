package Vista;

import javax.swing.JOptionPane;

public class Vis_Login extends javax.swing.JFrame {

    public Vis_Login() {
        initComponents();
        txtuser.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtpass.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jl_Bienvenido = new javax.swing.JLabel();
        jl_Bienvenido2 = new javax.swing.JLabel();
        jl_Descripcion = new javax.swing.JLabel();
        jl_Usuario = new javax.swing.JLabel();
        jl_Usser = new javax.swing.JLabel();
        jl_Contrasena = new javax.swing.JLabel();
        jl_Password = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DarkStar");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 90, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/planet-ringed (3) 1 (1).png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/IMG_Login.png"))); // NOI18N
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 750));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 750));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 750));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 700));

        jPanel2.setBackground(new java.awt.Color(145, 162, 205));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_Bienvenido.setFont(new java.awt.Font("Roboto Bk", 1, 60)); // NOI18N
        jl_Bienvenido.setForeground(new java.awt.Color(46, 53, 178));
        jl_Bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Bienvenido.setText("Bienvenido");
        jPanel2.add(jl_Bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 420, 60));

        jl_Bienvenido2.setFont(new java.awt.Font("Roboto Bk", 1, 60)); // NOI18N
        jl_Bienvenido2.setForeground(new java.awt.Color(46, 53, 178));
        jl_Bienvenido2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Bienvenido2.setText("a Smart Suggest");
        jPanel2.add(jl_Bienvenido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 490, 80));

        jl_Descripcion.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jl_Descripcion.setForeground(new java.awt.Color(46, 53, 178));
        jl_Descripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Descripcion.setText("Esta app fue desarrollada por DarkStar, o tambien conocidos como \"Grupo F\"");
        jPanel2.add(jl_Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 480, -1));

        jl_Usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jl_Usuario.setForeground(new java.awt.Color(58, 102, 212));
        jl_Usuario.setText("Usuario");
        jPanel2.add(jl_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 341, -1));

        jl_Usser.setForeground(new java.awt.Color(51, 51, 51));
        jl_Usser.setText("____________________________________________________________________");
        jPanel2.add(jl_Usser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 350, 30));

        jl_Contrasena.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jl_Contrasena.setForeground(new java.awt.Color(58, 102, 212));
        jl_Contrasena.setText("Contraseña");
        jPanel2.add(jl_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 240, -1));

        jl_Password.setForeground(new java.awt.Color(51, 51, 51));
        jl_Password.setText("____________________________________________________________________");
        jPanel2.add(jl_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 360, 30));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(25, 118, 211));
        btnLogin.setText("LOGIN");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 341, 40));

        txtuser.setFont(txtuser.getFont().deriveFont(txtuser.getFont().getSize()+2f));
        txtuser.setForeground(new java.awt.Color(51, 51, 51));
        txtuser.setText("admin");
        txtuser.setBorder(null);
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        jPanel2.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 340, 30));

        txtpass.setFont(txtpass.getFont().deriveFont(txtpass.getFont().getSize()+2f));
        txtpass.setForeground(new java.awt.Color(51, 51, 51));
        txtpass.setText("123");
        txtpass.setBorder(null);
        txtpass.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 340, 30));

        jLabel7.setBackground(new java.awt.Color(119, 106, 193));
        jLabel7.setForeground(new java.awt.Color(119, 106, 193));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 30, 30));

        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_invisible_20px_1.png"))); // NOI18N
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel2.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 30, 30));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_eye_20px_1.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 30, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 510, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        txtpass.setEchoChar((char) 0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        txtpass.setEchoChar((char) 8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.parseFloat(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO add your handling code here:
        String Usuario = "admin";
        String Contrasena = "123";

        if (txtuser.getText().equals(Usuario) && (txtpass.getText().equals(Contrasena))) {
            Vis_Menu menu = new Vis_Menu();
            menu.setVisible(true);
            dispose();
        } else if ((txtuser.getText().equals("")) || (txtpass.getText().equals(""))) {
            JOptionPane.showMessageDialog(this, "No se han ingresado datos");
        } else {
            JOptionPane.showMessageDialog(this, "Datos incorrectos");
        }

    }//GEN-LAST:event_btnLoginMouseClicked

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void butCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_butCerrarActionPerformed

    private void butMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMinimizarActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_butMinimizarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vis_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vis_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vis_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vis_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vis_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jl_Bienvenido;
    private javax.swing.JLabel jl_Bienvenido2;
    private javax.swing.JLabel jl_Contrasena;
    private javax.swing.JLabel jl_Descripcion;
    private javax.swing.JLabel jl_Password;
    private javax.swing.JLabel jl_Usser;
    private javax.swing.JLabel jl_Usuario;
    private javax.swing.JLabel show;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
