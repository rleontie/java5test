package guis.buttons;

//adapted from code by Prof. Simha

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class QuitActionListener implements ActionListener{
    public void actionPerformed(ActionEvent a) {
        System.exit(0);
    }

}

class NewFrame2 extends JFrame {
    // Note: Frame does not implement ActionListener anymore

    // Data.
    private JButton quitB; // Quit button.
    private JButton helloB, byeB; // Two silly buttons.
    private JLabel msg;


    // Constructor.
    public NewFrame2(int width, int height) {
        // Set the title and other frame parameters.
        this.setTitle("Button Test");
        this.setResizable(true);
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // We'll use a flowlayout
        Container cPane = this.getContentPane();
        cPane.setLayout(new FlowLayout());

        // Quit button
        quitB = new JButton("Quit");
        quitB.setBackground(Color.red);

        quitB.addActionListener(new QuitActionListener());
        cPane.add(quitB);


        // "Hello" button
        helloB = new JButton("Hello");
        helloB.setBackground(Color.green);
        cPane.add(helloB);

        // "Bye" button
        byeB = new JButton("Bye");
        byeB.setBackground(Color.red);
        cPane.add(byeB);

        msg = new JLabel("msg...");
        cPane.add(msg);

        // Show the frame.
        this.setVisible(true);
    }

} // End of class "NewFrame"

public class ButtonTest {

    public static void main(String[] argv) {
        NewFrame2 nf = new NewFrame2(300, 200);
    }

}