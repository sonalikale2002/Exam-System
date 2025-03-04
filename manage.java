import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class manage extends JPanel 
{
	// which subject paper are create the decide 
	// manage couser list 
	JButton b1,b2,b3,b4;
	JLabel L1,L2;
	JComboBox cb11;
	//String subject[] ={"Apptitude","Math","English","Hindi","Science"};
	manage()
	{
		// add couser list
		setLayout(null);
		Color c = new Color(176,196,222);
		setBackground(c);
		Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,20);
		Font f1 = new Font("Corsiva Hebrew",Font.BOLD,30);
		// heading "manage courses"
		L1 = new JLabel("MANAGE COURSES");
		L1.setBounds(800,50,500,60);
		L1.setFont(f1);
		add(L1);
		// add image 
		L2 = new JLabel(new ImageIcon("A:\\project\\s37.png"));
		L2.setBackground(c);
		L2.setLocation(800,130);
		L2.setSize(300,300);
		add(L2);
		// list of course
		cb11 = new JComboBox();
		cb11.setBounds(700,500,350,80);
		cb11.setFont(f1);
		add(cb11);
		// button
		b1 = new JButton("Edit Course");
		b1.setBounds(950,650,200,60);
		b1.setFont(f);
		add(b1);
		
		b2 = new JButton("Delete");
		b2.setBounds(750,650,150,60);
		b2.setFont(f);
		add(b2);
		
		b3 = new JButton("ADD NEW COURSE");
		b3.setBounds(1100,500,250,60);
		b3.setFont(f);
		add(b3);
		
		b4 = new JButton("Back");
		b4.setBounds(50,900,150,70);
		b4.setFont(f);
		add(b4);
	}
}
