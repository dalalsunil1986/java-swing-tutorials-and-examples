package com.javaguides.avaswing.login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class UserHome extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				//	UserHome frame = new UserHome();
					
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the frame.
	 */
	public UserHome(String userSes) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		String name1 = null;
		try{
			System.out.println("add");
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
			
			PreparedStatement st=(PreparedStatement) con.prepareStatement("Select name,prt,gender,class,dob,section,teach,roll,marks section from stu where name=?");
			int i;
			
			st.setString(1,userSes);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				name1=rs.getString(1);
			
			}
			
			
			
			
		}
		catch(Exception w1)
		{
		System.out.println(w1);	
		}
		
		
		ButtonGroup btg=new ButtonGroup();
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 39));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int a=JOptionPane.showConfirmDialog(btnNewButton,"Are you sure?");
				//JOptionPane.setRootFrame(null);
				if(a==JOptionPane.YES_OPTION){
					dispose();
					UserLogin obj=new UserLogin();
					obj.setTitle("Student-Login");
					obj.setVisible(true);
				}
				dispose();
				UserLogin obj=new UserLogin();
			
				obj.setTitle("Student-Login");
				obj.setVisible(true);
						
			}
		});
		btnNewButton.setBounds(247, 118, 491, 114);
		contentPane.add(btnNewButton);
		final String a=name1;
		JButton button = new JButton("Change-password\r\n");
		button.setBackground(UIManager.getColor("Button.disabledForeground"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Change bo=new Change(a);
				bo.setTitle("Change Password");
				bo.setVisible(true);
						
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 35));
		button.setBounds(247, 320, 491, 114);
		contentPane.add(button);
		
		
	}
	
}
