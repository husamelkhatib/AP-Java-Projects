package Prog52aForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prog52aForm {
    private JPanel mainpanel;
    private JButton calculateButton;
    private JButton clearButton;
    private JTextField txtLen;
    private JTextField txtWid;
    private JLabel lblArea;
    private JLabel lblPerim;

    public Prog52aForm() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int len = Integer.parseInt(txtLen.getText());
                int wid = Integer.parseInt(txtWid.getText());
                int area = len * wid;
                int perim = (len * 2) + (wid * 2);
                lblArea.setText("Area: " + area);
                lblPerim.setText(("Perimeter: " + perim));
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblArea.setText("Area: ");
                lblPerim.setText(("Perimeter: "));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Prog52aForm");
        frame.setContentPane(new Prog52aForm().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
