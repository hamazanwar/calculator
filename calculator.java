import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class calculator implements ActionListener
{
	
	boolean operaterclicked=false;
	
	String oldvalue;
	String operator;
	
	
	
	JFrame jf;
	JLabel displaylabel;
	
	
	
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninetbutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton pointbutton;
	JButton zerobutton;
	JButton equaltbutton;
	JButton divisionbutton;
	JButton multiplebutton;
	JButton subtractionbutton;
	JButton additionbutton;
	JButton clearbutton;
	
	
	
	public calculator()
	{
		jf=new JFrame("calculator");
		jf.setSize(600,600);
		jf.setLayout(null);
		jf.setLocation(900,150);
		
		
		
		displaylabel=new JLabel();
		displaylabel.setBounds(30,60,540,40);
		displaylabel.setBackground(Color.gray);
		displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(Color.white);
		
		jf.add(displaylabel);
		
		
		JLabel programmerbrand=new JLabel("HMZ");
		programmerbrand.setBounds(470,200,540,40);
		programmerbrand.setFont(new Font("Arial",Font.BOLD,18));
		jf.add(programmerbrand);
		
		JLabel programmername=new JLabel("CALCULATOR");
		programmername.setBounds(430,230,540,40);
		programmername.setFont(new Font("Arial",Font.BOLD,18));
		jf.add(programmername);
		
		
		sevenbutton=new JButton("7");
		sevenbutton.setBounds(30,130,80,80);
		sevenbutton.addActionListener(this);
		jf.add(sevenbutton);
		
		eightbutton=new JButton("8");
		eightbutton.setBounds(120,130,80,80);
		eightbutton.addActionListener(this);
		jf.add(eightbutton);
		
		ninetbutton=new JButton("9");
		ninetbutton.setBounds(210,130,80,80);
		ninetbutton.addActionListener(this);
		jf.add(ninetbutton);
		
		
		
		
		
		fourbutton=new JButton("4");
		fourbutton.setBounds(30,220,80,80);
		fourbutton.addActionListener(this);
		jf.add(fourbutton);
		
		fivebutton=new JButton("5");
		fivebutton.setBounds(120,220,80,80);
		fivebutton.addActionListener(this);
		jf.add(fivebutton);
		
		sixbutton=new JButton("6");
		sixbutton.setBounds(210,220,80,80);
		sixbutton.addActionListener(this);
		jf.add(sixbutton);
		
		
		
		
		
		onebutton=new JButton("1");
		onebutton.setBounds(30,310,80,80);
		onebutton.addActionListener(this);
		jf.add(onebutton);
		
		twobutton=new JButton("2");
		twobutton.setBounds(120,310,80,80);
		twobutton.addActionListener(this);
		jf.add(twobutton);
		
		threebutton=new JButton("3");
		threebutton.setBounds(210,310,80,80);
		threebutton.addActionListener(this);
		jf.add(threebutton);
		
		
		
		
		
		pointbutton=new JButton(".");
		pointbutton.setBounds(30,400,80,80);
		pointbutton.addActionListener(this);
		jf.add(pointbutton);
		
		zerobutton=new JButton("0");
		zerobutton.setBounds(120,400,80,80);
		zerobutton.addActionListener(this);
		jf.add(zerobutton);
		
		equaltbutton=new JButton("=");
		equaltbutton.setBounds(210,400,80,80);
		equaltbutton.addActionListener(this);
		jf.add(equaltbutton);
		
		
		
		
		
		divisionbutton=new JButton("/");
		divisionbutton.setBounds(300,130,80,80);
		divisionbutton.addActionListener(this);
		jf.add(divisionbutton);
		
		multiplebutton=new JButton("x");
		multiplebutton.setBounds(300,220,80,80);
		multiplebutton.addActionListener(this);
		jf.add(multiplebutton);
		
		subtractionbutton=new JButton("_");
		subtractionbutton.setBounds(300,310,80,80);
		subtractionbutton.addActionListener(this);
		jf.add(subtractionbutton);
		
		additionbutton=new JButton("+");
		additionbutton.setBounds(300,400,80,80);
		additionbutton.addActionListener(this);
		jf.add(additionbutton);
		
		
		clearbutton=new JButton("clear");
		clearbutton.setBounds(390,400,80,80);
		clearbutton.addActionListener(this);
		jf.add(clearbutton);
		
		
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String arg[])
	{
		calculator c=new calculator();
	}
	
	
	public void actionPerformed(ActionEvent e)
    {
		if(e.getSource()==sevenbutton)
		{
			if(operaterclicked)
			{
				displaylabel.setText("7");
				operaterclicked=false;
			}
			else
			{
				displaylabel.setText(displaylabel.getText()+"7");
			}
		}
		else if(e.getSource()==eightbutton)
		{
			if(operaterclicked)
			{
				displaylabel.setText("8");
				operaterclicked=false;
			}
			else
			{
				displaylabel.setText(displaylabel.getText()+"8");
			}
		}
		else if(e.getSource()==ninetbutton)
		{
			if(operaterclicked)
			{
				displaylabel.setText("9");
				operaterclicked=false;
			}
			else
			{
				displaylabel.setText(displaylabel.getText()+"9");
			}
		}
		else if(e.getSource()==fourbutton)
		{
			if(operaterclicked)
			{
				displaylabel.setText("4");
				operaterclicked=false;
			}
			else
			{
				displaylabel.setText(displaylabel.getText()+"4");
			}
		}
		else if(e.getSource()==fivebutton)
		{
			if(operaterclicked)
			{
				displaylabel.setText("5");
				operaterclicked=false;
			}
			else
			{
				displaylabel.setText(displaylabel.getText()+"5");
			}
		}
		else if(e.getSource()==sixbutton)
		{
			if(operaterclicked)
			{
				displaylabel.setText("6");
				operaterclicked=false;
			}
			else
			{
				displaylabel.setText(displaylabel.getText()+"6");
			}
		}
		else if(e.getSource()==onebutton)
		{
			if(operaterclicked)
			{
				displaylabel.setText("1");
				operaterclicked=false;
			}
			else
			{
				displaylabel.setText(displaylabel.getText()+"1");
			}
		}
		else if(e.getSource()==twobutton)
		{
			if(operaterclicked)
			{
				displaylabel.setText("2");
				operaterclicked=false;
			}
			else
			{
				displaylabel.setText(displaylabel.getText()+"2");
			}
		}
		else if(e.getSource()==threebutton)
		{
			if(operaterclicked)
			{
				displaylabel.setText("3");
				operaterclicked=false;
			}
			else
			{
				displaylabel.setText(displaylabel.getText()+"3");
			}
		}
		else if(e.getSource()==pointbutton)
		{
			if(operaterclicked)
			{
				displaylabel.setText(".");
				operaterclicked=false;
			}
			else
			{
				displaylabel.setText(displaylabel.getText()+".");
			}
		}
		else if(e.getSource()==zerobutton)
		{
			if(operaterclicked)
			{
				displaylabel.setText("0");
				operaterclicked=false;
			}
			else
			{
				displaylabel.setText(displaylabel.getText()+"0");
			}
		}
		else if(e.getSource()==equaltbutton)
		{
			String newvalue=displaylabel.getText();
			float oldvalueF=Float.parseFloat(oldvalue);
			float newvalueF=Float.parseFloat(newvalue);
			float result=0;
			if(operator.equals("+"))
			{
				result=oldvalueF+newvalueF;
			}
			else if(operator.equals("_"))
			{
				result=oldvalueF-newvalueF;
			}
			else if(operator.equals("x"))
			{
				result=oldvalueF*newvalueF;
			}
			else if(operator.equals("/"))
			{
				result=oldvalueF/newvalueF;
			}
			displaylabel.setText(result+"");
		}
		else if(e.getSource()==divisionbutton)
		{
			operaterclicked=true;
			oldvalue=displaylabel.getText();
			operator="/";
		}
		else if(e.getSource()==multiplebutton)
		{
			operaterclicked=true;
			oldvalue=displaylabel.getText();
			operator="x";
		}
		else if(e.getSource()==subtractionbutton)
		{
			operaterclicked=true;
			oldvalue=displaylabel.getText();
			operator="_";
		}
		else if(e.getSource()==additionbutton)
		{
			operaterclicked=true;
			oldvalue=displaylabel.getText();
			operator="+";
		}
		else if(e.getSource()==clearbutton)
		{
			displaylabel.setText("");
		}
    }
}
