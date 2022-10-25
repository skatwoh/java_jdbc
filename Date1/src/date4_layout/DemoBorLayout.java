/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package date4_layout;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class DemoBorLayout {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo BorderLayout");
        BorderLayout layout = new BorderLayout();
        frame.setLayout(layout);

        JLabel lblTop = new JLabel("Top");
        JLabel lblBottom = new JLabel("Bottom");
        JLabel lblLeft = new JLabel("Left");
        JLabel lblRight = new JLabel("Right");
        JLabel lblMiddle = new JLabel("Middle");

        layout.addLayoutComponent(lblTop, BorderLayout.NORTH);
        layout.addLayoutComponent(lblBottom, BorderLayout.SOUTH);
        layout.addLayoutComponent(lblLeft, BorderLayout.WEST);
        layout.addLayoutComponent(lblRight, BorderLayout.EAST);
        layout.addLayoutComponent(lblMiddle, BorderLayout.CENTER);

        frame.setLayout(layout);

        frame.add(lblTop);
        frame.add(lblBottom);
        frame.add(lblLeft);
        frame.add(lblRight);
        frame.add(lblMiddle);

        frame.pack();
        frame.setVisible(true);
    }

}
