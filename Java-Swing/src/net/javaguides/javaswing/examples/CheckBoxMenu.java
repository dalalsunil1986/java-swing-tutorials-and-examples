package net.javaguides.javaswing.examples;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Chk2 extends JFrame{


	Chk2(){}
	Chk2(String s){super(s);}
	JCheckBox a,b,c;
	JButton btn;
	
	void check(){
		
		a=new JCheckBox("Pizza@399",false);
		a.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(a);
		a.setBounds(150,100,150,60);
		
		b=new JCheckBox("Burger@199",false);
		b.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(b);
		b.setBounds(150,150,150,60);
		
		c=new JCheckBox("Tea@49",false);
		c.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(c);
		c.setBounds(150,200,150,60);
		
		btn=new JButton("Total");
		btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(btn);
		btn.setBounds(150,300,100,60);
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String msg = "";
				int total=0;
				if(a.isSelected())
				{
				total+=399;
				msg+="Pizza@399\n";
				}
				if(b.isSelected())
				{
				total+=199;
				msg+="Burger@199\n";
				}
				if(c.isSelected())
				{
				total+=49;
				msg+="Tea@49\n";
				}
				
				if(msg == "")
				{
					JOptionPane.showMessageDialog(btn,"Go & Get some money");
				}
				else
				{
					total+=total%18;
				JOptionPane.showMessageDialog(btn, msg+ "\n(18% Gst added)\n\nTotal:- "+total);
				}
			}			
		}
		);
		
	}
}

public class CheckBoxMenu extends Chk2{

	public static void main(String args[])
	{
		Chk2 jf=new Chk2("Food");
		
		jf.check();
		jf.setLayout(null);
		jf.setSize(500,500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}