package swing;

import java.awt.*;
import javax.swing.*;

public class MyFirstLabel {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		//frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,1000,500);
		frame.setTitle("My Frame");
		Container c=frame.getContentPane();
          c.setLayout(null);
          ImageIcon icon = new ImageIcon("C:\\Users\\91722\\OneDrive\\Pictures\\icon\\second.jpg");
          JLabel label=new JLabel(icon);
          label.setBounds(100,100,icon.getIconWidth(),icon.getIconHeight());
//		JLabel label=new JLabel("Username");
//		label.setBounds(100, 50, 200, 30);
//
//		Font font=new Font("Arial",Font.ITALIC,30);
//		label.setFont(font);
	c.add(label);
	frame.setVisible(true);
	}

}
