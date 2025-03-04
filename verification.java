import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class verification extends JPanel
{
	// verification by the admin 
	// for the student are registration
	JLabel L1,L2;
	JComboBox cv1;
	JButton b1,b2,b3,b4;
	//String user[] ={"Softwave","rohan","pinki","sonu","dev"};
	verification()
	{
		setLayout(null);
		Color c = new Color(176,196,222);
		setBackground(c);
		Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,25);
		Font f1 = new Font("Corsiva Hebrew",Font.BOLD,30);
		L1 = new JLabel("Verification");
		L1.setBounds(800,50,300,70);
		L1.setFont(f1);
		add(L1);
		L2 = new JLabel("User avaliable verification");
		L2.setBounds(300,400,700,70);
		L2.setFont(f);
		add(L2);
		cv1 = new JComboBox();
		cv1.setBounds(700,400,300,70);
		cv1.setFont(f1);
		add(cv1);
		b1 = new JButton("SEARCH");
		b1.setBounds(1100,400,150,70);
		b1.setFont(f);
		add(b1);
		b2 = new JButton("BACK");
		b2.setBounds(50,900,150,70);
		b2.setFont(f);
		add(b2);
		b3 = new JButton("DELETE");
		b3.setBounds(700,550,150,70);
		b3.setFont(f);
		add(b3);
		b4 = new JButton("VERIFY");
		b4.setBounds(900,550,150,70);
		b4.setFont(f);
		add(b4);
		
	}
}