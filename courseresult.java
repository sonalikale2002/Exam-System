import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class courseresult extends JPanel
{
		// particular subject result show all the student
	JLabel L1,L2;
	JTextField tx1;
	JButton b1,b2;
	JComboBox cb1;
//	String user1[] ={"Softwave","physics","sanskrit","hindi","English"};
	courseresult()
	{
		setLayout(null);
		Color c = new Color(176,196,222);
		setBackground(c);
		Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,25);
		Font f1 = new Font("Corsiva Hebrew",Font.BOLD,30);
		Font f2 = new Font("Corsiva Hebrew",Font.BOLD,50);
		L1 = new JLabel("Course : ");
		L1.setBounds(800,50,300,70);
		L1.setFont(f2);
		add(L1);
		L2 = new JLabel("Avaliable Course : ");
		L2.setBounds(380,400,700,70);
		L2.setFont(f);
		add(L2);
		cb1 = new JComboBox();
		cb1.setBounds(700,400,300,70);
		cb1.setFont(f1);
		add(cb1);
		//button
		b1 = new JButton("SEARCH");
		b1.setBounds(1100,400,150,70);
		b1.setFont(f);
		add(b1);
		b2 = new JButton("BACK");
		b2.setBounds(50,900,150,70);
		b2.setFont(f);
		add(b2);
	}
}