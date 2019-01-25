import java.awt.*; //layouts, colors, etc

import javax.swing.*; //layouts, components, etc

public class ShawneePong extends JFrame{
	public ShawneePong() {
		super();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				PongUtilities.construct();
				constructFrame();
			}
		});
	}
	public void constructFrame() {
		GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
		DisplayMode dm = e.getDefaultScreenDevice().getDisplayMode();
		setUndecorated(true); //no title bar and stuff
		e.getDefaultScreenDevice().setFullScreenWindow(this); //makes this fullscreen
		setSize(dm.getWidth(), dm.getHeight());
		getContentPane().setLayout(new BorderLayout());
		setBackground(Color.BLACK); //so it doesn't flash your eyes if panels are switched
		getContentPane().setBackground(Color.BLACK); //(truthfully idk if its necessary but its in my RTS code so here)
		//had issues with flashing before so this *might* have fixed it
		getContentPane().add(new PongMenu(), BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //if the user clicks the x it ends (wouldn't happen here)
		setVisible(true);
	}
	public static void main(String[] args) {
		Player player1 = new Player(100, 100); //placeholder values that are arbitrary and only there to get it to run
		Player player2 = new Player(900, 100); //placeholder values that are arbitrary and only there to get it to run
		System.out.println("Yeet");
		PongGameDisplay d = new PongGameDisplay(player1, player2);
		//TODO remove/move this to relevant class, it is a bad idea to
		//construct players or the game display here, chiefly because this class probably shouldn't be the game class
		//(splitting would make it look cleaner, give this class a singular specific purpose (setting up the game
		//by initializing the constants and creating a holding window) and make it more object oriented)
		//leaving it for now because the relevant class hasn't been coded yet
		
		//removed irrelevant display code displaying the menu/creating the frame has already been taken care of
		new ShawneePong();
	}
}
