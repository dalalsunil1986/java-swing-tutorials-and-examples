package net.javaguides.javaswing.examples;
import javax.swing.*;

public class Button_icon {


	public static void main(String args[])
	{
		JFrame jf=new JFrame();
		jf.setSize(300, 300);
		jf.setVisible(true);
		
		JButton b=new JButton(new ImageIcon("D:\\img.png"));
		//b.setAction();
		jf.setLayout(null);
		b.setBounds(70,70,100, 100);
		jf.add(b);
		
	}
}
