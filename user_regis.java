import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.*;
import java.util.*;
class user_regis extends JPanel implements ActionListener
{
	// student registration form 
	String s1;
	JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,background;
	JComboBox cb1,cb2,cb3;
	JButton b1,b2,b3;
	ButtonGroup group;
	JTextField tx1,tx3,tx4,tx5,tx6,tx7,tx8;
	JPasswordField tx2;
	JTextArea ta1;
	JRadioButton r1,r2,r3;
	static int x=1;
	// array to D.O.B 
	String Day[] = {"1","2","3","4","5","6","7","8","9"
	,"10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String Month[] ={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER",
	"NOVEMBER","DECEMBER"};
    String Year[] ={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001",
	"2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015"};
	// constructor
	user_regis()
	{
		setLayout(null);
		// image set registration form 
		background = new JLabel(new ImageIcon("A:\\project\\s26.jpg"));
		background.setLocation(1300,300);
		background.setSize(600,600);
		add(background);
		// set background color to page
		Color c = new Color(176,196,222);
		setBackground(c);
		Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,30);
		// heading of form
		L1 = new JLabel("REGISTRATION FORM");
		L1.setBounds(700,20,400,70);
		L1.setFont(f);
		add(L1);
		// username of user
		L2 = new JLabel("USERNAME");
		L2.setBounds(400,150,200,70);
		L2.setFont(f);
		add(L2);
		tx1 = new JTextField(10);
		tx1.setBounds(650,150,450,70);
		tx1.setBackground(c);
		tx1.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		tx1.setFont(f);
		add(tx1);
		// set password to user
		L3 = new JLabel("PASSWORD");
		L3.setBounds(1150,150,200,70);
		L3.setFont(f);
		add(L3);
		tx2 = new JPasswordField();
		tx2.setBounds(1400,150,450,70);
		tx2.setBackground(c);
		tx2.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		tx2.setFont(f);
		add(tx2);
		// student name
		L4 = new JLabel("NAME");
		L4.setBounds(400,250,100,70);
		L4.setFont(f);
		add(L4);
		// first name textfield
		tx3 = new JTextField(10);
		tx3.setBounds(650,250,150,70);
		tx3.setBackground(c);
		tx3.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		tx3.setFont(f);
		add(tx3);
		// middle name
		tx4 = new JTextField(10);
		tx4.setBounds(850,250,150,70);
		tx4.setBackground(c);
		tx4.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		tx4.setFont(f);
		add(tx4);
		// last name
		tx5= new JTextField(10);
		tx5.setBounds(1050,250,150,70);
		tx5.setBackground(c);
		tx5.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		tx5.setFont(f);
		add(tx5);
		// mobile number
		L5 = new JLabel("MOBILE NO.");
		L5.setBounds(400,350,250,70);
		L5.setFont(f);
		add(L5);
		tx6 = new JTextField(10);
		tx6.setBounds(650,350,450,70);
		tx6.setBackground(c);
		tx6.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		tx6.setFont(f);
		add(tx6);
		// student gender
		L6 = new JLabel("GENDER");
		L6.setBounds(400,450,250,70);
		L6.setFont(f);
		add(L6);
		r1 = new JRadioButton("MALE");
		r1.setBounds(650,450,150,70);
		r1.setBackground(c);
		r1.setForeground(Color.white);
		r1.setFont(f);
		r1.setSelected(true);
		add(r1);
		r2 = new JRadioButton("FEMALE");
		r2.setBounds(800,450,200,70);
		r2.setBackground(c);
		r2.setForeground(Color.white);
		r2.setFont(f);
		r2.setSelected(false);
		add(r2);
		r3 = new JRadioButton("OTHER");
		r3.setBounds(1000,450,150,70);
		r3.setBackground(c);
		r3.setForeground(Color.white);
		r3.setFont(f);
		r3.setSelected(false);
		add(r3);
		// email id to student
		L7 = new JLabel("E-MAIL");
		L7.setBounds(400,550,250,70);
		L7.setFont(f);
		add(L7);
		tx7= new JTextField(10);
		tx7.setBounds(650,550,450,70);
		tx7.setBackground(c);
		tx7.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		tx7.setFont(f);
		add(tx7);
		// student date of birth 
		L8 = new JLabel("D.O.B");
		L8.setBounds(400,650,250,70);
		L8.setFont(f);
		add(L8);
		cb1 = new JComboBox(Day);
		cb1.setBounds(650,650,100,70);
		cb1.setFont(f);
		add(cb1);
		cb2 = new JComboBox(Month);
		cb2.setBounds(800,650,250,70);
		cb2.setFont(f);
		add(cb2);
		cb3 = new JComboBox(Year);
		cb3.setBounds(1100,650,150,70);
		cb3.setFont(f);
		add(cb3);
		// student collage name
		L9 = new JLabel("COLLAGE");
		L9.setBounds(400,750,250,70);
		L9.setFont(f);
		add(L9);
		tx8 = new JTextField(10);
		tx8.setBounds(650,750,450,70);
		tx8.setBackground(c);
		tx8.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		tx8.setFont(f);
		add(tx8);
		// student address 
		L10 = new JLabel("ADDRESS");
		L10.setBounds(400,850,250,70);
		L10.setFont(f);
		add(L10);
		ta1 = new JTextArea();
		ta1.setBounds(650,850,450,100);
		ta1.setBackground(c);
		ta1.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		ta1.setFont(f);
		add(ta1);
		// submit button
		b1 = new JButton("Submit");
		b1.setBounds(1200,900,150,70);
		b1.setFont(f);
		add(b1);
		// reset form button
		b2 = new JButton("RESET");
		b2.setBounds(1400,900,150,70);
		b2.setFont(f);
		add(b2);
		// student registration to go student login page
		b3 = new JButton("BACK");
		b3.setBounds(50,900,150,70);
		b3.setFont(f);
		add(b3);
		
		r1.setActionCommand("MALE");
		r2.setActionCommand("FEMALE");
		r3.setActionCommand("OTHER");
		
		group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
		group.add(r3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		// database are store the data 
		// student registration form connection regis table
		// reset button working 
		if(e.getSource() == b2)
		{
		      tx1.setText("");
		      tx2.setText("");
		      tx3.setText("");
		      tx4.setText("");
		      tx5.setText("");
		      tx6.setText("");
		      tx7.setText("");
		      tx8.setText("");
		      ta1.setText("");
			  cb1.setSelectedItem("1");
			  cb2.setSelectedItem("JANUARY");
			  cb3.setSelectedItem("1995");
			  r1.setSelected(true);
		}
		
	// student registration "submit" button
		if(e.getSource() == b1)
		{
		           s1 = tx1.getText();
			String s2 = tx2.getText();
			String s3 = tx3.getText();
			String s4 = tx4.getText();
			String s5 = tx5.getText();
			String s6 = tx6.getText();
			String s7 = group.getSelection().getActionCommand();
			String s8 = tx7.getText();
			String s9 =  cb1.getSelectedItem().toString();
			String s10 = cb2.getSelectedItem().toString();
			String s11 = cb3.getSelectedItem().toString();
			String s12 = tx8.getText();
			String s13 = ta1.getText();
			String s16;
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL = false","root","root");
				java.util.Date date = Calendar.getInstance().getTime();
				DateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
				s16 = dateFormat.format(date);
				int z = x++;
				PreparedStatement ps = con.prepareStatement("insert into regis(regdate,username,password,first,middle,last,mobile,gender,email,date,month,year,college,address) values('"+s16+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"','"+s13+"')");
				ps.executeUpdate();
			    JOptionPane.showMessageDialog(null,"You have registration successfully.");
				tx1.setText("");
		        tx2.setText("");
		        tx3.setText("");
		        tx4.setText("");
		        tx5.setText("");
		        tx6.setText("");
		        tx7.setText("");
		        tx8.setText("");
		        ta1.setText("");
				cb1.setSelectedItem("1");
			    cb2.setSelectedItem("JANUARY");
			    cb3.setSelectedItem("1995");
			    r1.setSelected(true);
				ps.close();
				con.close();
			}
			catch(Exception e1)
			{
			     System.out.println(e1);
			}
		}
	}
}