package practice.dots;

import util.DotPanel;
import util.Helper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by timwood on 11/9/16.
 */
public class DotKeys extends JFrame implements ActionListener, KeyListener {
	private static final long serialVersionUID = -5176170979783243427L;

	/** The Dot Panel object you will draw to */
	protected static DotPanel dp;
	MovableDot activeDot;

	/* Define constants using static final variables */
	public static final int MAX_X = 20;
	public static final int MAX_Y = 20;
	private static final int DOT_SIZE = 16;


	public DotKeys() {
		this.setSize(MAX_X * DOT_SIZE, MAX_Y * DOT_SIZE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Dots!");

		/* Create and set the size of the panel */
		dp = new DotPanel(MAX_X, MAX_Y, DOT_SIZE);

		/* Add the panel to the frame */
		Container cPane = this.getContentPane();

		cPane.setLayout(new BorderLayout());
		cPane.add(dp);
		JButton button = new JButton("Button Test!");
		cPane.add(button, BorderLayout.SOUTH);
		button.addActionListener(this);
		// Need to prevent button from getting focus (which would cause it to intercept the key presses)
		button.setFocusable(false);

		this.addKeyListener(this);

		/* Initialize the DotPanel canvas:
		 * You CANNOT draw to the panel BEFORE this code is called.
		 * You CANNOT add new widgets to the frame AFTER this is called.
		 */
		this.pack();
		dp.init();
		dp.clear();
		dp.setPenColor(Color.red);
		this.setVisible(true);

		activeDot = new MovableDot(5, 5, Color.green);

		while(true)
		{
			dp.clear();
			activeDot.draw(dp);
			dp.repaintAndSleep(33);
		}

	}

	public static void main(String[] args) {
		new DotKeys();
	}


	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		Color randColor = Color.getHSBColor((float)Helper.nextDouble(), (float)Helper.nextDouble(), (float)Helper.nextDouble());
		int x,y;
		x = Helper.nextInt(MAX_X);
		y = Helper.nextInt(MAX_Y);
		MovableDot dot = new MovableDot(x, y, randColor);
		activeDot = dot;
		System.out.println("New dot at dot coordinate: " + x + ", " + y);
	}


	@Override
	public void keyTyped(KeyEvent keyEvent) {
	}

	@Override
	public void keyPressed(KeyEvent keyEvent) {
		System.out.print(keyEvent.getKeyChar());
		switch(keyEvent.getKeyCode()) {
			case KeyEvent.VK_DOWN:
				activeDot.moveDown();
				break;
			case KeyEvent.VK_RIGHT:
				activeDot.moveRight();
				break;
			case KeyEvent.VK_LEFT:
				activeDot.moveLeft();
				break;
			case KeyEvent.VK_UP:
				activeDot.moveUp();
				break;
		}

	}

	@Override
	public void keyReleased(KeyEvent keyEvent) {
	}
}
