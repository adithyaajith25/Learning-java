import javax.swing.*;
import java.awt.event.*;
public class Calc extends JFrame implements ActionListener{
	
	JFrame f=new JFrame("THIS IS A FRAME");
	
	JTextField tf=new JTextField("ENTER");
	tf.setBounds(100,117,201,25);
	f.add(tf);
	
	JButton b1= new JButton("1");		//1
	b1.setBounds(100,140,50,30);
	f.add(b1);
	JButton b2= new JButton("2");
	b2.setBounds(150,140,50,30);
	f.add(b2);
	JButton b3= new JButton("3");
	b3.setBounds(200,140,50,30);
	f.add(b3);
	JButton b4= new JButton("+");
	b4.setBounds(250,140,50,30);
	f.add(b4);
	
	JButton b5= new JButton("4");		//4
	b5.setBounds(100,170,50,30);
	f.add(b5);
	JButton b6= new JButton("5");
	b6.setBounds(150,170,50,30);
	f.add(b6);
	JButton b7= new JButton("6");
	b7.setBounds(200,170,50,30);
	f.add(b7);
	JButton b8= new JButton("-");
	b8.setBounds(250,170,50,30);
	f.add(b8);
	
	JButton b9= new JButton("7");		//7
	b9.setBounds(100,200,50,30);
	f.add(b9);
	JButton b10= new JButton("8");
	b10.setBounds(150,200,50,30);
	f.add(b10);
	JButton b11= new JButton("9");
	b11.setBounds(200,200,50,30);
	f.add(b11);
	JButton b12= new JButton("*");
	b12.setBounds(250,200,50,30);
	f.add(b12);
	
	JButton b13= new JButton("/");		
	b13.setBounds(100,230,50,30);
	f.add(b13);
	JButton b14= new JButton("%");
	b14.setBounds(150,230,50,30);
	f.add(b14);
	JButton b15= new JButton("=");
	b15.setBounds(200,230,50,30);
	f.add(b15);
	JButton b16= new JButton("C");
	b16.setBounds(250,230,50,30);
	f.add(b16);
	
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
	int num;
	String operation;
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b10.addActionListener(this);
	b11.addActionListener(this);
	b12.addActionListener(this);
	b13.addActionListener(this);
	b14.addActionListener(this);
	b15.addActionListener(this);
	b16.addActionListener(this);
	

	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1)
			tf.setText(tf.getText()+"1");
		else if(e.getSource()==b2)
			tf.setText(e.getText()+"2");
		else if(e.getSource()==b3)
			tf.setText(e.getText()+"3");
		else if(e.getSource()==b5)
			tf.setText(e.getText()+"4");
		else if(e.getSource()==b6)
			tf.setText(e.getText()+"5");
		else if(e.getSource()==b7)
			tf.setText(e.getText()+"6");
		else if(e.getSource()==b9)
			tf.setText(e.getText()+"7");
		else if(e.getSource()==b10)
			tf.setText(e.getText()+"8");
		else if(e.getSource()==b11)
			tf.setText(e.getText()+"9");
		else if(e.getSource()==b16){
			tf.setText("");
			num=0;
			operation=null;
		}
		else if(e.getSource()==b4)
			doAction("+");
		else if(e.getSource()==b8)
			doAction("-");
		else if(e.getSource()==b12)
			doAction("*");
		else if(e.getSource()==b13)
			doAction("/");
		else if(e.getSource()==b14)
			doAction("%");
		else if(e.getSource()==b15)
			doAction("=");
	}
	
	public void doAction(String op){	
		if(operation==null){
			operation=op;
			num=Integer.parseInt(tf.getText());
			tf.setText("");
		}
		else{
			switch(operation){
				case "+":
					num=num+Integer.parseInt(tf.getText());
					break;
				case "-":
					num=num-Integer.parseInt(tf.getText());
					break;
				case "/": 
					num=num/Integer.parseInt(tf.getText());
					break;
				case "*":
					num=num*Integer.parseInt(tf.getText());
					break;
				case "%":
					num=num%Integer.parseInt(tf.getText());
					break;
			}
			if(op.equals("=")){
				tf.setText(num.toString());
				num=0;
				operation=null;
			}
			else{
				operation=op;
				tf.setText("");
			}
		}
	
	}
		

}				
				
			
		
		
		
		
	

