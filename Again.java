import java.lang.*;
import javax.swing.*;
import java.awt.event.*;

public class Again extends JFrame implements ActionListener
{
	private JButton b1,b2;
	private JPanel panel;
	public Again()
	{
		super("Again");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		panel=new JPanel();
		panel.setLayout(null);
		
		b1=new JButton("Play Again");
		b1.setBounds(200,250,100,30);
		b1.addActionListener(this);
		panel.add(b1);
		
		b2=new JButton("EXIT");
		b2.setBounds(310,250,100,30);
		b2.addActionListener(this);
		panel.add(b2);
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b2))
		{
			System.exit(0);
		}
		else if(ae.getSource().equals(b1))
		{
			Puzzle pp=new Puzzle();
			pp.setVisible(true);
			this.setVisible(false);
		}
	}
}