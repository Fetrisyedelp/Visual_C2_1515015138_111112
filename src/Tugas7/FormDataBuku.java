package Tugas7;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Asus
 */
public class FormDataBuku extends javax.swing.JFrame {

    private DefaultTableModel model;//untuk membuat model pada tabel
    private Connection con = koneksi.getConnection();//untuk mengambil koneksi
    private Statement stt;//untuk eksekusi query database
    private ResultSet rss;//untuk penampung data dari database
    
    /**
     * Creates new form FormDataBuku
     */
    public FormDataBuku() {
        initComponents();
    }
    
 private void InitTable(){
        model = new DefaultTableModel();//membuat table dengan variabel model
        model.addColumn("ID BUKU");
        model.addColumn("JUDUL");//menambah kolom dengan nama JUDUL
        model.addColumn("PENULIS");//menambah kolom dengan nama PENULIS
        model.addColumn("HARGA");//menambah kolom dengan nama HARGA
        TableBuku.setModel(model);//mengatur table buku
    }
    
    private void TampilData(){//method untuk menampilkan data dimana dalam method ini menggunakan Exception
        try{//try digunakan untuk mencoba mengeksekusi program dalam try
            String sql = "SELECT * FROM buku";//mendeklarasikan variabel sql bertipedata string yg memanggil isi dari tabel buku dari database menggunakan query tersebut
            stt = con.createStatement();//membuat statement koneksi
            rss = stt.executeQuery(sql);//mengeksekusi query sql yang akan diletakkan dalam penampung database bernama rss
            while(rss.next()){//melakukan perulangan
                Object[] o = new Object[4];//membuat objek baru dengan nama o yang menampung 4 elemen
                o[0] = rss.getString("id");
                o[1] = rss.getString("judul");//index pertama[0] dari rss (penampung database) dengan nama judul
                o[2] = rss.getString("penulis");//index kedua[1] dari rss (penampung database) dengan nama penulis
                o[3] = rss.getInt("harga");//index ketiga[2] dari rss (penampung database) dengan nama harga
                model.addRow(o);
            }
        }catch(SQLException e){//catch digunakan saat program tidak dapat mengeksekusi try, maka dilakukan Exception untuk mengatasi error
            System.out.println(e.getMessage());//ketika error maka exception handler akan menampilkan pesan
        }
    }
    
     private boolean validasi(String Judul, String Penulis){//method validasi yang memiliki parameter judul bertipedata string dan penulis bertipedata string
        try{//try digunakan untuk mencoba mengeksekusi program dalam try
            stt=con.createStatement();//membuat statement koneksi
            String sql = "Select * from buku where judul='"+Judul+"' and Penulis='"+Penulis+"';";//mendeklarasikan variabel sql bertipedata string yg memanggil field judul dan penulis dari table buku
            rss=stt.executeQuery(sql);//mengeksekusi query sql yang akan diletakkan dalam penampung database bernama rss
            if (rss.next())//melakukan perulangan dengan kondisi jika rss (penampung database) masih
                return true;//mengembalikan nilai kembalian true jika kondisi if terpenuhi
            else
                return false;//mengembalikan nilai kembalian false jika kondisi if terpenuhi
        }
        catch(SQLException e){//catch digunakan saat program tidak dapat mengeksekusi try, maka dilakukan Exception untuk mengatasi error
            System.out.printf(e.getMessage());//ketika error maka exception handler akan menampilkan pesan
            return false;
        }
    }
     
    private void TambahData(String judul, String penulis, String harga){//method TambahData dengan parameter judul,penulis dan harga bertipedata string
        try{//try digunakan untuk mencoba mengeksekusi program dalam try
            String sql ="INSERT INTO buku VALUES (NULL,'"+judul+"','"+penulis+"',"+harga+")";//mendeklarasikan variabel sql dengan tipe data string yang digunakan untuk memasukkan nilai ke dalam field judul, penulis dan harga
            stt = con.createStatement();//membuat statement koneksi
            stt.executeUpdate(sql);//mengeksekusi query database dengan mengeksekusi
            model.addRow(new Object[]{judul,penulis,harga});//menambahkan data kedalam field judul, penulis dan harga
        }
        catch(SQLException e){//catch digunakan saat program tidak dapat mengeksekusi try, maka dilakukan Exception untuk mengatasi error
            System.out.println(e.getMessage());//ketika error maka exception handler akan menampilkan pesan
        }
    }

    public boolean UbahData(String id, String judul, String penulis, String harga){//method UbahData yang mempunyai parameter id, judul, penulis, dan harga yang semua bertipe data string
        try{//try digunakan untuk mencoba mengeksekusi program dalam try
            String sql = "UPDATE buku set judul='"+judul//mendeklarasikan variabel sql dengan tipe data string yang menjalankan kueri update untuk field judul, penulis, dan harga dari table buku
                    +"', penulis='"+penulis+"', harga="+harga
                    +" WHERE id="+id+";";
            stt = con.createStatement();//membuat statement koneksi
            stt.executeUpdate(sql);//mengeksekusi query database dengan mengeksekusi
            return true;//menghasilkan nilai kembalian
        }catch(SQLException e){//catch digunakan saat program tidak dapat mengeksekusi try, maka dilakukan Exception untuk mengatasi error
            System.out.println(e.getMessage());//ketika error maka exception handler akan menampilkan pesan
            return false;//tidak memberikan nilai kembalian
        }
    }
    
    public boolean HapusData(String id){//mendeklarasikan method HapusData bertipedata boolean dengan parameter id bertipedata string
        try{//try digunakan untuk mencoba mengeksekusi program dalam try
            String sql = "DELETE FROM buku WHERE id="+id+";";//mendeklarasikan variabel sql dengan tipe data string yang menjalankan kueri menghapus data dari table buku
            stt = con.createStatement();//membuat statement koneksi
            stt.executeUpdate(sql);//mengeksekusi query database dengan mengeksekusi
            return true;//menghasilkan nilai kembalian
        }catch(SQLException e){//catch digunakan saat program tidak dapat mengeksekusi try, maka dilakukan Exception untuk mengatasi error
            System.out.println(e.getMessage());//ketika error maka exception handler akan menampilkan pesan
            return false;//tidak memberikan nilai kembalian
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        LblJudul = new javax.swing.JLabel();
        TfJudul = new javax.swing.JTextField();
        LblPenulis = new javax.swing.JLabel();
        CmbPenulis = new javax.swing.JComboBox();
        LblHarga = new javax.swing.JLabel();
        TfHarga = new javax.swing.JTextField();
        BtnSimpan = new javax.swing.JButton();
        BtnKeluar = new javax.swing.JButton();
        BtnUbah = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBuku = new javax.swing.JTable();
        LblSearch = new javax.swing.JLabel();
        TfSearch = new javax.swing.JTextField();
        LblBy = new javax.swing.JLabel();
        CmbSearch = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Form Data Buku");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));

        LblJudul.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LblJudul.setForeground(new java.awt.Color(255, 255, 255));
        LblJudul.setText("Judul");

        LblPenulis.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LblPenulis.setForeground(new java.awt.Color(255, 255, 255));
        LblPenulis.setText("Penulis");

        CmbPenulis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tere Liye", "W.S Rendra", "Felix Slauw", "Asma Nadia", "Dewi Lestari" }));

        LblHarga.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LblHarga.setForeground(new java.awt.Color(255, 255, 255));
        LblHarga.setText("Harga");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblJudul)
                    .addComponent(LblPenulis)
                    .addComponent(LblHarga))
                .addGap(70, 70, 70)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TfJudul)
                    .addComponent(CmbPenulis, 0, 260, Short.MAX_VALUE)
                    .addComponent(TfHarga))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblJudul)
                    .addComponent(TfJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblPenulis)
                    .addComponent(CmbPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblHarga)
                    .addComponent(TfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        BtnKeluar.setText("Keluar");

        BtnUbah.setText("Ubah");
        BtnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUbahActionPerformed(evt);
            }
        });

        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        TableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "JUDUL", "PENULIS", "HARGA"
            }
        ));
        TableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableBuku);

        LblSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LblSearch.setText("Search:");

        TfSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TfSearchCaretUpdate(evt);
            }
        });
        TfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfSearchActionPerformed(evt);
            }
        });

        LblBy.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        LblBy.setText("By:");

        CmbSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Judul", "Penulis", "Harga" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(LblSearch)
                                .addGap(18, 18, 18)
                                .addComponent(TfSearch))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LblBy)
                                .addGap(18, 18, 18)
                                .addComponent(CmbSearch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSearch)
                    .addComponent(TfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblBy)
                    .addComponent(CmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        String judul = TfJudul.getText();//variabel judul dengan tipe data string yang nilainya diambil dari textfield judul (TfJudul)
        String penulis = CmbPenulis.getSelectedItem().toString();//variabel penulis dengan tipe data string yang nilainya diambil dari combobox penulis (CmbPenulis)
        String harga = TfHarga.getText();//variabel harga dengan tipe data string yang nilainya diambil dari textfield harga (TfHarga)
        if(validasi (judul, penulis)){//pengkondisian method validasi dengan judul dan penulis sebagai parameter
            JOptionPane.showMessageDialog(null, "Data sudah ada");//penggunaan JOptionPane dimana jika pengkondisian if terpenuhi maka akan menampilkan peringatan "Data Sudah Ada"
        }
        else//jika pengkondisian dalam if tidak terpenuhi maka
        {
        TambahData(judul, penulis, harga);//penambahan data pada judul, penulis, dan harga
        InitTable();TampilData();//memanggil method InitTable dan method TampilData
        JOptionPane.showMessageDialog(null, "Berhasil Simpan Data");//penggunaan JOptionPane dimana jika pengkondisian if tidak terpenuhi maka akan menampilkan peringatan "Berhasil Simpan Data"
        }
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        // TODO add your handling code here:
        int baris = TableBuku.getSelectedRow();//mendeklarasikan isi dari variabel baris adalah baris yang terpilih dari table buku
        String id = TableBuku.getValueAt(baris, 0).toString();
        if(HapusData(id))//menjankan pengkondisian jika id terhapus 
            JOptionPane.showMessageDialog(null, "Berhasil Hapus Data");//maka akan menampilkan pesan JOptionPane "Berhasil Hapus Data"
        else//jika kondisi if tidak terpenuhi 
            JOptionPane.showConfirmDialog(null, "Gagal Hapus Data");//maka akan menampilkan pesan konfirmasi JOptionPane "Gagal Hapus Data"
        model.removeRow(baris);//menghapus isi baris terpilih
        InitTable();TampilData();//memanggil dan menjalankan method InitTable dan TampilData
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void TfSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TfSearchCaretUpdate
        // TODO add your handling code here:
    InitTable();//memanggil dan menjalankan method InitTable
    if(TfSearch.getText().length()==0){//pengkondisian dimana jika panjang inputan dalam TfSearch maka
        TampilData();//memanggil dan menjalankan method TampilData yang berguna untuk menampilkan data
    }else{//jika pengkondisian dalam if tidak terpenuhi maka
        PencarianData(CmbSearch.getSelectedItem().toString(),TfSearch.getText());//memanggil dan menjalankan method PencarianData
    }
//        model.getDataVector().removeAllElements();//mengambambil data dan menghapus elemen data
//        model.fireTableDataChanged();//mengubah isi table
//        String search = CmbSearch.getSelectedItem().toString();//mendeklarasikan variable search dengan isi adalah item terpilih dari CmbSearch
//        if (TfSearch.getText().length()>0){//melakukan perulangan dengan kondisi jika panjang isi dari textfield Search(TfSearch) lebih dari 0 maka di lakukan
//            try {//try digunakan untuk mencoba mengeksekusi program dalam try
//                String sql = "select *from buku where "+search+" like '%"+TfSearch.getText()+"%'";//mendeklarasikan variabel sql dengan tipe data string yang memanggil semua field dari table buku yang mempunyai element seperti yang inputkan
//                stt = con. createStatement();//membuat statement koneksi
//                rss = stt. executeQuery(sql);//mengeksekusi query database dengan mengeksekusi
//                ResultSet rss=stt.executeQuery(sql);//mengatur isi dari variabel ResultSet adalah hasil eksekusi query
//                while (rss.next()){//melakukan perulangan
//                    Object[] o=new Object[3];//membuat array baru dengan nama o yang menampung 3 index
//                    o[0]=rss.getString("JUDUL");//index pertama[0] dari rss (penampung database) dengan nama judul
//                    o[1]=rss.getString("PENULIS");//index kedua[1] dari rss (penampung database) dengan nama penulis
//                    o[2]=rss.getString("HARGA");//index ketiga[2] dari rss (penampung database) dengan nama harga
//                    model.addRow(o);
//                }
//                stt.close();//menutup stt(eksekusi query database)
//                rss.close();//menutup rss(penampung database)
//            }
//            catch(SQLException e){//catch digunakan saat program tidak dapat mengeksekusi try, maka dilakukan Exception untuk mengatasi error
//                System.out.println("Terjadi kesalahan");//ketika error maka exception handler akan menampilkan pesan
//            }
//        }
    }//GEN-LAST:event_TfSearchCaretUpdate

    private void TfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfSearchActionPerformed

    private void TableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableBukuMouseClicked
        // TODO add your handling code here:
    int baris = TableBuku.getSelectedRow();//mendeklarasikan variabel baris dengan tipe data string yang berisi baris yang terpilih dalam table buku
    TfJudul.setText(TableBuku.getValueAt(baris, 1).toString());//mengatur isi dari TfJudul adalah nilai dari index 1 dari table buku
    CmbPenulis.setSelectedItem(TableBuku.getValueAt(baris, 2).toString());//mengatur isi dari CmbPenulis adalah nilai dari index 2 dari table buku
    TfHarga.setText(TableBuku.getValueAt(baris, 3).toString());//mengatur isi dari TfHarga adalah nilai dari index 3 dari table buku
    }//GEN-LAST:event_TableBukuMouseClicked

    private void BtnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUbahActionPerformed
        // TODO add your handling code here:
    int baris = TableBuku.getSelectedRow();//mendeklarasikan variabel baris bertipedata integer yang berisi baris yang terpilih dalam table buku
    String id = TableBuku.getValueAt(baris, 0).toString();//mendeklarasikan variabel id bertipedata string yang berisi nilai dari index 0
    String judul = TfJudul.getText();//mendeklarasikan variabel judul bertipedata string yang berisi nilai dari TfJudul
    String penulis = CmbPenulis.getSelectedItem().toString();//mendeklarasikan variabel penulis bertipedata string yang berisi item yang terpilih dari CmbPenulis
    String harga = TfHarga.getText();//menndeklarasikan vriabel harga bertipedata string yang berisi nilai dari TfHarga
    if(UbahData(id, judul, penulis, harga))//menjalankan pengkondisian method UbahData dengan parameter id, judul, penulis dan harga
        JOptionPane.showMessageDialog(null, "Berhasil Ubah Data");//menjalankan JOptionPane dimana jika pengkondisian if terpenuhi maka akan tampil pesan "Berhasil Ubah Data"
    else//jika pengkodisian dalam if tidak terpenuhi maka
        JOptionPane.showConfirmDialog(null, "Gagal Ubah Data");//menjalankan JOptionPane yang menampilkan pesan konfirmasi "Gagal Ubah Data"
    InitTable();TampilData();//memanggil dan menampilkan method InitTable dan TampilData
    }//GEN-LAST:event_BtnUbahActionPerformed

    private void PencarianData(String by, String cari){//mendeklarasikan method PencarianData dengan parameter by dan cari yang bertipedata string
        try{//try digunakan untuk mencoba mengeksekusi program dalam try
            String sql = "SELECT * FROM buku WHERE "+by+" LIKE '%"+cari+"%';";//mendeklarasikan variabel sql dengan tipe data string yang  menjalankan kueri menampilkan semua field table buku yang isinya mirip seperti inputan
            stt = con.createStatement();//membuat statement koneksi
            rss = stt.executeQuery(sql);//mengeksekusi query database dengan mengeksekusi kueri
            while(rss.next()){//pengkodisian
                Object[] data = new Object[4];//membuat objek baru dengan nama o yang menampung 4 elemen
                data[0] = rss.getString("id");//menampilkan data dari index 0 dengan nama id
                data[1] = rss.getString("judul");//menampilkan data dari index 1 dengan nama judul
                data[2] = rss.getString("penulis");//menampilkan data dari index 2 dengan nama penulis
                data[3] = rss.getInt("harga");//menampilkan data dari index 3 dengan nama harga
                model.addRow(data);    
            }
        }catch(Exception e){//jika pengkodisian dala if tidak terpenuhi maka menjalakan Exception untuk menangani error yang terjadi
            System.out.println(e.getMessage());//dengan menampilkan pesan
        }
    }
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
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnKeluar;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JButton BtnUbah;
    private javax.swing.JComboBox CmbPenulis;
    private javax.swing.JComboBox CmbSearch;
    private javax.swing.JLabel LblBy;
    private javax.swing.JLabel LblHarga;
    private javax.swing.JLabel LblJudul;
    private javax.swing.JLabel LblPenulis;
    private javax.swing.JLabel LblSearch;
    private javax.swing.JTable TableBuku;
    private javax.swing.JTextField TfHarga;
    private javax.swing.JTextField TfJudul;
    private javax.swing.JTextField TfSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

//    private void TambahData(String judul, String penulis, String harga) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
