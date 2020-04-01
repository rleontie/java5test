package guis.buttons;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; // Needed for ActionListener.

class NewFrame extends JFrame  {

    // Constructor.
    public NewFrame (int width, int height)
    {
        // Set the title and other frame parameters.
        this.setTitle ("Button example");
        this.setResizable (true);
        this.setSize (width, height);

        Container cPane = this.getContentPane();

        // Create a new button.
        JButton b = new JButton ("<html> <b> Quit </b> </html>");
        b.setBackground (Color.red);


        // BorderLayout is already the manager of the content pane
        // but leave a comment as a reminder.
        // cPane.setLayout (new BorderLayout());

        // Add the button to the south of the frame.
        cPane.add (b, BorderLayout.SOUTH);

        // Show the frame.
        this.setVisible (true);
    }

    // This method is required to implement the
    // ActionListener interface.


} // End of class "NewFrame"


public class ButtonAction {

    public static void main (String[] argv)
    {
        NewFrame nf = new NewFrame (300, 200);
    }

}