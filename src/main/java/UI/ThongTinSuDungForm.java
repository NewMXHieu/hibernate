/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI;
import BLL.ThanhVienBLL;
import BLL.ThietBiBLL;
import BLL.ThongTinSDBLL;
import hibernate.entity.thongtinsd;
import hibernate.entity.thanhvien;
import hibernate.entity.thietbi;

import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ACER
 */
public class ThongTinSuDungForm extends javax.swing.JDialog {

    QuanLyThanhVienForm form;
    private ThongTinSDBLL ttBll;
    private ThanhVienBLL tvBll;
    private ThietBiBLL tbBll;
    private int matv;
    private String tgvao;
    private int iddau;
    /**
     * Creates new form ThongTinSuDungForm
     */
    public ThongTinSuDungForm(QuanLyThanhVienForm f,int maTV,String tgVao) {
        initComponents();
        form=f;
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        ttBll=new ThongTinSDBLL();
        tvBll=new ThanhVienBLL();
        tbBll=new ThietBiBLL();
        loadThongTinSD(null);
        LoadComboBox();
        this.matv=maTV;
        this.tgvao=tgVao;
        this.iddau= ttBll.AutoID();


    }
    protected void loadThongTinSD(List l){
        List<thongtinsd>list=null;
        if (l==null){
            list=ttBll.GetAllThongTinSD();
        }else{
            list=l;
        }
        String[] colNames={"Tên thành viên","Tên thiết bị","Thời gian vào","Thời gian mượn","Thời gian trả"};
        Object[][] rows=new Object[list.size()][colNames.length];
        for (int i=0;i<list.size();i++){
            String tentv=tvBll.GetHoTenByID(list.get(i).getMaTV());
            rows[i][0]=tentv;
            Integer matb= list.get(i).getMaTB();
            if (matb!=null){
                String tentb=tbBll.GetTenThietBiById(list.get(i).getMaTB());
                rows[i][1]=tentb;
            }
            else{
                rows[i][1]="";
            }
            rows[i][2]=list.get(i).getTGVao();
            rows[i][3]=list.get(i).getTGMuon();
            rows[i][4]=list.get(i).getTGTra();
        }
        DefaultTableModel model=new DefaultTableModel(rows,colNames);
        jTable1.setModel(model);
    }
    protected void LoadComboBox(){
        List<String>thanhvienList=tvBll.GetAllThanhVien1();
        if(thanhvienList==null|| thanhvienList.isEmpty()){
            JOptionPane.showConfirmDialog(null,"Dữ liệu rỗng");
            return;
        }
        for (String tv:thanhvienList){
            jComboBox2.addItem(tv);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnMuon = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnTra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chọn Thành viên--" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnExit.setText("Rời khu học tập");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "Mã Thông tin SD", "Thành viên", "Thiết bị", "Thời gian vào", "Thời gian mượn", "Thời gian trả"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("THÔNG TIN SỬ DỤNG");

        btnMuon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMuon.setText("MƯỢN");
        btnMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuonActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setText("SỬA");

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("REFRESH");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        btnTra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTra.setText("TRẢ");
        btnTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(424, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(405, 405, 405))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btnTra, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jButton4)
                                .addGap(34, 34, 34))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(473, 473, 473)
                                .addComponent(btnExit)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(btnTra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btnMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(46, 46, 46)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int idcuoi=ttBll.AutoID();
        if(iddau==idcuoi){
            int id=idcuoi+1;
            thongtinsd tt=new thongtinsd();
            tt.setMaTT(id);
            tt.setMaTV(matv);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime tgvaoDateTime=LocalDateTime.parse(tgvao,formatter);
            Date tgvaoDate=Date.from(tgvaoDateTime.atZone(ZoneId.systemDefault()).toInstant());
            tt.setTGVao(tgvaoDate);
            if(ttBll.AddThongTinSD(tt)==1){
                JOptionPane.showMessageDialog(null,"Cám ơn đã vào khu học tập","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        }
        JOptionPane.showMessageDialog(null,"Cám ơn đã vào khu học tập","Message",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jComboBox2.setSelectedIndex(0);
        loadThongTinSD(null);
    }
    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {
        // TODO add your handling code here:
        int selectIndex=jComboBox2.getSelectedIndex();
        if (selectIndex==0){return ;}
        String selectTen=(String) jComboBox2.getSelectedItem();
        String[] parts=selectTen.split("_");
        int matv= Integer.parseInt(parts[0]);
        List<thongtinsd>list=ttBll.GetTVById(matv);
        loadThongTinSD(list);
    }
    private void btnTraActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        List<String>thietbiList=tbBll.GetThietBiTra(matv);
        if(thietbiList==null|| thietbiList.isEmpty()){
            JOptionPane.showMessageDialog(null,"Không có thiết bị nào cần trả!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }else{
            ThongTinSDTra form1=new ThongTinSDTra(this,matv,tgvao);
            form1.setVisible(true);
        }
    }
    private void btnMuonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        List<String>thietbiList=tbBll.GetThietBiMuon();
        if(thietbiList==null|| thietbiList.isEmpty()){
            JOptionPane.showMessageDialog(null,"Không còn thiết bị nào có thể mượn!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }else {
            ThongTinSDMuon form = new ThongTinSDMuon(this, matv, tgvao);
            form.setVisible(true);
        }
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMuon;
    private javax.swing.JButton btnTra;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration
}
