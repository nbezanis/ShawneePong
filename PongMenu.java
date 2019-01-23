import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PongMenu extends JPanel {
	private JPanel backgroundPanel;
	private JPanel menuPanel;
	//private PongGame gameManager (need to rename depending on others work)
	public PongMenu() {
		super();
		this.setBackground(Color.BLACK);
		this.setLayout(new BorderLayout());
		constructBackground();
		constructMenu();
		backgroundPanel.add(menuPanel, BorderLayout.CENTER);
		this.add(backgroundPanel);
	}
	private void constructBackground() {
		backgroundPanel = new JPanel();
		backgroundPanel.setLayout(new BorderLayout()); //a simple but useful layout manager
		backgroundPanel.setBackground(Color.BLACK);
	}
	private void constructMenu() {
		menuPanel = new JPanel();
		menuPanel.setOpaque(false);
		menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS)); //vertical box
		menuPanel.add(Box.createVerticalGlue());
		JLabel titleLabel = new JLabel();
		titleLabel.setForeground(Color.WHITE); //text color
		titleLabel.setFont(new Font("Dialog", Font.BOLD, 48)); //ive used this before, has looked good
		titleLabel.setText("Pong");
		titleLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		menuPanel.add(titleLabel);
		menuPanel.add(Box.createVerticalStrut(100));
		String[] buttonNames = {"Multiplayer", "Singleplayer", "Quit"};
		ActionListener[] buttonFunctions = getButtonFunctions();
		for (int i = 0; i < buttonNames.length; i++) {
			JButton button = new JButton();
			button.setText(buttonNames[i]);
			if (buttonNames[i].equalsIgnoreCase("Singleplayer")) {
				button.setEnabled(false);
			}
			button.setAlignmentX(JButton.CENTER_ALIGNMENT);
			button.addActionListener(buttonFunctions[i]); //adds appropriate function
			menuPanel.add(button);
			if (i != (buttonNames.length - 1)) {
				menuPanel.add(Box.createVerticalStrut(20)); //spacing
			}
		}
		menuPanel.add(Box.createVerticalGlue());
		JLabel authorLabel = new JLabel();
		authorLabel.setForeground(Color.WHITE); //text color
		authorLabel.setFont(new Font("Dialog", Font.ITALIC, 32)); //ive used this before, has looked good
		authorLabel.setText("Created by the 2018-2019 Computer Science Club");
		authorLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		menuPanel.add(authorLabel);
		menuPanel.add(Box.createVerticalStrut(20)); //spacing
	}
	private ActionListener[] getButtonFunctions() {
		ActionListener[] listeners = new ActionListener[3];
		listeners[0] = new ActionListener() { //multiplayer
			public void actionPerformed(ActionEvent e) {
				//boot multiplayer
			}
		};
		listeners[1] = new ActionListener() { //singleplayer (aka AI)
			public void actionPerformed(ActionEvent e) {
				//boot singleplayer
			}
		};
		listeners[2] = new ActionListener() { //multiplayer
			public void actionPerformed(ActionEvent e) {
				System.exit(0); //exits normally
			}
		};
		return listeners;
	}
}
