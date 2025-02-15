import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class admin_login extends JPanel //implements KeyListener 
{
	// admin login page 
	JButton b1,b2;
	JLabel L1,L2,L3,background;
	JTextField tx1;
	JPasswordField tx2;
	admin_login()
	{ 
	    setLayout(null);
		Color c = new Color(176,196,222);
		setBackground(c);
		Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,30);
		L3 = new JLabel("Admin Login");
		L3.setBounds(800,100,300,60);
		L3.setFont(f);
		add(L3);
		background = new JLabel(new ImageIcon("A:\\project\\s22.png"));
		background.setLocation(700,150);
		background.setSize(400,400);
		add(background);
		/*
		L1 = new JLabel("Enter Name");
		L1.setBounds(500,500,300,60);
		L1.setFont(f);
		add(L1);
		*/
		tx1 = new JTextField(10);
		tx1.setBounds(750,520,350,40);
		tx1.setBackground(c);
		tx1.setForeground(Color.black);
		tx1.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		tx1.setFont(f);
		add(tx1);
		/*
		L2 = new JLabel("Enter Password");
		L2.setBounds(500,600,300,60);
		L2.setFont(f);
		add(L2);
		*/
		tx2 = new JPasswordField(10);
		tx2.setBounds(750,620,350,40);
		tx2.setBackground(c);
		tx2.setEchoChar('*');
		tx2.setForeground(Color.black);
		tx2.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		tx2.setFont(f);
		add(tx2);
		// Back button call sub2 page
		b1 = new JButton("Back");
		b1.setBounds(50,900,120,60);
		b1.setFont(f);
		add(b1);
		// login button call menu page
		b2 = new JButton("login");
		b2.setBounds(840,710,120,60);
		b2.setFont(f);
		add(b2);
	//	tx1.addKeyListener(this);
	//	tx2.addKeyListener(this);
	}
	/*
	public void keyReleased(KeyEvent e)
	{
		if(tx1.isFocusOwner())
		{
		String s1 = tx1.getText().trim();
		if(s1.equals(""))
		{
			tx1.setText("Enter Name");
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
		if(s1.equals("Enter Name"))
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
			//tx2.setEchoChar('*');
			
		}
		}
	}
	public void keyTyped(KeyEvent e)
	{}
	*/
}
