package practice.dots;

import java.awt.*;

/**
 * Created by timwood on 11/16/16.
 */
public class MovableDot extends Dot {

	public MovableDot(int x, int y, Color c) {
		super(x, y, c);
	}

	public void moveLeft(){
		if(x > 0)
			x--;
	}
	public void moveRight(){
		if(x < DotKeys.MAX_X-1)
			x++;
	}
	public void moveUp(){
		if(y > 0)
			y--;
	}
	public void moveDown(){
		if(y < DotKeys.MAX_Y-1)
			y++;
	}
}
