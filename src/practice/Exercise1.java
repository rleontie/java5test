package practice;

import java.awt.*;
import javax.swing.*;

public class Exercise1 {

    public static void main (String[] argv)
    {
        // Create a Frame instance.
        JFrame f = new JFrame ();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size.
        f.setSize (200, 100);

        // Install a title for the titlebar.
        f.setTitle ("A Test Window");

        // A background color:
        //   First, extract the contentPane
        Container cPane = f.getContentPane();
        //   Then, set its color.
        cPane.setBackground (Color.cyan);

        // Get a Toolkit instance.  
        Toolkit tk = Toolkit.getDefaultToolkit ();

        // Get resolution in pixels per inch.  
        int pixelPerInch = tk.getScreenResolution ();

        // Screen dimensions can also be obtained in a Dimension instance.  
        Dimension screenSize = tk.getScreenSize ();

        // Print out results.  
        System.out.println ("Resolution: " + pixelPerInch);
        System.out.println ("Size (pixels): Height=" + screenSize.height +
                ", Width=" + screenSize.width);
        
        // Display.
        f.setVisible (true);
    }

}