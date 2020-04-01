package guis;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class HelloSwing {
    public static void main (String[] argv)
    {
        JFrame f = new JFrame ();
        f.setSize (200, 100);
        f.setResizable(false);

        //   First, extract the contentPane
        Container cPane = f.getContentPane();
        //   Then, set its color to something hideous.
        cPane.setBackground (Color.cyan);
        //   Display.
        f.setVisible (true);
        f.setTitle("Hello World");

    }
}