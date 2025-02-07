import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class second_page extends JPanel 
{
	JButton b1,b2;
	JLabel background,Back1;
	second_page()
	{ 
	    setLayout(null);
		Color c = new Color(176,196,222);
		setBackground(c);
		Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,30);
		background = new JLabel(new ImageIcon("A:\\project\\s26.jpeg"));
		background.setLocation(720,150);
		background.setSize(400,400);
		add(background);
		/*
		Back1 = new JLabel(new ImageIcon("A:\\project\\as2.jpeg"));
		Back1.setBounds(100,100,1000,1000);
		add(Back1);
		Back1 = new JLabel(new ImageIcon("A:\\project\\as5.jpeg"));
        Back1.setLocation(0,0);
        Back1.setSize(1000,1000);
		*/
		//first button admin login page call
		b1 = new JButton("Admin");
		b1.setBounds(730,500,350,70);
		b1.setFont(f);
		add(b1);
		// second button user registration page call
		b2 = new JButton("User");
		b2.setBounds(730,600,350,70);
		b2.setFont(f);
		add(b2);
		
	}
}
