import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Couresult extends JPanel
{
	// show all code the are this page
	JLabel L1,L2,L3;
	JButton b2;
	JTable jt;
	JScrollPane jp,ju;
	static String data[][]=new String[100][11];
	static int i=0,j,k;
	String col1[]={"sno","Username","Name","Total Question","Attempt Question","Correct Question","Wrong Question","Total Marks","Marks Obtained","precentage"};
	Couresult()
	{
		setLayout(null);
		Color c = new Color(176,196,222);
		Color c1 = new Color(230,245,245);
		setBackground(c);
		Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,15);
		Font f1 = new Font("Corsiva Hebrew",Font.BOLD,30);
		Font f2 = new Font("Corsiva Hebrew",Font.BOLD,50);
		// heading
		L1 = new JLabel("COURSE RESULT");
		L1.setBounds(800,50,500,70);
		L1.setFont(f2);
		add(L1);
		L2 = new JLabel("COURSE NAME :");
		L2.setBounds(700,130,500,70);
		L2.setFont(f1);
		add(L2);
		L3 = new JLabel("");
		L3.setBounds(1000,130,600,70);
		L3.setFont(f1);
		add(L3);
	     // tab are create show purpose
		jt=new JTable(data,col1);
		jp=new JScrollPane(jt);
		jt.setFont(f);
		jt.setBackground(c1);
		jp.setBounds(200,200,1500,700);
		jp.setFont(f);
		add(jp);
		// button
		b2 = new JButton("Back");
		b2.setBounds(50,900,150,70);
		b2.setFont(f);
		add(b2);
	}
}