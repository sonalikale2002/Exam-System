import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class result extends JPanel
{
	// student result table are create
	JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15,L16,L17,L18,L19;
	JButton b1,b2;
	result()
	{
		setLayout(null);
		Color c = new Color(176,196,222);
		setBackground(c);
		Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,20);
		Font f1 = new Font("Corsiva Hebrew",Font.BOLD,30);
		Font f2 = new Font("Corsiva Hebrew",Font.BOLD,20);
		L1 = new JLabel("RESULT");
		L1.setBounds(800,30,150,50);
		L1.setFont(f1);
		add(L1);
		L2 = new JLabel("Course name :");
		L2.setBounds(400,250,200,50);
		L2.setFont(f);
		add(L2);
		L3 = new JLabel("");
		L3.setBounds(750,250,200,50);
		L3.setFont(f);
		add(L3);
		L4 = new JLabel("Time Taken :");
		L4.setBounds(400,320,200,50);
		L4.setFont(f);
		add(L4);
		L5 = new JLabel("");
		L5.setBounds(750,320,200,50);
		L5.setFont(f);
		add(L5);
		L6 = new JLabel("Total Questions");
		L6.setBounds(400,390,200,50);
		L6.setFont(f);
		add(L6);
		L7 = new JLabel("");
		L7.setBounds(750,390,200,50);
		L7.setFont(f);
		add(L7);
		L8 = new JLabel("Attempted Questions :");
		L8.setBounds(400,460,250,50);
		L8.setFont(f);
		add(L8);
		L9 = new JLabel("");
		L9.setBounds(750,460,200,50);
		L9.setFont(f);
		add(L9);
		L10 = new JLabel("Correct Questions :");
		L10.setBounds(400,520,250,50);
		L10.setFont(f);
		add(L10);
		L11 = new JLabel("");
		L11.setBounds(750,520,200,50);
		L11.setFont(f);
		add(L11);
		L12 = new JLabel("Wrong Questions :");
		L12.setBounds(400,590,200,50);
		L12.setFont(f);
		add(L12);
		L13 = new JLabel("");
		L13.setBounds(750,590,200,50);
		L13.setFont(f);
		add(L13);
		L14 = new JLabel("Marks Obtained :");
		L14.setBounds(400,660,200,50);
		L14.setFont(f);
		add(L14);
		L15 = new JLabel("");
		L15.setBounds(750,660,200,50);
		L15.setFont(f);
		add(L15);
		L16 = new JLabel("Total marks :");
		L16.setBounds(400,720,200,50);
		L16.setFont(f);
		add(L16);
		L17 = new JLabel("");
		L17.setBounds(750,720,200,50);
		L17.setFont(f);
		add(L17);
		L18 = new JLabel("Percentage :");
		L18.setBounds(400,790,200,50);
		L18.setFont(f);
		add(L18);
		L19 = new JLabel("");
		L19.setBounds(750,790,200,50);
		L19.setFont(f);
		add(L19);
		b1 = new JButton("DISCARD");
		b1.setBounds(30,900,150,70);
		b1.setFont(f);
		add(b1);
		b2 = new JButton("SAVE");
		b2.setBounds(1700,900,150,70);
		b2.setFont(f);
		add(b2);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Color c1 = new Color(230,245,245);
		g.setColor(c1);
		g.fillRect(300,200,1300,700);
	}
	
}