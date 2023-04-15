package com.BookMyShow;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Exception;
public abstract class User {
    private static int idCounter=0;
    private int id;
    private String name;

    public User(String userName) {
        idCounter += 1;
        this.id = idCounter;
        //login();
        this.name = userName;
       // createUser();
       // System.out.print(name);
       // createUser();
    }
    
	public void setName(String name) {
		this.name = name;
	}

	public void createUser() {
    	
    	JFrame f = new JFrame("Create User");//creating instance
		 
		 // panel.setLayout(new FlowLayout()); 
		JLabel l1;
		l1 = new JLabel("User Name"); //Create Label user
		l1.setBounds(30,15, 100, 30); 
		
		JTextField F_user = new JTextField();
		F_user.setBounds(110, 15, 200, 30);
		
		
		JButton login_but1 = new JButton("Add User");
		login_but1.setBounds(80, 90, 80, 25);
		login_but1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
		       name = F_user.getText(); 
		   	if(name.equals("")) //If username is null
			{
			  JOptionPane.showMessageDialog(null,  "Please enter username"); //Display dialog box with the message
			}else {
		     //GuestUser piyush = new GuestUser();
			 setName(F_user.getText());
			System.out.println(getName());
			F_user.setText("");
			 // JOptionPane.showMessageDialog(null,  "Please enter username"); 
			}
			}
		});
		
		JButton login_but2 = new JButton("Cancel");
		login_but2.setBounds(210, 90, 80, 25);
		login_but2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (e.getActionCommand().equals("Cancel")) {
			       //  F_user.setText("");
			        f.dispose();
			      }
			}
		});
		
	    f.add(login_but1);//adding button in JFrame  
	    f.add(login_but2);//adding button in JFrame 
	    f.add(F_user);  //add user
	    f.add(l1);  // add label1 i.e. for username

	     
	    f.setSize(400,180);//400 width and 500 height  
	    f.setLayout(null);//using no layout managers  
	    f.setVisible(true);//making the frame visible 
	    f.setLocationRelativeTo(null);
    
    }
	
	public static void login() {
		JFrame f = new JFrame("Log In");
		JLabel BookMyShow = new JLabel("Book My Show");
		BookMyShow.setBounds(180, 50, 100, 25);
		JLabel l1 = new JLabel("UserName");
	    l1.setBounds(100, 150, 100, 25);
	    JLabel l2 = new JLabel("Password");
	    l2.setBounds(100, 200, 100, 25);
		JTextField tf1 = new JTextField();
		tf1.setBounds(200, 150, 100, 25);
		JTextField tf2 = new JTextField();
		tf2.setBounds(200, 200, 100, 25);
		JButton logIn = new JButton("LogIn");
	    logIn.setBounds(200, 250, 80, 20);
	    JButton guestUser_butt = new JButton("Guest User");
	    guestUser_butt.setBounds(200, 300, 100, 25);
	    JButton registerUser_butt = new JButton("Register User");
	    registerUser_butt.setBounds(200, 350, 100, 25);
	    
	    f.add(BookMyShow);
	    f.add(l1);
	    f.add(l2);
	    f.add(tf1);
	    f.add(tf2);
	    f.add(logIn);
	    f.add(guestUser_butt);
	    f.add(registerUser_butt);
	    
	  // f.pack();
	   
	    f.setSize(500, 800);
	    f.setLayout(null);
	    f.setVisible(true);
	    f.setLocation(150,50);
	}
   

    public String getName() {
        return name;
    }
}
