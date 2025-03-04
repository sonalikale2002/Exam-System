import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Timer;
import java.util.TimerTask;
class FDemo extends JFrame implements ActionListener
{
//	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	// card are user divided the page 
	CardLayout card;
	Container cn;
	// font page next page "admin" and "User"
	second_page rd;
	//font page
	font_page rd1;
	// Admin login page
	admin_login sad;
	// user login page
	user_login pink;
	// student registration form page
	user_regis ram;
	//admin admin_menu page 
	admin_menu sita;
	// student menu page "instruction about exam"
	usermenu um;
	// manage course and edit the list course
	manage man;
	// create the paper this page
	EditCourse Ed;
	// add new subject -> manage course
	AddCourse course;
	// "user list check by admin"
	user us;
	// show the information of student
	search sh;
	verification ver;
	// subject  result declare show the student
	courseresult cat;
	//  page for the student 
	Exam ex;
	// student result show table create 
	result res;
	// serach page call particular student result all subject
	 sturesult stu;
	 // this page declare result "show all code"
	 Couresult cou;
	boolean b= true,a = false,c = true,d=true,r=false;
	int re=0;
 	int count = 0,mat;
	int remaining = 0;
	int Attempt = 0;
	public ResultSet rs;
    public Connection con;
    public String[] answers; // Array to store student's answers
    public String[] correctAnswers; // Array to store correct answers from the database
    public int currentIndex = 0;
    public int totalQuestions = 0;
//	int next,wed,i=0;
//	int sima=0,hello=0,hjj =0,hii=0,addc;
	String d21;
	String si10,si7,si8,si9,si1,si6;
	String si2,sii1;
	String sii;
	int miya,hours,minutes,seconds;
	Timer timer;
	static int p=0,j,k;
	 String time ="";
	FDemo()
	{
		//Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,20);
		cn=getContentPane();
		card = new CardLayout();
		setLayout(card);
		Color c = new Color(176,196,222);
		setBackground(c);
		/*
		b1 = new JButton("Button_1");
		add("A" ,b1);
		b2 = new JButton("Button_2");
		add("B",b2);
		b3 = new JButton("Button_3");
		add("C",b3);
		b4 = new JButton("Button_4");
		add("D",b4);
		*/
		//font page open when program are run 
		rd1 = new font_page();
		add("gcc",rd1);
		//Admin page and user page = home page  = "second_page"
		rd = new second_page();
		add("ggc",rd);
		//Admin login page their are two button "login" and "Back"
		sad = new admin_login();
		add("saad",sad);
		//user login page object are "pink"
		pink = new user_login();
		add("main",pink);
		// student registration form page "ram"
		ram = new user_regis();
		add("Ram",ram);
		//Admin admin_menu page create object are "sita"
		sita =new admin_menu();
		add("Sita",sita);
		// student side menu bar 
		um = new usermenu();
		add("m22",um);
		// edit course list by admin "decide the subject" 
		man = new manage();
		add("maan",man);
		// create question paper about subject 
		Ed =  new EditCourse();
		add("ed",Ed);
		// add new subject to course list
		course =  new AddCourse();
		add("add",course);
		// student list by check the admin  
		us = new user();
		add("user",us);
		// show all informotion of student
		sh = new search();
		add("search",sh);
		// student verify by the admin
		ver = new verification();
		add("very",ver);
		// subject result show
		cat = new courseresult();
		add("ccar",cat);
		// examination page for the student 
		ex = new Exam();
		add("exam",ex);
		// student result
		res = new result();
		add("result",res);
		// serach page call particular student result all subject
		stu = new  sturesult();
		add("student",stu);
		//  "show all code for result"
		cou = new Couresult();
		add("courseresult",cou);
		//font_page font page "next" button working 
		rd1.b2.addActionListener(this);
		// second_page home page "Admin" button working
		rd.b1.addActionListener(this);
		//admin_login Admin login page "login" button working
		sad.b2.addActionListener(this);
		// admin_login Admin login page "back" button working
		sad.b1.addActionListener(this);
		// second_page home page "User" button working
		rd.b2.addActionListener(this);
		// student login page "back" button
		pink.b1.addActionListener(this);
		// student login page "login" button
		pink.b2.addActionListener(this);
		// student login page "registration" button
		pink.b4.addActionListener(this);
		// student registration page "Back" button
		ram.b3.addActionListener(this);
		// student registration page "Reset" button
		ram.b2.addActionListener(this);
		// student registration page "submit" button
		ram.b1.addActionListener(this);
		//Admin admin_menu page six button:
		// "manage course"
		sita.b1.addActionListener(this);
		// "Course result"
		sita.b2.addActionListener(this);
		// "logout"
		sita.b3.addActionListener(this);
		// "User"
		sita.b4.addActionListener(this);
		// "Verification"
		sita.b5.addActionListener(this);
		// "change password"
		sita.b6.addActionListener(this);
		// "back"
		sita.b7.addActionListener(this);
		// serach the student in user page
		us.b1.addActionListener(this);
		// back button to go admin_menu page
		us.b2.addActionListener(this);
		//user menu "Edit details" button
		um.b1.addActionListener(this);
		// user menu "logout" button
		um.b3.addActionListener(this);
		// user menu "start" button
		um.b4.addActionListener(this);
		// user menu "back" button
		um.b5.addActionListener(this);
		// edit list course 
		// "back" button
		man.b4.addActionListener(this);
		// "edit course" button
		man.b1.addActionListener(this);
		// "delete" button
		man.b2.addActionListener(this);
		// "add new course" button 
		man.b3.addActionListener(this);
		// Edit course by admin back button
		Ed.b3.addActionListener(this);
		// add new subject 
		// add course button
		course.b1.addActionListener(this);
		// back button
		course.b2.addActionListener(this);
		// back button call user page
		sh.b1.addActionListener(this);
		// verify about student serach button
		ver.b1.addActionListener(this);
		// verify about student back button
		ver.b2.addActionListener(this);
		// verify about studnet verify button
		ver.b4.addActionListener(this);
		// course result page
		// search button
		cat.b1.addActionListener(this);
		// back button
		cat.b2.addActionListener(this);
		//exam page submit button
		ex.submit.addActionListener(this);
		// result page "discord" button 
		res.b1.addActionListener(this);
		// result page "save" button
		res.b2.addActionListener(this);
		// exam page "next button
		ex.next.addActionListener(this);
		// exam page "previous" button
		ex.previous.addActionListener(this);
		// usermenu page "result" button
		um.b2.addActionListener(this);
		// result button serach page 
		sh.b2.addActionListener(this);
		// show all result "back" button
		cou.b2.addActionListener(this);
		// edit course view page combobox 
		Ed.View.cb12.addActionListener(this);
        um.cb1.addActionListener(this);
		// back button for student result page 
		stu.b2.addActionListener(this);
		// exam back button
		ex.Back.addActionListener(this);
	//	sad.tx1.addKeyListener(this);
	//	sad.tx2.addKeyListener(this);
	    Ed.b4.addActionListener(this);
		// edit course save button 
	
	}
	void set_time()
	{
           String s1  = um.cb1.getSelectedItem().toString();
        try{		   
		    Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL = false","root","root");
			Statement st = con.createStatement();
			ResultSet rsp = st.executeQuery("select time from course where course ='"+s1+"'");
			while(rsp.next())
				time = rsp.getString(1);
			    String[] timeParts = time.split(":");
                hours = Integer.parseInt(timeParts[0]);
                minutes = Integer.parseInt(timeParts[1]);
                seconds = Integer.parseInt(timeParts[2]);
			
//			System.out.println("timer ="+time);
//			System.out.println("hours ="+hours);
//			System.out.println("minutes ="+minutes);
//			System.out.println("seconds ="+seconds);
			con.close();
	        }
           	catch(Exception ex)
	        {
		     System.out.println("sitaram");
        	}
	}
	    private void startTimer() {
        if (timer != null) {
            timer.cancel();
        }

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (hours == 0 && minutes == 0 && seconds == 0) {
                    timer.cancel();
                    JOptionPane.showMessageDialog(null, "Time's up!");
                } else {
                    decrementTime();
                    updateTimeLabel();
                }
            }
        }, 0, 1000); // Execute every 1000ms (1 second)
    }

    // Decrement the time
    private void decrementTime() {
        if (seconds > 0) {
            seconds--;
        } else if (minutes > 0) {
            minutes--;
            seconds = 59;
        } else if (hours > 0) {
            hours--;
            minutes = 59;
            seconds = 59;
        }
    }
	private void updateTimeLabel() {
        String timeText = String.format("Time: %02d:%02d:%02d", hours, minutes, seconds);
        ex.showtime.setText(timeText);
    }
	//question paper working 
	private void setupDatabase() 
	 {
		 String s1  = um.cb1.getSelectedItem().toString();
        try {
            // JDBC Connection setup
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL=false", "root", "root");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("select * from getpaper1 where course ='"+s1+"'");
            // Count total questions and initialize arrays
            rs.last();
            totalQuestions = rs.getRow();
            rs.beforeFirst();
             	remaining = totalQuestions;
            answers = new String[totalQuestions];
            correctAnswers = new String[totalQuestions];
        } 
		catch (Exception ex) 
		{
           System.out.println(ex);
        }
    }
	//print the first and total question display on page 
	 public void loadQuestion() 
	 {
        try {
            // Load question and options from the ResultSet
            ex.q.setText(rs.getString(3));
            ex.o1.setText(rs.getString(4));
            ex.o2.setText(rs.getString(5));
            ex.o3.setText(rs.getString(6));
            ex.o4.setText(rs.getString(7));

            correctAnswers[currentIndex] = rs.getString(8);

            ex.bg.clearSelection();
            // Restore selected answer if previously answered
            if (answers[currentIndex] != null) 
			{
                if (answers[currentIndex].equals("option1")) 
				{
                    ex.rb1.setSelected(true);
					
                } else if (answers[currentIndex].equals("option2")) 
				{
                    ex.rb2.setSelected(true);
					
                } else if (answers[currentIndex].equals("option3")) 
				{
                    ex.rb3.setSelected(true);
					
                } else if (answers[currentIndex].equals("option4")) 
				{
                    ex.rb4.setSelected(true);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	public boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
	//save answere
	public void saveAnswer() 
	{
        // Save selected answer in the array
        if (ex.rb1.isSelected()) 
		{
            answers[currentIndex] = "option1";
        } 
		else if (ex.rb2.isSelected()) 
		{
            answers[currentIndex] = "option2";
			
        } else if (ex.rb3.isSelected()) 
		{
            answers[currentIndex] = "option3";
			
        } else if (ex.rb4.isSelected()) 
		{
            answers[currentIndex] = "option4";
			
        } else {
            answers[currentIndex] = null; // No answer selected
        }
    }
	
	public void calculateResult() 
	{
        int correctCount = 0, wrongCount = 0,ab = 0;
		String s29 = res.L3.getText();
                  try
				 {
					Class.forName("com.mysql.cj.jdbc.Driver");
				    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL = false","root","root");
				    Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from course where course = '"+s29+"'");
					while(rs.next())
					{
					//	res.L3.setText(rs.getString("ids"));
                         ab = Integer.parseInt(rs.getString(2));						
					}
				 }
				 catch(Exception e4)
				 {
					 System.out.println(e4);
				 }
             for (int i = 0; i < totalQuestions; i++) 
			 {
                 if (answers[i] != null && answers[i].equals(correctAnswers[i])) 
				 {
                     correctCount++;
                 } 
				 else 
				 {
                     wrongCount++;
                 }
             }
			 int c = correctCount + wrongCount;
			 int v = totalQuestions - c; 
			  res.L9.setText(""+v);
             int totalMarks = totalQuestions * ab;
             int obtainedMarks = correctCount * ab;
			 res.L7.setText(""+totalQuestions);
			  res.L11.setText(""+correctCount);
			  res.L13.setText(""+wrongCount);
			  res.L15.setText(""+totalMarks);				
              res.L17.setText(""+obtainedMarks);	
              double percentage = ((double) obtainedMarks / totalMarks) * 100;
		      res.L19.setText(percentage+"%");
    }
	
	// student subject are show list in exam working on function
	void colour()
	{
		    try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL = false","root","root");
		        Statement st = con.createStatement();
		        ResultSet rs = st.executeQuery("select * from course");
			    while(rs.next())
		        {
					// course edit list are add course in course table
					//manager
					 um.cb1.addItem(rs.getString("course"));
					 // course result combobox
			    }
				con.close();
			}
			catch(Exception e2)
			{
				 System.out.println(e2);
			}
	}
	void manage_list()
	{
		  try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL = false","root","root");
		        Statement st = con.createStatement();
		        ResultSet rs = st.executeQuery("select * from course");
			    while(rs.next())
		        {
					// course edit list are add course in course table
					//manager
			        man.cb11.addItem(rs.getString("course"));
			    }
				con.close();
			}
			catch(Exception e2)
			{
				 System.out.println(e2);
			}
	}
	void course_result_list()
	{
		  try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL = false","root","root");
		        Statement st = con.createStatement();
		        ResultSet rs = st.executeQuery("select * from course");
			    while(rs.next())
		        {
					 cat.cb1.addItem(rs.getString("course"));
			    }
				con.close();
			}
			catch(Exception e2)
			{
				 System.out.println(e2);
			}
	}
	// admin verification from student name list are generate this function
	void user()
	{
		    try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL = false","root","root");
		        Statement st = con.createStatement();
		        ResultSet rs = st.executeQuery("select username from regis");
			    while(rs.next())
		        {
			         us.cg1.addItem(rs.getString("username"));
			    //     ver.cv1.addItem(rs.getString("username"));
			    }
				con.close();
			}
			catch(Exception e2)
			{
				 System.out.println(e2);
			}
	}
		// student login page two textfield data are fetch in regis table
	void login()
	{
		String s11 = pink.tx1.getText();
		String s12 = pink.tx2.getText();
		try
		{
			        Class.forName("com.mysql.cj.jdbc.Driver");
				    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL = false","root","root");
				    Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from regis where username ='"+s11+"' AND password = '"+s12+"'");
			   if(rs.next())
			   {
				          
				   // if data fetch correct show message
						card.show(cn,"m22");
						um.L6.setText(rs.getString(5));
						sii = rs.getString(3);
						//um.cb1.setSelectedItem("  ");
						JOptionPane.showMessageDialog(null,"Successfully login.");
						 pink.tx1.setText("");
			             pink.tx2.setText("");	 
				}
				else
				 {
					 // wrong condition 
			            JOptionPane.showMessageDialog(null,"Invalid Username and password.");
						card.show(cn,"main");						
                        pink.tx1.setText("");
			            pink.tx2.setText("");
				 }						
			  con.close();
		}
		catch(Exception e4)
		{
			 System.out.println(e4);
		}
	}	
	public void actionPerformed(ActionEvent e)
	{
		
		// font page "font_page" next button are call next page "second_page" 
		// second_page = rd, name = "ggc"
		// font_page = rd1, name = "gcc"
		if(e.getSource()==rd1.b2)
		{
			card.show(cn,"ggc");
		}
		// second_page "Admin" button call "admin_login" page Admin login
		// second_page = rd  name= "ggc"
		// admin_login = sad  name = "saad"
	    if(e.getSource() == rd.b1)
		{
	     	card.show(cn,"saad");
		}
		//second_page "User" button call "user_login" page user Registration
		// second_page = rd name = "ggc"
		// user_login = pink name = "main"
		if(e.getSource() == rd.b2)
		{
	     	card.show(cn,"main");
		}
		// admin_login page "login" button working 
		//admin_login page check the data call "admin_menu" page
        // admin_login = sad  name = saad
        // admin_menu = sita	name = Sita	
		if(e.getSource() == sad.b2)
		{
			// mysql table "admin"
			String s1 = sad.tx1.getText();
			String s2 = sad.tx2.getText();
			if(s1.equals("") && s2.equals("")) // name = admin password = 222333
			{
		        JOptionPane.showMessageDialog(null,"Please Enter values \n both the field.","Window",JOptionPane.ERROR_MESSAGE);
			}
			else 
			{
			     try
			       {
				    Class.forName("com.mysql.cj.jdbc.Driver");
				    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL = false","root","root");
				    Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from admin where name ='"+s1+"' AND pass = '"+s2+"'");
					if(rs.next())
					{
			            if(s1.equals(rs.getString(1)) && s2.equals(rs.getString(2)))
			            {
							 re = 1;
	     	                 card.show(cn,"Sita");
			            }
					}
					else
					{
					   JOptionPane.showMessageDialog(null,"Invalid user and Password","Window",JOptionPane.ERROR_MESSAGE);
					}   
					con.close();
			        }
			        catch(Exception e4)
			        {
				         System.out.println(e4);
			        }
			}
		}
		//admin_login page "back" button call "second_page" page
		// admin_login =  sad name = saad
		// second_page =  rd name = ggc
		if(e.getSource() == sad.b1)
		{
	     	card.show(cn,"ggc");
		}
		/*
		if(e.getSource() == b4)
		{
	     	card.show(cn,"gcc");
		}
		*/
		// back button 
		// student login page == font page panel "admin" or "user"
		if(e.getSource() == pink.b1)
		{
	     	card.show(cn,"ggc");
		}
		// student login page "login" button internal working
		if(e.getSource() == pink.b2)
		{
			// two textfield fetch data
			 String s1 = pink.tx1.getText();
             String s2 = pink.tx2.getText();
		// first time call function colour
		// then function are work student subject list to exam
	        if(c)
			{
                colour();
			}			
		    c = false;
			// admin verification working then student login their
			if(ver.cv1.getSelectedItem() != null)
			{
				JOptionPane.showMessageDialog(null,"Please verfiy by admin.");
			}
			else
			{ 		
		     // if textfield are black their 
		        if((s1.equals(""))&&(s2.equals("")))
				{
						   JOptionPane.showMessageDialog(null,"please Enter data.");
			    }
				else
				{
					// atleast login the student 
                    login();
		        }
				
			}	
		}
		// student login page
		// login button second working perform
		// particular student are set the instruction about exam 
		if(e.getSource() == pink.b2)
		{
			String s1 = um.cb1.getSelectedItem().toString();
			if(!s1.equals(""))
			{
					um.L7.setText("                 /////////////////////////////////////////////////////////");
					um.L8.setText("INSTRUCTIONS");
					um.L10.setText("1.There are total 1 questions each with 5 marks in this course.");
					um.L11.setText("2. Maximum time is 00.05.00.");
					um.L12.setText("3. There is no negative marking for any question.");
					um.L13.setText("4. After time up you will be automatically logged out.");		
			}						
		}
		// student login page == student registration page
		if(e.getSource() == pink.b4)
		{
	     	card.show(cn,"Ram");
		}
		// student registration page == student login page
		if(e.getSource() ==ram.b3)
		{
			card.show(cn,"main");
		}
		if(e.getSource() == sita.b1)
		{
		// manage course list are back button work their
        // their colour function are edit course list data are not remove click back button 
		   if(re == 1)
		    	manage_list();
			card.show(cn,"maan");
		}
		if(e.getSource() == sita.b7)
		{
			sad.tx1.setText("");
			sad.tx2.setText("");
			card.show(cn,"saad");
		}
		if(e.getSource() == um.b5)
		{
			card.show(cn,"main");
		}	
		
	                ex.rb1.setActionCommand("option1");
		            ex.rb2.setActionCommand("option2");
					ex.rb3.setActionCommand("option3");
		            ex.rb4.setActionCommand("option4");	
                    ButtonGroup group = new ButtonGroup();
					group.add(ex.rb1);
					group.add(ex.rb2);
					group.add(ex.rb3);
		     		group.add(ex.rb4); 		
   	   
		if(e.getSource() == um.b4) // start button click
		{
			
			String sc  = um.cb1.getSelectedItem().toString();
			ex.L3.setText(sc);
			setupDatabase();
			set_time();
			startTimer();
                 try 
			     {
                     if (rs.next()) 
					 {
                          loadQuestion();
                          um.b4.setEnabled(false);
                          ex.next.setEnabled(true);
                          ex.submit.setEnabled(true);
                     }
                } 
			    catch (SQLException ex) 
				{
                   System.out.println(ex);
                }
				ex.L2.setText(""+remaining);
		          ex.L1.setText(""+Attempt);
				card.show(cn,"exam");
				
		   // start button call exam page to student do exam paper
		}
				
		        if(e.getSource() == ex.next)
	     	    {
					saveAnswer();
                    try 
				    {
                         if (rs.next()) 
					    {
                             currentIndex++;
                             loadQuestion();
						     remaining--;
						     Attempt++;
                        }  
					    else 
					    {
                             JOptionPane.showMessageDialog(null, "This is the last question!");
                             rs.previous(); // Move back to the last valid row
                        }
                    } 
				    catch (SQLException ex) 
				    {
                       System.out.println(ex);
                    }
				    ex.L2.setText(""+remaining);
		            ex.L1.setText(""+Attempt);
				}
			 if(e.getSource() == ex.previous)
			 {
				 saveAnswer();
                 try 
				 {
                      if (rs.previous()) 
					  {
                         currentIndex--;
                         loadQuestion();
						 remaining++;
						 Attempt--;
                      } 
					  else 
					  {
                             JOptionPane.showMessageDialog(null, "This is the first question!");
                              rs.next(); // Move back to the first valid row
                      }
                  } 
				  catch (SQLException rx) 
				  {
                         System.out.println("  "+rx);
                  }
				  ex.L2.setText(""+remaining);
		          ex.L1.setText(""+Attempt);
			 }
			 
			if(e.getSource() == ex.submit)
		    {
				/// create by result to student;
				saveAnswer();
			   card.show(cn,"result");
			   res.L3.setText(ex.L3.getText());
               calculateResult();
				
			}	
		   // manage course page == admin menu page (back)
		if(e.getSource() == man.b4)
		{
			re = 0;
			card.show(cn,"Sita");
		}
		// manage course page are edit course list working 
		if(e.getSource() == man.b1)
		{
			card.show(cn,"ed");
			// edit course paper create working their
			Ed.tx1.setText(man.cb11.getSelectedItem().toString());
			Ed.tx2.setText(man.cb11.getSelectedItem().toString());
			Ed.New.s1 = man.cb11.getSelectedItem().toString();
			Ed.s31 = man.cb11.getSelectedItem().toString();
			Ed.s11 = man.cb11.getSelectedItem().toString();
			Ed.tx3.setText(course.tx2.getText());
			Ed.tx4.setText(course.tx3.getText());
			Ed.tx5.setText(course.tx4.getText());
			Ed.tx6.setText(""+totalQuestions);
		//	Ed.cg1.setSelectedItem(Add.cb1.getSelectedItem().toString());
		// edit course page save button working 
			if(e.getSource() != Ed.b4)
			{
		       Ed.showChoice();
			}
			
			String s65 = man.cb11.getSelectedItem().toString();
			try
			{
				    Class.forName("com.mysql.cj.jdbc.Driver");
				    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL = false","root","root");
				    Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from course where course = '"+s65+"'");
			        while(rs.next())
		           {
					   Ed.cg1.setSelectedItem(rs.getString(2));
				   }
			}
			catch(Exception e3)
			{
				System.out.println(e3);
			}
		}
		// edit course "back" button
		if(e.getSource() == Ed.b3)
		{
			/*
			DefaultComboBoxModel model = (DefaultComboBoxModel)Ed.View.cb12.getModel();
			model.removeAllElements();
			*/
			//Ed.removeChoice();
			Ed.View.cb12.removeAllItems();
			Ed.Update.cb11.removeAllItems();
			Ed.Remove.cb12.removeAllItems();
			Ed.View.ta1.setText("");
			Ed.View.tx3.setText("");
			Ed.View.tx4.setText("");
			Ed.View.tx5.setText("");
			Ed.View.tx6.setText("");
			Ed.View.tx1.setText("");
		   card.show(cn,"maan"); 
		}
		// manage couser are add new subject to couser list
		// call next page "add new couser"
		if(e.getSource() == man.b3)
		{
			card.show(cn,"add");
		}
		// logout button "admin menu"
		if(e.getSource() == sita.b3)
		{
			// call admin_login page
			card.show(cn,"saad");
			sad.tx1.setText("");
			sad.tx2.setText("");
		    JOptionPane.showMessageDialog(null,"Logout successfullly");
		}
		// back button call manage course page
		if(e.getSource() == course.b2)
		{
			card.show(cn,"maan");
		}
		if(e.getSource() == sita.b4)
		{
			if(e.getSource() == pink.b4)
		      	us.cg1.addItem(ram.tx1.getText());
		}
		if(e.getSource() == sita.b5)
		{   
               if(ver.cv1.getSelectedItem() != null)
			   {
			       card.show(cn,"very");
			   }
			   else
			   {
				   JOptionPane.showMessageDialog(null,"No users founds.");
				   card.show(cn,"Sita");
			   }
		}
		// student registration page "submit" button wroking
		if(e.getSource() == ram.b1)
		{
			String so = course.tx1.getText();
			if(!so.equals(""))
			{
			    ver.cv1.addItem(ram.tx1.getText());
			}
		}
		if(e.getSource() == sita.b4)
		{
			if(b)
			 user();
			card.show(cn,"user");
			b= false;
		}
		// search button show informotion about student
		if(e.getSource() == us.b1 || e.getSource() ==ver.b1)
		{
			String s1 = us.cg1.getSelectedItem().toString();
			try
			{
                    Class.forName("com.mysql.cj.jdbc.Driver");
				    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL = false","root","root");
				    Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from regis where username = '"+s1+"'");
			    while(rs.next())
		        {
					sh.L23.setText(rs.getString(1));
					sh.L24.setText(rs.getString(2));
					sh.tx1.setText(rs.getString(3));
					sh.tx2.setText(rs.getString(4));
					sh.tx3.setText(rs.getString(5));
					sh.tx4.setText(rs.getString(6));
					sh.tx5.setText(rs.getString(7));
					sh.tx6.setText(rs.getString(8));
					if(rs.getString(9).equals("MALE"))
					{ 
					   sh.r1.setSelected(true); 
					}
					else if(rs.getString(9).equals("FEMALE"))
					    { 
				           sh.r2.setSelected(true);
					    }
				    else 
					   {  
				          sh.r3.setSelected(true);  
					   }
					sh.tx7.setText(rs.getString(10));
					sh.cg1.setSelectedItem(rs.getString(11));
					sh.cg2.setSelectedItem(rs.getString(12));
					sh.cg3.setSelectedItem(rs.getString(13));
					sh.tx8.setText(rs.getString(14));
					sh.ta1.setText(rs.getString(15));
				}
				con.close();
			    card.show(cn,"search");
			}
			catch(Exception e3)
			{
				System.out.print(e3);
			}
		}
		// back button call admin_menu page
		if(e.getSource() == us.b2)
		{
			card.show(cn,"Sita");
		}
		// increase the size of list student
		if(e.getSource() == us.b1)
		{
			count = 1;
		}
		if(e.getSource() == um.b1)
		{
			count = 2;
			miya=11;
		}
		if(e.getSource() == ver.b1)
		{
			count = 3;
		}
		if(count == 1)
		{
		    if(e.getSource() == sh.b1) 
	        {
		     	sh.r1.setSelected(false);
		     	sh.r2.setSelected(false);
		     	sh.r3.setSelected(false);
			    card.show(cn,"user");
				count=0;
	     	}
		}
		else if(count == 2)
		{
		    if(e.getSource() == sh.b1) 
	        {
		     	sh.r1.setSelected(false);
		     	sh.r2.setSelected(false);
		     	sh.r3.setSelected(false);
			    card.show(cn,"m22");
				count=0;
	     	}
		}
		else if(count == 3)
		{
		    if(e.getSource() == sh.b1) 
	        {
		     	sh.r1.setSelected(false);
		     	sh.r2.setSelected(false);
		     	sh.r3.setSelected(false);
			    card.show(cn,"very");
				count=0;
	     	}
		}
		// "add course" button 
		// add course in the course list with the help of database
		if(e.getSource() == course.b1)
		{
			String s12 = course.cb1.getSelectedItem().toString();
			String s1 = course.tx1.getText();
			String hr = course.tx2.getText();
			String min = course.tx3.getText();
			String sec = course.tx4.getText();
			
			 if (!isNumeric(hr) || !isNumeric(min) || !isNumeric(sec)) 
			 {
               JOptionPane.showMessageDialog(null, "Please enter valid numeric values for time!");
               return;
            }
			 try 
			 {
            // JDBC Connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL=false", "root", "root");
            // Insert Query
            String query = "insert into Course (course,mark,time) VALUES (?, ?,?)";
            PreparedStatement pst = con.prepareStatement(query);

            String formattedTime = String.format("%02d:%02d:%02d", hr, min, sec);
            pst.setString(1, s12); // Replace with actual subject name or user input
			pst.setString(2, s1);
            pst.setString(3, formattedTime);

            int rows = pst.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Time inserted successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to insert time.");
            }

            con.close();
           } 
		   catch (Exception exp) 
		   {
              System.out.println(ex);
           }
			
			/*
            try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL = false","root","root");
				Statement st = con.createStatement();
				st.executeUpdate("insert into course(course,mark,time) values('"+s1+"','"+s12+"')");
				man.cb11.addItem(course.tx1.getText().toString());
				course.tx1.setText("");
				course.tx2.setText("");
				course.tx3.setText("");
				course.tx4.setText("");
				con.close();
			}
			catch(Exception e3)
			{
				System.out.println(e3);
			}
			    card.show(cn,"maan");
		        JOptionPane.showMessageDialog(null,"Course Added successfullly"); 	
				*/
		}
		// delete the item course list to manage course page 
		if(e.getSource() == man.b2)
		{
			
		     // man.cb11.removeItem(man.cb11.getSelectedItem().toString());
			//JOptionPane.showMessageDialog(null,"Are you sure Delete the Course.","Window",JOptionPane.ERROR_MESSAGE);
			String s21 = man.cb11.getSelectedItem().toString();
	        int input = JOptionPane.showConfirmDialog(null,"Are you sure Delete the Course.","Comform",JOptionPane.OK_CANCEL_OPTION);
			if(input == JOptionPane.OK_OPTION)
			{
				// delete the course to the list
			    try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL= false","root","root");
					Statement st = con.createStatement();
					st.executeUpdate("delete from course where course = '"+s21+"'");
				//	man.cb11.getSelectedItem().toString();
					man.cb11.removeItem(s21);
					con.close();
				}
				catch(Exception e4)
				{
					System.out.println(e4);
				}
				
			}
            else if(input == JOptionPane.CANCEL_OPTION)
			{ 		
		       card.show(cn,"maan");
			}
		}
		if(e.getSource() == ver.b2)
		{
			card.show(cn,"Sita");
		}
		/*
		if(e.getSource() == sita.b5)
		{
			card.show(cn,"very");
		}
		*/
		if(e.getSource() == ver.b4)
		{
			JOptionPane.showMessageDialog(null,"All Current Users are Verified.");
		    ver.cv1.removeAllItems();  
			card.show(cn,"Sita");
		}
		// back button course result
		if(e.getSource() == cat.b2)
		{
			card.show(cn,"Sita");
		}
		if(e.getSource() == sita.b2)
		{
			// add the data in combobox 
			// list of subject that time colour function call 
			// open the page courseresult 
			
			if(d == true)
			{
				course_result_list();
			//colour();
			d = false;
			}
			
			card.show(cn,"ccar");
		}
		if(e.getSource() == um.b1)
		{
			String s1 = um.L6.getText();
			try
			{
				    Class.forName("com.mysql.cj.jdbc.Driver");
				    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL = false","root","root");
				    Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from regis where first = '"+s1+"'");
			    while(rs.next())
		        {
					sh.L23.setText(rs.getString(1));
					sh.L24.setText(rs.getString(2));
					sh.tx1.setText(rs.getString(3));
					sh.tx2.setText(rs.getString(4));
					sh.tx3.setText(rs.getString(5));
					sh.tx4.setText(rs.getString(6));
					sh.tx5.setText(rs.getString(7));
					sh.tx6.setText(rs.getString(8));
					if(rs.getString(9).equals("MALE"))
					{ 
					   sh.r1.setSelected(true); 
					}
					else if(rs.getString(9).equals("FEMALE"))
					    { 
				           sh.r2.setSelected(true);
					    }
				    else 
					   {  
				          sh.r3.setSelected(true);  
					   }
					sh.tx7.setText(rs.getString(10));
					sh.cg1.setSelectedItem(rs.getString(11));
					sh.cg2.setSelectedItem(rs.getString(12));
					sh.cg3.setSelectedItem(rs.getString(13));
					sh.tx8.setText(rs.getString(14));
					sh.ta1.setText(rs.getString(15));
				}
				con.close();
			    card.show(cn,"search");
			}
			catch(Exception e3)
			{
				System.out.println(e3);
			}
		}
		if(e.getSource() == um.b3)
		{
			card.show(cn,"main");
			JOptionPane.showMessageDialog(null,"LogOut Successfully.");
		}
		if(e.getSource() == res.b1)
		{
			card.show(cn,"m22");
		}
		if(e.getSource() == res.b2)
		{
			//////////////////////////////
			/* remaining work at this place. */
			// save button working
			//sii = um.L6.getText();
		   
			String s1 = res.L3.getText();
			String s2 = res.L7.getText();
			String s3 = res.L9.getText();
			String s4 = res.L11.getText();
			String s5 = res.L13.getText();
			String s6 = res.L15.getText();
			String s7 = res.L17.getText();
			String s8 = res.L19.getText();
			String s17 = um.L6.getText();
			try
			{
				    Class.forName("com.mysql.cj.jdbc.Driver");
				    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL = false","root","root");
				    Statement st = con.createStatement();
					st.executeUpdate("insert into result(course,username,name,TotalQues,AttemptedQues,CorrectQues,WrongQues,Totalmarks,MarksObtained,Percentages) values('"+s1+"','"+sii+"','"+s17+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s7+"','"+s6+"','"+s8+"')");
					con.close();
			}
			catch(Exception e3)
			{
				System.out.println(e3);
			}
			JOptionPane.showMessageDialog(null,"Thank you \n Your result is saved successfully.");
			card.show(cn,"m22");
			        res.L3.setText("");
					res.L7.setText("");
					res.L9.setText("");
					res.L11.setText("");
					res.L13.setText("");
					res.L15.setText("");
					res.L17.setText("");
					res.L19.setText("");
		}
		if(e.getSource() == sita.b6)
		{
		    d21 = JOptionPane.showInputDialog(null,"NEW PASSWORD");
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidp?useSSL = false","root","root");
					Statement st = con.createStatement();
					st.executeUpdate("Update admin set pass = '"+d21+"' where name = 'admin'");
					con.close();
				}
				catch(Exception e3)
				{
					System.out.println(e3);
				}
					
		}
		if(e.getSource() == um.b2)
		{
			stu.L3.setText(sii);
		  
			stu.showTable();
			card.show(cn,"student");
			miya = 10;
		}
		// show all table increase their
		if(e.getSource() == stu.b2)
		{
			if(miya == 10)
		    {
			    card.show(cn,"m22");
		    }
		}
		
		// show the result about the student 
		if(e.getSource() == sh.b2)
		{
			// show all code
			String s1 = sh.tx1.getText();
			stu.L3.setText(sh.tx1.getText());
			//stu.showTable();
			try 
					{
					   Class.forName("com.mysql.cj.jdbc.Driver");	
					   String db_url="jdbc:mysql://localhost:3306/abhidp?useSSL = false";		
					   String db_uname="root";
					   String db_upass="root";
					   Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
					   Statement st = con.createStatement();
					   
					
					   String q = "select sno,course,TotalQues,AttemptedQues,CorrectQues,WrongQues,Totalmarks,MarksObtained,Percentages from result where username = '"+s1+"' ";
					   ResultSet rs=st.executeQuery(q); 
					   
					   p=0;
					   for(int i2=0;i2<100;i2++)
					{
						  for(j=0,k=1;j<9;j++,k++)
						   {
							stu.data[i2][j]="";
						   } 
					   }
					   
					   while(rs.next())
					   {
						   for(j=0,k=1;j<9;j++,k++)
						   {
							stu.data[p][j]=rs.getString(k);
						   }
							p++;
					   }
					   
					   con.close();	
					}
					catch(Exception ex)
					{
					  System.out.println(ex);
					}
			card.show(cn,"student");
		}
		// show all table increase student result
		if(e.getSource() == stu.b2)
		{
			if(miya == 11)
		     {
				card.show(cn,"search");
				miya=1;
		     }
			
		}
		
		if(miya == 1)
		{
		    if(e.getSource() == sh.b1) 
	        {
			    card.show(cn,"m22");
		     	sh.r1.setSelected(false);
		     	sh.r2.setSelected(false);
		     	sh.r3.setSelected(false);
				miya =0;
	     	}
		}
		if(e.getSource() == cat.b1)
	    {
			// show result for particular subject 
			cou.L3.setText(cat.cb1.getSelectedItem().toString());
			
			  String s12 = cat.cb1.getSelectedItem().toString();
			  // show all code in the result
			try 
					{
					   Class.forName("com.mysql.cj.jdbc.Driver");	
					   String db_url="jdbc:mysql://localhost:3306/abhidp?useSSL = false";		
					   String db_uname="root";
					   String db_upass="root";
					   Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
					   Statement st = con.createStatement();
					   
					   String q = "select sno,username,name,TotalQues,AttemptedQues,CorrectQues,WrongQues,Totalmarks,MarksObtained,Percentages from result where course = '"+s12+"'";
					   ResultSet rs=st.executeQuery(q); 
					   
					   p=0;
					   for(int i2=0;i2<100;i2++)
					   {
						  for(j=0,k=1;j<10;j++,k++)
						   {
							cou.data[i2][j]="";
						   } 
					   }
					   
					   while(rs.next())
					   {
						   for(j=0,k=1;j<10;j++,k++)
						   {
							cou.data[p][j]=rs.getString(k);
						   }
							p++;
					   }
					   con.close();	
					}
					catch(Exception ex)
					{
					  System.out.println(ex);
					}
		
			
		card.show(cn,"courseresult");
		}
		// back button working call "courseresult" page
		if(e.getSource() == cou.b2)
		{
		  card.show(cn,"ccar");
		}
		if(e.getSource() == ex.Back)
		{
			card.show(cn,"m22");
		}
	}
}
class main
{
	public static void main(String ab[])
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setBounds(200,100,700,700);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}



//set classpath=A:\project\mysql-connector-java-8.0.30.jar;.;%classpath%