package Vista.Ventanas;


import Controladores.ControladorMenuInicio2;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Modelo.*;
import Vista.Interfaces.InterfazMenuInicio;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class VistaMenuInicio extends javax.swing.JFrame implements InterfazMenuInicio {

    imagenFondo fondo = new imagenFondo();
    
    
    public VistaMenuInicio() {
        this.setContentPane(fondo);
        initComponents();
        btnInicio.setActionCommand(INICIO);
        btnVerYModificarOrden.setActionCommand(VerYModificarOrden);
        btnRegistrarTicket.setActionCommand(PagarOrden);
        btnCerrarSesion.setActionCommand(CerrarSesion);
        btnBebidas.setActionCommand(BEBIDAS);
        btnEnsaladas.setActionCommand(ENSALADAS);
        btnEntradas.setActionCommand(ENTRADAS);
        btnComidas.setActionCommand(COMIDAS);
        btnMenuEspecial.setActionCommand(MENUESPECIAL);
        btnMiCompra.setActionCommand(MICOMPRA);
        establecerImagenes();
        this.setResizable(false);
        
    }
    
    public void establecerImagenes()
    {
        ImageIcon imagenBebidas =  new ImageIcon("src\\imagenesproyecto\\bebidascafe.jpg");
        Icon iconoBebidas = new ImageIcon(imagenBebidas.getImage().getScaledInstance(lblBebidas.getWidth(), lblBebidas.getHeight(), Image.SCALE_DEFAULT));
        lblBebidas.setIcon(iconoBebidas);
        //this.repaint();
        
        ImageIcon imagenEnsaladas =  new ImageIcon("src\\imagenesproyecto\\ensalada.jpg");
        Icon iconoEnsaladas = new ImageIcon(imagenEnsaladas.getImage().getScaledInstance(lblEnsaladas.getWidth(), lblEnsaladas.getHeight(), Image.SCALE_DEFAULT));
        lblEnsaladas.setIcon(iconoEnsaladas);
        
        ImageIcon imagenEntradas =  new ImageIcon("src\\imagenesproyecto\\entradas.jpg");
        Icon iconoEntradas = new ImageIcon(imagenEntradas.getImage().getScaledInstance(lblEntradas.getWidth(), lblEntradas.getHeight(), Image.SCALE_DEFAULT));
        lblEntradas.setIcon(iconoEntradas);
        
        ImageIcon imagenComidas =  new ImageIcon("src\\imagenesproyecto\\comidas.jpg");
        Icon iconoComidas = new ImageIcon(imagenComidas.getImage().getScaledInstance(lblComidas.getWidth(), lblComidas.getHeight(), Image.SCALE_DEFAULT));
        lblComidas.setIcon(iconoComidas);
        
        ImageIcon imagenEspecialMenu =  new ImageIcon("src\\imagenesproyecto\\menuespecial.jpg");
        Icon iconoEspecialMenu = new ImageIcon(imagenEspecialMenu.getImage().getScaledInstance(lblEspecialMenu.getWidth(), lblEspecialMenu.getHeight(), Image.SCALE_DEFAULT));
        lblEspecialMenu.setIcon(iconoEspecialMenu);
    }
    
    private class imagenFondo extends JPanel
    {
        private Image imagen;
        
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/imagenesproyecto/MenuInicio.jpg")).getImage();
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new imagenFondo();
        lblNombreCliente = new javax.swing.JLabel();
        lblCafeteriaUNMSM = new javax.swing.JLabel();
        btnBebidas = new javax.swing.JButton();
        btnEnsaladas = new javax.swing.JButton();
        btnEntradas = new javax.swing.JButton();
        btnComidas = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnVerYModificarOrden = new javax.swing.JButton();
        btnRegistrarTicket = new javax.swing.JButton();
        btnMenuEspecial = new javax.swing.JButton();
        lblBebidas = new javax.swing.JLabel();
        lblEnsaladas = new javax.swing.JLabel();
        lblComidas = new javax.swing.JLabel();
        lblEntradas = new javax.swing.JLabel();
        lblEspecialMenu = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMiCompra = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 630));

        lblNombreCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombreCliente.setForeground(new java.awt.Color(255, 255, 255));

        lblCafeteriaUNMSM.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblCafeteriaUNMSM.setText("RESTAURANTE %%%%%");

        btnBebidas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBebidas.setText("Bebidas");

        btnEnsaladas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEnsaladas.setText("Ensaladas");

        btnEntradas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEntradas.setText("Entradas");

        btnComidas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnComidas.setText("Comidas");

        btnInicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInicio.setText("Inicio");

        btnVerYModificarOrden.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVerYModificarOrden.setText("Ver y Modificar Orden");

        btnRegistrarTicket.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarTicket.setText("Registrar Ticket");

        btnMenuEspecial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMenuEspecial.setText("Menu Especial");

        btnCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesproyecto/INICIO SESION.JPG"))); // NOI18N

        btnMiCompra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMiCompra.setText("Mi Compra");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(btnVerYModificarOrden))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addComponent(jLabel1))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnMiCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnRegistrarTicket))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(149, 149, 149)
                                                .addComponent(btnBebidas))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(81, 81, 81)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(btnInicio)))
                                .addGap(108, 108, 108)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblEnsaladas, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnEnsaladas)
                                        .addGap(116, 116, 116)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEspecialMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(btnMenuEspecial))))
                            .addComponent(lblComidas, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btnComidas))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(lblCafeteriaUNMSM)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEspecialMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMenuEspecial)
                .addGap(209, 209, 209))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblCafeteriaUNMSM)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEnsaladas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBebidas)
                        .addComponent(btnEnsaladas)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComidas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEntradas)
                            .addComponent(btnComidas)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnInicio)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerYModificarOrden)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarTicket)
                        .addGap(18, 18, 18)
                        .addComponent(btnMiCompra)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrarSesion)))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(VistaMenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                /*new VistaMenuInicio().setVisible(true);*/
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBebidas;
    public javax.swing.JButton btnCerrarSesion;
    public javax.swing.JButton btnComidas;
    public javax.swing.JButton btnEnsaladas;
    public javax.swing.JButton btnEntradas;
    public javax.swing.JButton btnInicio;
    public javax.swing.JButton btnMenuEspecial;
    public javax.swing.JButton btnMiCompra;
    public javax.swing.JButton btnRegistrarTicket;
    public javax.swing.JButton btnVerYModificarOrden;
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblBebidas;
    public javax.swing.JLabel lblCafeteriaUNMSM;
    public javax.swing.JLabel lblComidas;
    public javax.swing.JLabel lblEnsaladas;
    public javax.swing.JLabel lblEntradas;
    public javax.swing.JLabel lblEspecialMenu;
    public javax.swing.JLabel lblNombreCliente;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setControlador(ControladorMenuInicio2 c) {
        btnBebidas.addActionListener(c);
        btnCerrarSesion.addActionListener(c);
        btnComidas.addActionListener(c);
        btnEnsaladas.addActionListener(c);
        btnEntradas.addActionListener(c);
        btnInicio.addActionListener(c);
        btnMenuEspecial.addActionListener(c);
        btnRegistrarTicket.addActionListener(c);
        btnVerYModificarOrden.addActionListener(c);
        btnMiCompra.addActionListener(c);
    }

    @Override
    public void arranca() {
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    
}
