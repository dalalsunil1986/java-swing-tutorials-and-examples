package net.javaguides.javaswing.examples;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction {

	public static void main(String args[])
	{
		JFrame jf=new JFrame();
		jf.setSize(400, 400);
	
		
		final JTextField tf=new JTextField();
		tf.setBounds(50,50,200,80);
		tf.setEditable(false);
		jf.add(tf);		
		
		JButton b=new JButton();
		b.setBounds(100,200,100,50);
		jf.add(b);
		jf.setLayout(null);
		b.setText("Click Here");
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("Welcome to Java-Swing");
			}
		});
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
