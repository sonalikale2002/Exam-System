import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Exam extends JPanel
{
	// Exam page 
	JLabel cn,q1,qa,qr,o1,o2,o3,o4,L1,L2,L3,showtime;
	JTextArea q;
	ButtonGroup bg;
	JRadioButton rb1,rb2,rb3,rb4;
	JButton previous,next,submit,Back;
//	int currentQuestion = 0, totalQuestions = 0, score = 0, NoAttempted =0;
//	String[][] questions; // Array to store questions dynamically
//    String[] selectedAnswers; // Array to store selected answers
	Exam()
	{
		setLayout(null);
		
		bg=new ButtonGroup();
		Color c = new Color(176,196,222);
		setBackground(c);
		Font f1=new Font("",Font.BOLD,20);
		Font f2=new Font("",Font.BOLD,30);
		
		cn=new JLabel("COURSE NAME :");
		cn.setBounds(800,20,250,50);
		cn.setFont(f2);
		add(cn);
		L3 = new JLabel("");
		L3.setBounds(1070,20,250,50);
		L3.setFont(f2);
		add(L3);
		
		q1=new JLabel("Q.");
		q1.setBounds(245,250,50,50);
		q1.setFont(f1);
		add(q1);
		
		
		qa=new JLabel("Question Attempt : ");
		qa.setBounds(250,850,400,50);
		qa.setFont(f1);
		add(qa);
		
		L1 = new JLabel();
		L1.setBounds(450,850,100,50);
		L1.setFont(f1);
		add(L1);
		
		qr=new JLabel("Question Remaining : ");
		qr.setBounds(900,850,400,50);
		qr.setFont(f1);
		add(qr);
	
	    L2 = new JLabel();
		L2.setBounds(1150,850,100,50);
		L2.setFont(f1);
		add(L2);
	
	
		previous=new JButton("PREVIOUS");
		previous.setBounds(300,750,200,50);
		previous.setFont(f1);
		add(previous);
		
		next=new JButton("NEXT");
		next.setBounds(900,750,100,50);
		next.setFont(f1);
		add(next);
		
		q=new JTextArea();
		q.setBounds(300,250,800,200);
		q.setEditable(false);
		q.setBackground(Color.black);
		q.setForeground(Color.white);
		q.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
		q.setFont(f2);
		q.setWrapStyleWord(true);
	    q.setFocusable(false);
	   // q.setBorder(null);
		add(q);
		
		submit=new JButton("SUBMIT");
		submit.setBounds(1630,220,150,50);
		submit.setFont(f1);
		add(submit);
		
		Back = new JButton("Back");
		Back.setBounds(1630,900,150,50);
		Back.setFont(f1);
		add(Back);
		
		rb1=new JRadioButton("1.");
		rb1.setBounds(300,500,60,70);
		rb1.setBackground(c);
		rb1.setFont(f1);
		add(rb1);
		bg.add(rb1);
		
		o1=new JLabel();
		o1.setBounds(400,500,400,70);
		o1.setBackground(c);
		o1.setFont(f1);
		add(o1);
		
		rb2=new JRadioButton("2");
		rb2.setBounds(850,500,60,70);
		rb2.setBackground(c);
		rb2.setFont(f1);
		add(rb2);
		bg.add(rb2);
		
		o2=new JLabel();
		o2.setBounds(950,500,400,70);
		o2.setBackground(c);
		o2.setFont(f1);
		add(o2);
		
		rb3=new JRadioButton("3");
		rb3.setBounds(300,600,60,70);
		rb3.setBackground(c);
		rb3.setFont(f1);
		add(rb3);
		bg.add(rb3);
		
		o3=new JLabel();
		o3.setBounds(400,600,400,70);
		o3.setBackground(c);
		o3.setFont(f1);
		add(o3);
		
		
		
		rb4=new JRadioButton("4");
		rb4.setBounds(850,600,60,70);
		rb4.setFont(f1);
		rb4.setBackground(c);
		add(rb4);
		bg.add(rb4);
		
		
		o4=new JLabel();
		o4.setBounds(950,600,400,70);
		o4.setBackground(c);
		o4.setFont(f1);
		add(o4);
		
		showtime = new JLabel();
		showtime.setBounds(1620,70,150,100);
		showtime.setFont(f1);
		add(showtime);
	}	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Color c1 = new Color(230,245,245);
		g.setColor(c1);
		g.fillRect(150,150,1200,40);
		g.fillRect(150,190,40,500);
		g.fillRect(1310,190,40,500);
		g.fillRect(150,690,1200,250);
		g.fillRect(1600,50,200,130);
	}
}