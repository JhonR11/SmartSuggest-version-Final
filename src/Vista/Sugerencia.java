package Vista;

import Persistencia.Board;
import Persistencia.Fuente;
import Persistencia.Procesador;
import Persistencia.TarjetaGrafica;
import Logica.LogicaBoard;
import Logica.LogicaFuente;
import Logica.LogicaProcesador;
import Logica.LogicaTarjeta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Sugerencia extends javax.swing.JFrame {

    LogicaTarjeta logTarjeta = new LogicaTarjeta();
    LogicaBoard logBoard = new LogicaBoard();
    LogicaFuente logFuente = new LogicaFuente();
    LogicaProcesador logProcesador = new LogicaProcesador();

    ArrayList<TarjetaGrafica> listaTarjetas = new ArrayList<>();
    ArrayList<Board> listaBoards = new ArrayList<>();
    ArrayList<Fuente> listaFuentes = new ArrayList<>();
    ArrayList<Procesador> listaProcesadores = new ArrayList<>();

    DefaultTableModel mdtSugerencia = new DefaultTableModel();
    ArrayList<String> listaImagenesSugerencia = new ArrayList<>();

    public Sugerencia() {
        initComponents();

        this.listaBoards = this.logBoard.consultarBoards();
        this.listaFuentes = this.logFuente.consultarFuentes();
        this.listaProcesadores = this.logProcesador.consultarProcesadores();
        this.listaTarjetas = this.logTarjeta.consultarTarjetas();

        for (int i = 0; i < listaFuentes.size(); i++) {
            jcb_Fuente.addItem(listaFuentes.get(i).getCapacidad() + "");
        }

        mdtSugerencia.addColumn("ID");
        mdtSugerencia.addColumn("Nombre");
        mdtSugerencia.addColumn("Modelo");
        mdtSugerencia.addColumn("Velocidad de Ram");
        mdtSugerencia.addColumn("Tipo de Memoria");
        mdtSugerencia.addColumn("Consumo");
        mdtSugerencia.addColumn("Alimentación Externa");
        mdtSugerencia.addColumn("Pines");
        mdtSugerencia.addColumn("Puerto");
        mdtSugerencia.addColumn("Procesadores");
        mdtSugerencia.addColumn("Gama");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Fuente = new javax.swing.JLabel();
        jl_TipoBoard = new javax.swing.JLabel();
        jl_SocketBoard = new javax.swing.JLabel();
        jl_Puerto = new javax.swing.JLabel();
        jl_FamiliaProcesador = new javax.swing.JLabel();
        jl_GeneracionProcesador = new javax.swing.JLabel();
        jl_ReferenciaProcesador = new javax.swing.JLabel();
        jl_GamaProcesador = new javax.swing.JLabel();
        jcb_Fuente = new javax.swing.JComboBox<>();
        jcb_TipoBoard = new javax.swing.JComboBox<>();
        jcb_SocketBoard = new javax.swing.JComboBox<>();
        Jtf_Puerto = new javax.swing.JTextField();
        jcb_FamiliaProcesador = new javax.swing.JComboBox<>();
        jcb_GeneracionProcesador = new javax.swing.JComboBox<>();
        jcb_ReferenciaProcesador = new javax.swing.JComboBox<>();
        jtf_GamaProcesador = new javax.swing.JTextField();
        jb_GenerarSugerencia = new javax.swing.JButton();
        jb_Volver = new javax.swing.JButton();
        jb_Tarjetas = new javax.swing.JButton();
        jb_Componentes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Sugerencia = new javax.swing.JTable();
        jl_Imagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf_Modelo = new javax.swing.JTextField();
        jtf_VRam = new javax.swing.JTextField();
        jtf_TipoMemoria = new javax.swing.JTextField();
        jtf_Consumo = new javax.swing.JTextField();
        jtf_Procesador = new javax.swing.JTextField();
        jtf_Gama = new javax.swing.JTextField();
        jb_Minimizar = new javax.swing.JButton();
        jb_Close = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_Fuente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_Fuente.setForeground(new java.awt.Color(255, 255, 255));
        jl_Fuente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_Fuente.setText("Fuente");
        getContentPane().add(jl_Fuente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 210, -1));

        jl_TipoBoard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_TipoBoard.setForeground(new java.awt.Color(255, 255, 255));
        jl_TipoBoard.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_TipoBoard.setText("Tipo de Board");
        getContentPane().add(jl_TipoBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 220, -1));

        jl_SocketBoard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_SocketBoard.setForeground(new java.awt.Color(255, 255, 255));
        jl_SocketBoard.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_SocketBoard.setText("Socket (Board)");
        getContentPane().add(jl_SocketBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 140, -1));

        jl_Puerto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_Puerto.setForeground(new java.awt.Color(255, 255, 255));
        jl_Puerto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_Puerto.setText("Puerto");
        getContentPane().add(jl_Puerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 140, -1));

        jl_FamiliaProcesador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_FamiliaProcesador.setForeground(new java.awt.Color(255, 255, 255));
        jl_FamiliaProcesador.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_FamiliaProcesador.setText("Familia del Procesador");
        getContentPane().add(jl_FamiliaProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 200, -1));

        jl_GeneracionProcesador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_GeneracionProcesador.setForeground(new java.awt.Color(255, 255, 255));
        jl_GeneracionProcesador.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_GeneracionProcesador.setText("Generación del Procesador");
        getContentPane().add(jl_GeneracionProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 220, -1));

        jl_ReferenciaProcesador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_ReferenciaProcesador.setForeground(new java.awt.Color(255, 255, 255));
        jl_ReferenciaProcesador.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_ReferenciaProcesador.setText("Referencia del Procesador");
        getContentPane().add(jl_ReferenciaProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 220, -1));

        jl_GamaProcesador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_GamaProcesador.setForeground(new java.awt.Color(255, 255, 255));
        jl_GamaProcesador.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_GamaProcesador.setText("Gama del Procesador");
        getContentPane().add(jl_GamaProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 200, -1));

        getContentPane().add(jcb_Fuente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 220, -1));

        jcb_TipoBoard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AMD", "INTEL" }));
        jcb_TipoBoard.setSelectedIndex(-1);
        jcb_TipoBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_TipoBoardActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_TipoBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 220, -1));

        jcb_SocketBoard.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_SocketBoardItemStateChanged(evt);
            }
        });
        jcb_SocketBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_SocketBoardActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_SocketBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 220, -1));

        Jtf_Puerto.setEditable(false);
        getContentPane().add(Jtf_Puerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 220, -1));

        jcb_FamiliaProcesador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_FamiliaProcesadorItemStateChanged(evt);
            }
        });
        getContentPane().add(jcb_FamiliaProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 220, -1));

        jcb_GeneracionProcesador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_GeneracionProcesadorItemStateChanged(evt);
            }
        });
        getContentPane().add(jcb_GeneracionProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 220, -1));

        jcb_ReferenciaProcesador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_ReferenciaProcesadorItemStateChanged(evt);
            }
        });
        getContentPane().add(jcb_ReferenciaProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 220, -1));

        jtf_GamaProcesador.setEditable(false);
        jtf_GamaProcesador.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(jtf_GamaProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 220, -1));

        jb_GenerarSugerencia.setBackground(new java.awt.Color(169, 223, 216));
        jb_GenerarSugerencia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jb_GenerarSugerencia.setText("Generar Sugerencia");
        jb_GenerarSugerencia.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        jb_GenerarSugerencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_GenerarSugerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GenerarSugerenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jb_GenerarSugerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 400, 50));

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
        getContentPane().add(jb_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 110, 30));

        jb_Tarjetas.setBackground(new java.awt.Color(137, 212, 202));
        jb_Tarjetas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_Tarjetas.setText("Tarjetas");
        jb_Tarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_TarjetasActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Tarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 130, 30));

        jb_Componentes.setBackground(new java.awt.Color(137, 212, 202));
        jb_Componentes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_Componentes.setText("Componentes");
        jb_Componentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ComponentesActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Componentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, 140, 30));

        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        jt_Sugerencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jt_Sugerencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_SugerenciaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_Sugerencia);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 630, 260));

        jl_Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Tarjetas/NVIDIA GeForce TRX 4090 Ti.png"))); // NOI18N
        jl_Imagen.setMaximumSize(new java.awt.Dimension(300, 300));
        jl_Imagen.setMinimumSize(new java.awt.Dimension(300, 300));
        jl_Imagen.setPreferredSize(new java.awt.Dimension(250, 250));
        getContentPane().add(jl_Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Modelo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 460, 160, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("VRam");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, 160, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tipo de Memoria");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, 160, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Consumo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 160, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Procesador");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, 160, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Gama");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 610, 160, -1));

        jtf_Modelo.setEditable(false);
        jtf_Modelo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jtf_Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 460, 190, -1));

        jtf_VRam.setEditable(false);
        jtf_VRam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jtf_VRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 490, 190, -1));

        jtf_TipoMemoria.setEditable(false);
        jtf_TipoMemoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jtf_TipoMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 520, 190, -1));

        jtf_Consumo.setEditable(false);
        jtf_Consumo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jtf_Consumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 190, -1));

        jtf_Procesador.setEditable(false);
        jtf_Procesador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jtf_Procesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 580, 190, -1));

        jtf_Gama.setEditable(false);
        jtf_Gama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jtf_Gama, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 610, 190, -1));

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

        Background.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Form.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_VolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Vis_Menu menu = new Vis_Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jb_VolverActionPerformed

    private void jb_TarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_TarjetasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdministrarTarjetas menu = new AdministrarTarjetas();
        menu.setVisible(true);
    }//GEN-LAST:event_jb_TarjetasActionPerformed

    private void jb_ComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ComponentesActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Componentes menu = new Componentes();
        menu.setVisible(true);
    }//GEN-LAST:event_jb_ComponentesActionPerformed

    private void jcb_TipoBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_TipoBoardActionPerformed
        // TODO add your handling code here:
        HashSet organizar = new HashSet();
        ArrayList<String> auxiliar;
        jcb_SocketBoard.removeAllItems();

        for (int i = 0; i < this.listaBoards.size(); i++) {
            if (jcb_TipoBoard.getSelectedItem().toString().equals(this.listaBoards.get(i).getTipo())) {
                organizar.add(this.listaBoards.get(i).getSocket());
            }
        }

        auxiliar = new ArrayList(organizar);
        Collections.sort(auxiliar);

        for (int i = 0; i < auxiliar.size(); i++) {
            jcb_SocketBoard.addItem(auxiliar.get(i));
        }
    }//GEN-LAST:event_jcb_TipoBoardActionPerformed

    private void jcb_SocketBoardItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_SocketBoardItemStateChanged
        // TODO add your handling code here:
        try {
            HashSet organizar = new HashSet();
            ArrayList<String> auxiliar;
            jcb_FamiliaProcesador.removeAllItems();

            for (int i = 0; i < this.listaProcesadores.size(); i++) {
                if (jcb_SocketBoard.getSelectedItem().toString().equals(this.listaProcesadores.get(i).getSocket())) {
                    organizar.add(this.listaProcesadores.get(i).getSerie());
                }
            }

            auxiliar = new ArrayList(organizar);
            Collections.sort(auxiliar);

            for (int i = 0; i < auxiliar.size(); i++) {
                jcb_FamiliaProcesador.addItem(auxiliar.get(i));
            }
        } catch (Exception exc) {
        }
    }//GEN-LAST:event_jcb_SocketBoardItemStateChanged

    private void jcb_FamiliaProcesadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_FamiliaProcesadorItemStateChanged
        // TODO add your handling code here:
        try {
            HashSet organizar = new HashSet();
            ArrayList<String> auxiliar;
            jcb_GeneracionProcesador.removeAllItems();

            for (int i = 0; i < this.listaProcesadores.size(); i++) {
                if (jcb_FamiliaProcesador.getSelectedItem().toString().equals(this.listaProcesadores.get(i).getSerie())) {
                    organizar.add(this.listaProcesadores.get(i).getGeneracion());
                }
            }
            auxiliar = new ArrayList(organizar);
            Collections.sort(auxiliar);

            for (int i = 0; i < auxiliar.size(); i++) {
                jcb_GeneracionProcesador.addItem(auxiliar.get(i));
            }

        } catch (Exception exc) {
        }
    }//GEN-LAST:event_jcb_FamiliaProcesadorItemStateChanged

    private void jcb_GeneracionProcesadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_GeneracionProcesadorItemStateChanged
        // TODO add your handling code here:
        try {
            HashSet organizar = new HashSet();
            ArrayList<String> auxiliar;
            jcb_ReferenciaProcesador.removeAllItems();

            for (int i = 0; i < this.listaProcesadores.size(); i++) {
                if ((jcb_FamiliaProcesador.getSelectedItem().toString().equals(this.listaProcesadores.get(i).getSerie()))
                        && (jcb_GeneracionProcesador.getSelectedItem().toString().equals(this.listaProcesadores.get(i).getGeneracion()))) {
                    organizar.add(this.listaProcesadores.get(i).getReferencia());
                }
            }

            auxiliar = new ArrayList(organizar);
            Collections.sort(auxiliar);

            for (int i = 0; i < auxiliar.size(); i++) {
                jcb_ReferenciaProcesador.addItem(auxiliar.get(i));
            }

        } catch (Exception exc) {
        }
    }//GEN-LAST:event_jcb_GeneracionProcesadorItemStateChanged

    private void jcb_ReferenciaProcesadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_ReferenciaProcesadorItemStateChanged
        // TODO add your handling code here:
        try {
            String gama = "";

            for (int i = 0; i < this.listaProcesadores.size(); i++) {
                if (jcb_ReferenciaProcesador.getSelectedItem().toString().equals(this.listaProcesadores.get(i).getReferencia())) {
                    gama = this.listaProcesadores.get(i).getGama();
                    break;
                }
            }
            jtf_GamaProcesador.setText(gama);
        } catch (Exception exc) {
        }
    }//GEN-LAST:event_jcb_ReferenciaProcesadorItemStateChanged

    private void jcb_SocketBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_SocketBoardActionPerformed
        // TODO add your handling code here:
        try {
            String puerto = "";
            for (int i = 0; i < this.listaBoards.size(); i++) {
                if (jcb_SocketBoard.getSelectedItem().toString().equals(this.listaBoards.get(i).getSocket())) {
                    puerto = this.listaBoards.get(i).getPuerto();
                }
            }
            Jtf_Puerto.setText(puerto);
        } catch (Exception exc) {
        }
    }//GEN-LAST:event_jcb_SocketBoardActionPerformed

    private void jb_GenerarSugerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GenerarSugerenciaActionPerformed
        // TODO add your handling code here:
        int fuenteSugerencia = (Integer.parseInt(jcb_Fuente.getSelectedItem().toString()) + 100);
        String puertoSugerencia = Jtf_Puerto.getText();
        String gamaSugerencia = jtf_GamaProcesador.getText();
        listaImagenesSugerencia.clear();

        mdtSugerencia.setRowCount(0);

        for (int i = 0; i < listaTarjetas.size(); i++) {
            if ((fuenteSugerencia >= listaTarjetas.get(i).getConsumo())
                    && (puertoSugerencia.equals(listaTarjetas.get(i).getPuerto()))
                    && (gamaSugerencia.equals(listaTarjetas.get(i).getGama()))) {
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
                listaImagenesSugerencia.add(listaTarjetas.get(i).getImg());
                mdtSugerencia.addRow(fila);
            }
        }
        jt_Sugerencia.setModel(mdtSugerencia);

        if (mdtSugerencia.getRowCount() > 0) {
            jtf_Modelo.setText((String) jt_Sugerencia.getValueAt(0, 2));
            jtf_VRam.setText((String) jt_Sugerencia.getValueAt(0, 3) + "GB");
            jtf_TipoMemoria.setText((String) jt_Sugerencia.getValueAt(0, 4));
            jtf_Consumo.setText(jt_Sugerencia.getValueAt(0, 5) + "");
            jtf_Procesador.setText(jt_Sugerencia.getValueAt(0, 9) + "");
            jtf_Gama.setText((String) jt_Sugerencia.getValueAt(0, 10));
            ImageIcon icons = new ImageIcon(listaImagenesSugerencia.get(0));
            jl_Imagen.setIcon(icons);
        }


    }//GEN-LAST:event_jb_GenerarSugerenciaActionPerformed

    private void jt_SugerenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_SugerenciaMouseClicked
        // TODO add your handling code here:
        int fila = jt_Sugerencia.getSelectedRow();
        jtf_Modelo.setText((String) jt_Sugerencia.getValueAt(fila, 2));
            jtf_VRam.setText((String) jt_Sugerencia.getValueAt(fila, 3) + "GB");
            jtf_TipoMemoria.setText((String) jt_Sugerencia.getValueAt(fila, 4));
            jtf_Consumo.setText(jt_Sugerencia.getValueAt(fila, 5) + "");
            jtf_Procesador.setText(jt_Sugerencia.getValueAt(fila, 9) + "");
            jtf_Gama.setText((String) jt_Sugerencia.getValueAt(fila, 10));
            ImageIcon icons = new ImageIcon(listaImagenesSugerencia.get(fila));
            jl_Imagen.setIcon(icons);
    }//GEN-LAST:event_jt_SugerenciaMouseClicked

    private void jb_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jb_CloseActionPerformed

    private void jb_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_MinimizarActionPerformed
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jb_MinimizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField Jtf_Puerto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Close;
    private javax.swing.JButton jb_Componentes;
    private javax.swing.JButton jb_GenerarSugerencia;
    private javax.swing.JButton jb_Minimizar;
    private javax.swing.JButton jb_Tarjetas;
    private javax.swing.JButton jb_Volver;
    private javax.swing.JComboBox<String> jcb_FamiliaProcesador;
    private javax.swing.JComboBox<String> jcb_Fuente;
    private javax.swing.JComboBox<String> jcb_GeneracionProcesador;
    private javax.swing.JComboBox<String> jcb_ReferenciaProcesador;
    private javax.swing.JComboBox<String> jcb_SocketBoard;
    private javax.swing.JComboBox<String> jcb_TipoBoard;
    private javax.swing.JLabel jl_FamiliaProcesador;
    private javax.swing.JLabel jl_Fuente;
    private javax.swing.JLabel jl_GamaProcesador;
    private javax.swing.JLabel jl_GeneracionProcesador;
    private javax.swing.JLabel jl_Imagen;
    private javax.swing.JLabel jl_Puerto;
    private javax.swing.JLabel jl_ReferenciaProcesador;
    private javax.swing.JLabel jl_SocketBoard;
    private javax.swing.JLabel jl_TipoBoard;
    private javax.swing.JTable jt_Sugerencia;
    private javax.swing.JTextField jtf_Consumo;
    private javax.swing.JTextField jtf_Gama;
    private javax.swing.JTextField jtf_GamaProcesador;
    private javax.swing.JTextField jtf_Modelo;
    private javax.swing.JTextField jtf_Procesador;
    private javax.swing.JTextField jtf_TipoMemoria;
    private javax.swing.JTextField jtf_VRam;
    // End of variables declaration//GEN-END:variables
}
