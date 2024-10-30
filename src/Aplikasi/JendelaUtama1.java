package Aplikasi;

import app.db.Mahasiswa;
import app.db.MahasiswaManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class JendelaUtama1 extends javax.swing.JFrame {

   List<Mahasiswa> mahasiswa = new ArrayList<>();
    int currentRow = 0;
//Constructor
    public JendelaUtama1() {
        String lookAndFeel = javax.swing.UIManager.getSystemLookAndFeelClassName();
            try {
                javax.swing.UIManager.setLookAndFeel(lookAndFeel);
            } catch (Exception e) {
            }
       
            initComponents();
                loadData();
                bindData();

                txtNoBP.setEditable(false);
                txtNama.setEditable(false);
                txtTmpLahir.setEditable(false);
                txtTglLahir.setEditable(false);
                txtAlamat.setEditable(false);
                txtPhone.setEditable(false);
                txtAsalSekolah.setEditable(false);
            
            
    }
    private void loadData() {
        MahasiswaManager mhsmgr = new MahasiswaManager();
        mahasiswa = mhsmgr.getMahasiswa();
        mhsmgr.closeConnection();
    }
     private void bindData() {
        if (mahasiswa.size()>0) {
            Mahasiswa m = mahasiswa.get(currentRow);
            txtNoBP.setText(m.getnobp());
            txtNama.setText(m.getnama());
            txtTmpLahir.setText(m.gettmplahir());
            txtTglLahir.setText(m.gettgllahir());
            txtAlamat.setText(m.getalamat());
            txtPhone.setText(m.getphone());
            txtAsalSekolah.setText(m.getasalsekolah());
        } else {
            currentRow = 0;
            txtNoBP.setText("");
            txtNama.setText("");
            txtTmpLahir.setText("");
            txtTglLahir.setText("");
            txtAlamat.setText("");
            txtPhone.setText("");
            txtAsalSekolah.setText("");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTmpLahir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTglLahir = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtPhone = new javax.swing.JTextField();
        txtAsalSekolah = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        txtNama = new javax.swing.JTextField();
        txtNoBP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DATA MAHASISWA");

        jLabel1.setText("DATA MAHASISWA");

        jLabel2.setText("No BP");

        jLabel3.setText("Nama");

        jLabel4.setText("Tempat/Tgl lahir");

        jLabel5.setText("Alamat");

        txtTmpLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTmpLahirActionPerformed(evt);
            }
        });

        jLabel6.setText("/");

        txtTglLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTglLahirActionPerformed(evt);
            }
        });

        jLabel7.setText("Phone");

        jLabel8.setText("Asal Sekolah");

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnNew.setText("Baru");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(txtAsalSekolah)))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrev)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext)
                        .addGap(138, 138, 138)
                        .addComponent(btnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTmpLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNoBP, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(txtNoBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(txtTmpLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAsalSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnNew)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTglLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTglLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglLahirActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
     if (currentRow < mahasiswa.size() - 1) {
    currentRow++;
    btnPrev.setEnabled(true); 
} else {
    btnNext.setEnabled(false); 
}


if (currentRow <= 0) {
    btnPrev.setEnabled(false);
}


if (currentRow < mahasiswa.size() - 1) {
    btnNext.setEnabled(true);
}

bindData();

    }//GEN-LAST:event_btnNextActionPerformed

    private void txtTmpLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTmpLahirActionPerformed

    }//GEN-LAST:event_txtTmpLahirActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
    
if (currentRow < mahasiswa.size() - 1) {
    ++currentRow;
    btnPrev.setEnabled(true); 
} else {
    btnNext.setEnabled(false); 
}


if (currentRow > 0) {
    --currentRow;
    btnNext.setEnabled(true); 
} else {
    btnPrev.setEnabled(false); 
}


bindData();


    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
      if (btnNew.getText().equals("New")) {
    // Clear all text fields
    txtNoBP.setText("");
    txtNama.setText("");
    txtTmpLahir.setText("");
    txtTglLahir.setText("");
    txtAlamat.setText("");
    txtPhone.setText("");
    txtAsalSekolah.setText("");
    
    // Make text fields editable and focus on txtNoBP
    txtNoBP.setEditable(true);
    txtNama.setEditable(true);
    txtTmpLahir.setEditable(true);
    txtTglLahir.setEditable(true);
    txtAlamat.setEditable(true);
    txtPhone.setEditable(true);
    txtAsalSekolah.setEditable(true);
    txtNoBP.requestFocus();
    
    // Change button text for functionality
    btnNew.setText("Save");
    btnDelete.setText("Cancel");
    btnEdit.setEnabled(false);
    btnPrev.setEnabled(false);
    btnNext.setEnabled(false);
} else {
    // Check if required fields are filled
    if (!txtNoBP.getText().equals("") && !txtNama.getText().equals("")) {
        MahasiswaManager mhsmgr = new MahasiswaManager();
        Mahasiswa m = new Mahasiswa();
        
        // Set data for the new Mahasiswa object
        m.setnobp(txtNoBP.getText());
        m.setnama(txtNama.getText());
        m.settmplahir(txtTmpLahir.getText());
        m.settgllahir(txtTglLahir.getText());
        m.setalamat(txtAlamat.getText());
        m.setphone(txtPhone.getText());
        m.setasalsekolah(txtAsalSekolah.getText());
        
        // Attempt to save data to the database
        if (mhsmgr.Insert(m) > 0) {
            loadData();
            currentRow = mahasiswa.size() - 1;
            bindData();
            JOptionPane.showMessageDialog(this, "Data successfully saved", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to save data", "Information", JOptionPane.WARNING_MESSAGE);
        }
        
        // Reset UI components
        txtNoBP.setEditable(false);
        txtNama.setEditable(false);
        txtTmpLahir.setEditable(false);
        txtTglLahir.setEditable(false);
        txtAlamat.setEditable(false);
        txtPhone.setEditable(false);
        txtAsalSekolah.setEditable(false);
        
        // Update button states
        btnNew.setText("New");
        btnDelete.setText("Delete");
        btnEdit.setEnabled(true);
        btnPrev.setEnabled(true);
        btnNext.setEnabled(true);
        
        mhsmgr.closeConnection();
    } else {
        JOptionPane.showMessageDialog(this, "Please complete all required fields", "Information", JOptionPane.WARNING_MESSAGE);
    }
}

    }//GEN-LAST:event_btnNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (btnEdit.getText().equals("Edit")){
            txtNoBP.setText("");
            txtNama.setText("");
            txtTmpLahir.setText("");
            txtTglLahir.setText("");
            txtAlamat.setText("");
            txtPhone.setText("");
            txtAsalSekolah.setText("");
            txtNoBP.setEditable(true);
            txtNama.setEditable(true);
            txtTmpLahir.setEditable(true);
            txtTglLahir.setEditable(true);
            txtAlamat.setEditable(true);
            txtPhone.setEditable(true);
            txtAsalSekolah.setEditable(true);
            txtNoBP.requestFocus();
            btnNew.setText("Simpan");
            btnDelete.setText("Batal");
            btnEdit.setEnabled(false);
            btnPrev.setEnabled(false);
            btnNext.setEnabled(false);
        } else {
            MahasiswaManager mhsmgr = new MahasiswaManager();
            Mahasiswa m = new Mahasiswa();
            m.setnobp(txtNoBP.getText());
            m.setnama(txtNama.getName());
            m.settmplahir(txtTmpLahir.getText());
            m.settgllahir(txtTglLahir.getText());
            m.setalamat(txtAlamat.getText());
            m.setphone(txtPhone.getText());
            m.setasalsekolah(txtAsalSekolah.getText());
               if (mhsmgr.Update(m)>0){
                    loadData();
                    bindData();
                    JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "Data Gagal Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
                }
           txtNoBP.setEditable(false);
           txtNama.setEditable(false);
           txtTmpLahir.setEditable(false);
           txtTglLahir.setEditable(false);
           txtAlamat.setEditable(false);
           txtPhone.setEditable(false);
           txtAsalSekolah.setEditable(false);
           btnNew.setText("Baru");
           btnDelete.setText("Hapus");
           btnPrev.setEnabled(true);
           btnNext.setEnabled(true);
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    if (btnDelete.getText().equals("Delete")) {
    int dialog = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Akan Menghapus Data Ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
    MahasiswaManager mhsmgr = new MahasiswaManager();
    Mahasiswa m = mahasiswa.get(currentRow);

    if (dialog == JOptionPane.YES_OPTION) {
        if (mhsmgr.Delete(m) > 0) {
            loadData(); 
            
            currentRow = Math.max(0, currentRow - 1); 
            bindData();

            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);

           
            btnNext.setEnabled(currentRow < mahasiswa.size() - 1);
            btnPrev.setEnabled(currentRow > 0);
        } else {
            JOptionPane.showMessageDialog(this, "Data Gagal Dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
} else if (btnDelete.getText().equals("Batal")) {
    loadData(); 
    bindData();

    
    btnNew.setText("Baru");
    btnEdit.setText("Edit");
    btnDelete.setText("Delete");
    btnEdit.setEnabled(true);
    btnNew.setEnabled(true);
    btnNext.setEnabled(currentRow < mahasiswa.size() - 1);
    btnPrev.setEnabled(currentRow > 0);

    
    txtNoBP.setEditable(false);
    txtNama.setEditable(false);
    txtTmpLahir.setEditable(false);
    txtTglLahir.setEditable(false);
    txtAlamat.setEditable(false);
    txtPhone.setEditable(false);
    txtAsalSekolah.setEditable(false);
}

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

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
            java.util.logging.Logger.getLogger(JendelaUtama1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JendelaUtama1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JendelaUtama1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JendelaUtama1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JendelaUtama1().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtAsalSekolah;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoBP;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtTglLahir;
    private javax.swing.JTextField txtTmpLahir;
    // End of variables declaration//GEN-END:variables
}
