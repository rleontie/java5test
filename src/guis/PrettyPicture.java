package guis;

import java.awt.*;

import javax.swing.*;

// This is a class we can use to make an object and draw things inside of
// Extend JPanel to override its paintComponent() method:
class PrettyPanel extends JPanel {

	// Set background in constructor.
	public PrettyPanel (Color c)
	{
		this.setBackground (c);
	}


	// Override paintComponent():
	public void paintComponent (Graphics g)
	{
		// Always call super.paintComponent (g):
		super.paintComponent(g);

		g.setColor(Color.yellow);
		g.drawString("Hello!!!", 50, 100);
		g.drawRect(40, 40, 200, 200);

	}

}

public class PrettyPicture {

	public static void main (String[] argv)
	{
		// Create a frame
		JFrame f = new JFrame ();
		// make the program exit when the close button is clicked
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the title and other parameters.
		f.setTitle ("Drawing Test");
		f.setResizable (true);
		f.setSize (500, 300);

		// Add the panel to the frame's content pane
		PrettyPanel panel = new PrettyPanel (Color.red);
		Container cPane = f.getContentPane ();
		cPane.setLayout(new GridLayout(1,0));
		cPane.add (panel);
		// Show the frame.
		f.setVisible (true);
	}

}
