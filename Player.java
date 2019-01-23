import java.awt.Graphics;

//a class for the 2 stick things that the players control
public class Player {
	
	public int x, y;//variables for the x and y positions of the player
	public final int WIDTH = 50;
	public final int HEIGHT = 100;//width and height of the stick things, 50 and 100 are placeholders just change it to whatever looks the best
	
	public Player() {//just a default constructor, I don't really have anything to put in here for now but maybe something will come up later
		
	}
	
	//this function is for updating the player's position data and stuff
	public void update() {
		
	}
	
	//this function is for drawing the player's stick thing, I'm putting this in the player class because it would be easier to access the x and y positions of the player
	//in the player class itself rather than in the display class
	public void draw(Graphics g) {
		
	}
	
	//this function takes a range of numbers and uses proportions to map it to another range of numbers. ex: if I had a color value 200 from 0 to 255 and I wanted to
	//put it on a scale of 0 to 1, this function will do that. I made it static in case it might be useful outside the player class.
	//value = the number to be mapped (200 from the color example)
	//istart = the beginning of the first range of numbers (0 in my color example)
	//istop = the end of the first range of numbers (255 in my color example)
	//ostart = the beginning of the second range of numbers (0 in my color example)
	//ostop = the end of the second range of numbers (1 in my color example)
	public static double map(double value, double istart, double istop, double ostart, double ostop) {
		return ostart + (ostop - ostart) * ((value - istart) / (istop - istart));
	}
	
	//funtion that converts degrees to radians
	//angle = angle to be converted
	public static double toRads(double angle) {
		return angle * (Math.PI/180);
	}
}
