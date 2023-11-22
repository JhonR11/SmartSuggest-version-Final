package Vista;

import Persistencia.Board;
import Persistencia.Procesador;
import Persistencia.Fuente;
import Entidades.TXTCreate.TXTBoard;
import Entidades.TXTCreate.TXTFuente;
import Entidades.TXTCreate.TXTProcesador;
import Logica.*;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;

public class Componentes extends javax.swing.JFrame {

    TXTBoard btt = new TXTBoard();
    private LogicaBoard logicaBoard = new LogicaBoard();
    DefaultTableModel mdtCatalogoBoard = new DefaultTableModel();
    ArrayList<Board> listaBoards = new ArrayList();

    TXTFuente ftt = new TXTFuente();
    private LogicaProcesador logicaProcesador = new LogicaProcesador();
    DefaultTableModel mdtCatalogoProcesador = new DefaultTableModel();
    ArrayList<Procesador> listaProcesadores = new ArrayList();

    TXTProcesador ptt = new TXTProcesador();
    private LogicaFuente logicaFuente = new LogicaFuente();
    DefaultTableModel mdtCatalogoFuente = new DefaultTableModel();
    ArrayList<Fuente> listaFuentes = new ArrayList();

    TableRowSorter trsBoard = new TableRowSorter();
    TableRowSorter trsFuente = new TableRowSorter();
    TableRowSorter trsProcesador = new TableRowSorter();

    public Componentes() {

        initComponents();

        this.btt.crearArchivoTexto();
        this.ftt.crearArchivoTexto();
        this.ptt.crearArchivoTexto();

        this.listaBoards = this.logicaBoard.consultarBoards();
        this.listaProcesadores = this.logicaProcesador.consultarProcesadores();
        this.listaFuentes = this.logicaFuente.consultarFuentes();

        mdtCatalogoFuente.addColumn("Capacidad");

        mdtCatalogoBoard.addColumn("Tipo");
        mdtCatalogoBoard.addColumn("Soquet");
        mdtCatalogoBoard.addColumn("Puerto");

        mdtCatalogoProcesador.addColumn("Socket");
        mdtCatalogoProcesador.addColumn("Serie");
        mdtCatalogoProcesador.addColumn("Referencia");
        mdtCatalogoProcesador.addColumn("Generación");
        mdtCatalogoProcesador.addColumn("Gama");

        mostrarTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Buscar = new javax.swing.JLabel();
        jtp_CatalogoBFP = new javax.swing.JTabbedPane();
        jsc_Board = new javax.swing.JScrollPane();
        jt_Board = new javax.swing.JTable();
        jsp_Fuentes = new javax.swing.JScrollPane();
        jt_Fuente = new javax.swing.JTable();
        jsp_Procesadores = new javax.swing.JScrollPane();
        jt_Procesadores = new javax.swing.JTable();
        jtf_Buscar = new javax.swing.JTextField();
        jb_Volver = new javax.swing.JButton();
        jb_Close = new javax.swing.JButton();
        jb_Minimizar = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_Buscar.setBackground(new java.awt.Color(255, 255, 255));
        jl_Buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        jl_Buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Buscar.setText("Buscar");
        getContentPane().add(jl_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jtp_CatalogoBFP.setBackground(new java.awt.Color(23, 24, 33));
        jtp_CatalogoBFP.setForeground(new java.awt.Color(255, 255, 255));
        jtp_CatalogoBFP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtp_CatalogoBFP.setMaximumSize(new java.awt.Dimension(900, 700));
        jtp_CatalogoBFP.setMinimumSize(new java.awt.Dimension(900, 700));
        jtp_CatalogoBFP.setPreferredSize(new java.awt.Dimension(900, 700));
        jtp_CatalogoBFP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtp_CatalogoBFPMouseClicked(evt);
            }
        });

        jt_Board.setBackground(new java.awt.Color(23, 24, 33));
        jt_Board.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jt_Board.setForeground(new java.awt.Color(255, 255, 255));
        jt_Board.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jt_Board.setEnabled(false);
        jt_Board.setGridColor(new java.awt.Color(23, 24, 33));
        jt_Board.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jsc_Board.setViewportView(jt_Board);

        jtp_CatalogoBFP.addTab("Board", jsc_Board);

        jt_Fuente.setBackground(new java.awt.Color(23, 24, 33));
        jt_Fuente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jt_Fuente.setForeground(new java.awt.Color(255, 255, 255));
        jt_Fuente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jt_Fuente.setEnabled(false);
        jt_Fuente.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jsp_Fuentes.setViewportView(jt_Fuente);

        jtp_CatalogoBFP.addTab("Fuentes", jsp_Fuentes);

        jt_Procesadores.setBackground(new java.awt.Color(23, 24, 33));
        jt_Procesadores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jt_Procesadores.setForeground(new java.awt.Color(255, 255, 255));
        jt_Procesadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jt_Procesadores.setEnabled(false);
        jt_Procesadores.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jsp_Procesadores.setViewportView(jt_Procesadores);

        jtp_CatalogoBFP.addTab("Procesadores", jsp_Procesadores);

        getContentPane().add(jtp_CatalogoBFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 660, 530));

        jtf_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_BuscarKeyTyped(evt);
            }
        });
        getContentPane().add(jtf_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 360, -1));

        jb_Volver.setBackground(new java.awt.Color(153, 153, 153));
        jb_Volver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jb_Volver.setText("Volver");
        jb_Volver.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jb_Volver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_VolverActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 110, 30));

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

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Componets.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_BuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_BuscarKeyTyped
        // TODO add your handling code here:
        if (jtp_CatalogoBFP.getSelectedIndex() == 0) {
            jl_Buscar.setText("Buscar Board");
            jtf_Buscar.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent ke) {
                    trsBoard.setRowFilter(RowFilter.regexFilter("(?i)" + jtf_Buscar.getText(), 0));
                }
            });

            trsBoard = new TableRowSorter(mdtCatalogoBoard);
            jt_Board.setRowSorter(trsBoard);
        }

        if (jtp_CatalogoBFP.getSelectedIndex() == 1) {
            jl_Buscar.setText("Buscar Fuente");
            jtf_Buscar.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent ke) {
                    trsFuente.setRowFilter(RowFilter.regexFilter("(?i)" + jtf_Buscar.getText(), 0));
                }
            });

            trsFuente = new TableRowSorter(mdtCatalogoFuente);
            jt_Fuente.setRowSorter(trsFuente);
        }

        if (jtp_CatalogoBFP.getSelectedIndex() == 2) {
            jl_Buscar.setText("Buscar Procesador");
            jtf_Buscar.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent ke) {
                    trsProcesador.setRowFilter(RowFilter.regexFilter("(?i)" + jtf_Buscar.getText(), 1));
                }
            });

            trsProcesador = new TableRowSorter(mdtCatalogoProcesador);
            jt_Procesadores.setRowSorter(trsProcesador);
        }
    }//GEN-LAST:event_jtf_BuscarKeyTyped

    private void jtp_CatalogoBFPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtp_CatalogoBFPMouseClicked
        // TODO add your handling code here:
        if (jtp_CatalogoBFP.getSelectedIndex() == 0) {
            jl_Buscar.setText("Buscar Board");
        }
        
        if (jtp_CatalogoBFP.getSelectedIndex() == 1) {
            jl_Buscar.setText("Buscar Fuente");
        }
        
        if (jtp_CatalogoBFP.getSelectedIndex() == 2) {
            jl_Buscar.setText("Buscar Procesador");
        }

    }//GEN-LAST:event_jtp_CatalogoBFPMouseClicked

    private void jb_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_VolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdministrarTarjetas menu = new AdministrarTarjetas();
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

    private void mostrarTablas() {
        this.listaBoards.clear();
        this.listaFuentes.clear();
        this.listaProcesadores.clear();

        this.listaBoards = this.logicaBoard.consultarBoards();
        this.listaFuentes = this.logicaFuente.consultarFuentes();
        this.listaProcesadores = this.logicaProcesador.consultarProcesadores();

        this.mdtCatalogoBoard.setRowCount(0);
        this.mdtCatalogoFuente.setRowCount(0);
        this.mdtCatalogoProcesador.setRowCount(0);

        for (int i = 0; i < listaFuentes.size(); i++) {
            Object[] fila = new Object[1];
            fila[0] = listaFuentes.get(i).getCapacidad();
            mdtCatalogoFuente.addRow(fila);
        }

        for (int i = 0; i < listaBoards.size(); i++) {
            Object[] fila = new Object[3];
            fila[0] = listaBoards.get(i).getTipo();
            fila[1] = listaBoards.get(i).getPuerto();
            fila[2] = listaBoards.get(i).getSocket();
            mdtCatalogoBoard.addRow(fila);
        }

        for (int i = 0; i < listaProcesadores.size(); i++) {
            Object[] fila = new Object[5];
            fila[0] = listaProcesadores.get(i).getSocket();
            fila[1] = listaProcesadores.get(i).getSerie();
            fila[2] = listaProcesadores.get(i).getReferencia();
            fila[3] = listaProcesadores.get(i).getGeneracion();
            fila[4] = listaProcesadores.get(i).getGama();
            mdtCatalogoProcesador.addRow(fila);
        }

        jt_Fuente.setModel(mdtCatalogoFuente);
        jt_Board.setModel(mdtCatalogoBoard);
        jt_Procesadores.setModel(mdtCatalogoProcesador);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton jb_Close;
    private javax.swing.JButton jb_Minimizar;
    private javax.swing.JButton jb_Volver;
    private javax.swing.JLabel jl_Buscar;
    private javax.swing.JScrollPane jsc_Board;
    private javax.swing.JScrollPane jsp_Fuentes;
    private javax.swing.JScrollPane jsp_Procesadores;
    private javax.swing.JTable jt_Board;
    private javax.swing.JTable jt_Fuente;
    private javax.swing.JTable jt_Procesadores;
    private javax.swing.JTextField jtf_Buscar;
    private javax.swing.JTabbedPane jtp_CatalogoBFP;
    // End of variables declaration//GEN-END:variables
}
