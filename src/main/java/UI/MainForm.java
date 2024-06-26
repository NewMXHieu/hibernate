/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import javax.swing.*;

/**
 *
 * @author ankho
 */
public class MainForm extends javax.swing.JFrame {



    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnQltb = new javax.swing.JButton();
        btnXlvp = new javax.swing.JButton();
        btnTk = new javax.swing.JButton();
        btnQltv = new javax.swing.JButton();
        jDesktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setAlignmentY(0.0F);

        btnQltb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQltb.setText("Quản lý thiết bị");
        btnQltb.setAlignmentY(0.0F);
        btnQltb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQltb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQltbMouseClicked(evt);
            }
        });

        btnXlvp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXlvp.setText("Xử lý vi phạm");
        btnXlvp.setAlignmentY(0.0F);
        btnXlvp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXlvp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXlvpMouseClicked(evt);
            }
        });

        btnTk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTk.setText("Thống kê");
        btnTk.setAlignmentY(0.0F);
        btnTk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTkMouseClicked(evt);
            }
        });

        btnQltv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQltv.setText("Quản lý thành viên");
        btnQltv.setAlignmentY(0.0F);
        btnQltv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQltv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQltvMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnQltb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnXlvp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnTk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnQltv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(btnQltv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnQltb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnXlvp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(286, Short.MAX_VALUE))
        );

        jDesktopPane.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane.setMaximumSize(new java.awt.Dimension(1035, 650));
        jDesktopPane.setMinimumSize(new java.awt.Dimension(1035, 650));

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
                jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1035, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
                jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void btnQltvMouseClicked(java.awt.event.MouseEvent evt) {
        QuanLyThanhVienForm qltv = new QuanLyThanhVienForm();
        jDesktopPane.removeAll();
        jDesktopPane.add(qltv).setVisible(true);
    }

    private void btnQltbMouseClicked(java.awt.event.MouseEvent evt) {
        QuanLyThietBiForm qltb = new QuanLyThietBiForm();
        jDesktopPane.removeAll();
        jDesktopPane.add(qltb).setVisible(true);
    }

    private void btnXlvpMouseClicked(java.awt.event.MouseEvent evt) {
        XuLyViPhamForm xlvp = new XuLyViPhamForm();
        jDesktopPane.removeAll();
        jDesktopPane.add(xlvp).setVisible(true);
    }

    private void btnTkMouseClicked(java.awt.event.MouseEvent evt) {
        ThongKeForm tk = new ThongKeForm();
        jDesktopPane.removeAll();
        jDesktopPane.add(tk).setVisible(true);
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify
    private javax.swing.JButton btnQltb;
    private javax.swing.JButton btnQltv;
    private javax.swing.JButton btnTk;
    private javax.swing.JButton btnXlvp;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration
}
