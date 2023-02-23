import java.awt.*;
import java.awt.event.*;
class  Application extends WindowAdapter implements ActionListener
{
	Frame f;
	Panel p;
	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3,t4,t5;
	Button b1;
	TextArea t;
    
	Application()
	{
		f=new Frame("Registration Form");		
		f.setBackground(Color.orange);
		
		p=new Panel();
		
		l1=new Label("Enrollment:");
		l2=new Label("Name:");
		l3=new Label("Branch:");
		l4=new Label("Semester:");
		l5=new Label("Information:");
		
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		t4=new TextField(10);
		t5=new TextField(40);

		
		b1=new Button("Submit");

		t=new TextArea("",5,20);        
		
		p.setLayout(new GridLayout(6,2));
		p.add(l1);p.add(t1);
		p.add(l2);p.add(t2);
		p.add(l3);p.add(t3);
		p.add(l4);p.add(t4);
		p.add(l5);p.add(t);    
		p.add(b1);
		
		f.setLayout(new FlowLayout());
		f.add(p);
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(this);
		b1.addActionListener(this);
}

public void windowClosing(WindowEvent e)
		{
		f.dispose();
	    }

	
public void actionPerformed(ActionEvent act)
	{
		
		if(act.getSource()==b1)
		{
			String e_no=t1.getText();
			String n_m=t2.getText();
			String br=t3.getText();
			String sem=t4.getText();

			String str_out="Details are:\n";

			str_out+="Enrolment is:"+e_no+"\n";
			str_out+="Name is:"+n_m+"\n";
			str_out+="Branch is:"+br+"\n";
			str_out+="Semester is:"+sem+"\n";

			t.setText(str_out);
			
        }
    }
	
}
class RegistrationForm
{
	public static void main(String[] args) 
	{
		Application t=new Application();
	}
}
