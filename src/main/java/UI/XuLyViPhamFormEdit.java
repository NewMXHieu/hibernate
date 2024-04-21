/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import BLL.ThanhVienBLL;
import BLL.XuLyBLL;
import hibernate.entity.xuly;
import hibernate.entity.thanhvien;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class XuLyViPhamFormEdit extends javax.swing.JFrame {

    XuLyViPhamForm form;
    private int maXl;
    private XuLyBLL xlBll;
    private ThanhVienBLL tvBll;
    public XuLyViPhamFormEdit(XuLyViPhamForm f, int maXL) {
        initComponents();
        form = f;
        maXl = maXL;
        xlBll = new XuLyBLL();
        tvBll = new ThanhVienBLL();
        LoadThongTinXuLy(maXl);
        LoadThongTinThanhVien();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateXL = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        cbThanhVien = new javax.swing.JComboBox<>();
        cbHinhThucXL = new javax.swing.JComboBox<>();
        txtSoTien = new javax.swing.JTextField();
        cbHinhThucXL1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sửa xử lý vi phạm");

        jLabel2.setText("Thành viên: ");

        dateXL.setFocusable(false);

        jLabel3.setText("Hình thức  xử lý:");

        jLabel4.setText("Số tiền:");

        jLabel5.setText("Ngày xử lý:");

        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });

        cbThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbThanhVienActionPerformed(evt);
            }
        });

        cbHinhThucXL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bồi thường", "Khóa thẻ 1 tháng và bồi thường", "Khóa thẻ 1 tháng", "Khóa thẻ 2 tháng", " " }));
        cbHinhThucXL.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                if (evt.getStateChange() == ItemEvent.SELECTED) {
                    if (cbHinhThucXL.getSelectedItem().equals("Bồi thường") || cbHinhThucXL.getSelectedItem().equals("Khóa thẻ 1 tháng và bồi thường")) {
                        txtSoTien.setEnabled(true);
                    } else {
                        txtSoTien.setEnabled(false);
                    }
                }
            }
        });

        cbHinhThucXL1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Chưa xử lý", "Đã xử ly" }));

        jLabel6.setText("Trạng thái:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbHinhThucXL1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbHinhThucXL, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateXL, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEdit)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbHinhThucXL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(dateXL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbHinhThucXL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void LoadThongTinThanhVien() {
        List<String> thanhvienList = tvBll.GetAllThanhVien1();

        if (thanhvienList == null || thanhvienList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không có dữ liệu thành viên", "Message", JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (String tv : thanhvienList) {
            // Use tv directly as it's already the formatted string:
            cbThanhVien.addItem(tv);
        }
    }
    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {
        if (checkValid()) {
            xuly obj = xlBll.GetXuLyById(maXl);
            String soTienText = txtSoTien.getText();
            int soTien = Integer.parseInt(soTienText);
            String selectedValue = (String) cbThanhVien.getSelectedItem();
            String[] parts = selectedValue.split("_");
            int maThanhVien = Integer.parseInt(parts[0]);
            String hinhThucXL = String.valueOf(cbHinhThucXL.getSelectedItem());
            Date ngayXL = dateXL.getDate();
            String selectedTrangThai = cbHinhThucXL1.getSelectedItem().toString();

            int trangThai = selectedTrangThai.equals("Chưa xử lý") ? 1 : 0;
            if (trangThai != obj.getTrangThaiXL()) {
                obj.setTrangThaiXL(trangThai);
            }

            obj.setSoTien(soTien);
            obj.setMaTV(maThanhVien);
            obj.setHinhThucXL(hinhThucXL);
            obj.setNgayXL(ngayXL);

            if (xlBll.EditXuLy(obj) == 1) {
                JOptionPane.showMessageDialog(null, "Cập nhật thành công", "Message", JOptionPane.INFORMATION_MESSAGE);
                form.loadXuLy(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật thất bại", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }


    private void cbThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbThanhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbThanhVienActionPerformed

    private void LoadThongTinXuLy(int maXl) {
        try {
            xuly obj = xlBll.GetXuLyById(maXl);
            if (obj != null) {
                String hoTen = tvBll.GetHoTenByID(obj.getMaTV());
                String trangthai = String.valueOf(xlBll.GetXuLyById(obj.getTrangThaiXL()));
                cbThanhVien.setSelectedItem(hoTen);
                cbHinhThucXL.setSelectedItem(obj.getHinhThucXL());
                txtSoTien.setText(String.valueOf(obj.getSoTien()));
                dateXL.setDate(obj.getNgayXL());
                cbHinhThucXL1.setSelectedItem(trangthai);
            } else {
                // Handle case where obj is null
            }
        } catch (Exception ex) {
            // Handle any exception that occurs during the process
            ex.printStackTrace();
        }
    }

    private boolean checkValid() {
        String hinhThucXL = String.valueOf(cbHinhThucXL.getSelectedItem());

        if (hinhThucXL.equals("Bồi thường") || hinhThucXL.equals("Khóa thẻ 1 tháng và bồi thường")) {
            String soTienText = txtSoTien.getText();
            if (!soTienText.isBlank() && !soTienText.isEmpty() && !soTienText.equals("0")) {
                try {
                    int soTien = Integer.parseInt(soTienText);
                    if (soTien > 0) {
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Số tiền phải là số nguyên dương", "Message", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Số tiền phải là số nguyên", "Message", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Số tiền không được để trống", "Message", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            txtSoTien.setText("0");
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cbHinhThucXL;
    private javax.swing.JComboBox<String> cbHinhThucXL1;
    private javax.swing.JComboBox<String> cbThanhVien;
    private com.toedter.calendar.JDateChooser dateXL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtSoTien;
    // End of variables declaration//GEN-END:variables
}