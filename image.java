import java.awt.*;
import javax.swing.*;
class FDemo extends JFrame
{
	JLabel background;
	JButton b1,b2;
	FDemo()
	{
		  setLayout(null);
		 background = new JLabel(new ImageIcon("A:\\project\\s1.jpg"));
		//background.setLayout(new FlowLayout());
		background.setLocation(0,0);
		background.setSize(900,600);
		add(background);
		b1 = new JButton("Admin");
		b1.setLocation(900,500);
		b1.setSize(150,70);
		add(b1);
		b2 = new JButton("User");
		b2.setLocation(900,600);
		b2.setSize(150,70);
		add(b2);
	}
	
}
class image
{
	public static void main(String ab[])
	{
		int x=100,y=100,w=500,h=400;
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("s12.png");
		Dimension d=t.getScreenSize();
		x=(d.width - w)/2;
		y =(d.height-h)/2;
		FDemo f = new FDemo();
		f.setIconImage(i);
		f.setVisible(true);
		f.setBounds(x,y,w,h);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}