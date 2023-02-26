import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Swi_ng 
{
	    JFrame f;
		
		
	Swi_ng() 
	   {
		 f=new JFrame("My frame");
		
		 String name=JOptionPane.showInputDialog(f,"Enter your name:");
		 JOptionPane.showMessageDialog(f,"your name is :"+name);
		 JOptionPane.showMessageDialog(f,"Welcome");		 
	   } 
}

class joptionPanepopup
{

	public static void main(String[] args) 
	{
	Swi_ng ob=new Swi_ng();	
	}
}
