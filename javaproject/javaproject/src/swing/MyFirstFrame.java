package swing;
import java.awt.*;
import javax.swing.*;

public class MyFirstFrame {

	public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	frame.setSize(500,300);
//	frame.setLocation(100,100);
	frame.setBounds(100,100,1000,500);
	frame.setTitle("My Frame");
	ImageIcon icon=new ImageIcon("C:\\Users\\91722\\OneDrive\\Pictures\\icon\\second.jpg");
	frame.setIconImage(icon.getImage());
	Container c=frame.getContentPane();
	c.setBackground(Color.LIGHT_GRAY);
	frame.setResizable(false);
	}

}
