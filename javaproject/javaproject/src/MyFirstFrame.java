
import java.awt.*;
import javax.swing.*;

public class MyFirstFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,500);
		frame.setLocation(100,50);
		frame.setBounds(100, 50, 500, 500);
		frame.setTitle("My frame");
		ImageIcon icon = new ImageIcon("C:\\Users\\91722\\OneDrive\\Pictures\\my photo\\mahesh.jpeg");
		frame.setIconImage(icon.getImage());
		Container c= frame.getContentPane();
		c.setBackground(Color.GRAY);
		frame.setVisible(true);
		//frame.setResizable(false);
	}

}
