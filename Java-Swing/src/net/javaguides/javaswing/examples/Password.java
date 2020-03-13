package net.javaguides.javaswing.examples;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

class PW extends JFrame{
	
	PW(){}
	PW(String s)
	{
	super(s);
	}
	
	JLabel l,l1,l2;
	JButton b1;
	JTextArea Area;
	JPasswordField p;
	
	void textArea(){

		l=new JLabel();
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		
		b1=new JButton("Login");
		
		Area=new JTextArea();
		Area.setFont(new Font("Tahoma", Font.PLAIN, 18));
	
		p=new JPasswordField();
		
		add(l);
		add(l1);
		add(l2);
		add(b1);
		add(Area);
		add(p);
		
		l1.setBounds(20,20,80,30);
		l2.setBounds(20,75,80,30);
		Area.setBounds(100,20,100,30);
		p.setBounds(100,75,100,30);
		b1.setBounds(100,120,80,30);
		l.setBounds(20,150,400,50);
	
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String data="Username:-" +Area.getText()+  ", Password:-" +p.getText();
				String user=Area.getText();
				String pass=p.getText();
				if( user.equals("Soumya") && pass.equals("1234"))
				{
					l.setText("Access Granted"+data);
				}
				else
				{
					l.setText("Access denied");
				}
			}

			
		});
	}
}
	
public class Password extends PW{

	Password(){}
	Password(String s)
	{
	super(s);
	}
	public static void main(String args[])
	{
		Password jf=new Password("Security");
		jf.textArea();
		jf.setLayout(null);
		jf.setSize(400,300);
		jf.setVisible(true);
		
		
	}
}

