import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class admin_menu extends JPanel 
{
	JLabel L1,L2,L3,L4,L5,L6,L7;
	JButton b1,b2,b3,b4,b5,b6,b7;
	admin_menu()
	{
		setLayout(null);
		Color c = new Color(176,196,222);
		setBackground(c);
		Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,20);
		Font f1 = new Font("Corsiva Hebrew",Font.BOLD,30);
		// six image position are set admin page
		L7 = new JLabel(new ImageIcon("A:\\project\\s34.png"));
		L7.setBackground(c);
		L7.setLocation(1350,500);
		L7.setSize(200,200);
		add(L7);
		L6 = new JLabel(new ImageIcon("A:\\project\\s33.png"));
		L6.setBackground(c);
		L6.setLocation(750,470);
		L6.setSize(256,256);
		add(L6);
		L5 = new JLabel(new ImageIcon("A:\\project\\s32.jpg"));
		L5.setBackground(c);
		L5.setLocation(130,500);
		L5.setSize(250,250);
		add(L5);
		L4 = new JLabel(new ImageIcon("A:\\project\\s31.jpeg"));
		L4.setBackground(c);
		L4.setLocation(1300,170);
		L4.setSize(250,250);
		add(L4);
		L3 = new JLabel(new ImageIcon("A:\\project\\s30.jpg"));
		L3.setBackground(c);
		L3.setLocation(800,170);
		L3.setSize(170,250);
		add(L3);
		L2 = new JLabel(new ImageIcon("A:\\project\\s29.jpg"));
		L2.setBackground(c);
		L2.setLocation(130,150);
		L2.setSize(200,280);
		add(L2);
		// heading of the page 
		L1 = new JLabel("Admin Panel");
		L1.setBounds(800,50,300,70);
		L1.setFont(f1);
		add(L1);
		// six button are add 
		b1 = new JButton("Manage Course");
		b1.setBounds(400,250,220,60);
		b1.setFont(f);
		add(b1);
		b2 = new JButton("Course Result");
		b2.setBounds(1000,250,220,60);
		b2.setFont(f);
		add(b2);
		b3 = new JButton("logout");
		b3.setBounds(1600,250,150,60);
		b3.setFont(f);
		add(b3);
		b4 = new JButton("User");
		b4.setBounds(400,550,150,60);
		b4.setFont(f);
		add(b4);
		b5 = new JButton("Verification");
		b5.setBounds(1000,550,200,60);
		b5.setFont(f);
		add(b5);
		b6 = new JButton("change password");
		b6.setBounds(1600,550,250,60);
		b6.setFont(f);
		add(b6);
		//  "admin page" prevision direction call 
		b7 = new JButton("Back");
		b7.setBounds(50,900,150,70);
		b7.setFont(f);
		add(b7);
	}
}