package Vista;

import javax.swing.border.EmptyBorder;

public class Vis_Menu extends javax.swing.JFrame {

    public Vis_Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Titulo = new javax.swing.JLabel();
        jl_Descripcion = new javax.swing.JTextArea();
        jl_Imagen = new javax.swing.JLabel();
        jb_Sugerencia = new javax.swing.JButton();
        jb_Catalogo = new javax.swing.JButton();
        jb_Tarjetas = new javax.swing.JButton();
        jb_Close = new javax.swing.JButton();
        jb_Minimizar = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setName("Main"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_Titulo.setBackground(new java.awt.Color(33, 33, 45));
        jl_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jl_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jl_Titulo.setText("NVIDIA GeForce TRX 4090 Ti");
        getContentPane().add(jl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jl_Descripcion.setEditable(false);
        jl_Descripcion.setBackground(new java.awt.Color(33, 33, 45));
        jl_Descripcion.setColumns(20);
        jl_Descripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_Descripcion.setForeground(new java.awt.Color(255, 255, 255));
        jl_Descripcion.setLineWrap(true);
        jl_Descripcion.setRows(5);
        jl_Descripcion.setText("Como cabía esperar, los procesadores gráficos de la familia GeForce RTX 40 tienen muchos más núcleos de este tipo que sus predecesores. De hecho, la GPU GeForce RTX 4090 incorpora 16.384 núcleos CUDA, mientras que la GeForce RTX 3090 Ti se conforma con 10.752. La GeForce RTX 4080 de 16 GB tiene 9728, y la versión de 12 GB incorpora 7680 núcleos CUDA. La GeForce RTX 3080 Ti las supera a ambas con sus 10.240 núcleos de este tipo, pero la RTX 2080 se coloca entre las dos versiones de la RTX 4080 con sus 8704 núcleos CUDA.");
        jl_Descripcion.setWrapStyleWord(true);
        jl_Descripcion.setBorder(null);
        getContentPane().add(jl_Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 520, 190));

        jl_Imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Tarjetas/NVIDIA GeForce TRX 4090 Ti.png"))); // NOI18N
        jl_Imagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jl_Imagen.setPreferredSize(new java.awt.Dimension(300, 170));
        getContentPane().add(jl_Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jb_Sugerencia.setBackground(new java.awt.Color(137, 212, 202));
        jb_Sugerencia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jb_Sugerencia.setText("Generar Sugerencia");
        jb_Sugerencia.setBorder(new EmptyBorder(15, 15, 15, 15));
        jb_Sugerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_SugerenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Sugerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 540, 50));

        jb_Catalogo.setBackground(new java.awt.Color(137, 212, 202));
        jb_Catalogo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jb_Catalogo.setText("Catalogo");
        jb_Catalogo.setBorder(new EmptyBorder(15, 15, 15, 15));
        jb_Catalogo.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jb_Catalogo.setMaximumSize(new java.awt.Dimension(150, 25));
        jb_Catalogo.setMinimumSize(new java.awt.Dimension(150, 25));
        jb_Catalogo.setPreferredSize(new java.awt.Dimension(150, 25));
        jb_Catalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CatalogoActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Catalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jb_Tarjetas.setBackground(new java.awt.Color(137, 212, 202));
        jb_Tarjetas.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jb_Tarjetas.setText("Administrar Tarjetas");
        jb_Tarjetas.setBorder(new EmptyBorder(15, 15, 15, 15));
        jb_Tarjetas.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jb_Tarjetas.setMaximumSize(new java.awt.Dimension(150, 25));
        jb_Tarjetas.setMinimumSize(new java.awt.Dimension(150, 25));
        jb_Tarjetas.setPreferredSize(new java.awt.Dimension(150, 25));
        jb_Tarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_TarjetasActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Tarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jb_Close.setBackground(new java.awt.Color(255, 0, 0));
        jb_Close.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        jb_Close.setMaximumSize(new java.awt.Dimension(30, 30));
        jb_Close.setMinimumSize(new java.awt.Dimension(30, 30));
        jb_Close.setPreferredSize(new java.awt.Dimension(30, 30));
        jb_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CloseActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, -1, -1));

        jb_Minimizar.setBackground(new java.awt.Color(255, 255, 51));
        jb_Minimizar.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        jb_Minimizar.setMaximumSize(new java.awt.Dimension(30, 30));
        jb_Minimizar.setMinimumSize(new java.awt.Dimension(30, 30));
        jb_Minimizar.setPreferredSize(new java.awt.Dimension(30, 30));
        jb_Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_MinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, -1, -1));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/IMG_Main.jpg"))); // NOI18N
        Background.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_CatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CatalogoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Componentes comp = new Componentes();
        comp.setVisible(true);
    }//GEN-LAST:event_jb_CatalogoActionPerformed

    private void jb_TarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_TarjetasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdministrarTarjetas admTarjetas = new AdministrarTarjetas();
        admTarjetas.setVisible(true);
    }//GEN-LAST:event_jb_TarjetasActionPerformed

    private void jb_SugerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SugerenciaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Sugerencia sug = new Sugerencia();
        sug.setVisible(true);
    }//GEN-LAST:event_jb_SugerenciaActionPerformed

    private void jb_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jb_CloseActionPerformed

    private void jb_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_MinimizarActionPerformed
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jb_MinimizarActionPerformed
    
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
            java.util.logging.Logger.getLogger(Vis_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vis_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vis_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vis_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vis_Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton jb_Catalogo;
    private javax.swing.JButton jb_Close;
    private javax.swing.JButton jb_Minimizar;
    private javax.swing.JButton jb_Sugerencia;
    private javax.swing.JButton jb_Tarjetas;
    private javax.swing.JTextArea jl_Descripcion;
    private javax.swing.JLabel jl_Imagen;
    private javax.swing.JLabel jl_Titulo;
    // End of variables declaration//GEN-END:variables
}
