import javax.swing.JFrame;

public class ShawneePong extends JFrame{
	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		System.out.println("Yeet");
		PongDisplay d = new PongDisplay(player1, player2);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.add(d);
		frame.setVisible(true);
	}
}
