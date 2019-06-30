package net.javaguides.javaswing.examples;

import javax.swing.*;    
import java.awt.*;  
public class JSeparatorEx    
{    
    public static void main(String args[]) {  
        JFrame f = new JFrame("Javaguides");      
        f.setLayout(new GridLayout(0, 1));  
        JLabel l1 = new JLabel("Above");  
        f.add(l1);  
        JSeparator sep = new JSeparator();  
        f.add(sep);  
        JLabel l2 = new JLabel("Below");  
        f.add(l2);  
        f.setSize(400, 100);  
        f.setVisible(true);  
      }  
    }    