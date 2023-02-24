import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Swi_ng implements ActionListener 
{
	    JFrame f;
		JPanel p;
		JLabel l1,l2,l3,l4,l5;
		JTextField t1,t2,t3;
		JButton b1;
		JTextArea t;
	Swi_ng() 
	{
		f=new JFrame("My frame");
		p=new JPanel();

		 t=new JTextArea(1,20);

		ImageIcon icon=new ImageIcon("1.jpg");
	    ImageIcon icon1=new ImageIcon("2.jpg");
	    ImageIcon icon2=new ImageIcon("3.jpg");
	    ImageIcon icon3=new ImageIcon("A.jpg");
		ImageIcon icon4=new ImageIcon("CA.jpg");

		l1=new JLabel(icon);
		l2=new JLabel(icon1);
		l3=new JLabel(icon2);
		l4=new JLabel(icon3);

		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		
		b1=new JButton(icon4);

		p.setLayout(new GridLayout(6,2));
		p.add(l1);p.add(t1);
		p.add(l2);p.add(t2);
		p.add(l3);p.add(t3);
		p.add(l4);p.add(t);
		p.add(b1);
		
		f.setLayout(new FlowLayout());
		f.add(p);
		f.setSize(400,400);
		f.setVisible(true);
		b1.addActionListener(this);

	}
		public void actionPerformed(ActionEvent act) 
			{
                if (act.getSource() == b1)
					{
                        double f1 = Double.parseDouble(t1.getText().toString());
                        double f2 = Double.parseDouble(t2.getText().toString());
                        double f3 = Double.parseDouble(t3.getText().toString());
                        double g = ((f1 + f2 + f3) / 3);
                        t.setText(String.valueOf(g));
						
                    }
		     } 
}

class SwingApplication
{

	public static void main(String[] args) 
	{
	Swi_ng ob=new Swi_ng();	
	}
} 
