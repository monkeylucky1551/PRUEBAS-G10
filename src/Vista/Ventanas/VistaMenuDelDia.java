/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Ventanas;

import Controladores.ControladorBebidas;
import Controladores.ControladorMenuDelDia;
import static Vista.Interfaces.InterfazBebidas.ATRAS;
import static Vista.Interfaces.InterfazBebidas.INICIO;
import static Vista.Interfaces.InterfazBebidas.MICOMPRA;
import static Vista.Interfaces.InterfazBebidas.PAGARORDEN;
import static Vista.Interfaces.InterfazBebidas.VerYModificarOrden;
import static Vista.Interfaces.InterfazMenuDelDia.AGREGAR;
import Vista.Interfaces.InterfazMenuDelDia;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class VistaMenuDelDia extends javax.swing.JFrame implements InterfazMenuDelDia{

    imagenFondo fondo = new imagenFondo();
    
    
    public VistaMenuDelDia() {
        this.setContentPane(fondo);
        initComponents();
        btnAtrás.setActionCommand(ATRAS);
        btnInicio.setActionCommand(INICIO);
        btnRegistrarTicket.setActionCommand(PAGARORDEN);
        btnVerYModificarOrden.setActionCommand(VerYModificarOrden);
        btnMiCompra.setActionCommand(MICOMPRA);
        btnAgregar.setActionCommand(AGREGAR);
        btnQuitar.setActionCommand(QUITAR);
        btnCerrarSesion.setActionCommand(CERRARSESION);
        this.setResizable(false);
    }
    
    private class imagenFondo extends JPanel
    {
        private Image imagen;
        
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/imagenesproyecto/MenuRustico.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new imagenFondo();
        jPanel2 = new imagenFondo();
        lblNombreCliente = new javax.swing.JLabel();
        lblMenuDelDia = new javax.swing.JLabel();
        spnlBebidas = new javax.swing.JScrollPane();
        tblMenuDelDia = new javax.swing.JTable();
        lblOrdenCompra = new javax.swing.JLabel();
        spnlOrdenCompra = new javax.swing.JScrollPane();
        tblNuevaOrden = new javax.swing.JTable();
        btnInicio = new javax.swing.JButton();
        btnVerYModificarOrden = new javax.swing.JButton();
        btnRegistrarTicket = new javax.swing.JButton();
        btnAtrás = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMiCompra = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(1300, 550));

        lblNombreCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombreCliente.setForeground(new java.awt.Color(255, 255, 255));

        lblMenuDelDia.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMenuDelDia.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuDelDia.setText("MENU DEL DIA");

        tblMenuDelDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblMenuDelDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "PRODUCTO", "CATEGORIA", "PRECIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMenuDelDia.setRowHeight(30);
        spnlBebidas.setViewportView(tblMenuDelDia);

        lblOrdenCompra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOrdenCompra.setForeground(new java.awt.Color(255, 255, 255));
        lblOrdenCompra.setText("MiOrdenCompra");

        tblNuevaOrden.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblNuevaOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "PRODUCTO", "CATEGORIA", "PRECIO", "CANTIDAD", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNuevaOrden.setRowHeight(30);
        spnlOrdenCompra.setViewportView(tblNuevaOrden);

        btnInicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInicio.setText("Inicio");

        btnVerYModificarOrden.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVerYModificarOrden.setText("Ver y Modificar Orden");

        btnRegistrarTicket.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarTicket.setText("Registrar Ticket");

        btnAtrás.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtrás.setText("Atrás");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesproyecto/INICIO SESION.JPG"))); // NOI18N

        btnMiCompra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMiCompra.setText("Mi Compra");

        btnCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");

        btnQuitar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuitar.setText("Quitar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnMiCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 557, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btnInicio))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnVerYModificarOrden)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAtrás)
                                    .addComponent(spnlBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnAgregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnQuitar)))
                                .addGap(45, 45, 45))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(lblMenuDelDia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnlOrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrdenCompra))
                .addGap(26, 26, 26))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarTicket)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblMenuDelDia)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spnlBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblOrdenCompra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnlOrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnQuitar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVerYModificarOrden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrarTicket)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtrás)
                    .addComponent(btnMiCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VistaMenuDelDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenuDelDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenuDelDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenuDelDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnAtrás;
    public javax.swing.JButton btnCerrarSesion;
    public javax.swing.JButton btnInicio;
    public javax.swing.JButton btnMiCompra;
    public javax.swing.JButton btnQuitar;
    public javax.swing.JButton btnRegistrarTicket;
    public javax.swing.JButton btnVerYModificarOrden;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblMenuDelDia;
    public javax.swing.JLabel lblNombreCliente;
    public javax.swing.JLabel lblOrdenCompra;
    public javax.swing.JScrollPane spnlBebidas;
    public javax.swing.JScrollPane spnlOrdenCompra;
    public javax.swing.JTable tblMenuDelDia;
    public javax.swing.JTable tblNuevaOrden;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setControlador(ControladorMenuDelDia c) {
        btnAtrás.addActionListener(c);
        btnAgregar.addActionListener(c);
        btnCerrarSesion.addActionListener(c);
        btnInicio.addActionListener(c);
        btnMiCompra.addActionListener(c);
        btnRegistrarTicket.addActionListener(c);
        btnVerYModificarOrden.addActionListener(c);
        btnQuitar.addActionListener(c);
        btnCerrarSesion.addActionListener(c);
        
        ControladorMenuDelDia.ClickTablaOrden cOrden = c.new ClickTablaOrden();
        
        tblNuevaOrden.addMouseListener(cOrden);
    }

    @Override
    public void arranca() {
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
