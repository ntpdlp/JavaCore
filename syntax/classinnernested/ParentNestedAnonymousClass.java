package basic.syntax.classinnernested;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParentNestedAnonymousClass extends JFrame {
    ParentNestedAnonymousClass(){
        JButton btnPrint = new JButton("Print");
        JPanel panel = new JPanel();
        panel.add(btnPrint);
        add(panel);

        btnPrint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
            }
        });
    }

    public static void main(String[] args) {
        ParentNestedAnonymousClass helloForm = new ParentNestedAnonymousClass();
        helloForm.setTitle("Using anonymous in ActionListener - Functional Interface");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height*1/3;
        int width = screenSize.width*1/3;
        helloForm.setPreferredSize(new Dimension(height,width));
        helloForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        helloForm.setVisible(true);
    }
}
