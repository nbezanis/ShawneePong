import java.awt.Color;
import java.awt.Graphics;

/**a class for the 2 stick things that the players control*/
public class Player {
	
	public int x, y;//variables for the x and y positions of the player
	public final int WIDTH = 50;
	public final int HEIGHT = 100;//width and height of the stick things, 50 and 100 are placeholders just change it to whatever looks the best
	
	public Player(int x, int y) {//just a default constructor, I don't really have anything to put in here for now but maybe something will come up later
		this.x = x;//the x and y in the constructor are for the sticks' starting positions
		this.y = y;
	}
	
	//this function is for updating the player's position data and stuff
	public void update() {
		
	}
	
	//this function is for drawing the player's stick thing, I'm putting this in the player class because it would be easier to access the x and y positions of the player
	//in the player class itself rather than in the display class
	public void draw(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x, y, WIDTH, HEIGHT);
		g.setColor(c);
	}
}
