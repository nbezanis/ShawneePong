import java.awt.DisplayMode;
import java.awt.GraphicsEnvironment;

/**A class to hold useful utilities for pong*/
public class PongUtilities {
	private static int SCREEN_WIDTH;
	private static int SCREEN_HEIGHT;
	private static final int GOAL_FPS = 60;
	private PongUtilities() {} //makes the class impossible to instantiate (java doesn't make a default constructor
	//if it already has one, making it private means nobody but it can instantiate it therefore impossible to create)
	/**Sets useful constants for a game of pong*/
	public static void construct() {
		GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
		DisplayMode dm = e.getDefaultScreenDevice().getDisplayMode();
		SCREEN_WIDTH = dm.getWidth();
		SCREEN_HEIGHT = dm.getHeight();
	}
	//might include stuff for loading idk yet
	
	//this function takes a range of numbers and uses proportions to map it to another range of numbers. ex: if I had a color value 200 from 0 to 255 and I wanted to
	//put it on a scale of 0 to 1, this function will do that.
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
