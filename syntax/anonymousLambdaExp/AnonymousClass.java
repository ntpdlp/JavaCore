package basic.syntax.anonymousLambdaExp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass extends JFrame {

    AnonymousClass(){
        JButton btnHello = new JButton("Hello");
        JButton btnWorld = new JButton("World");
        JPanel panel = new JPanel();
        panel.add(btnHello);
        panel.add(btnWorld);
        add(panel);

        //anonymous class
        btnHello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
            }
        });

        //lambda expression
        btnWorld.addActionListener( e -> {
            System.out.println("World");
        });
    }

    public static void main(String[] args) {
        AnonymousClass helloForm = new AnonymousClass();
        helloForm.setTitle("Hello World");
        helloForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        helloForm.setVisible(true);
    }

}
