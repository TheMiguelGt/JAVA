/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro;

import static Pro.Crearu.us;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author CAT
 */
public class Llenadodedatos extends javax.swing.JFrame {

    public static String nombre, correo, telefono, ubicacion, experiencia, programas, habilidades, idiomas;
    public static Llenadodedatos lle = new Llenadodedatos();
    public static  Login lo = new Login();
    
    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Llenadodedatos.nombre = nombre;
    }

    public static String getCorreo() {
        return correo;
    }

    public static void setCorreo(String correo) {
        Llenadodedatos.correo = correo;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static void setTelefono(String telefono) {
        Llenadodedatos.telefono = telefono;
    }

    public static String getUbicacion() {
        return ubicacion;
    }

    public static void setUbicacion(String ubicacion) {
        Llenadodedatos.ubicacion = ubicacion;
    }

    public static String getExperiencia() {
        return experiencia;
    }

    public static void setExperiencia(String experiencia) {
        Llenadodedatos.experiencia = experiencia;
    }

    public static String getProgramas() {
        return programas;
    }

    public static void setProgramas(String programas) {
        Llenadodedatos.programas = programas;
    }

    public static String getHabilidades() {
        return habilidades;
    }

    public static void setHabilidades(String habilidades) {
        Llenadodedatos.habilidades = habilidades;
    }

    public static String getIdiomas() {
        return idiomas;
    }

    public static void setIdiomas(String idiomas) {
        Llenadodedatos.idiomas = idiomas;
    }

    /**
     * Creates new form Llenadodedatos
     */
    public Llenadodedatos() {
        initComponents();
//        printButton.setFocusPainted(false);
//printButton.setBorderPainted(false);
//printButton.setContentAreaFilled(false);
        jBenviar.setFocusPainted(false);
        jBenviar.setBorderPainted(false);
        jBenviar.setContentAreaFilled(false);
        //this.setMaximumSize(new Dimension(1380,890));
        //this.setMinimumSize(new Dimension(1380,890));
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
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
        jPanel2 = new javax.swing.JPanel();
        jTnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTcorreo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTubicacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTtel = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTexperiencia = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jThabilidades = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTprogramas = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTidiomas = new javax.swing.JTextArea();
        jBenviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 51, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jTnombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel2.add(jTnombre);
        jTnombre.setBounds(90, 10, 700, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 10, 80, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(290, 30, 800, 50);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("  Correo:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 10, 80, 30);

        jTcorreo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel3.add(jTcorreo);
        jTcorreo.setBounds(90, 10, 330, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(920, 90, 430, 50);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(null);

        jTubicacion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel4.add(jTubicacion);
        jTubicacion.setBounds(90, 10, 340, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ubicación:");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 10, 80, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 90, 440, 50);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Num tel:");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(10, 10, 80, 30);

        jTtel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel5.add(jTtel);
        jTtel.setBounds(80, 10, 330, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(480, 90, 420, 50);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Experiencia Laboral:");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(10, 10, 150, 30);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(20, 170, 160, 40);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setLayout(null);

        jTexperiencia.setColumns(20);
        jTexperiencia.setRows(5);
        jScrollPane4.setViewportView(jTexperiencia);

        jPanel7.add(jScrollPane4);
        jScrollPane4.setBounds(10, 10, 600, 200);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(20, 210, 620, 220);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setLayout(null);

        jThabilidades.setColumns(20);
        jThabilidades.setRows(5);
        jScrollPane1.setViewportView(jThabilidades);

        jPanel8.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 600, 200);

        jPanel1.add(jPanel8);
        jPanel8.setBounds(730, 210, 620, 220);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Habilidades:");
        jPanel10.add(jLabel6);
        jLabel6.setBounds(10, 10, 100, 30);

        jPanel1.add(jPanel10);
        jPanel10.setBounds(730, 170, 110, 40);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Programas:");
        jPanel9.add(jLabel9);
        jLabel9.setBounds(0, 10, 80, 30);

        jPanel1.add(jPanel9);
        jPanel9.setBounds(20, 440, 90, 40);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setLayout(null);

        jTprogramas.setColumns(20);
        jTprogramas.setRows(5);
        jScrollPane2.setViewportView(jTprogramas);

        jPanel11.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 600, 200);

        jPanel1.add(jPanel11);
        jPanel11.setBounds(20, 480, 620, 220);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Idiomas:");
        jPanel12.add(jLabel7);
        jLabel7.setBounds(10, 10, 61, 30);

        jPanel1.add(jPanel12);
        jPanel12.setBounds(730, 440, 80, 40);

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setLayout(null);

        jTidiomas.setColumns(20);
        jTidiomas.setRows(5);
        jScrollPane3.setViewportView(jTidiomas);

        jPanel13.add(jScrollPane3);
        jScrollPane3.setBounds(10, 10, 600, 200);

        jPanel1.add(jPanel13);
        jPanel13.setBounds(730, 480, 620, 220);

        jBenviar.setBackground(new java.awt.Color(153, 153, 153));
        jBenviar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jBenviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pro/icons8-lleno-enviado-32.png"))); // NOI18N
        jBenviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBenviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBenviarMouseEntered(evt);
            }
        });
        jBenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBenviarActionPerformed(evt);
            }
        });
        jPanel1.add(jBenviar);
        jBenviar.setBounds(1300, 40, 40, 40);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBenviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBenviarMouseEntered
        jBenviar.setToolTipText("ENVIAR");
    }//GEN-LAST:event_jBenviarMouseEntered

    private void jBenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBenviarActionPerformed
        
        
       
                lle.setNombre(jTnombre.getText());
           
                lle.setUbicacion(jTubicacion.getText());
       
                lle.setTelefono(jTtel.getText());
      
                lle.setCorreo(jTcorreo.getText());
      
                lle.setExperiencia(jTexperiencia.getText());
       
                lle.setHabilidades(jThabilidades.getText());
         
                lle.setProgramas(jTprogramas.getText());
    
                lle.setIdiomas(jTidiomas.getText());
       if(lle.getNombre().equals("") || lle.getUbicacion().equals("") || lle.getTelefono().equals("")|| lle.getCorreo().equals("")||lle.getExperiencia().equals("")||lle.getHabilidades().equals("")||lle.getProgramas().equals("")||lle.getIdiomas().equals("")){
           JOptionPane.showMessageDialog(null, "Favor de de no dejar algun campo de texto vacio");
       }else{
            JOptionPane.showMessageDialog(null, "Se ha enviado y se cerrara sesion");
        lo.setVisible(true);
        lo.setLocationRelativeTo(null);
        dispose();
       }
    }//GEN-LAST:event_jBenviarActionPerformed

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
            java.util.logging.Logger.getLogger(Llenadodedatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Llenadodedatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Llenadodedatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Llenadodedatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Llenadodedatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBenviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTcorreo;
    private javax.swing.JTextArea jTexperiencia;
    private javax.swing.JTextArea jThabilidades;
    private javax.swing.JTextArea jTidiomas;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextArea jTprogramas;
    private javax.swing.JTextField jTtel;
    private javax.swing.JTextField jTubicacion;
    // End of variables declaration//GEN-END:variables
}
