package net.javaguides.javaswing.examples;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;  
public class JDialogEx {  
    private static JDialog d;  
    JDialogEx() {  
        JFrame f= new JFrame();  
        d = new JDialog(f , "Dialog Example", true);  
        d.setLayout( new FlowLayout() );  
        JButton b = new JButton ("OK");  
        b.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
            	JDialogEx.d.setVisible(false);  
            	f.dispose();
            }  
        });  
        d.add( new JLabel ("Click button to continue."));  
        d.add(b);   
        d.setSize(300,300);    
        d.setVisible(true);  
    }  
    public static void main(String args[])  
    {  
        new JDialogEx();  
    }  
}  
