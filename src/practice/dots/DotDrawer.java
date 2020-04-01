package practice.dots;

import util.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Created by timwood on 11/9/16.
 */
public class DotDrawer extends JFrame implements ActionListener, MouseListener, MouseMotionListener {
	private static final long serialVersionUID = -5176170979783243427L;

	/** The Dot Panel object you will draw to */
	protected static DotPanel dp;
	ArrayList<Dot> dots;
	Dot draggedDot;

	/* Define constants using static final variables */
	public static final int MAX_X = 100;
	public static final int MAX_Y = 100;
	private static final int DOT_SIZE = 6;


	public DotDrawer() {
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
		dp.addMouseListener(this);
		dp.addMouseMotionListener(this);

		/* Initialize the DotPanel canvas:
		 * You CANNOT draw to the panel BEFORE this code is called.
		 * You CANNOT add new widgets to the frame AFTER this is called.
		 */
		this.pack();
		dp.init();
		dp.clear();
		dp.setPenColor(Color.red);
		this.setVisible(true);

		dots = new ArrayList<Dot>();

		while(true)
		{
			dp.clear();
			for(Dot d: dots) {
				d.draw(dp);
			}
			dp.repaintAndSleep(33);
		}

	}

	public static void main(String[] args) {
		new DotDrawer();
	}


	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		Color randColor = Color.getHSBColor((float)Helper.nextDouble(), (float)Helper.nextDouble(), (float)Helper.nextDouble()*2);
		int x,y;
		x = Helper.nextInt(MAX_X);
		y = Helper.nextInt(MAX_Y);
		Dot dot = new Dot(x, y, randColor);
		dots.add(dot);
		System.out.println("New dot at dot coordinate: " + x + ", " + y);
	}

	@Override
	public void mouseClicked(MouseEvent mouseEvent) {
		System.out.println("Clicked at screen coordinate: " + mouseEvent.getX() / DOT_SIZE + ", " + mouseEvent.getY() / DOT_SIZE);
	}

	@Override
	public void mousePressed(MouseEvent mouseEvent) {
		for(Dot dot : dots) {
			if (dot.x == mouseEvent.getX() / DOT_SIZE && dot.y == mouseEvent.getY() / DOT_SIZE) {
				draggedDot = dot;
				return;
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent mouseEvent) {
		draggedDot = null;
	}

	@Override
	public void mouseEntered(MouseEvent mouseEvent) {

	}

	@Override
	public void mouseExited(MouseEvent mouseEvent) {

	}

	@Override
	public void mouseDragged(MouseEvent mouseEvent) {
		if(draggedDot != null) {
			draggedDot.x = mouseEvent.getX() / DOT_SIZE;
			draggedDot.y = mouseEvent.getY() / DOT_SIZE;
		}
	}

	@Override
	public void mouseMoved(MouseEvent mouseEvent) {

	}

}