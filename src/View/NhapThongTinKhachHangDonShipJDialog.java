/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.BanChiTietDAO;
import Dao.BanDao;
import Dao.HoaDonDAO;
import Model.Ban;
import Model.BanChiTiet;
import Model.Hoadon;
import Helper.Xdate;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class NhapThongTinKhachHangDonShipJDialog extends javax.swing.JDialog {

    /**
     * Creates new form NhapThongTinKhachHangDonShipJDialog
     */
    public NhapThongTinKhachHangDonShipJDialog(java.awt.Frame parent, boolean modal, Ban ban, String ngayhientai) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        numberDesk = ban;
        dayNow = ngayhientai;
    }
static Ban numberDesk;
static String dayNow;
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
        txtSDT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiachi = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTienShip = new javax.swing.JTextField();
        btnLmoi = new javax.swing.JButton();
        btnLapDon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 242, 203));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        txtSDT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SĐT:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tên:");

        txtTen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Nhập thông tin khách hàng");

        txtDiachi.setColumns(20);
        txtDiachi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDiachi.setLineWrap(true);
        txtDiachi.setRows(5);
        jScrollPane1.setViewportView(txtDiachi);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Địa chỉ:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Tiền Ship:");

        txtTienShip.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnLmoi.setBackground(new java.awt.Color(255, 255, 255));
        btnLmoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLmoi.setForeground(new java.awt.Color(255, 169, 94));
        btnLmoi.setText("Làm mới");
        btnLmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLmoiActionPerformed(evt);
            }
        });

        btnLapDon.setBackground(new java.awt.Color(255, 169, 94));
        btnLapDon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLapDon.setText("Lập đơn");
        btnLapDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLmoi)
                        .addGap(18, 18, 18)
                        .addComponent(btnLapDon, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(txtSDT)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel6)
                        .addGap(21, 21, 21)
                        .addComponent(txtTienShip, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel5)
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtTienShip, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLapDon, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnLmoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtSDT, txtTen});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked
    HoaDonDAO DAOHOADON = new HoaDonDAO();
    BanDao DAOBAN = new BanDao();
    BanChiTietDAO DAOBanCT = new BanChiTietDAO();
    private void btnLmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLmoiActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnLmoiActionPerformed

    private void btnLapDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapDonActionPerformed
        // TODO add your handling code here:
        if (checknull()) return;
        if (checknumberphone()) return;
        if (checknumber()) return;
        if (txtTienShip.getText().length() < 4 && Integer.parseInt(txtTienShip.getText()) != 0) {
            JOptionPane.showMessageDialog(this, "Tiền ship phải 1.000 đồng trở lên");
            return;
        }
        DAOHOADON.insert(setInforHoaDon());
        DAOBAN.updateHoatDong(numberDesk.getIdBan());
        numberDesk.setHoatDong(false);
        List<Hoadon> list = DAOHOADON.selectAll();
        BanChiTiet bct = new BanChiTiet(list.get(list.size() -1).getIdHoaDon(),numberDesk.getIdBan(), new Date(),true);
        System.out.println(list.get(list.size() -1).getIdHoaDon()+"");
        DAOBanCT.insert(bct);
        dispose();
    }//GEN-LAST:event_btnLapDonActionPerformed

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
            java.util.logging.Logger.getLogger(NhapThongTinKhachHangDonShipJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhapThongTinKhachHangDonShipJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhapThongTinKhachHangDonShipJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhapThongTinKhachHangDonShipJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NhapThongTinKhachHangDonShipJDialog dialog = new NhapThongTinKhachHangDonShipJDialog(new javax.swing.JFrame(), true,numberDesk, dayNow);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLapDon;
    private javax.swing.JButton btnLmoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDiachi;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTienShip;
    // End of variables declaration//GEN-END:variables
private Hoadon setInforHoaDon(){
    Hoadon hd = new Hoadon();
    //hd.setIdHoaDon(i);
    hd.setIdNhanVien("NV1");
    hd.setNgayTao(Xdate.toDate(dayNow, "yyyy-MM-dd"));
    hd.setTrangThai(true);
    hd.setTrangThaiTT(false);
    hd.setThanhTien(0);
    hd.setSlSanPhamHuy(0);
    hd.setLyDoHuy("");
    hd.setTen(txtTen.getText());
    hd.setSDT(txtSDT.getText());
    hd.setDiaChi(txtDiachi.getText());
    if (txtTienShip.getText().equals("") || Integer.parseInt(txtTienShip.getText()) == 0){
        hd.setTienShip(0);
    }else if (!txtTienShip.getText().equals("")) {
        hd.setTienShip(Integer.parseInt(txtTienShip.getText()));
    }
    return hd;
}

private void clear(){
    txtDiachi.setText("");
    txtSDT.setText("");
    txtTen.setText("");
    txtTienShip.setText("");
}

private boolean  checknull(){
    StringBuilder sb = new StringBuilder();
    if (txtTen.getText().equals("")) {
        sb.append("Chưa nhập tên khách hàng!");
    }
    if (txtSDT.getText().equals("")) {
        sb.append("Chưa nhập SĐT khách hàng!");
    }
    if (txtDiachi.getText().equals("")) {
        sb.append("Chưa nhập địa chỉ khách hàng!");
    }
//    if (txtTienShip.getText().equals("")) {
//        sb.append("Chưa nhập tiền vận chuyển hàng cho khách hàng!");
//    }
    
    if (sb.length() > 0) {
        JOptionPane.showMessageDialog(this, sb.toString());
        return true;
    }
    return false;
}

public boolean checknumberphone(){
    String regix = "0\\d{9,10}";
    String phone = txtSDT.getText();
    if (!phone.matches(regix)) {
        JOptionPane.showMessageDialog(this, "Sai định dạng số điện thoại (0 + 9,10 số)");
        return true;
    }
    return false;
}

public boolean checknumber(){
    if (txtTienShip.getText().equals("")) {
        return false;
    }
    try {
        int numbe = Integer.parseInt(txtTienShip.getText());
        if (numbe < 0) {
            JOptionPane.showMessageDialog(this, "tiền ship không được phép nhập số âm!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Tiền ship bạn nhập không phải là số!!");
        return true;
    }
    return false;
}
}
