import java.awt.Graphics;

/** a class for the ball*/
public class Ball {
	public int x,y;
	public final int RADIUS = 10;//10 is a placeholder value, change it to whatever looks good
	public Ball(int x, int y) {//constructor containing the initial x and y positions for the ball
		this.x = x;
		this.y = y;
	}
	
	//this function is for updating the ball's position data and stuff
	public void update() {
		
	}
	
	
	//this function is for drawing the ball, I'm putting this in the ball class because it would be easier to access the x and y positions of the ball
	//in the ball class itself rather than in the display class
	public void draw(Graphics g) {
		
	}
}
