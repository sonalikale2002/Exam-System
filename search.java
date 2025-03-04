import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class search extends JPanel
{
	// student information show by the admin 
	JLabel L1,L11,L12,L13,L14,L15,L16,L17,L18,L19,L20,L21,L22,L23,L24;
//	JLabel L26,L27,L28,L29,L30,L31,L32,L33;
	JComboBox cg1,cg2,cg3;
	JRadioButton rb1,rb2,rb3;
	JButton b1,b2,b11;
	JTextField tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8;
	JTextArea ta1;
	JRadioButton r1,r2,r3;
	String Day[] = {"1","2","3","4","5","6","7","8","9"
	,"10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String Month[] ={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER",
	"NOVEMBER","DECEMBER"};
    String Year[] ={"1995","1996","1997","1998","1999","2000","2001",
	"2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017",
	"2018","2019","2020"};
	search()
	{
		setLayout(null);
		Color c = new Color(176,196,222);
		setBackground(c);
		Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,20);
		Font f1 = new Font("Corsiva Hebrew",Font.BOLD,30);
		L1 = new JLabel("USERS DETALIS");
		L1.setBounds(800,10,500,70);
		L1.setFont(f1);
		add(L1);
		b1 = new JButton("BACK");
		b1.setBounds(50,900,150,70);
		b1.setFont(f);
		add(b1);
		b2 = new JButton("RESULT");
		b2.setBounds(1700,900,150,70);
		b2.setFont(f);
		add(b2);
		b11 = new JButton("Update");
		b11.setBounds(800,800,180,60);
		b11.setFont(f);
		add(b11);
		L11 = new JLabel("REG NO. :");
		L11.setBounds(450,80,150,70);
		L11.setFont(f1);
		add(L11);
		L23 = new JLabel("");
		L23.setBounds(670,80,100,70);
		L23.setFont(f1);
		add(L23);
		L12 = new JLabel("REG DATE  :");
		L12.setBounds(1100,80,210,70);
		L12.setFont(f1);
		add(L12);
		L24 = new JLabel("");
		L24.setBounds(1350,80,300,70);
		L24.setFont(f1);
		add(L24);
		L13 = new JLabel("USERNAME :");
		L13.setBounds(450,150,300,70);
		L13.setFont(f1);
		add(L13);
		/*
	    L25 = new JLabel("");
		L25.setBounds(690,160,300,50);
		L25.setFont(f1);
		add(L25);
		*/
		tx1 = new JTextField(10);
		tx1.setBounds(670,160,300,50);
		tx1.setBackground(c);
		tx1.setFont(f1);
		add(tx1);
		L14 = new JLabel("PASSWORD :");
		L14.setBounds(1100,150,300,70);
		L14.setFont(f1);
		add(L14);
		tx2 = new JTextField(10);
		tx2.setBounds(1320,160,300,50);
		tx2.setBackground(c);
		tx2.setFont(f1);
		add(tx2);
		/*
		L26 = new JLabel("");
		L26.setBounds(1360,160,200,50);
		L26.setFont(f1);
		add(L26);
		*/
		L15 = new JLabel("NAME");
		L15.setBounds(470,220,200,70);
		L15.setFont(f1);
		add(L15);
		/*
		L27 = new JLabel("");
		L27.setBounds(670,230,150,50);
		L27.setFont(f1);
		add(L27);
		L28 = new JLabel("");
		L28.setBounds(850,230,150,50);
		L28.setFont(f1);
		add(L28);
		L29 = new JLabel("");
		L29.setBounds(1030,230,150,50);
		L29.setFont(f1);
		add(L29);
		*/
		tx3 = new JTextField(10);
		tx3.setBounds(670,230,150,50);
		tx3.setBackground(c);
		tx3.setFont(f1);
		add(tx3);
		tx4 = new JTextField(10);
		tx4.setBounds(850,230,150,50);
		tx4.setBackground(c);
		tx4.setFont(f1);
		add(tx4);
		tx5 = new JTextField(10);
		tx5.setBounds(1030,230,150,50);
		tx5.setBackground(c);
		tx5.setFont(f1);
		add(tx5);
		
		L16 = new JLabel("MOBILE NO :");
		L16.setBounds(450,290,300,70);
		L16.setFont(f1);
		add(L16);
		/*
		L30 = new JLabel("");
		L30.setBounds(670,300,450,50);
		L30.setFont(f1);
		add(L30);
		*/
		tx6 = new JTextField(10);
		tx6.setBounds(670,300,450,50);
		tx6.setBackground(c);
		tx6.setFont(f1);
		add(tx6);
		L17 = new JLabel("GENDER :");
		L17.setBounds(450,360,300,70);
		L17.setFont(f1);
		add(L17);
		r1 = new JRadioButton("MALE");
		r1.setBounds(670,360,150,70);
		r1.setBackground(c);
		r1.setForeground(Color.white);
		r1.setFont(f1);
		add(r1);
		r2 = new JRadioButton("FEMALE");
		r2.setBounds(820,360,170,70);
		r2.setBackground(c);
		r2.setForeground(Color.white);
		r2.setFont(f1);
		add(r2);
		r3 = new JRadioButton("OTHER");
		r3.setBounds(1000,360,150,70);
		r3.setBackground(c);
		r3.setForeground(Color.white);
		r3.setFont(f1);
		add(r3);
		L18 = new JLabel("E-MAIL");
		L18.setBounds(450,430,230,70);
		L18.setFont(f1);
		add(L18);
		tx7 = new JTextField(10);
		tx7.setBounds(670,435,450,50);
		tx7.setBackground(c);
		tx7.setFont(f1);
		add(tx7);
		/*
		L31 = new JLabel("");
		L31.setBounds(670,435,450,50);
		L31.setFont(f1);
		add(L31);
		*/
		L19 = new JLabel("D.B.O");
		L19.setBounds(450,500,230,70);
		L19.setFont(f1);
		add(L19);
		cg1 = new JComboBox(Day);
		//cg1 = new JComboBox();
		cg1.setBounds(650,505,100,50);
		cg1.setFont(f);
		add(cg1);
		cg2 = new JComboBox(Month);
		//cg2 = new JComboBox();
		cg2.setBounds(800,505,250,50);
		cg2.setFont(f);
		add(cg2);
		cg3 = new JComboBox(Year);
		//cg3 = new JComboBox();
		cg3.setBounds(1100,505,150,50);
		cg3.setFont(f);
		add(cg3);
		L20 = new JLabel("COLLAGE");
		L20.setBounds(450,580,230,70);
		L20.setFont(f1);
		add(L20);
		tx8 = new JTextField(10);
		tx8.setBounds(670,585,450,50);
		tx8.setBackground(c);
		tx8.setFont(f1);
		add(tx8);
		/*
		L32 = new JLabel("");
		L32.setBounds(670,585,450,50);
		L32.setFont(f1);
		add(L32);
		*/
		L21 = new JLabel("ADDRESS");
		L21.setBounds(450,650,230,70);
		L21.setFont(f1);
		add(L21);
		/*
		L33 = new JLabel("");
		L33.setBounds(670,655,450,100);
		L33.setFont(f1);
		add(L33);
		*/
		ta1 = new JTextArea();
		ta1.setBounds(670,655,450,100);
		ta1.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
		ta1.setBackground(c);
		ta1.setFont(f1);
		add(ta1);
	}
	
}