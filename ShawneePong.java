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
		getContentPane().add(new PongMenu(), BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //if the user clicks the x it ends (wouldn't happen here)
		setVisible(true);
	}
	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		System.out.println("Yeet");
		PongGameDisplay d = new PongGameDisplay(player1, player2);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.add(d);
		frame.setVisible(true);
		new ShawneePong();
	}
}
