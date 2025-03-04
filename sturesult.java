import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class sturesult extends JPanel
{
	// show the particular student result
	JLabel L1,L2,L3;
	JButton b2;
	JTable jt;
	JScrollPane jp,ju;
	static String data[][]=new String[100][11];
	static int i=0,j,k;
	String col[]={"sno","Course","Total Question","Attempt Question","Correct Question","Wrong Question","Total Marks","Marks Obtained","precentage"};
	String col1[]={"sno","Username","Name","Total Question","Attempt Question","Correct Question","Wrong Question","Total Marks","Marks Obtained","precentage"};
	sturesult()
	{
		setLayout(null);
		Color c = new Color(176,196,222);
		Color c1 = new Color(230,245,245);
		setBackground(c);
		Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,15);
		Font f1 = new Font("Corsiva Hebrew",Font.BOLD,30);
		Font f2 = new Font("Corsiva Hebrew",Font.BOLD,50);
		// heading
		L1 = new JLabel("RESULT");
		L1.setBounds(800,50,300,70);
		L1.setFont(f2);
		add(L1);
		// student name their
		L2 = new JLabel("USERNAME :");
		L2.setBounds(1000,130,250,70);
		L2.setFont(f1);
		add(L2);
		L3 = new JLabel("");
		L3.setBounds(1200,130,300,70);
		L3.setFont(f1);
		add(L3);
	// tab are create 
		jt=new JTable(data,col);
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
	// show all table working 
	public void showTable()
	{
		  String x= L3.getText();
			        try 
					{
					   Class.forName("com.mysql.cj.jdbc.Driver");	
					   String db_url="jdbc:mysql://localhost:3306/abhidp?useSSL = false";		
					   String db_uname="root";
					   String db_upass="root";
					   Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
					   Statement st = con.createStatement();
					   
					
					   String q = "select sno,course,TotalQues,AttemptedQues,CorrectQues,WrongQues,Totalmarks,MarksObtained,Percentages from result where username = '"+x+"' ";
					   ResultSet rs=st.executeQuery(q); 
					   
					   i=0;
					   for(int i2=0;i2<100;i2++)
					   {
						  for(j=0,k=1;j<9;j++,k++)
						   {
							data[i2][j]="";
						   } 
					   }
					   
					   while(rs.next())
					   {
						   for(j=0,k=1;j<9;j++,k++)
						   {
							data[i][j]=rs.getString(k);
						   }
							i++;
					   }
					   
					   con.close();	
					}
					catch(Exception ex)
					{
					  System.out.println(ex);
					}
	}
}