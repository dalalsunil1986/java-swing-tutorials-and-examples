package net.javaguides.javaswing.examples;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingImg {

  public static void main(String avg[]) throws Exception {
    BufferedImage img = ImageIO.read(new URL(
        "https://pbs.twimg.com/profile_images/954020529391902720/jW4dnFtA.jpg"));
    ImageIcon icon = new ImageIcon(img);
    JFrame frame = new JFrame();
    frame.setLayout(new FlowLayout());
    frame.setSize(400,400);
    JLabel lbl = new JLabel();
    lbl.setIcon(icon);
    frame.add(lbl);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}