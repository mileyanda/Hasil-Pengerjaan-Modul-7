/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7_1;

/**
 *
 * @author yanda
 */
public class FormModul7_1 extends javax.swing.JFrame {

    /**
     * Creates new form FormModul7_1
     */
    public FormModul7_1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        absen = new javax.swing.JLabel();
        kelas = new javax.swing.JLabel();
        kelamin = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        Kelas = new javax.swing.JComboBox<>();
        Laki = new javax.swing.JRadioButton();
        Perempuan = new javax.swing.JRadioButton();
        alamat = new javax.swing.JLabel();
        Alamat = new javax.swing.JTextField();
        Send = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setText("Biodata");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 10, 80, 20);

        nama.setText("Nama");
        jPanel1.add(nama);
        nama.setBounds(20, 30, 70, 30);

        absen.setText("Absen");
        jPanel1.add(absen);
        absen.setBounds(20, 110, 70, 30);

        kelas.setText("Kelas");
        jPanel1.add(kelas);
        kelas.setBounds(20, 70, 60, 30);

        kelamin.setText("Jenis Kelamin");
        jPanel1.add(kelamin);
        kelamin.setBounds(20, 150, 90, 30);
        jPanel1.add(Nama);
        Nama.setBounds(120, 30, 230, 30);
        jPanel1.add(Absen);
        Absen.setBounds(120, 110, 230, 30);

        Kelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XI RPL 1", "XI RPL 2", "XI RPL 3", "XI RPL 4", "XI RPL 5", "XI RPL 6", "XI TKJ 1", "XI TKJ 2", "XI TKJ 3", "XI TKJ 4", "XI TKJ 5" }));
        Kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KelasActionPerformed(evt);
            }
        });
        jPanel1.add(Kelas);
        Kelas.setBounds(120, 70, 230, 30);

        Laki.setText("Laki - Laki");
        jPanel1.add(Laki);
        Laki.setBounds(120, 150, 80, 30);

        Perempuan.setText("Perempuan");
        jPanel1.add(Perempuan);
        Perempuan.setBounds(239, 150, 90, 30);

        alamat.setText("Alamat");
        jPanel1.add(alamat);
        alamat.setBounds(20, 190, 70, 30);
        jPanel1.add(Alamat);
        Alamat.setBounds(120, 190, 230, 30);

        Send.setText("Send");
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });
        jPanel1.add(Send);
        Send.setBounds(70, 250, 57, 23);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(270, 250, 51, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\wallpaper android\\scale.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(360, 0, 220, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KelasActionPerformed

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
    String nama = Nama.getText();
    String kelas = Kelas.getSelectedItem().toString();
    String absen = Absen.getText();
    String kelamin;
    String alamat = Alamat.getText();
    //untuk kelamin
    if (Laki.isSelected())
        kelamin = "Laki - Laki";
    else if (Perempuan.isSelected())
        kelamin = "Perempuan";
    else
        kelamin = " ";
    //untuk kelas
    if (Kelas.getSelectedItem()=="XI RPL 1"){
    }
    if (Kelas.getSelectedItem()=="XI RPL 2"){
    }
    if (Kelas.getSelectedItem()=="XI RPL 3"){
    }
    if (Kelas.getSelectedItem()=="XI RPL 4"){
    }
    if (Kelas.getSelectedItem()=="XI RPL 5"){
    }
    if (Kelas.getSelectedItem()=="XI RPL 6"){
    }
    if (Kelas.getSelectedItem()=="XI TKJ 1"){
    }
    if (Kelas.getSelectedItem()=="XI TKJ 2"){
    }
    if (Kelas.getSelectedItem()=="XI TKJ 3"){
    }
    if (Kelas.getSelectedItem()=="XI TKJ 4"){
    }
    if (Kelas.getSelectedItem()=="XI TKJ 5"){
    }
    
    new FormModul7_2(nama, kelas, absen, kelamin, alamat).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_SendActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(FormModul7_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormModul7_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormModul7_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormModul7_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormModul7_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JTextField Alamat;
    private javax.swing.JButton Exit;
    private javax.swing.JComboBox<String> Kelas;
    private javax.swing.JRadioButton Laki;
    private javax.swing.JTextField Nama;
    private javax.swing.JRadioButton Perempuan;
    private javax.swing.JButton Send;
    private javax.swing.JLabel absen;
    private javax.swing.JLabel alamat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kelamin;
    private javax.swing.JLabel kelas;
    private javax.swing.JLabel nama;
    // End of variables declaration//GEN-END:variables
}