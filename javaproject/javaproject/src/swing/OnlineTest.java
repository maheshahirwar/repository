package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OnlineTest extends JFrame implements ActionListener{

	//private static final long seriesVersionUID=1L;
	JLabel label;
	JRadioButton radioButton[]=new JRadioButton[5];
	JButton btnNext,btnBookmark;
	ButtonGroup bg;
	int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];
	//create JFrame with radioButton and JButton
	OnlineTest(String s) {
		super(s);
		label=new JLabel();
		add(label);
		bg=new ButtonGroup();
		for(int i=0; i<5; i++) {
			radioButton[i]=new JRadioButton();
			add(radioButton[i]);
			bg.add(radioButton[i]);
		}
		btnNext=new JButton("Next");
		btnBookmark=new JButton("Bookmark");
		btnNext.addActionListener(this);
		btnBookmark.addActionListener(this);
		add(btnNext);
		add(btnBookmark);
		set();
		label.setBounds(10, 10, 1500, 20);
		radioButton[0].setBounds(100, 80, 450, 20);
		radioButton[1].setBounds(100, 110, 200, 20);
		radioButton[2].setBounds(100, 140, 200, 20);
		radioButton[3].setBounds(100, 170, 200, 20);
		btnNext.setBounds(100, 240, 100, 30);
		btnBookmark.setBounds(270, 240, 100, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(0,0);
		setVisible(true);
		setSize(1500,1000);
	}
	
	 void set() {
		 radioButton[4].setSelected(true);
			if(current==0) {
				label.setText("Que1: Which of the following fraction is the largest ?");
				radioButton[0].setText("7/8");
				radioButton[1].setText("13/16");
				radioButton[2].setText("31/40");
				radioButton[3].setText("63/80");
			}
			if(current==1) {
				label.setText("Que2: .009/? = .01 ");
				radioButton[0].setText(".0009");
				radioButton[1].setText(".09");
				radioButton[2].setText(".9");
				radioButton[3].setText("9");
			}
			if(current==2) {
				label.setText("Que3: What is Arun's present age ?\n"
						+ "I. Five years ago, Arun's age was double that of his son's age at that time.\n"
						+ "II. Present ages of Arun and his son are in the ratio of 11:6 respectively.\n"
						+ "III. Five years hence, the respective ratio of Arun's age and his son's age will become 12:7.");
				radioButton[0].setText("Only I and II");
				radioButton[1].setText("Only II and III");
				radioButton[2].setText("Only I and III");
				radioButton[3].setText("Any two of the three");
			}
			if(current==3) {
				label.setText("Que4: If 20% of a=b , then b% of 20 is the same as: ");
				radioButton[0].setText("4% of a");
				radioButton[1].setText("5% of a");
				radioButton[2].setText("20% of a");
				radioButton[3].setText("None of these");
			}
			if(current==4) {
				label.setText("Que5: 3 pumps , working 8 hours a day , can empty a tank in 2 days. How many hours a day must 4 pumps work to empty the tank in 1 day ?");
				radioButton[0].setText("9");
				radioButton[1].setText("10");
				radioButton[2].setText("11");
				radioButton[3].setText("12");
			}
			if(current==5) {
				label.setText("Que6: A man took loan from a bank at the rate of 12% p.a. simple interest. After 3 years he had to pay Rs. 5400 interest only for the period. The principle amount borrowed by him was:");
				radioButton[0].setText("Rs. 2000");
				radioButton[1].setText("Rs. 10,000");
				radioButton[2].setText("Rs. 15,000");
				radioButton[3].setText("Rs. 20,000");
			}
			if(current==6) {
				label.setText("Que7: By investing in (16(2/3))% stock at 64, one earns Rs. 1500. The investment made is:");
				radioButton[0].setText("Rs. 5640");
				radioButton[1].setText("Rs.5760");
				radioButton[2].setText("Rs.7500");
				radioButton[3].setText("Rs.9600");
			}
			if(current==7) {
				label.setText("Que8: 10,25,45,54,60,75,80");
				radioButton[0].setText("10");
				radioButton[1].setText("45");
				radioButton[2].setText("54");
				radioButton[3].setText("75");
			}
			if(current==8) {
				label.setText("Que9: 56,72,90,110,132,150");
				radioButton[0].setText("72");
				radioButton[1].setText("110");
				radioButton[2].setText("132");
				radioButton[3].setText("150");
			}
			if(current==9) {
				label.setText("Que10: 8,24,12,36,18,54,(...)");
				radioButton[0].setText("27");
				radioButton[1].setText("108");
				radioButton[2].setText("68");
				radioButton[3].setText("72");
			}
			label.setBounds(10, 10, 1500, 20);
			for(int i=0,j=0; i<=90; i+=30,j++)
				radioButton[j].setBounds(50,80+i,200,20);
	}
	   

	public static void main(String[] args) {
	new OnlineTest("Online Test App");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNext) {
			if(check())
				count=count+1;
			current++;
			set();
			if(current==9) {
					btnNext.setEnabled(false);
					btnBookmark.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Bookmark")) {
			JButton bk=new JButton("Bookmark"+x);
			bk.setBounds(480, 20+30*x, 100, 30);
			add(bk);
			bk.addActionListener(this);
			m[x]=current;
			x++;
			current++;
			set();
			if(current==9)
				btnBookmark.setText("Result");
			  setVisible(false);
			  setVisible(true);
		}
		for(int i=0,y=1;i<x; i++,y++) {
			if(e.getActionCommand().equals("Bookmark"+y)) {
				if(check())
					count=count+1;
				    now=current;
				    current=m[y];
				    set();
				    ((JButton)e.getSource()).setEnabled(false);
				    current=now;
				    		
			}
		}
		if(e.getActionCommand().equals("Result")) {
			if(check())
				count=count+1;
				current++;
				JOptionPane.showMessageDialog(this, "correct answers= "+count);
				System.exit(0);
			
		}
		}

	 boolean check() {
		if(current==0)
			return (radioButton[0].isSelected());
		if(current==1)
			return (radioButton[2].isSelected());
		if(current==2)
			return (radioButton[3].isSelected());
		if(current==3)
			return (radioButton[0].isSelected());
		if(current==4)
			return (radioButton[3].isSelected());
		if(current==5)
			return (radioButton[2].isSelected());
		if(current==6)
			return (radioButton[1].isSelected());
		if(current==7)
			return (radioButton[2].isSelected());
		if(current==8)
			return (radioButton[3].isSelected());
		if(current==9)
			return (radioButton[0].isSelected());
		return false;
	}
}