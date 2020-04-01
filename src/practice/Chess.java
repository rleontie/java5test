package practice;
// Template for Draw a chessboard

import java.awt.*;
import javax.swing.*;

// Create a JPanel subclass to override paintComponent()

class NewPanel extends JPanel {

    public NewPanel ()
    {
        this.setBackground (Color.cyan);
    }

    // PUT YOUR CODE HERE

}


class ChessFrame extends JFrame {

    // Constructors.
    public ChessFrame(int width, int height)
    {
        // Set the title and other parameters.
        this.setTitle ("Chessboard");
        this.setResizable (true);
        this.setSize (width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Create panel and add it.
        this.getContentPane().add (new NewPanel());

        // Show the frame.
        this.setVisible (true);
    }

    // No-parameter constructor - use a default size.
    public ChessFrame()
    {
        this (500, 500);
    }

}

public class Chess {

    public static void main (String[] argv)
    {
        ChessFrame f = new ChessFrame (500, 500);
    }

}