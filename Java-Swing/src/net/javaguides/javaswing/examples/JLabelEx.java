
package net.javaguides.javaswing.examples;

import javax.swing.*;  
public class JLabelEx  
{  
public static void main(String args[])  
    {  
    JFrame f= new JFrame("Label Example");  
    JLabel l1,l2;  
    l1=new JLabel("Java Guides.");  
    l1.setBounds(50,50, 100,30);  
    l2=new JLabel("Hello Swing.");  
    l2.setBounds(50,100, 100,30);  
    f.add(l1); f.add(l2);  
    f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true);  
  }  
}  
