import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class user_login extends JPanel// implements KeyListener
{
	JLabel L1,L2,background;
	JButton b1,b2,b3,b4;
	JTextField tx1;
	JPasswordField tx2;
	user_login()
	{
		// student login page 
		setLayout(null);
		Color c = new Color(176,196,222);
		setBackground(c);
		Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,30);
		Font f1 = new Font("Arial Rounded MT BOLD",Font.BOLD,20);
		// one image are set login page
		background = new JLabel(new ImageIcon("A:\\project\\s22.png"));
		background.setLocation(680,110);
		background.setSize(400,400);
		add(background);
		// heading of student page
		L1 = new JLabel("User Login");
		L1.setBounds(800,100,250,50);
		L1.setFont(f);
		add(L1);
		// username field to student
		tx1 = new JTextField(10);
		tx1.setBounds(750,450,300,60);
		tx1.setForeground(Color.black);
	    tx1.setBackground(c);
		tx1.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		tx1.setFont(f);
		add(tx1);
		// password field to student
		tx2 = new JPasswordField(10);
		tx2.setBounds(750,550,300,60);
		tx2.setForeground(Color.black);
		tx2.setBackground(c);
		tx2.setEchoChar('*');
		tx2.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		tx2.setFont(f);
		add(tx2);
		// "sub2" font page to "admin" to "user" are call
		b1 = new JButton("Back");
		b1.setBounds(50,900,150,70);
		b1.setFont(f);
		add(b1);
		// student login button
		b2 = new JButton("login");
		b2.setBounds(730,700,130,60);
		b2.setFont(f);
		add(b2);
		// student forget password button 
		b3 = new JButton("Forget password");
		b3.setBounds(900,700,150,60);
		add(b3);
		L2 = new JLabel("New User :");
		L2.setBounds(720,810,250,60);
		L2.setFont(f);
		add(L2);
		// student registration button
		b4 = new JButton("Registration");
		b4.setBounds(920,810,170,60);
		b4.setFont(f1);
		add(b4);
		
		//tx1.addKeyListener(this);
		//tx2.addKeyListener(this);
	}
	/*
	public void keyReleased(KeyEvent e)
	{
		if(tx1.isFocusOwner())
		{
		String s1 = tx1.getText().trim();
		if(s1.equals(""))
		{
			tx1.setText("Enter UserName");
			tx1.setForeground(Color.gray);
		}
		}
		if(tx2.isFocusOwner())
		{
		String s2 = tx2.getText().trim();
		if(s2.equals(""))
		{
			tx2.setText("Enter Password");
			tx2.setForeground(Color.gray);
		}
		}
	
	}
	public void keyPressed(KeyEvent e)
	{
		if(tx1.isFocusOwner())
		{
		String s1 = tx1.getText();
		if(s1.equals("Enter UserName"))
		{
			tx1.setText("");
			tx1.setForeground(Color.black);
		}
		}
		if(tx2.isFocusOwner())
		{
		String s2 = tx2.getText();
		if(s2.equals("Enter password"))
		{
			tx2.setText("");
			tx2.setForeground(Color.black);
			tx2.setEchoChar('*');
			
		}
		}
	}
	public void keyTyped(KeyEvent e){}
	*/
}
