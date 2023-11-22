package Vista;

import Persistencia.Board;
import Persistencia.TarjetaGrafica;
import Logica.LogicaBoard;
import Logica.LogicaTarjeta;
import Entidades.TXTCreate.TXTTarjetas;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class AdministrarTarjetas extends javax.swing.JFrame {

    private LogicaTarjeta logicaTarjeta = new LogicaTarjeta();
    private LogicaBoard logicaBoard = new LogicaBoard();

    DefaultTableModel mdtCatalogo = new DefaultTableModel();
    ArrayList<TarjetaGrafica> listaTarjetas = new ArrayList();
    ArrayList<Board> listaBoards = new ArrayList<>();
    TXTTarjetas att = new TXTTarjetas();

    HashSet<String> organizarPuertos = new HashSet();

    ArrayList<String> puertosUsados;

    public AdministrarTarjetas() {
        initComponents();

        jtf_ID.setEditable(false);
        this.att.crearArchivoTexto();
        this.listaBoards = this.logicaBoard.consultarBoards();
        this.listaTarjetas = this.logicaTarjeta.consultarTarjetas();

        for (int i = 0; i < listaBoards.size(); i++) {
            organizarPuertos.add(listaBoards.get(i).getPuerto());
        }
        puertosUsados = new ArrayList(organizarPuertos);

        for (String puerto : puertosUsados) {
            jcb_Puertos.addItem(puerto);
        }

        mdtCatalogo.addColumn("ID");
        mdtCatalogo.addColumn("Nombre");
        mdtCatalogo.addColumn("Modelo");
        mdtCatalogo.addColumn("Velocidad de Ram");
        mdtCatalogo.addColumn("Tipo de Memoria");
        mdtCatalogo.addColumn("Consumo");
        mdtCatalogo.addColumn("Alimentación Externa");
        mdtCatalogo.addColumn("Pines");
        mdtCatalogo.addColumn("Puerto");
        mdtCatalogo.addColumn("Procesadores");
        mdtCatalogo.addColumn("Gama");

        jcb_Opciones.setSelectedIndex(0);
        mostrarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcb_Opciones = new javax.swing.JComboBox<>();
        jtf_ID = new javax.swing.JTextField();
        jtf_Nombre = new javax.swing.JTextField();
        jtf_Modelo = new javax.swing.JTextField();
        jtf_VRam = new javax.swing.JTextField();
        jcb_tipMemoria = new javax.swing.JComboBox<>();
        jtf_Consumo = new javax.swing.JTextField();
        jtb_Alimentacion = new javax.swing.JToggleButton();
        jcb_Pines = new javax.swing.JComboBox<>();
        jcb_Puertos = new javax.swing.JComboBox<>();
        jtf_Procesador = new javax.swing.JTextField();
        jcb_Gama = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Catalogo = new javax.swing.JTable();
        jb_Accion = new javax.swing.JButton();
        jb_Componentes = new javax.swing.JButton();
        jb_Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jb_Close = new javax.swing.JButton();
        jb_Minimizar = new javax.swing.JButton();
        jl_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcb_Opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crear", "Modificar", "Eliminar" }));
        jcb_Opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_OpcionesActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 382, -1));

        jtf_ID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtf_ID.setText("1");
        getContentPane().add(jtf_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 240, -1));

        jtf_Nombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtf_Nombre.setText("Nvidia");
        getContentPane().add(jtf_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 240, -1));

        jtf_Modelo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtf_Modelo.setText("GT 710");
        getContentPane().add(jtf_Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 240, -1));

        jtf_VRam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtf_VRam.setText("2");
        getContentPane().add(jtf_VRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 240, -1));

        jcb_tipMemoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcb_tipMemoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GDDR", "GDDR2", "GDDR3", "GDDR4", "GDDR5", "GDDR6" }));
        getContentPane().add(jcb_tipMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 240, -1));

        jtf_Consumo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtf_Consumo.setText("200");
        getContentPane().add(jtf_Consumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 240, -1));

        jtb_Alimentacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtb_Alimentacion.setText("Alimentación Externa");
        jtb_Alimentacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtb_AlimentacionMousePressed(evt);
            }
        });
        getContentPane().add(jtb_Alimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 240, -1));

        jcb_Pines.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcb_Pines.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "1x6", "1x6-1x8", "1x8", "2x6", "2x8" }));
        getContentPane().add(jcb_Pines, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 240, -1));

        jcb_Puertos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jcb_Puertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 240, -1));

        jtf_Procesador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtf_Procesador.setText("192");
        getContentPane().add(jtf_Procesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 240, -1));

        jcb_Gama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcb_Gama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "baja", "baja-media", "baja-alta", "media-baja", "media", "media-alta", "alta-baja", "alta-media", "alta" }));
        getContentPane().add(jcb_Gama, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 240, -1));

        jt_Catalogo.setBackground(new java.awt.Color(23, 24, 33));
        jt_Catalogo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jt_Catalogo.setForeground(new java.awt.Color(255, 255, 255));
        jt_Catalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jt_Catalogo.setEnabled(false);
        jt_Catalogo.setGridColor(new java.awt.Color(23, 24, 33));
        jt_Catalogo.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jt_Catalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_CatalogoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_Catalogo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 124, 660, 530));

        jb_Accion.setBackground(new java.awt.Color(169, 223, 216));
        jb_Accion.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jb_Accion.setBorder(new EmptyBorder(12, 12, 12, 12));
        jb_Accion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AccionActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Accion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 440, 60));

        jb_Componentes.setBackground(new java.awt.Color(137, 212, 202));
        jb_Componentes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_Componentes.setText("Ver los Componentes");
        jb_Componentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ComponentesActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Componentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 320, 30));

        jb_Volver.setBackground(new java.awt.Color(153, 153, 153));
        jb_Volver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jb_Volver.setText("Volver");
        jb_Volver.setBorder(new EmptyBorder(15, 15, 15, 15));
        jb_Volver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_VolverActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 110, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Gama");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 200, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 200, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Modelo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 200, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Velocidad Ram");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 200, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Tipo de Memoria");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 200, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Consumo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Alimentación Externa");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 200, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Pines");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 200, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Puerto");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 200, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Procesador");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 200, -1));

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

        jl_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/IMG_CatalogoTarjetas.png"))); // NOI18N
        getContentPane().add(jl_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jt_CatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_CatalogoMouseClicked
        // TODO add your handling code here:
        if (jcb_Opciones.getSelectedItem().equals("Modificar") || (jcb_Opciones.getSelectedItem().equals("Eliminar"))) {
            mdtCatalogo = (DefaultTableModel) jt_Catalogo.getModel();
            int fila = jt_Catalogo.getSelectedRow();
            jtf_ID.setText(jt_Catalogo.getValueAt(fila, 0).toString());
            jtf_Nombre.setText((String) jt_Catalogo.getValueAt(fila, 1));
            jtf_Modelo.setText((String) jt_Catalogo.getValueAt(fila, 2));
            jtf_VRam.setText((String) jt_Catalogo.getValueAt(fila, 3));

            for (int i = 0; i < jcb_tipMemoria.getItemCount(); i++) {
                if (jt_Catalogo.getValueAt(fila, 4).toString().equals(jcb_tipMemoria.getItemAt(i))) {
                    jcb_tipMemoria.setSelectedIndex(i);
                    break;
                }
            }

            jtf_Consumo.setText(jt_Catalogo.getValueAt(fila, 5).toString());
            if ((Boolean) jt_Catalogo.getValueAt(fila, 6) == true) {
                jtb_Alimentacion.setText("Si");
                jtb_Alimentacion.setSelected(true);
            } else {
                jtb_Alimentacion.setText("No");
                jtb_Alimentacion.setSelected(false);
            }

            for (int i = 0; i < jcb_Pines.getItemCount(); i++) {
                if (jt_Catalogo.getValueAt(fila, 7).toString().equals(jcb_Pines.getItemAt(i))) {
                    jcb_Pines.setSelectedIndex(i);
                    break;
                }
            }

            for (int i = 0; i < jcb_Puertos.getItemCount(); i++) {
                if (jt_Catalogo.getValueAt(fila, 8).toString().equals(jcb_Puertos.getItemAt(i))) {
                    jcb_Puertos.setSelectedIndex(i);
                    break;
                }
            }

            jtf_Procesador.setText(jt_Catalogo.getValueAt(fila, 9).toString());
            for (int i = 0; i < jcb_Gama.getItemCount(); i++) {
                if (jt_Catalogo.getValueAt(fila, 10).toString().equals(jcb_Gama.getItemAt(i))) {
                    jcb_Gama.setSelectedIndex(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_jt_CatalogoMouseClicked

    private void jcb_OpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_OpcionesActionPerformed
        // TODO add your handling code here:

        if (jcb_Opciones.getSelectedItem().equals("Crear")) {
            jb_Accion.setText("Crear Tarjeta");
            jtf_ID.setText((this.listaTarjetas.size() + 1) + "");
            jt_Catalogo.setEnabled(false);
            jtf_Nombre.setText(null);
            jtf_Modelo.setText(null);
            jtf_VRam.setText(null);
            jcb_tipMemoria.setEnabled(true);
            jtf_Consumo.setText(null);
            jtb_Alimentacion.setEnabled(true);
            jcb_Pines.setEnabled(true);
            jcb_Puertos.setEnabled(true);
            jtf_Procesador.setText(null);
            jcb_Gama.setEnabled(true);
        }

        if (jcb_Opciones.getSelectedItem().equals("Modificar")) {
            jb_Accion.setText("Modificar Tarjeta");
            jt_Catalogo.setEnabled(true);
            jcb_tipMemoria.setEnabled(true);
            jtb_Alimentacion.setEnabled(true);
            jcb_Pines.setEnabled(true);
            jcb_Puertos.setEnabled(true);
            jcb_Gama.setEnabled(true);

        }

        if (jcb_Opciones.getSelectedItem().equals("Eliminar")) {
            jb_Accion.setText("Eliminar Tarjeta");
            jt_Catalogo.setEnabled(true);
            jtf_Nombre.setEditable(false);
            jtf_Modelo.setEditable(false);
            jtf_VRam.setEditable(false);
            jcb_tipMemoria.setEnabled(false);
            jtf_Consumo.setEditable(false);
            jtb_Alimentacion.setEnabled(false);
            jcb_Pines.setEnabled(false);
            jcb_Puertos.setEnabled(false);
            jtf_Procesador.setEditable(false);
            jcb_Gama.setEnabled(false);

        }
    }//GEN-LAST:event_jcb_OpcionesActionPerformed

    private void jtb_AlimentacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_AlimentacionMousePressed
        // TODO add your handling code here:
        if (!jtb_Alimentacion.isSelected()) {
            jtb_Alimentacion.setText("Si");
        } else {
            jtb_Alimentacion.setText("No");
        }
    }//GEN-LAST:event_jtb_AlimentacionMousePressed

    private void jb_AccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AccionActionPerformed
        // TODO add your handling code here:
        if (jcb_Opciones.getSelectedItem().equals("Crear")) {

            if ((jtf_Nombre.getText().equals(""))
                    || (jtf_Modelo.getText().equals(""))
                    || (jtf_VRam.getText().equals(""))
                    || (jtf_Consumo.getText().equals(""))
                    || (jtf_Procesador.getText().equals(""))) {
                JOptionPane.showMessageDialog(this, "Favor rellenar los espacios");
            } else {
                TarjetaGrafica tg;
                String nombre = jtf_Nombre.getText();
                String modelo = jtf_Modelo.getText();
                String VRam = jtf_VRam.getText();
                String tipoMemoria = jcb_tipMemoria.getSelectedItem().toString();
                int Consumo = Integer.parseInt(jtf_Consumo.getText());
                boolean alimentacionExterna = jtb_Alimentacion.isSelected();
                String pines = jcb_Pines.getSelectedItem().toString();
                String puert = jcb_Puertos.getSelectedItem().toString();
                int procesador = Integer.parseInt(jtf_Procesador.getText());
                String gama = jcb_Gama.getSelectedItem().toString();
                String img = "./src/IMG/Tarjetas/gt710.png";

                ArrayList<TarjetaGrafica> aux;
                aux = this.logicaTarjeta.consultarTarjetas();
                tg = this.logicaTarjeta.crearTarjeta((aux.size() + 1), nombre, modelo, VRam, tipoMemoria, Consumo, alimentacionExterna, pines, puert, procesador, gama, img);
                this.logicaTarjeta.registrarTarjeta(tg);
                this.mostrarTabla();

            }
        }

        if (jcb_Opciones.getSelectedItem().equals("Modificar")) {
            if ((jtf_Nombre.getText().equals(""))
                    || (jtf_Modelo.getText().equals(""))
                    || (jtf_VRam.getText().equals(""))
                    || (jtf_Consumo.getText().equals(""))
                    || (jtf_Procesador.getText().equals(""))) {
                JOptionPane.showMessageDialog(this, "Favor rellenar los espacios");
            } else {
                TarjetaGrafica tg;
                int fila = jt_Catalogo.getSelectedRow();
                int idBuscado = Integer.parseInt(jt_Catalogo.getValueAt(fila, 0).toString());

                int ID = Integer.parseInt(jtf_ID.getText());
                String nombre = jtf_Nombre.getText();
                String modelo = jtf_Modelo.getText();
                String VRam = jtf_VRam.getText();
                String tipoMemoria = jcb_tipMemoria.getSelectedItem().toString();
                int Consumo = Integer.parseInt(jtf_Consumo.getText());
                boolean alimentacionExterna = jtb_Alimentacion.isSelected();
                String pines = jcb_Pines.getSelectedItem().toString();
                String puert = jcb_Puertos.getSelectedItem().toString();
                int procesador = Integer.parseInt(jtf_Procesador.getText());
                String gama = jcb_Gama.getSelectedItem().toString();
                String img = "./src/IMG/Tarjetas/gt710.png";

                tg = this.logicaTarjeta.crearTarjeta(ID, nombre, modelo, VRam, tipoMemoria, Consumo, alimentacionExterna, pines, puert, procesador, gama, img);
                this.logicaTarjeta.reemplazarTarjeta(idBuscado, tg);
                jt_Catalogo.setModel(mdtCatalogo);
                this.mostrarTabla();
            }
        }
        if (jcb_Opciones.getSelectedItem().equals("Eliminar")) {
            int fila = jt_Catalogo.getSelectedRow();
            int idEliminado = Integer.parseInt(jt_Catalogo.getValueAt(fila, 0).toString());
            this.logicaTarjeta.eliminarTarjeta(idEliminado);
            jt_Catalogo.setModel(mdtCatalogo);
            this.mostrarTabla();
        }
    }//GEN-LAST:event_jb_AccionActionPerformed

    private void jb_ComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ComponentesActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Componentes comp = new Componentes();
        comp.setVisible(true);
    }//GEN-LAST:event_jb_ComponentesActionPerformed

    private void jb_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_VolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Vis_Menu menu = new Vis_Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jb_VolverActionPerformed

    private void jb_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jb_CloseActionPerformed

    private void jb_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_MinimizarActionPerformed
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jb_MinimizarActionPerformed

    private void mostrarTabla() {
        this.listaTarjetas.clear();
        this.listaTarjetas = this.logicaTarjeta.consultarTarjetas();
        mdtCatalogo.setRowCount(0);
        for (int i = 0; i < listaTarjetas.size(); i++) {
            Object[] fila = new Object[11];

            fila[0] = listaTarjetas.get(i).getID();
            fila[1] = listaTarjetas.get(i).getNombre();
            fila[2] = listaTarjetas.get(i).getModelo();
            fila[3] = listaTarjetas.get(i).getVRam();
            fila[4] = listaTarjetas.get(i).getTipoMemoria();
            fila[5] = listaTarjetas.get(i).getConsumo();
            fila[6] = listaTarjetas.get(i).isAlimentacionExterna();
            fila[7] = listaTarjetas.get(i).getPines();
            fila[8] = listaTarjetas.get(i).getPuerto();
            fila[9] = listaTarjetas.get(i).getProcesador();
            fila[10] = listaTarjetas.get(i).getGama();
            mdtCatalogo.addRow(fila);
        }
        jt_Catalogo.setModel(mdtCatalogo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Accion;
    private javax.swing.JButton jb_Close;
    private javax.swing.JButton jb_Componentes;
    private javax.swing.JButton jb_Minimizar;
    private javax.swing.JButton jb_Volver;
    private javax.swing.JComboBox<String> jcb_Gama;
    private javax.swing.JComboBox<String> jcb_Opciones;
    private javax.swing.JComboBox<String> jcb_Pines;
    private javax.swing.JComboBox<String> jcb_Puertos;
    private javax.swing.JComboBox<String> jcb_tipMemoria;
    private javax.swing.JLabel jl_Background;
    private javax.swing.JTable jt_Catalogo;
    private javax.swing.JToggleButton jtb_Alimentacion;
    private javax.swing.JTextField jtf_Consumo;
    private javax.swing.JTextField jtf_ID;
    private javax.swing.JTextField jtf_Modelo;
    private javax.swing.JTextField jtf_Nombre;
    private javax.swing.JTextField jtf_Procesador;
    private javax.swing.JTextField jtf_VRam;
    // End of variables declaration//GEN-END:variables
}
