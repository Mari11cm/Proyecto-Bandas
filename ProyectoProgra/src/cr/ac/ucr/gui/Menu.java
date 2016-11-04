/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gui;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ASEK
 */
public class Menu extends javax.swing.JFrame {

    Login l;
    VentanaPrincipal vn;
    Icon icon;
    
    public Menu() {
        initComponents();
        icon = new ImageIcon(getClass().getResource("/icono/logo2.png"));
        this.setTitle("JAMP Elektron");
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 1067));

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1600, 1067));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ca/ucr/iconos/fondo.jpg"))); // NOI18N

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 51));

        jMenu1.setForeground(new java.awt.Color(0, 153, 153));
        jMenu1.setText("Acciones");
        jMenu1.setFont(new java.awt.Font("Shonar Bangla", 1, 24)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Shonar Bangla", 1, 24)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 153, 153));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ca/ucr/iconos/engra.png"))); // NOI18N
        jMenuItem1.setText("Ver Bandas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setFont(new java.awt.Font("Shonar Bangla", 1, 24)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 153, 153));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ca/ucr/iconos/archivos.png"))); // NOI18N
        jMenuItem3.setText("Ver Información");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu3.setForeground(new java.awt.Color(0, 153, 153));
        jMenu3.setText("Acerca de");
        jMenu3.setFont(new java.awt.Font("Shonar Bangla", 1, 24)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Shonar Bangla", 1, 24)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(0, 153, 153));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ca/ucr/iconos/info.png"))); // NOI18N
        jMenuItem2.setText("Acerca de");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu2.setForeground(new java.awt.Color(0, 153, 153));
        jMenu2.setText("Salir");
        jMenu2.setFont(new java.awt.Font("Shonar Bangla", 1, 24)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Shonar Bangla", 1, 24)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(0, 153, 153));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ca/ucr/iconos/Exit.png"))); // NOI18N
        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JOptionPane.showMessageDialog(null, "Gracias por utilizar la aplicacion");
        //System.exit(0);
        this.setVisible(false);
        vn = new VentanaPrincipal();
        vn.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        JOptionPane.showMessageDialog(null, "JAMP Elektron  \n\n" + 
                "Aplicación que se encarga de gestionar  \n" + "la cadena de valor de dicha empresa \n" +
                "productora de electrónicos.  \n\n" + "Realizado por:  \n" + 
                "Alejandro Rivera B35781  \n" + "Jose Rivera B35783  \n" + 
                "Mariela Calvo B44444  \n" + "Juan Pablo Solano B35555  \n\n"+
                "Version 1.0  \n\n" + "UNIVERSIDAD DE COSTA RICA  \n" + "Informatica Empresarial  \n"+
                "Programación II  \n\n" + "2016", "Acerda de", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Bandas b = new Bandas();
        jDesktopPane1.add(b);
        b.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ContenidoArchivos ca = new ContenidoArchivos();
        jDesktopPane1.add(ca);
        ca.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
