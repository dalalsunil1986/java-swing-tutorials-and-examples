package net.javaguides.javaswing.examples;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

class Chk1 extends JFrame{
	
	Chk1(){}
	Chk1(String s){super(s);}
	
	JCheckBox a,b;
	JLabel l,l1;
	
	void check(){
		
		l=new JLabel();
		l.setBounds(150,25,150,60);
		add(l);
		
		l1=new JLabel();
		l1.setBounds(150,50,150,60);
		add(l1);
		
		l.setText("JavaTextbox :- Unchecked");
		l1.setText("CTextbox :- Unchecked");
		a=new JCheckBox("Java",false);
		a.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(a);
		a.setBounds(150,100,100,60);
		a.addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent e)
		{
			l.setText("JavaTextbox :- "+(e.getStateChange()==1?"Chcked":"Unchecked"));
		}
		});
		
		
		b=new JCheckBox("C",false);
		b.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(b);
		b.setBounds(150,150,50,60);
		b.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e)
			{
				l1.setText("CTextbox :- "+(e.getStateChange()==1?"Chcked":"Unchecked"));
			}
			});
		
	}
	
}
public class CheckBox1 extends Chk1{

	public static void main(String args[])
	{
		Chk1 jf=new Chk1("Check");
		jf.check();
		jf.setLayout(null);
		jf.setSize(400,300);
		jf.setVisible(true);
		
}
}