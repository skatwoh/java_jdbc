/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package date5_adv_layout;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class DangKi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        GridLayout girdLayout = new GridLayout(8, 1);
        frame.setLayout(girdLayout);

        FlowLayout centerLayout = new FlowLayout(FlowLayout.CENTER);

        JPanel pn1 = new JPanel(centerLayout);
        JPanel pn2 = new JPanel(centerLayout);
        JPanel pn3 = new JPanel(centerLayout);
        JPanel pn4 = new JPanel(centerLayout);
        JPanel pn5 = new JPanel(centerLayout);
        JPanel pn6 = new JPanel(centerLayout);
        JPanel pn7 = new JPanel(centerLayout);
        JPanel pn8 = new JPanel(centerLayout);

        JTextField jTextField1 = new JTextField("_______________");
        JTextField jTextField2 = new JTextField("_______________");
        JComboBox<String> jComboBox = new JComboBox();
        jComboBox.addItem("Môn1");
        jComboBox.addItem("Môn2");
        JRadioButton rdNam = new JRadioButton();
        rdNam.setText("Nam");
        JRadioButton rdNu = new JRadioButton();
        rdNu.setText("Nữ");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rdNam);
        bg.add(rdNu);

        JCheckBox cbCheck = new JCheckBox("Tôi đã đóng tiền");

        JButton btnNop = new JButton("Nộp");
        btnNop.addActionListener((e) -> {
            JOptionPane.showMessageDialog(jComboBox, "Nộp");
        });

        JButton btnThoat = new JButton("Thoát");
        btnThoat.addActionListener((e) -> {
            System.exit(0);
        });
        
        
        pn1.add(new JLabel("Đơn đăng kí học lại"));
        pn2.add(new JLabel("MSSV"));
        pn2.add(jTextField1);
        pn3.add(new JLabel("Email"));
        pn3.add(jTextField2);
        pn4.add(new JLabel("Môn học"));
        pn4.add(jComboBox);
        pn5.add(new JLabel("Giới tính"));
        pn5.add(rdNam);
        pn5.add(rdNu);
        pn6.add(cbCheck);
        pn7.add(btnNop);
        pn7.add(btnThoat);

        frame.add(pn1);
        frame.add(pn2);
        frame.add(pn3);
        frame.add(pn4);
        frame.add(pn5);
        frame.add(pn6);
        frame.add(pn7);

        frame.pack();

    }

}
