package net.javaguides.javaswing.examples;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class Combo extends JFrame{
	
	Combo()
	{
		super("Combo Box");
	}
	JComboBox cb;
	String words[]={"c","C++","C#","java","Php","Python"};
	JButton b;
	public void combo()
	{
		
		
		cb=new JComboBox(words);
		cb.setSelectedItem(null);
		cb.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(cb);
		cb.setBounds(150,100,150,60);
		
		b=new JButton("Click");
		add(b);
		b.setFont(new Font("Tahoma", Font.PLAIN, 18));
		b.setBounds(150,300,120,30);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String data=(String) cb.getItemAt(cb.getSelectedIndex());
		//		JOptionPane.add()
				JOptionPane.showMessageDialog(b,"You have selected "+data);
			}
		});
	}
	
	
}
public class Combo_box extends Combo{
	public static void main(String args[])
	{
		Combo_box jf=new Combo_box();
		
		jf.combo();
		jf.setLayout(null);
		jf.setSize(500,500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
