import java.awt.*;
import java.awt.event.*;
class MyFirstGui extends WindowAdapter
{
	Frame f;
    MyFirstGui()
	{
		
    f=new Frame("First Frame");
	Button b=new Button("click me");
	b.setBounds(30,40,80,90);
	f.setVisible(true);
	f.setSize(300,300);
	f.add(b);
	f.setLayout(null);
	f.addWindowListener(this);
	}

	public void windowClosing(WindowEvent e)
		{
		f.dispose();
	    }
}

class Gui_main
{

	public static void main(String[] args) 
	{
	MyFirstGui G=new MyFirstGui();	
	
	}
}
