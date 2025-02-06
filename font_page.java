import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class font_page extends JPanel 
{
	JButton b1,b2;
	JLabel L1;
	font_page()
	{ 
	// font page when program are run 
	    setLayout(null);
		Color c = new Color(176,196,222);
		setBackground(c);
		Color c1 = new Color(128,0,128);
		Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,30);
		Font f1 = new Font("Arial Rounded MT BOLD",Font.BOLD,100);
		//one label are create in handing 
		L1 = new JLabel("Online Examination System");
		L1.setBounds(200,200,1600,500);
		L1.setForeground(c1);
		L1.setFont(f1);
		add(L1);
		// font page first button help 
		b1 = new JButton("Help");
		b1.setBounds(50,850,150,70);
		b1.setFont(f);
		add(b1);
		// font page second button next
		b2 = new JButton("Next");
		b2.setBounds(1600,850,150,70);
		b2.setFont(f);
		add(b2);
	}
	
}
