import javax.swing.*;
public class SwingMain1{
	public static void main(String args[]){
		JFrame f=new JFrame("THIS IS A FRAME");
		JButton b= new JButton("BUTTON");
		b.setBounds(175,100,100,40);
		f.add(b);
		
		JTextField tf= new JTextField("FIELD");
		tf.setBounds(150,150,150,20);
		f.add(tf);
		
		JTextArea ta= new JTextArea("AREA");
		ta.setBounds(125,180,200,75);
		f.add(ta);
		
		
		
		f.setSize(500,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
		
