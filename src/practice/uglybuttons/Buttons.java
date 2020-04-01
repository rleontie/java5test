package practice.uglybuttons;

//
// Authors: Rahul Simha, Tim Wood
// Created: October 21, 2000
//
// BorderLayout: all directions.

import java.awt.*;
        import javax.swing.*;

class UglyButtonFrame extends JFrame {

    // Constructor.
    public UglyButtonFrame (int width, int height)
    {
        // On Mac-OS-X, you may add this for the default Java look:
        try {
            UIManager.setLookAndFeel (UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Set the title and other frame parameters.
        this.setTitle ("Button example");
        this.setResizable (true);
        this.setSize (width, height);

        // Extract the contentPane because we'll
        // need to refer to it a couple of times.
        Container cPane = this.getContentPane();

        // Create a bunch of ugly uglybuttons!

        // Show the frame.
        this.setVisible (true);
    }

} // End of class "UglyButtonFrame"


public class Buttons {

    public static void main (String[] argv)
    {
        UglyButtonFrame nf = new UglyButtonFrame (300, 200);
    }

}