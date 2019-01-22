import javax.swing.JFrame;

public class ShawneePong extends JFrame{
	public static void main(String[] args) {
		System.out.println("Yeet");
		PongDisplay d = new PongDisplay();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.add(d);
		frame.setVisible(true);
	}
}
