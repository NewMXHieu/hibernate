/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import BLL.ThanhVienBLL;
import hibernate.entity.thanhvien;

import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author ankho
 */
public class QuanLyThanhVienForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyThanhVienForm
     */
    private ThanhVienBLL tvBll;
    public QuanLyThanhVienForm() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        BasicInternalFrameUI ui  = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);

        tvBll=new ThanhVienBLL();
        LoadThanhVien(null);
    }

    protected void LoadThanhVien(List l){
        List<thanhvien> list=null;
        if (l == null) {
            list = tvBll.GetAllThanhVien();
        } else {
            list=l;
        }
        String[] colNames={"Mã nhân viên","Họ tên","Khoa","Ngành","SDT"};
        Object[][] rows=new Object[list.size()][colNames.length];
        for (int i=0;i<list.size();i++){
            rows[i][0]=list.get(i).getMaTV();
            rows[i][1]=list.get(i).getHoTen();
            rows[i][2]=list.get(i).getKhoa();
            rows[i][3]=list.get(i).getNganh();
            rows[i][4]=list.get(i).getSDT();
        }
        DefaultTableModel model=new DefaultTableModel(rows,colNames);
        jTable1.setModel(model);
    }
    private boolean checkVipham(int matv){
        long row=tvBll.checkViPham(matv);
        if (row>0)return false;
        return true;
    }
    private void Refresh(){
        LoadThanhVien(null);
        jComboBox1.setSelectedIndex(0);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnXoaNhieu = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnThemFile = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1035, 665));
        setMinimumSize(new java.awt.Dimension(1035, 665));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1035, 665));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("QUẢN LÝ THÀNH VIÊN");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "Họ tên", "Khoa", "Ngành", "Số điện thoại", "Email", "Mật khẩu"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnXoaNhieu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaNhieu.setText("Xóa nhiều");
        btnXoaNhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNhieuActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnEnter.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnEnter.setText("Vào Khu học tập");
        btnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnterMouseClicked(evt);
            }
        });
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        btnThemFile.setText("Thêm Excel");
        btnThemFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnAdd)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnUpdate)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnDelete)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnXoaNhieu)
                                                                .addGap(37, 37, 37)
                                                                .addComponent(btnThemFile)
                                                                .addGap(64, 64, 64)
                                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(26, 26, 26)))
                                                .addComponent(btnRefresh)
                                                .addGap(22, 22, 22)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(438, 438, 438)
                                .addComponent(btnEnter)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnXoaNhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThemFile, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    // </editor-fold>
    private void btnXoaNhieuActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        QuanLyThanhVienFormDelete form =new QuanLyThanhVienFormDelete(this);
        form.setVisible(true);
    }
    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        QuanLyThanhVienFormAdd form =new QuanLyThanhVienFormAdd(this);
        form.setVisible(true);
    }

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int row =jTable1.getSelectedRow();
        TableModel model =jTable1.getModel();
        int maTV= Integer.parseInt(model.getValueAt(row,0).toString());
        QuanLyThanhVienFormEdit form =new QuanLyThanhVienFormEdit(this,maTV);
        form.setVisible(true);
    }

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int row =jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        if(row!=-1){
            int maTV=Integer.parseInt(model.getValueAt(row,0).toString());
            thanhvien obj=tvBll.getById(maTV);
            int result=JOptionPane.showConfirmDialog(this,"Xác nhận xóa thành viên này","Xác nhận",JOptionPane.YES_NO_OPTION);
            if(result==JOptionPane.YES_OPTION){
                if(tvBll.RemoveThanhVien(obj)==1){
                    JOptionPane.showMessageDialog(null,"Xóa thành viên thành công","Message",JOptionPane.INFORMATION_MESSAGE);
                    Refresh();
                }else{
                    JOptionPane.showMessageDialog(null,"Xóa không thành công","Message",JOptionPane.WARNING_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Chưa chọn thành viên để xóa!","Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void btnEnterMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int row =jTable1.getSelectedRow();
        if (row>=0) {
            TableModel model = jTable1.getModel();
            int matv = Integer.parseInt(model.getValueAt(row, 0).toString());
            try {
                if(checkVipham(matv)){
                    LocalDateTime tgvao = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    String tgVao = tgvao.format(formatter);
                    ThongTinSuDungForm form = new ThongTinSuDungForm(this, matv,tgVao);
                    form.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Thành viên "+tvBll.GetHoTenByID(matv)+"dang trong qua trinh xu phat");
                }
            }catch (NumberFormatException ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null,"Giá trị không hợp lệ");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Chưa chọn thành viên vào Khu học tập");
        }

    }

    private void btnThemFileActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JFileChooser fileChooser=new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            if (tvBll.ImportExcel(selectedFile) != 0) {
                JOptionPane.showMessageDialog(null, "Nhập dữ liệu từ file thành công", "Message", JOptionPane.INFORMATION_MESSAGE);
                LoadThanhVien(null);
            } else {
                JOptionPane.showMessageDialog(null, "Nhập dữ liệu từ file thất bại", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn file", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Refresh();
    }

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {
        // TODO add your handling code here:
    }
    // Variables declaration - do not modify
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnThemFile;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnXoaNhieu;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration
}
