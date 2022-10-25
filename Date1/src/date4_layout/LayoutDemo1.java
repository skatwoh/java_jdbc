/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package date4_layout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class LayoutDemo1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 100);
        frame.setVisible(true);

        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.RIGHT);
        frame.setLayout(flowLayout);

        JLabel lblMa = new JLabel("KhanhdqPh26583");
        lblMa.setSize(150, 20);

        JButton btnXem = new JButton("Xem");
        btnXem.setSize(100, 50);
        btnXem.addActionListener((e) -> {
            JOptionPane.showMessageDialog(frame, "Xem");
        });

        JButton btnThem = new JButton("Thêm");
        btnThem.setSize(100, 50);
        btnThem.addActionListener((e) -> {
            JOptionPane.showMessageDialog(frame, "Thêm");
        });

        JButton btnSua = new JButton("Sửa");
        btnSua.setSize(100, 50);
        btnSua.addActionListener((e) -> {
            JOptionPane.showMessageDialog(frame, "Sửa");
        });

        JButton btnXoa = new JButton("Xóa");
        btnXoa.setSize(100, 50);
        btnXoa.addActionListener((e) -> {
            JOptionPane.showMessageDialog(frame, "Xóa");
        });

        JButton btnThoat = new JButton("Thoát");
        btnXem.setSize(100, 50);
        btnThoat.addActionListener((e) -> {
            System.exit(0);
        });

        frame.add(lblMa);
        frame.add(btnXem);
        frame.add(btnThem);
        frame.add(btnSua);
        frame.add(btnXoa);
        frame.add(btnThoat);
    }

}
