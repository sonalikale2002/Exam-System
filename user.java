import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class user extends JPanel
{
	// user list for check the admin "user_regis"
	JLabel L1,L2;
	JComboBox cg1;
	JButton b1,b2;
//	String user[] ={"dev","kavita","sonu","sonali","lokesh","pinki"};
	user()
	{
		setLayout(null);
		Color c = new Color(176,196,222);
		setBackground(c);
		Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,20);
		Font f1 = new Font("Corsiva Hebrew",Font.BOLD,30);
		// heading
		L1 = new JLabel("USERS");
		L1.setBounds(800,50,200,70);
		L1.setFont(f1);
		add(L1);
		// check the student list
		L2 = new JLabel("Avaliable user :");
		L2.setBounds(200,200,400,40);
		L2.setFont(f);
		add(L2);
		cg1 = new JComboBox();
		cg1.setBounds(400,200,300,40);
		cg1.setFont(f);
		add(cg1);
	// button 
		b1 = new JButton("search");
		b1.setBounds(750,200,130,40);
	    b1.setBackground(Color.white);
		b1.setFont(f);
		add(b1);
		b2 = new JButton("Back");
		b2.setBounds(50,900,150,70);
		b2.setFont(f);
		add(b2);
	}
}