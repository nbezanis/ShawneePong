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
}
