package net.javaguides.javaswing.examples;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class JPanelExample extends JFrame
{
    JPanel panel1,panel2 ;
    JTextField txtData;
    JButton[] btnData = new JButton[12];
    JPanelExample()
    {
        panel1=new JPanel();
        txtData = new JTextField(20);
        panel1.add(txtData);
        add(panel1,"North");
        panel2=new JPanel(new GridLayout(3,4));
        for(int i=0;i<=9;i++)
        {
            btnData[i]=new JButton(""+i);
            panel2.add(btnData[i]);
        }
            add(panel2,"Center");
     }
}
 public class JPanelEx
 {
      public static void main(String[]  args)
     {
          JPanelExample frame = new JPanelExample();
          frame.setTitle("JPanel Java Example");
          frame.setBounds(100,200,220,200);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.pack();
          frame.setVisible(true);
   }
 }