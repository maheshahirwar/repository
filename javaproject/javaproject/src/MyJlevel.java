import java.awt.*;

import javax.swing.*;

public class MyJlevel {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 1000, 500);
		frame.setTitle("My Title");
		Container c = frame.getContentPane();
		c.setLayout(null);
		ImageIcon icon = new ImageIcon("C:\\Users\\91722\\OneDrive\\Pictures\\my photo\\mahesh1.jpg");
		JLabel label = new JLabel(icon);
		label.setBounds(200, 100, icon.getIconWidth(),icon.getIconHeight());
		c.add(label);
	}

}
