package Tugas2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class inputktp extends javax.swing.JFrame {

    /**
     * Creates new form FormKTP
     */
    public inputktp() {
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LblNama = new javax.swing.JLabel();
        TfNama = new javax.swing.JTextField();
        LblTTL = new javax.swing.JLabel();
        TfTmpt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TfTl = new javax.swing.JTextField();
        LblJk = new javax.swing.JLabel();
        RbLk = new javax.swing.JRadioButton();
        RbPr = new javax.swing.JRadioButton();
        LblAlamat = new javax.swing.JLabel();
        TfAlamat = new javax.swing.JTextField();
        LblRt = new javax.swing.JLabel();
        TfRt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TfRw = new javax.swing.JTextField();
        LblKel = new javax.swing.JLabel();
        TfKel = new javax.swing.JTextField();
        LblKec = new javax.swing.JLabel();
        TfKec = new javax.swing.JTextField();
        LblKota = new javax.swing.JLabel();
        TfKota = new javax.swing.JTextField();
        LblAgama = new javax.swing.JLabel();
        CbAgama = new javax.swing.JComboBox();
        LblStatus = new javax.swing.JLabel();
        CbStatus = new javax.swing.JComboBox();
        LblGoldar = new javax.swing.JLabel();
        CbGoldar = new javax.swing.JComboBox();
        LblPkrj = new javax.swing.JLabel();
        TfPkrj = new javax.swing.JTextField();
        LblKwrg = new javax.swing.JLabel();
        RbWna = new javax.swing.JRadioButton();
        RbWni = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        BRegister = new javax.swing.JButton();
        BReset = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("FORM ISIAN");

        LblNama.setText("Nama");

        LblTTL.setText("Tempat/Tanggal Lahir");

        jLabel5.setText("/");

        LblJk.setText("Jenis Kelamin");

        buttonGroup1.add(RbLk);
        RbLk.setText("Laki-laki");

        buttonGroup1.add(RbPr);
        RbPr.setText("Perempuan");

        LblAlamat.setText("Alamat");

        LblRt.setText("RT/RW");

        jLabel9.setText("/");

        LblKel.setText("Kel/Desa");

        LblKec.setText("Kecamatan");

        LblKota.setText("Kota");

        LblAgama.setText("Agama");

        CbAgama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ISLAM", "KRISTEN", "BUDHA", "HINDU", "KONGHUCHU" }));
        CbAgama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbAgamaMouseClicked(evt);
            }
        });

        LblStatus.setText("Status");

        CbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KAWIN", "BELUM KAWIN" }));
        CbStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbStatusMouseClicked(evt);
            }
        });

        LblGoldar.setText("Golongan Darah");

        CbGoldar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "O", "AB" }));
        CbGoldar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbGoldarMouseClicked(evt);
            }
        });

        LblPkrj.setText("Pekerjaan");

        LblKwrg.setText("Kewarganegaraan");

        buttonGroup2.add(RbWna);
        RbWna.setText("WNA");

        buttonGroup2.add(RbWni);
        RbWni.setText("WNI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(294, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(294, 294, 294))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblNama)
                    .addComponent(LblTTL)
                    .addComponent(LblAlamat)
                    .addComponent(LblJk)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblKota)
                            .addComponent(LblKec)
                            .addComponent(LblKel)
                            .addComponent(LblRt)))
                    .addComponent(LblAgama)
                    .addComponent(LblStatus)
                    .addComponent(LblGoldar)
                    .addComponent(LblPkrj)
                    .addComponent(LblKwrg))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CbGoldar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(RbLk)
                            .addGap(18, 18, 18)
                            .addComponent(RbPr))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(TfTmpt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TfTl))
                        .addComponent(TfAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(TfRt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TfRw, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(TfKel)
                        .addComponent(TfKec)
                        .addComponent(TfKota)
                        .addComponent(TfPkrj)
                        .addComponent(TfNama))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RbWna)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RbWni)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNama)
                    .addComponent(TfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTTL)
                    .addComponent(TfTmpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TfTl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblJk)
                    .addComponent(RbLk)
                    .addComponent(RbPr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblAlamat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfRt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(TfRw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblRt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfKel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblKel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblKec)
                    .addComponent(TfKec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblKota)
                    .addComponent(TfKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblAgama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbGoldar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblGoldar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfPkrj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPkrj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblKwrg)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RbWna)
                        .addComponent(RbWni)))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("FORM KARTU TANDA PENDUDUK");

        BRegister.setText("Register");
        BRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegisterActionPerformed(evt);
            }
        });

        BReset.setText("Reset");
        BReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 182, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(190, 190, 190))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BRegister)
                                .addGap(22, 22, 22))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BRegister)
                    .addComponent(BReset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbAgamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbAgamaMouseClicked
        // TODO add your handling code here:
    CbAgama.getSelectedItem();
    }//GEN-LAST:event_CbAgamaMouseClicked

    private void CbStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbStatusMouseClicked
        // TODO add your handling code here:
    CbStatus.getSelectedItem();
    }//GEN-LAST:event_CbStatusMouseClicked

    private void CbGoldarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbGoldarMouseClicked
        // TODO add your handling code here:
    CbGoldar.getSelectedItem();
    }//GEN-LAST:event_CbGoldarMouseClicked

    private void BResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResetActionPerformed
        // TODO add your handling code here:
    TfNama.setText("");
    TfTmpt.setText("");
    TfTl.setText("");
    buttonGroup1.clearSelection();
    TfAlamat.setText("");
    TfRt.setText("");
    TfRw.setText("");
    TfKel.setText("");
    TfKec.setText("");
    TfKota.setText("");
    TfPkrj.setText("");
    buttonGroup2.clearSelection();
    CbAgama.setSelectedItem(null);
    CbStatus.setSelectedItem(null);
    CbGoldar.setSelectedItem(null);
    }//GEN-LAST:event_BResetActionPerformed

    private void BRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegisterActionPerformed
        // TODO add your handling code here:
    String Nama, TTL1, TTL2, JK=null, Alamat, RT, RW, Kel, Kec, Kota, Agama, Status, Goldar, Pkrj;
    Nama = TfNama.getText();
    TTL1 = TfTmpt.getText();
    TTL2 = TfTl.getText();
        if (RbLk.isSelected())
        {JK = RbPr.getText();}
        else if (RbPr.isSelected())
        {JK = RbPr.getText();}
    Alamat = TfAlamat.getText();
    RT = TfRt.getText();
    RW = TfRw.getText();
    Kel = TfKel.getText();
    Kec = TfKec.getText();
    Kota = TfKota.getText();
    Agama = CbAgama.getSelectedItem().toString();
    Status = CbStatus.getSelectedItem().toString();
    Goldar = CbGoldar.getSelectedItem().toString();
    Pkrj = TfPkrj.getText();
    String Kwrg=null;
        if (RbWna.isSelected())
        {Kwrg = RbWni.getText();}
        else if (RbWni.isSelected())
        {Kwrg = RbWna.getText();}
        
    outputktp x=new outputktp(Nama, TTL1, TTL2, JK, Alamat, RT, RW, Kel, Kec, Kota, Agama, Status, Goldar, Pkrj, Kwrg);
    x.setVisible(true);
    }//GEN-LAST:event_BRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(FormKTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputktp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BRegister;
    private javax.swing.JButton BReset;
    private javax.swing.JComboBox CbAgama;
    private javax.swing.JComboBox CbGoldar;
    private javax.swing.JComboBox CbStatus;
    private javax.swing.JLabel LblAgama;
    private javax.swing.JLabel LblAlamat;
    private javax.swing.JLabel LblGoldar;
    private javax.swing.JLabel LblJk;
    private javax.swing.JLabel LblKec;
    private javax.swing.JLabel LblKel;
    private javax.swing.JLabel LblKota;
    private javax.swing.JLabel LblKwrg;
    private javax.swing.JLabel LblNama;
    private javax.swing.JLabel LblPkrj;
    private javax.swing.JLabel LblRt;
    private javax.swing.JLabel LblStatus;
    private javax.swing.JLabel LblTTL;
    private javax.swing.JRadioButton RbLk;
    private javax.swing.JRadioButton RbPr;
    private javax.swing.JRadioButton RbWna;
    private javax.swing.JRadioButton RbWni;
    private javax.swing.JTextField TfAlamat;
    private javax.swing.JTextField TfKec;
    private javax.swing.JTextField TfKel;
    private javax.swing.JTextField TfKota;
    private javax.swing.JTextField TfNama;
    private javax.swing.JTextField TfPkrj;
    private javax.swing.JTextField TfRt;
    private javax.swing.JTextField TfRw;
    private javax.swing.JTextField TfTl;
    private javax.swing.JTextField TfTmpt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}