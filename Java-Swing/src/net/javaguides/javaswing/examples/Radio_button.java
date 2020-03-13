package net.javaguides.javaswing.examples;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Radio extends JFrame implements ActionListener {
	
	Radio()
	{
		super("Radio_button");
	}
	
	JRadioButton a,b,c;
	JButton btn;
	ButtonGroup btg;
	void check(){
		btg=new ButtonGroup();
		
		a=new JRadioButton("Male");
		a.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(a);
		btg.add(a);
		a.setBounds(150,100,150,60);

		b=new JRadioButton("Female");
		b.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(b);
		btg.add(b);
		b.setBounds(150,150,150,60);
		
		c=new JRadioButton("Children",false);
		c.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(c);
		btg.add(c);
		c.setBounds(150,200,150,60);
		
		btn=new JButton("Okay");
		btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(btn);
		btn.setBounds(150,300,100,60);
		btn.addActionListener(this);
	}
	
			public void actionPerformed(ActionEvent e)
			{
				String msg = "";
				if(a.isSelected())
				{
				
				msg+="Go to work\n";
				}
				if(b.isSelected())
				{
				msg+="Go to kitchen\n";
				}
				if(c.isSelected())
				{
				msg+="Go to sleep\n";
				}
				
				if(msg == "")
				{
					JOptionPane.showMessageDialog(btn,"You belong from Others");
				}
				else
				{
				JOptionPane.showMessageDialog(btn, msg);
				}
					
		}
}


public class Radio_button extends Radio{

	public static void main(String args[])
	{
		Radio jf=new Radio();
		
		jf.check();
		jf.setLayout(null);
		jf.setSize(500,500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}