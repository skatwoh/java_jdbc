/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date5_adv_layout;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class DemoLayout_adv {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo Layout");
        frame.setVisible(true); //hiển thị frame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // tắt chương trình khi x
        frame.setLocationRelativeTo(null);//để frame giữa màn hình

        GridLayout gridLayout = new GridLayout(4, 1); // 4 dòng x 1 cột
        frame.setLayout(gridLayout);

        FlowLayout centerLayout = new FlowLayout(FlowLayout.CENTER);
        FlowLayout leftLayout = new FlowLayout(FlowLayout.LEFT);
        FlowLayout rightLayout = new FlowLayout(FlowLayout.RIGHT);

        JPanel pnFirst = new JPanel(centerLayout);
        JPanel pnSecond = new JPanel(leftLayout);
        JPanel pnThird = new JPanel(leftLayout);
        JPanel pnFourth = new JPanel(rightLayout);
        
        JButton btnThoat = new JButton("Thoát");
        btnThoat.addActionListener((e) -> {
            System.exit(0);
        });

        pnFirst.add(new JLabel("MSSV"));
        pnSecond.add(new JButton("Xem"));
        pnSecond.add(new JButton("Thêm"));
        pnThird.add(new JButton("Sửa"));
        pnThird.add(new JButton("Xóa"));
        pnFourth.add(btnThoat);

        frame.add(pnFirst);
        frame.add(pnSecond);
        frame.add(pnThird);
        frame.add(pnFourth);

        frame.pack();
    }
}
