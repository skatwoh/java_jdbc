/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab56;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFormattedTextField;

/**
 *
 * @author Admin
 */
public class Lab56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tivi");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        GridLayout gridLayout = new GridLayout(13, 1);
        frame.setLayout(gridLayout);

        FlowLayout centerLayout = new FlowLayout(FlowLayout.CENTER);

        JPanel pn1 = new JPanel(centerLayout);
        JPanel pn2 = new JPanel(centerLayout);
        JPanel pn3 = new JPanel(centerLayout);
        JPanel pn4 = new JPanel(centerLayout);
        JPanel pn5 = new JPanel(centerLayout);
        JPanel pn6 = new JPanel(centerLayout);
        JPanel pn7 = new JPanel(centerLayout);
        JPanel pn8 = new JPanel(centerLayout);
        JPanel pn9 = new JPanel(centerLayout);
        JPanel pn10 = new JPanel(centerLayout);
        JPanel pn11 = new JPanel(centerLayout);
        JPanel pn12 = new JPanel(centerLayout);

        String[] columnName = {
            "M??", "T??n", "M?? t???", "Ng??y s???n xu???t", "Lo???i", "Inch", "Kh??? n??ng", "C??n kh??? d???ng", "????? ph??n gi???i"
        };

        DefaultTableModel defaultTableModel = new DefaultTableModel(columnName, 0);
        JTable tbTivi = new JTable(defaultTableModel);
        tbTivi.setBackground(Color.pink);

        JScrollPane jScrollPane = new JScrollPane(tbTivi);

        JTextField txtMa = new JTextField(10);
        JTextField txtTen = new JTextField(10);
        JTextField txtNam = new JTextField(10);
        JTextArea jTextArea = new JTextArea(1, 10);

        JComboBox<String> cbLoai = new JComboBox<>();
        cbLoai.addItem("C?? IPS");
        cbLoai.addItem("Kh??ng c?? IPS");

        JComboBox<String> cbInch = new JComboBox<>();
        cbInch.addItem("10-40");
        cbInch.addItem("40-80");
        cbInch.addItem("80-120");

        JComboBox<String> cbDoPhanGiai = new JComboBox<>();
        cbDoPhanGiai.addItem("qHD");
        cbDoPhanGiai.addItem("HD");
        cbDoPhanGiai.addItem("FullHD");
        cbDoPhanGiai.addItem("2K");
        cbDoPhanGiai.addItem("4K");

        JRadioButton rdCo = new JRadioButton("C??");
        JRadioButton rdKhong = new JRadioButton("Kh??ng");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rdCo);
        buttonGroup.add(rdKhong);

        JButton btnHienThi = new JButton("Hi???n th???");
        btnHienThi.addActionListener((e) -> {
            int hienThi = JOptionPane.showConfirmDialog(null, "B???n c?? mu???n hi???n th??? kh??ng?", "Yes", JOptionPane.YES_NO_OPTION);
            if (hienThi == 0) {
                try {
                    Object query = "SELECT MA, TEN, MOTA, NGAYSANXUAT, LOAI, INCH, KHANANG, CONKHADUNG, DOPHANGIAI FROM TIVI";
                    
                    Connection connection = DBContext.getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement((String) query);
                    ResultSet rs = preparedStatement.executeQuery();
                    while (rs.next()) {
                        Object ma = rs.getString("Ma");
                        Object ten = rs.getString("TEN");
                        Object moTa = rs.getString("MOTA");
                        Object ngaySanXuat = rs.getString("NGAYSANXUAT");
                        Object loai = rs.getString("LOAI");
                        Object inch = String.valueOf(rs.getInt("INCH"));
                        Object khaNang = rs.getString("KHANANG");
                        Object conKhaDung = rs.getString("CONKHADUNG");
                        Object doPhanGiai = rs.getString("DOPHANGIAI");

                        Object[] data = {ma, ten, moTa, ngaySanXuat, loai, inch, khaNang, conKhaDung, doPhanGiai};
                        defaultTableModel.addRow(data);

                    }
                } catch (SQLException ex) {
                    System.out.println("L???i :" + ex.getMessage());
                }

            }
        });

        JButton btnThem = new JButton("Th??m");
        btnThem.addActionListener((e) -> {
            int them = JOptionPane.showConfirmDialog(null, "B???n c?? mu???n th??m kh??ng?", "Yes", JOptionPane.YES_NO_OPTION);
            if (them == 0) {
                Tivi tivi = new Tivi();
                String ma = txtMa.getText();
                String ten = txtTen.getText();
                String moTa = jTextArea.getText();
                String nam = txtNam.getText();
                
                tivi.setMa(ma);
                tivi.setTen(ten);
                tivi.setMoTa(moTa);
                tivi.setNgaySanXuat(nam);
                
            }
        });

        JButton btnXoa = new JButton("X??a");
        btnXoa.addActionListener((e) -> {
            int xoa = JOptionPane.showConfirmDialog(null, "B???n c?? mu???n x??a kh??ng?", "Yes", JOptionPane.YES_NO_OPTION);
            if (xoa == 0) {
                JOptionPane.showMessageDialog(btnXoa, "X??a th??nh c??ng");
            }
        });

        JButton btnThoat = new JButton("Tho??t");
        btnThoat.addActionListener((e) -> {
            int thoat = JOptionPane.showConfirmDialog(null, "B???n c?? mu???n tho??t kh??ng?", "Yes", JOptionPane.YES_NO_OPTION);
            if (thoat == 0) {
                System.exit(0);
            }
        });

        pn1.add(new JLabel("Th??ng tin Tivi"));
        pn2.add(new JLabel("M??"));
        pn2.add(txtMa);
        pn3.add(new JLabel("T??n"));
        pn3.add(txtTen);
        pn4.add(new JLabel("M?? t???"));
        pn4.add(jTextArea);
        pn5.add(new JLabel("N??m s???n xu???t"));
        pn5.add(txtNam);
        pn6.add(new JLabel("Lo???i"));
        pn6.add(cbLoai);
        pn7.add(new JLabel("Inch"));
        pn7.add(cbInch);
        pn8.add(new JLabel("Kh??? n??ng"));
        pn8.add(new JCheckBox("Ch???ng l??a"));
        pn8.add(new JCheckBox("K???t n???i nhanh"));
        pn9.add(new JLabel("C??n kh??? d???ng"));
        pn9.add(rdCo);
        pn9.add(rdKhong);
        pn10.add(new JLabel("????? ph??n gi???i"));
        pn10.add(cbDoPhanGiai);
//        pn11.add(jScrollPane);
        pn12.add(btnHienThi);
        pn12.add(btnThem);
        pn12.add(btnXoa);
        pn12.add(btnThoat);

        frame.add(pn1);
        frame.add(pn2);
        frame.add(pn3);
        frame.add(pn4);
        frame.add(pn5);
        frame.add(pn6);
        frame.add(pn7);
        frame.add(pn8);
        frame.add(pn9);
        frame.add(pn10);
//        frame.add(pn11);
        frame.add(jScrollPane, BorderLayout.CENTER);
        frame.add(pn12);

        frame.pack();
    }

}
