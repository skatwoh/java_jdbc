/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab34;

import com.toedter.calendar.JDateChooser;
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

/**
 *
 * @author Admin
 */
public class Lab34 {

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

        String[][] data = {
            {"Tivi1", "SamSung OLED 1", "mô tả 1", "1-1-2020", "có ips", "10-40", "chống lóa", "có", "4K"},
            {"Tivi2", "SamSung OLED 2", "mô tả 2", "1-2-2020", "không ips", "40-80", "kết nối nhanh", "có", "2K"},
            {"Tivi3", "SamSung OLED 3", "mô tả 3", "1-3-2020", "có ips", "10-40", "chống lóa", "có", "FullHD"}
        };

        String[] columnName = {
            "Mã", "Tên", "Mô tả", "Ngày sản xuất", "Loại", "Inch", "Khả năng", "Còn khả dụng", "Độ phân giải"
        };
        
        DefaultTableModel defaultTableModel = new DefaultTableModel(data, columnName);
        JTable tbTivi = new JTable(defaultTableModel);
        tbTivi.setBackground(Color.pink);

        JScrollPane jScrollPane = new JScrollPane(tbTivi);

        JTextField txtMa = new JTextField(10);
        JTextField txtTen = new JTextField(10);
        JTextArea jTextArea = new JTextArea(1, 10);

        JComboBox<String> cbLoai = new JComboBox<>();
        cbLoai.addItem("Có IPS");
        cbLoai.addItem("Không có IPS");

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

        JRadioButton rdCo = new JRadioButton("Có");
        JRadioButton rdKhong = new JRadioButton("Không");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rdCo);
        buttonGroup.add(rdKhong);

        JDateChooser jdc = new JDateChooser();

        JButton btnThem = new JButton("Thêm");
        btnThem.addActionListener((e) -> {
            int them = JOptionPane.showConfirmDialog(null, "Bạn có muốn thêm không?", "Yes", JOptionPane.YES_NO_OPTION);
            if (them == 0) {
                JOptionPane.showMessageDialog(btnThem, "Thêm thành công");
            }
        });

        JButton btnSua = new JButton("Sửa");
        btnSua.addActionListener((e) -> {
            int sua = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa không?", "Yes", JOptionPane.YES_NO_OPTION);
            if (sua == 0) {
                JOptionPane.showMessageDialog(btnSua, "Sửa thành công");
            }
        });

        JButton btnXoa = new JButton("Xóa");
        btnXoa.addActionListener((e) -> {
            int xoa = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không?", "Yes", JOptionPane.YES_NO_OPTION);
            if (xoa == 0) {
                JOptionPane.showMessageDialog(btnXoa, "Xóa thành công");
            }
        });

        JButton btnThoat = new JButton("Thoát");
        btnThoat.addActionListener((e) -> {
            int thoat = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không?", "Yes", JOptionPane.YES_NO_OPTION);
            if (thoat == 0) {
                System.exit(0);
            }
        });

        pn1.add(new JLabel("Thông tin Tivi"));
        pn2.add(new JLabel("Mã"));
        pn2.add(txtMa);
        pn3.add(new JLabel("Tên"));
        pn3.add(txtTen);
        pn4.add(new JLabel("Mô tả"));
        pn4.add(jTextArea);
        pn5.add(new JLabel("Ngày sản xuất"));
        pn5.add(jdc);
        pn6.add(new JLabel("Loại"));
        pn6.add(cbLoai);
        pn7.add(new JLabel("Inch"));
        pn7.add(cbInch);
        pn8.add(new JLabel("Khả năng"));
        pn8.add(new JCheckBox("Chống lóa"));
        pn8.add(new JCheckBox("Kết nối nhanh"));
        pn9.add(new JLabel("Còn khả dụng"));
        pn9.add(rdCo);
        pn9.add(rdKhong);
        pn10.add(new JLabel("Độ phân giải"));
        pn10.add(cbDoPhanGiai);
//        pn11.add(jScrollPane);
        pn12.add(btnThem);
        pn12.add(btnSua);
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
