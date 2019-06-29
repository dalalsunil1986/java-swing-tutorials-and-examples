package net.javaguides.javaswing.examples;
import javax.swing.*;

public class Frame {

	public static void main(String args[])
	{
		JFrame jf=new JFrame();
		jf.setSize(300, 300);
		jf.setVisible(true);
		
		JButton b=new JButton("Click");
		b.setBounds(70,70,100, 50);
		jf.add(b);
		
	}
}
