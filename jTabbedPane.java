import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Swi_ng implements ActionListener
{
	    JFrame f;
		JPanel p1,p2,p3,p4;
		JLabel l1,l2,l3,l4;
		JTextField t1,t2,t3;
		JButton b1,b2;
		JTextArea t;
		
		
	Swi_ng() 
	   {
		 f=new JFrame("TABBED PANEL");
		 p1=new JPanel();
		 p2=new JPanel();
		 p3=new JPanel();
		 p4=new JPanel();
		 
		 JTabbedPane j_tab_p=new JTabbedPane();
		 j_tab_p.addTab("Name",p1);
		 j_tab_p.addTab("Branch",p2);
		 j_tab_p.addTab("Semester",p3);
		 j_tab_p.addTab("Result",p4);
		 f.add(j_tab_p);

		l1=new JLabel("Name:");
		l2=new JLabel("Branch:");
		l3=new JLabel("Semester:");
		l4=new JLabel("Details are:");

		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);

		 t=new JTextArea("",1,60);

		 b1=new JButton("Show");
		 b2=new JButton("Exit");

		 p1.setLayout(new GridLayout(6,2));
		 p2.setLayout(new GridLayout(6,2));
		 p3.setLayout(new GridLayout(6,2));
		 p4.setLayout(new GridLayout(6,2));

		 p1.add(l1);p1.add(t1);
		 p2.add(l2);p2.add(t2);
		 p3.add(l3);p3.add(t3);
         p4.add(l4);
		 p4.add(t);
         p4.add(b1);p4.add(b2);

		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		f.setVisible(true);
		b1.addActionListener(this);
	   } 

	 public void actionPerformed(ActionEvent act)
	    {
		
		if(act.getSource()==b1)
		{
			String e_no=t1.getText();
			String n_m=t2.getText();
			String br=t3.getText();
			String str_out="Details are:\n";

			str_out+="Enrolment is:"+e_no+"\n";
			str_out+="Name is:"+n_m+"\n";
			str_out+="Branch is:"+br+"\n";

			t.setText(str_out);
			
        }
    }
}

class jTabbedPane
{

	public static void main(String[] args) 
	{
	Swi_ng ob=new Swi_ng();	
	}
}
