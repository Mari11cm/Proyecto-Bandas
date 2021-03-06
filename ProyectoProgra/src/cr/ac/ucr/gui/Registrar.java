/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gui;

import cr.ac.ucr.archivos.ArchivoGerente;
import cr.ac.ucr.modelos.Gerente;
import javax.swing.JOptionPane;


/**
 *
 * @author ASEK
 */
public class Registrar extends javax.swing.JFrame {

    VentanaPrincipal vp;
    ArchivoGerente archivo;

    public Registrar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        archivo= new ArchivoGerente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jtfCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 102, 0));
        jLabel2.setText("Nombre ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jtfCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(jtfCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 232, -1));

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 102, 0));
        jLabel3.setText("Confrimar contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jButton1.setForeground(new java.awt.Color(0, 102, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ca/ucr/iconos/registrar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 102, 0));
        jLabel4.setText("Apellidos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));
        getContentPane().add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 232, -1));
        getContentPane().add(jtfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 232, -1));

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 102, 0));
        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jtfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(jtfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 232, -1));

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 102, 0));
        jLabel6.setText("Correo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 230, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ca/ucr/iconos/fondoTurquesa2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 90));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ca/ucr/iconos/fondoTurquesa.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 330, 90));

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 102, 0));
        jLabel8.setText("Contraseña");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));
        getContentPane().add(jtfContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 230, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String pass = "";
        String pass2 = "";
        char[] passChar = jPasswordField2.getPassword();
        for (int i = 0; i < passChar.length; i++) {
            pass += passChar[i];
        }
        char[] passChar2 = jtfContrasena.getPassword();
        for (int i = 0; i < passChar2.length; i++) {
            pass2 += passChar2[i];
        }
        
        if (jtfCorreo.getText().equals("") || pass.equals("") ||
                jtfNombre.getText().equals("") ||
                jtfApellidos.getText().equals("") ||
                jtfTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene los espacios");
        } else if(!(pass.equals(pass2))){
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        } else if(!archivo.buscaGerentes(jtfCorreo.getText(), pass2)) {
            //se pone el metodo que guarda en el archivo
            Gerente gerenteNuevo= new Gerente(jtfNombre.getText(), jtfApellidos.getText(),  jtfTelefono.getText(), jtfCorreo.getText(),jtfContrasena.getText());
            archivo.registrarNuevoGerente(gerenteNuevo);
            JOptionPane.showMessageDialog(null, "Registrado exitosamente");
            vp = new VentanaPrincipal();
            vp.setVisible(true);
            this.setVisible(false);
        } else 
            JOptionPane.showMessageDialog(null, "El correo ingresado ya tiene una cuenta asociada.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCorreoActionPerformed

    private void jtfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jtfApellidos;
    private javax.swing.JPasswordField jtfContrasena;
    private javax.swing.JTextField jtfCorreo;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
}
