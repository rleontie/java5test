package guis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloSwing2 {
	public static void main (String[] argv)
	{
		JFrame f = new JFrame ();
		// make the program exit when the close button is clicked
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize (300, 300);

		//   First, extract the contentPane
		Container cPane = f.getContentPane();
		//   Then, set its color.
		cPane.setBackground (Color.white);
		// 	 Then add more components to it.
		JLabel helloLabel = new JLabel("Hello Swing Components!");
		cPane.add(helloLabel);


		// Display.
		f.setVisible (true);

	}
}
