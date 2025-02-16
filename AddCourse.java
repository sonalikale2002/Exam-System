import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class AddCourse extends JPanel 
{
	JTextField tx1,tx2,tx3,tx4;
	JButton b1,b2;
	JLabel L1,L2;
	JComboBox cb1;
	String Marks[] ={"1","2","3","4","5","6","7","8","9","10"};
	AddCourse()
	{
		setLayout(null);
		Color c = new Color(176,196,222);
		setBackground(c);
		Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,20);
		Font f1 = new Font("Corsiva Hebrew",Font.BOLD,30);
		//heading 
		L1 = new JLabel("ADD NEW COURSES");
		L1.setBounds(800,50,500,60);
		L1.setFont(f1);
		add(L1);
		// course name
		tx1 = new JTextField(20);
		tx1.setBounds(750,500,400,40);
		tx1.setFont(f1);
		add(tx1);
	   // time hours
		tx2 = new JTextField(10);
		tx2.setBounds(800,570,70,40);
		tx2.setFont(f1);
		add(tx2);
		// time minutes
		tx3 = new JTextField(10);
		tx3.setBounds(900,570,70,40);
		tx3.setFont(f1);
		add(tx3);
		// time second
		tx4 = new JTextField(10);
		tx4.setBounds(1000,570,70,40);
		tx4.setFont(f1);
		add(tx4);
	     // every question marks set
	    cb1 = new JComboBox(Marks);
		cb1.setBounds(900,670,100,40);
		cb1.setFont(f1);
		add(cb1);
		
	    L1 = new JLabel("Marks :");
		L1.setBounds(750,650,130,70);
		L1.setForeground(Color.white);
		L1.setFont(f1);
		add(L1);
		// button add course in data course table
		b1 = new JButton("ADD COURSE");
		b1.setBounds(800,750,200,60);
		b1.setFont(f);
		add(b1);
		
		b2 = new JButton("Back");
		b2.setBounds(50,900,150,70);
		b2.setFont(f);
		add(b2);
		
		
	}
	
}