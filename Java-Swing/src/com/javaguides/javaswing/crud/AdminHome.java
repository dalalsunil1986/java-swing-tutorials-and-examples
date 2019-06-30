package com.javaguides.javaswing.crud;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
public class AdminHome extends JFrame {

	private JPanel contentPane;
	private JFrame jf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHome frame = new AdminHome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminHome() {
	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\0 (Custom).jpg"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1008, 26);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Main Menu");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmAddOldBooks = new JMenuItem("Add Student");
		mntmAddOldBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Students obj=new Add_Students();
				obj.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmAddOldBooks);
		
		JMenuItem mntmAddNewBooks = new JMenuItem("Update Stuent");
		mntmAddNewBooks.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			UpdateSearch obj=new UpdateSearch();
			obj.setVisible(true);
		}
	});
		mnNewMenu_1.add(mntmAddNewBooks);
		
		JButton add = new JButton("Add student");
		add.setFont(new Font("Tahoma", Font.PLAIN, 29));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Students obj=new Add_Students();
				obj.setVisible(true);
			}
		});
		add.setBounds(46, 197, 412, 118);
		contentPane.add(add);
		
		JButton button = new JButton("All Students");
		button.setFont(new Font("Tahoma", Font.PLAIN, 29));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AllStudents obj=new AllStudents();
				obj.setVisible(true);
			}
		});
		button.setBounds(505, 197, 387, 118);
		contentPane.add(button);
		
		JButton btnAlter = new JButton("Update Student");
		btnAlter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateSearch obj=new UpdateSearch();
				obj.setVisible(true);
			}
		});
		btnAlter.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnAlter.setBounds(46, 366, 412, 118);
		contentPane.add(btnAlter);
		
		JMenu mnNewMenu = new JMenu("Search");
		mnNewMenu.setBounds(0, 39, 58, -32);
		contentPane.add(mnNewMenu);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textArea.setBounds(65, 69, 587, 68);
		contentPane.add(textArea);
		
		JButton btnNewButton_2 = new JButton("Search");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_2.setBounds(688, 68, 148, 69);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String pstr=textArea.getText();
				try{
					System.out.println("add");
					
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
					
					PreparedStatement st=(PreparedStatement) con.prepareStatement("Select name,prt,gender,class,dob,section,teach,roll,marks section from stu where name=?");
					int i;
					
					st.setString(1,pstr);
					ResultSet rs=st.executeQuery();
					if(rs.next())
					{
						
						AdminSearch obj=new AdminSearch(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
						obj.setVisible(true);
					
					}
					else{
						JOptionPane.showMessageDialog(btnNewButton_2,"Sorry, Record Not Found");
						i=0;
					}
					
					
					
					
				}
				catch(Exception w1)
				{
				System.out.println(w1);	
				}
				
			}
		});
		
		JButton btnDeleteStudents = new JButton("Delete Students");
		btnDeleteStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteSearch obj=new DeleteSearch();
				obj.setVisible(true);
			}
		});
		btnDeleteStudents.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnDeleteStudents.setBounds(505, 366, 387, 118);
		contentPane.add(btnDeleteStudents);
		
		
	
	}
}
