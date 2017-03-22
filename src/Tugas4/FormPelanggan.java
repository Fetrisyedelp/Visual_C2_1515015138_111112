/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

import java.awt.Color;

/**
 *
 * @author Asus
 */
public class FormPelanggan extends javax.swing.JFrame {

    /**
     * Creates new form FormPelanggan
     */
    public FormPelanggan() {
        initComponents();
    }

    /**
     * Changed
     * ActionPerformance
     * MouseEntered
     * MouseExited
     * MouseClicked
     * WindowOpened
     * CaratUpdate
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LblForm = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LblNama = new javax.swing.JLabel();
        TfNama = new javax.swing.JTextField();
        LblNoHp = new javax.swing.JLabel();
        TfNoHp = new javax.swing.JTextField();
        LblBrt = new javax.swing.JLabel();
        TfBrt = new javax.swing.JTextField();
        LblKg = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        LblDiskon = new javax.swing.JLabel();
        SliderDiskon = new javax.swing.JSlider();
        LblJasa = new javax.swing.JLabel();
        RbReguler = new javax.swing.JRadioButton();
        RbExpress = new javax.swing.JRadioButton();
        LblHarga = new javax.swing.JLabel();
        TfHarga = new javax.swing.JTextField();
        LblDis = new javax.swing.JLabel();
        BtnProses = new javax.swing.JToggleButton();
        BtnUlang = new javax.swing.JToggleButton();
        BtnKeluar = new javax.swing.JToggleButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        LblForm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblForm.setText("Form Pelanggan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblForm)
                .addGap(196, 196, 196))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblForm)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));

        LblNama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblNama.setText("Nama");

        TfNama.setText("Masukkan Nama Anda");
        TfNama.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TfNamaCaretUpdate(evt);
            }
        });
        TfNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TfNamaMouseClicked(evt);
            }
        });
        TfNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNamaActionPerformed(evt);
            }
        });

        LblNoHp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblNoHp.setText("No. Telepon");

        TfNoHp.setText("Masukkan No Telp Anda");
        TfNoHp.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TfNoHpCaretUpdate(evt);
            }
        });
        TfNoHp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TfNoHpMouseClicked(evt);
            }
        });

        LblBrt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblBrt.setText("Berat Barang");

        TfBrt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TfBrtCaretUpdate(evt);
            }
        });

        LblKg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblKg.setText("kg");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TfNama)
                    .addComponent(TfNoHp)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblNama)
                            .addComponent(LblNoHp)
                            .addComponent(LblBrt)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(TfBrt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblKg)))
                        .addGap(0, 140, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblNoHp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TfNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblBrt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfBrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblKg))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));

        LblDiskon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblDiskon.setText("Atur Diskon");

        SliderDiskon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderDiskonStateChanged(evt);
            }
        });

        LblJasa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblJasa.setText("Jenis Jasa");

        buttonGroup1.add(RbReguler);
        RbReguler.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RbReguler.setText("Reguler");
        RbReguler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbRegulerActionPerformed(evt);
            }
        });

        buttonGroup1.add(RbExpress);
        RbExpress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RbExpress.setText("Express");

        LblHarga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblHarga.setText("Total Harga");

        LblDis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblDis.setText("50%");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(RbReguler, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RbExpress, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblDiskon)
                    .addComponent(LblJasa)
                    .addComponent(LblHarga)
                    .addComponent(TfHarga)
                    .addComponent(SliderDiskon, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblDis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblDiskon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SliderDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblDis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblJasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbReguler)
                    .addComponent(RbExpress))
                .addGap(18, 18, 18)
                .addComponent(LblHarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        BtnProses.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnProses.setText("Proses");
        BtnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProsesActionPerformed(evt);
            }
        });

        BtnUlang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnUlang.setText("Ulang");
        BtnUlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUlangActionPerformed(evt);
            }
        });

        BtnKeluar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnKeluar.setText("Keluar");
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnProses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnUlang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnKeluar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnProses)
                    .addComponent(BtnUlang)
                    .addComponent(BtnKeluar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SliderDiskonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderDiskonStateChanged
        // TODO add your handling code here:
    LblDis.setText(String.valueOf(SliderDiskon.getValue())+"%");
    }//GEN-LAST:event_SliderDiskonStateChanged

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        // TODO add your handling code here:
    System.exit(0);
    }//GEN-LAST:event_BtnKeluarActionPerformed

    private void RbRegulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbRegulerActionPerformed
        // TODO add your handling code here:
    String Jasa = null;
    if(RbReguler.isSelected())
        Jasa = RbReguler.getText();
    else if(RbExpress.isSelected())
        Jasa = RbExpress.getText();
    }//GEN-LAST:event_RbRegulerActionPerformed

    private void TfNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNamaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    TfNama.setText("");
    TfNoHp.setText("");
    }//GEN-LAST:event_formWindowOpened

    private void TfNamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TfNamaMouseClicked
        // TODO add your handling code here:
    TfNama.setText("");
    }//GEN-LAST:event_TfNamaMouseClicked

    private void TfNoHpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TfNoHpMouseClicked
        // TODO add your handling code here:
    TfNoHp.setText("");
    }//GEN-LAST:event_TfNoHpMouseClicked

    private void BtnUlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUlangActionPerformed
        // TODO add your handling code here:
    TfNama.setText("");
    TfNoHp.setText("");
    TfBrt.setText("");
    SliderDiskon.setValue(50);
    buttonGroup1.clearSelection();
    TfHarga.setText("");
    }//GEN-LAST:event_BtnUlangActionPerformed

    private void TfNamaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TfNamaCaretUpdate
        // TODO add your handling code here:
    if(TfNama.getText().length()!=0 && TfNoHp.getText().length()!=0 && TfBrt.getText().length() !=0) {
        BtnProses.setEnabled(true);}
    else{
            
            BtnProses.setEnabled(false);}
    }//GEN-LAST:event_TfNamaCaretUpdate

    private void TfBrtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TfBrtCaretUpdate
        // TODO add your handling code here:
     if (TfNama.getText().length() !=0 && TfNoHp.getText().length() !=0 && TfBrt.getText().length() !=0 && !TfBrt.getText().matches("[0]")){
           BtnProses.setEnabled(true);}
        else{
            
            BtnProses.setEnabled(false);}
    }//GEN-LAST:event_TfBrtCaretUpdate

    private void TfNoHpCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TfNoHpCaretUpdate
        // TODO add your handling code here:
    if (TfNama.getText().length() !=0 && TfNoHp.getText().length() !=0 && TfBrt.getText().length() !=0){
           BtnProses.setEnabled(true);}
        else{
            
            BtnProses.setEnabled(false);}
    }//GEN-LAST:event_TfNoHpCaretUpdate
    
    String jasa;
    Float Diskon,Total, Harga;
    private void BtnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProsesActionPerformed
        // TODO add your handling code here:
    {
        if (RbReguler.isSelected())
        {jasa = RbReguler.getText();}
        else if (RbExpress.isSelected())
        {jasa = RbExpress.getText();}
    }
    {
        if (RbReguler.isSelected()){
            Diskon = Float.valueOf(SliderDiskon.getValue());
            Total = 11500*(Float.valueOf(TfBrt.getText()))-((Diskon/100)*11500);
            Harga = Total;
          
        }
        else if (RbExpress.isSelected()){
            Diskon = Float.valueOf(SliderDiskon.getValue());
            Total = 11500*(Float.valueOf(TfBrt.getText()))-((Diskon/100)*11500);
            Harga = 1.5f*Total;
        }
        
        TfHarga.setText("Rp "+Harga);
    }
    }//GEN-LAST:event_BtnProsesActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
    
    }//GEN-LAST:event_formMouseEntered

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
    BtnProses.setBackground(Color.cyan);
    BtnProses.setForeground(Color.DARK_GRAY);
    
    BtnUlang.setBackground(Color.cyan);
    BtnUlang.setForeground(Color.DARK_GRAY);
    
    BtnKeluar.setBackground(Color.cyan);
    BtnKeluar.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
    BtnProses.setBackground(Color.gray);
    BtnProses.setForeground(Color.BLACK);
    
    BtnUlang.setBackground(Color.gray);
    BtnUlang.setForeground(Color.BLACK);
    
    BtnKeluar.setBackground(Color.gray);
    BtnKeluar.setForeground(Color.BLACK);
    }//GEN-LAST:event_formMouseExited

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
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnKeluar;
    private javax.swing.JToggleButton BtnProses;
    private javax.swing.JToggleButton BtnUlang;
    private javax.swing.JLabel LblBrt;
    private javax.swing.JLabel LblDis;
    private javax.swing.JLabel LblDiskon;
    private javax.swing.JLabel LblForm;
    private javax.swing.JLabel LblHarga;
    private javax.swing.JLabel LblJasa;
    private javax.swing.JLabel LblKg;
    private javax.swing.JLabel LblNama;
    private javax.swing.JLabel LblNoHp;
    private javax.swing.JRadioButton RbExpress;
    private javax.swing.JRadioButton RbReguler;
    private javax.swing.JSlider SliderDiskon;
    private javax.swing.JTextField TfBrt;
    private javax.swing.JTextField TfHarga;
    private javax.swing.JTextField TfNama;
    private javax.swing.JTextField TfNoHp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
