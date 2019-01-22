import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;
/**Actual holder for the game display. Add this to a container and it should work*/
public class PongDisplay extends JPanel {
	private static final int FPS_GOAL = 60; //can be changed easily
	private static final long serialVersionUID = 1L; //unused, just to get the editor to
	//shut up about the serial version
	private Timer repainter;
	//TODO change this in order to get access to pong game
	public PongDisplay() {
		constructPanel();
		createRepainter();
	}
	private void constructPanel() {
		setOpaque(false); //makes the background not displayed (transparent)
		setLayout(new BorderLayout()); //if an hud is needed it will allow a nice placement
		//in the center or at the edges
	}
	private void createRepainter() {
		int milliDelay = (int) 1000.0 / FPS_GOAL; //sets the millisecond delay to produce
		//the desired FPS (rounding down always, producing a slightly faster refresh rate)
		repainter = new Timer(milliDelay, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ignore the action event, it is unhelpful in this case
				repaint(); //repaint the panel
			}
		});
	}
	public void startRepainting() {
		repainter.start();
	}
	public void stopRepainting() {
		repainter.stop();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g); //repaints anything the superclass wants to do
		//this includes subcomponents (aka potentially an in game menu) and borders
		//if necessary
		g.drawString("suh dude", 100, 100);
		//right here I would put pongGame.drawGame(g) or something similar
		//however more code would have to be written for it to work
	}
}
