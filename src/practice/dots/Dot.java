package practice.dots;

import util.DotPanel;

import java.awt.*;

/**
 * Created by timwood on 11/11/16.
 */
public class Dot {

	public int x, y;
	private Color c;


	public Dot(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		this.c = c;
	}

	public void draw(DotPanel dotPanel) {
		dotPanel.setPenColor(c);
		dotPanel.drawDot(x,y);
	}

}
