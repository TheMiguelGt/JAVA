/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author CAT
 */
public class Buscador extends javax.swing.JFrame {
    public static String palabra;
    public static Buscador bus=new Buscador();
    public static Llenadodedatos lle=new Llenadodedatos();

    public static String getPalabra() {
        return palabra;
    }

    public static void setPalabra(String palabra) {
        Buscador.palabra = palabra;
    }
    
    /**
     * Creates new form Buscador
     */
    public Buscador() {
        initComponents();
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        jPven1.setVisible(false);
        jPven2.setVisible(false);
        jPven3.setVisible(false);
        jPven4.setVisible(false);
        jTexperiencia44.setEnabled(false);
        jThabilidades44.setEnabled(false);
        jTprogramas44.setEnabled(false);
        jTidiomas44.setEnabled(false);
        jTexperiencia11.setEnabled(false);
        jThabilidades11.setEnabled(false);
        jTprogramas11.setEnabled(false);
        jTidiomas11.setEnabled(false);
        jTexperiencia22.setEnabled(false);
        jThabilidades22.setEnabled(false);
        jTprogramas22.setEnabled(false);
        jTidiomas22.setEnabled(false);
        jTexperiencia33.setEnabled(false);
        jThabilidades33.setEnabled(false);
        jTprogramas33.setEnabled(false);
        jTidiomas33.setEnabled(false);
        jBbuscar.setFocusPainted(false);
        jBbuscar.setBorderPainted(true);
        jBbuscar.setContentAreaFilled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTpalabra = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPprincipal = new javax.swing.JPanel();
        jPven1 = new javax.swing.JPanel();
        jLnombre11 = new javax.swing.JLabel();
        jL9 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTexperiencia11 = new javax.swing.JTextArea();
        jL10 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTprogramas11 = new javax.swing.JTextArea();
        jL11 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jThabilidades11 = new javax.swing.JTextArea();
        jL12 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTidiomas11 = new javax.swing.JTextArea();
        jLcorreo11 = new javax.swing.JLabel();
        jPven2 = new javax.swing.JPanel();
        jLnombre22 = new javax.swing.JLabel();
        jLcorreo22 = new javax.swing.JLabel();
        jL13 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTexperiencia22 = new javax.swing.JTextArea();
        jL14 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jThabilidades22 = new javax.swing.JTextArea();
        jL15 = new javax.swing.JLabel();
        jL16 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTprogramas22 = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTidiomas22 = new javax.swing.JTextArea();
        jPven3 = new javax.swing.JPanel();
        jL5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTexperiencia33 = new javax.swing.JTextArea();
        jL6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTprogramas33 = new javax.swing.JTextArea();
        jL7 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jThabilidades33 = new javax.swing.JTextArea();
        jL8 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTidiomas33 = new javax.swing.JTextArea();
        jLnombre33 = new javax.swing.JLabel();
        jLcorreo33 = new javax.swing.JLabel();
        jPven4 = new javax.swing.JPanel();
        jLnombre44 = new javax.swing.JLabel();
        jLcorreo44 = new javax.swing.JLabel();
        jL2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTexperiencia44 = new javax.swing.JTextArea();
        jL4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jThabilidades44 = new javax.swing.JTextArea();
        jL3 = new javax.swing.JLabel();
        jL1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTprogramas44 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTidiomas44 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 51, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("BUSCADOR");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 30, 200, 40);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jTpalabra.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jTpalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpalabraActionPerformed(evt);
            }
        });
        jPanel2.add(jTpalabra);
        jTpalabra.setBounds(80, 10, 450, 30);

        jBbuscar.setBackground(new java.awt.Color(204, 204, 204));
        jBbuscar.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pro/icons8-búsqueda-30.png"))); // NOI18N
        jBbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBbuscarMouseEntered(evt);
            }
        });
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });
        jPanel2.add(jBbuscar);
        jBbuscar.setBounds(540, 0, 40, 40);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Palabra:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 10, 60, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 80, 590, 50);

        jPprincipal.setBackground(new java.awt.Color(204, 204, 204));
        jPprincipal.setLayout(null);

        jPven1.setBackground(new java.awt.Color(255, 255, 255));
        jPven1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPven1.setLayout(null);

        jLnombre11.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLnombre11.setForeground(new java.awt.Color(0, 0, 0));
        jPven1.add(jLnombre11);
        jLnombre11.setBounds(20, 20, 390, 30);

        jL9.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jL9.setForeground(new java.awt.Color(0, 0, 0));
        jL9.setText("Experiencia laboral:");
        jPven1.add(jL9);
        jL9.setBounds(20, 50, 140, 30);

        jTexperiencia11.setColumns(20);
        jTexperiencia11.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jTexperiencia11.setRows(5);
        jScrollPane9.setViewportView(jTexperiencia11);

        jPven1.add(jScrollPane9);
        jScrollPane9.setBounds(20, 80, 280, 80);

        jL10.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jL10.setForeground(new java.awt.Color(0, 0, 0));
        jL10.setText("Programas:");
        jPven1.add(jL10);
        jL10.setBounds(20, 160, 80, 30);

        jTprogramas11.setColumns(20);
        jTprogramas11.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jTprogramas11.setRows(5);
        jScrollPane10.setViewportView(jTprogramas11);

        jPven1.add(jScrollPane10);
        jScrollPane10.setBounds(20, 190, 280, 80);

        jL11.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jL11.setForeground(new java.awt.Color(0, 0, 0));
        jL11.setText("Habilidades:");
        jPven1.add(jL11);
        jL11.setBounds(350, 50, 140, 30);

        jThabilidades11.setColumns(20);
        jThabilidades11.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jThabilidades11.setRows(5);
        jScrollPane11.setViewportView(jThabilidades11);

        jPven1.add(jScrollPane11);
        jScrollPane11.setBounds(350, 80, 280, 80);

        jL12.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jL12.setForeground(new java.awt.Color(0, 0, 0));
        jL12.setText("Idiomas:");
        jPven1.add(jL12);
        jL12.setBounds(350, 160, 70, 30);

        jTidiomas11.setColumns(20);
        jTidiomas11.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jTidiomas11.setRows(5);
        jScrollPane12.setViewportView(jTidiomas11);

        jPven1.add(jScrollPane12);
        jScrollPane12.setBounds(350, 190, 280, 80);

        jLcorreo11.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLcorreo11.setForeground(new java.awt.Color(0, 0, 0));
        jPven1.add(jLcorreo11);
        jLcorreo11.setBounds(430, 20, 200, 30);

        jPprincipal.add(jPven1);
        jPven1.setBounds(0, 0, 650, 280);

        jPven2.setBackground(new java.awt.Color(255, 255, 255));
        jPven2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPven2.setLayout(null);

        jLnombre22.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLnombre22.setForeground(new java.awt.Color(0, 0, 0));
        jPven2.add(jLnombre22);
        jLnombre22.setBounds(20, 20, 390, 30);

        jLcorreo22.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLcorreo22.setForeground(new java.awt.Color(0, 0, 0));
        jPven2.add(jLcorreo22);
        jLcorreo22.setBounds(430, 20, 200, 30);

        jL13.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jL13.setForeground(new java.awt.Color(0, 0, 0));
        jL13.setText("Experiencia laboral:");
        jPven2.add(jL13);
        jL13.setBounds(20, 50, 140, 30);

        jTexperiencia22.setColumns(20);
        jTexperiencia22.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jTexperiencia22.setRows(5);
        jScrollPane13.setViewportView(jTexperiencia22);

        jPven2.add(jScrollPane13);
        jScrollPane13.setBounds(20, 80, 280, 80);

        jL14.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jL14.setForeground(new java.awt.Color(0, 0, 0));
        jL14.setText("Habilidades:");
        jPven2.add(jL14);
        jL14.setBounds(350, 50, 140, 30);

        jThabilidades22.setColumns(20);
        jThabilidades22.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jThabilidades22.setRows(5);
        jScrollPane14.setViewportView(jThabilidades22);

        jPven2.add(jScrollPane14);
        jScrollPane14.setBounds(350, 80, 280, 80);

        jL15.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jL15.setForeground(new java.awt.Color(0, 0, 0));
        jL15.setText("Programas:");
        jPven2.add(jL15);
        jL15.setBounds(20, 160, 80, 30);

        jL16.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jL16.setForeground(new java.awt.Color(0, 0, 0));
        jL16.setText("Idiomas:");
        jPven2.add(jL16);
        jL16.setBounds(350, 160, 70, 30);

        jTprogramas22.setColumns(20);
        jTprogramas22.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jTprogramas22.setRows(5);
        jScrollPane15.setViewportView(jTprogramas22);

        jPven2.add(jScrollPane15);
        jScrollPane15.setBounds(20, 190, 280, 80);

        jTidiomas22.setColumns(20);
        jTidiomas22.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jTidiomas22.setRows(5);
        jScrollPane16.setViewportView(jTidiomas22);

        jPven2.add(jScrollPane16);
        jScrollPane16.setBounds(350, 190, 280, 80);

        jPprincipal.add(jPven2);
        jPven2.setBounds(660, 0, 650, 280);

        jPven3.setBackground(new java.awt.Color(255, 255, 255));
        jPven3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPven3.setLayout(null);

        jL5.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jL5.setForeground(new java.awt.Color(0, 0, 0));
        jL5.setText("Experiencia laboral:");
        jPven3.add(jL5);
        jL5.setBounds(20, 50, 140, 30);

        jTexperiencia33.setColumns(20);
        jTexperiencia33.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jTexperiencia33.setRows(5);
        jScrollPane5.setViewportView(jTexperiencia33);

        jPven3.add(jScrollPane5);
        jScrollPane5.setBounds(20, 80, 280, 80);

        jL6.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jL6.setForeground(new java.awt.Color(0, 0, 0));
        jL6.setText("Programas:");
        jPven3.add(jL6);
        jL6.setBounds(20, 160, 80, 30);

        jTprogramas33.setColumns(20);
        jTprogramas33.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jTprogramas33.setRows(5);
        jScrollPane6.setViewportView(jTprogramas33);

        jPven3.add(jScrollPane6);
        jScrollPane6.setBounds(20, 190, 280, 80);

        jL7.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jL7.setForeground(new java.awt.Color(0, 0, 0));
        jL7.setText("Habilidades:");
        jPven3.add(jL7);
        jL7.setBounds(350, 50, 140, 30);

        jThabilidades33.setColumns(20);
        jThabilidades33.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jThabilidades33.setRows(5);
        jScrollPane7.setViewportView(jThabilidades33);

        jPven3.add(jScrollPane7);
        jScrollPane7.setBounds(350, 80, 280, 80);

        jL8.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jL8.setForeground(new java.awt.Color(0, 0, 0));
        jL8.setText("Idiomas:");
        jPven3.add(jL8);
        jL8.setBounds(350, 160, 70, 30);

        jTidiomas33.setColumns(20);
        jTidiomas33.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jTidiomas33.setRows(5);
        jScrollPane8.setViewportView(jTidiomas33);

        jPven3.add(jScrollPane8);
        jScrollPane8.setBounds(350, 190, 280, 80);

        jLnombre33.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLnombre33.setForeground(new java.awt.Color(0, 0, 0));
        jPven3.add(jLnombre33);
        jLnombre33.setBounds(20, 20, 390, 30);

        jLcorreo33.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLcorreo33.setForeground(new java.awt.Color(0, 0, 0));
        jPven3.add(jLcorreo33);
        jLcorreo33.setBounds(430, 20, 200, 30);

        jPprincipal.add(jPven3);
        jPven3.setBounds(0, 290, 650, 280);

        jPven4.setBackground(new java.awt.Color(255, 255, 255));
        jPven4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPven4.setLayout(null);

        jLnombre44.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLnombre44.setForeground(new java.awt.Color(0, 0, 0));
        jPven4.add(jLnombre44);
        jLnombre44.setBounds(30, 20, 390, 30);

        jLcorreo44.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLcorreo44.setForeground(new java.awt.Color(0, 0, 0));
        jPven4.add(jLcorreo44);
        jLcorreo44.setBounds(430, 20, 200, 30);

        jL2.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jL2.setForeground(new java.awt.Color(0, 0, 0));
        jL2.setText("Experiencia laboral:");
        jPven4.add(jL2);
        jL2.setBounds(30, 50, 140, 30);

        jTexperiencia44.setColumns(20);
        jTexperiencia44.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jTexperiencia44.setRows(5);
        jScrollPane3.setViewportView(jTexperiencia44);

        jPven4.add(jScrollPane3);
        jScrollPane3.setBounds(30, 80, 280, 80);

        jL4.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jL4.setForeground(new java.awt.Color(0, 0, 0));
        jL4.setText("Habilidades:");
        jPven4.add(jL4);
        jL4.setBounds(360, 50, 140, 30);

        jThabilidades44.setColumns(20);
        jThabilidades44.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jThabilidades44.setRows(5);
        jScrollPane1.setViewportView(jThabilidades44);

        jPven4.add(jScrollPane1);
        jScrollPane1.setBounds(350, 80, 280, 80);

        jL3.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jL3.setForeground(new java.awt.Color(0, 0, 0));
        jL3.setText("Programas:");
        jPven4.add(jL3);
        jL3.setBounds(30, 160, 80, 30);

        jL1.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jL1.setForeground(new java.awt.Color(0, 0, 0));
        jL1.setText("Idiomas:");
        jPven4.add(jL1);
        jL1.setBounds(350, 160, 70, 30);

        jTprogramas44.setColumns(20);
        jTprogramas44.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jTprogramas44.setRows(5);
        jScrollPane4.setViewportView(jTprogramas44);

        jPven4.add(jScrollPane4);
        jScrollPane4.setBounds(30, 190, 280, 80);

        jTidiomas44.setColumns(20);
        jTidiomas44.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jTidiomas44.setRows(5);
        jScrollPane2.setViewportView(jTidiomas44);

        jPven4.add(jScrollPane2);
        jScrollPane2.setBounds(350, 190, 280, 80);

        jPprincipal.add(jPven4);
        jPven4.setBounds(660, 290, 650, 280);

        jPanel1.add(jPprincipal);
        jPprincipal.setBounds(20, 140, 1310, 570);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTpalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpalabraActionPerformed
        
    }//GEN-LAST:event_jTpalabraActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        bus.setPalabra(jTpalabra.getText());
        if(bus.getPalabra().equals("")){
            JOptionPane.showMessageDialog(null, "Favor de ingresar un palabra clave para buscar","",JOptionPane.INFORMATION_MESSAGE);
        }else{
            if(bus.getPalabra().contains(lle.getHabilidades())||bus.getPalabra().contains(lle.getProgramas())||bus.getPalabra().contains(lle.getIdiomas())||bus.getPalabra().contains(lle.getExperiencia())){
                jPven1.setVisible(true);//compara todo lo que tiene el cv del solicitante 
                jLnombre11.setText(lle.getNombre());//imprime todos sus datos una vez que lo encontro
                jLcorreo11.setText(lle.getCorreo());
                jTexperiencia11.setText(lle.getExperiencia());
                jThabilidades11.setText(lle.getHabilidades());
                jTprogramas11.setText(lle.getProgramas());
                jTidiomas11.setText(lle.getIdiomas());
            }else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado nada","",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        System.out.println("popo "+lle.getNombre());
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBbuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBbuscarMouseEntered
         jBbuscar.setToolTipText("BUSCAR");
    }//GEN-LAST:event_jBbuscarMouseEntered

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
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JLabel jL1;
    private javax.swing.JLabel jL10;
    private javax.swing.JLabel jL11;
    private javax.swing.JLabel jL12;
    private javax.swing.JLabel jL13;
    private javax.swing.JLabel jL14;
    private javax.swing.JLabel jL15;
    private javax.swing.JLabel jL16;
    private javax.swing.JLabel jL2;
    private javax.swing.JLabel jL3;
    private javax.swing.JLabel jL4;
    private javax.swing.JLabel jL5;
    private javax.swing.JLabel jL6;
    private javax.swing.JLabel jL7;
    private javax.swing.JLabel jL8;
    private javax.swing.JLabel jL9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLcorreo11;
    private javax.swing.JLabel jLcorreo22;
    private javax.swing.JLabel jLcorreo33;
    private javax.swing.JLabel jLcorreo44;
    private javax.swing.JLabel jLnombre11;
    private javax.swing.JLabel jLnombre22;
    private javax.swing.JLabel jLnombre33;
    private javax.swing.JLabel jLnombre44;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPprincipal;
    private javax.swing.JPanel jPven1;
    private javax.swing.JPanel jPven2;
    private javax.swing.JPanel jPven3;
    private javax.swing.JPanel jPven4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTexperiencia11;
    private javax.swing.JTextArea jTexperiencia22;
    private javax.swing.JTextArea jTexperiencia33;
    private javax.swing.JTextArea jTexperiencia44;
    private javax.swing.JTextArea jThabilidades11;
    private javax.swing.JTextArea jThabilidades22;
    private javax.swing.JTextArea jThabilidades33;
    private javax.swing.JTextArea jThabilidades44;
    private javax.swing.JTextArea jTidiomas11;
    private javax.swing.JTextArea jTidiomas22;
    private javax.swing.JTextArea jTidiomas33;
    private javax.swing.JTextArea jTidiomas44;
    private javax.swing.JTextField jTpalabra;
    private javax.swing.JTextArea jTprogramas11;
    private javax.swing.JTextArea jTprogramas22;
    private javax.swing.JTextArea jTprogramas33;
    private javax.swing.JTextArea jTprogramas44;
    // End of variables declaration//GEN-END:variables
}
