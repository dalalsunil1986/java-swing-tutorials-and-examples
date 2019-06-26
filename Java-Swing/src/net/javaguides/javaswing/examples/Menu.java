package net.javaguides.javaswing.examples;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class MenuBar extends JFrame{
	

	
	private static final long serialVersionUID = 1L;
	MenuBar(){}
	MenuBar(String s){super(s);}
	
	JMenuBar mb;
	JMenu Menu,SubMenu;
	JMenuItem Item1,Item2,Item3,Item4,Item5;
	void Menu1(){
		mb=new JMenuBar();
		
		Menu=new JMenu("Menu");
		SubMenu=new JMenu("Sub-Menu");
				
		Item1=new JMenuItem("Item1");		
		Item2=new JMenuItem("Item2");
		Item3=new JMenuItem("Item3");		
		Item4=new JMenuItem("Item4");
		Item5=new JMenuItem("Item5");
		
		Menu.add(Item1);
		Menu.add(Item2);
		Menu.add(Item3);
		
		SubMenu.add(Item4);
		SubMenu.add(Item5);
		Menu.add(SubMenu);
		
		mb.add(Menu);
		//mb.add(SubMenu);
		
		setJMenuBar(mb);
	}
}
public class Menu extends MenuBar{

	public static void main(String args[])
	{
		MenuBar jf=new MenuBar("Menu");
		jf.Menu1();
		jf.setLayout(null);
		jf.setSize(400,300);
		jf.setVisible(true);
}
}