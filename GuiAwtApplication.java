import java.awt.*;
import java.awt.event.*;
class  GuiApplication extends WindowAdapter
{
	Frame f;
	Panel p;
	Label l1,l2,l3,lres,lresult;
	TextField t1,t2,t3;
	Button b1,b2,b3;
	
	public GuiApplication()
	{
		f=new Frame("Awt Gui Application");
		p=new Panel();
		l1=new Label("Enter first number:");
		l2=new Label("Enter second number:");
		l3=new Label("Enter third number:");
		lres=new Label("###Average###");
		lresult=new Label("Display the result here....");
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		b1=new Button("Compute");
		b2=new Button("Refresh");
		b3=new Button("Exit");
		p.setLayout(new GridLayout(6,2));
		p.add(l1);p.add(t1);
		p.add(l2);p.add(t2);
		p.add(l3);p.add(t3);
		p.add(lres);p.add(lresult);
		p.add(b1);p.add(b2);p.add(b3);
		f.setLayout(new FlowLayout());
		f.add(p);
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(this);
}

	public void windowClosing(WindowEvent e)
		{
		f.dispose();
	    }
	
}
class GuiAwtApplication
{

	public static void main(String[] args) 
	{
	GuiApplication G=new GuiApplication();	
	
	}
}
