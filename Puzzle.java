import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Puzzle extends JFrame implements MouseListener
{
	private JButton j1,j2,j3,j4,j5;
	private JLabel scr;
	private JButton j6,j7,j8,j9,j10;
	private JPanel panel;
	private int flag1,flag2,flag3,flag4,flag5, count=0,score=1000;
	public Puzzle()
	{
		super("PUZZLE GAME");
		this.setSize(1000,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		panel.setLayout(null);
		Random r1=new Random();
		Random r2=new Random();
		
		
		int x=r2.nextInt(100);
		j1=new JButton(""+x);
		
		j1.setBounds(r1.nextInt(700),r1.nextInt(700),100,100);
		j1.setBackground(Color.BLUE);
		j1.setForeground(Color.BLUE);
		j1.addMouseListener(this);
		panel.add(j1);
		
		int x2=r2.nextInt(100);
		j2=new JButton(""+x2);
		j2.setBounds(r1.nextInt(700),r1.nextInt(700),100,100);
		j2.setBackground(Color.BLUE);
		j2.setForeground(Color.BLUE);
		j2.addMouseListener(this);
		panel.add(j2);
		int x3=r2.nextInt(100);
		j3=new JButton(""+x3);
		j3.setBounds(r1.nextInt(700),r1.nextInt(700),100,100);
		j3.setBackground(Color.BLUE);
		j3.setForeground(Color.BLUE);
		j3.addMouseListener(this);
		panel.add(j3);
		int x4=r2.nextInt(100);
		j4=new JButton(""+x4);
		j4.setBounds(r1.nextInt(700),r1.nextInt(700),100,100);
		j4.setBackground(Color.BLUE);
		j4.setForeground(Color.BLUE);
		j4.addMouseListener(this);
		panel.add(j4);
		int x5=r2.nextInt(100);
		j5=new JButton(""+x5);
		j5.setBounds(r1.nextInt(700),r1.nextInt(700),100,100);
		j5.setBackground(Color.BLUE);
		j5.setForeground(Color.BLUE);
		j5.addMouseListener(this);
		panel.add(j5);
		
		scr=new JLabel("SCORE="+score);
		scr.setBounds(0,0,80,30);
		panel.add(scr);
		
		
		
		j6=new JButton(""+x);
		j6.setBounds(r1.nextInt(700),r1.nextInt(700),100,100);
		j6.setBackground(Color.GREEN);
		j6.setForeground(Color.GREEN);
		j6.addMouseListener(this);
		panel.add(j6);
		
		j7=new JButton(""+x2);
		j7.setBounds(r1.nextInt(700),r1.nextInt(700),100,100);
		j7.setBackground(Color.GREEN);
		j7.setForeground(Color.GREEN);
		j7.addMouseListener(this);
		panel.add(j7);
		
		j8=new JButton(""+x3);
		j8.setBounds(r1.nextInt(700),r1.nextInt(700),100,100);
		j8.setBackground(Color.GREEN);
		j8.setForeground(Color.GREEN);
		j8.addMouseListener(this);
		panel.add(j8);
		
		j9=new JButton(""+x4);
		j9.setBounds(r1.nextInt(700),r1.nextInt(700),100,100);
		j9.setBackground(Color.GREEN);
		j9.setForeground(Color.GREEN);
		j9.addMouseListener(this);
		panel.add(j9);
		
		j10=new JButton(""+x5);
		j10.setBounds(r1.nextInt(700),r1.nextInt(700),100,100);
		j10.setBackground(Color.GREEN);
		j10.setForeground(Color.GREEN);
		j10.addMouseListener(this);
		panel.add(j10);
		
		this.add(panel);
	}
	
	public void mouseEntered(MouseEvent me)
	{
	}
	public void mousePressed(MouseEvent me)
	{
	}
	public void mouseReleased(MouseEvent me)
	{}
	public void mouseExited(MouseEvent me)
	{}
	public void mouseClicked(MouseEvent me)
	{
		if(me.getSource().equals(j1)||me.getSource().equals(j6))
		{
			flag1++;
			flag2=0;
			flag3=0;
			flag4=0;
			flag5=0;
			
			if(flag1==2)
			{
				j1.setVisible(false);
				panel.remove(j1);
				
				j6.setVisible(false);
				panel.remove(j6);
				count++;				
			}
			if(count==5)
			{
				Again a=new Again();
				a.setVisible(true);
				this.setVisible(false);
			}
			else
			{
				score=score-100;
				scr.setText("SCORE="+score);
			}
			
		}
		
		
		
		else if(me.getSource().equals(j2)||me.getSource().equals(j7))
		{
			flag1=0;
			flag2++;
			flag3=0;
			flag4=0;
			flag5=0;
			
			if(flag2==2)
			{
				j2.setVisible(false);
				panel.remove(j2);
				
				j7.setVisible(false);
				panel.remove(j7);
				count++;
				
			}
			if(count==5)
			{
				Again a=new Again();
				a.setVisible(true);
				this.setVisible(false);
			}
			else
			{
				score=score-100;
				scr.setText("SCORE="+score);
			}
			
		}
		
		
		else if(me.getSource().equals(j3)||me.getSource().equals(j8))
		{
			flag1=0;
			flag2=0;
			flag3++;
			flag4=0;
			flag5=0;
			
			if(flag3==2)
			{
				j3.setVisible(false);
				panel.remove(j3);
				
				j8.setVisible(false);
				panel.remove(j8);
				count++;
				
			}
			if(count==5)
			{
				Again a=new Again();
				a.setVisible(true);
				this.setVisible(false);
			}
			else
			{
				score=score-5;
				scr.setText("SCORE="+score);
			}
			
		}
		
		
		
		else if(me.getSource().equals(j4)||me.getSource().equals(j9))
		{
			flag1=0;
			flag2=0;
			flag3=0;
			flag4++;
			flag5=0;
			
			if(flag4==2)
			{
				j4.setVisible(false);
				panel.remove(j4);
				
				j9.setVisible(false);
				panel.remove(j9);
				count++;
				
			}
			if(count==5)
			{
				Again a=new Again();
				a.setVisible(true);
				this.setVisible(false);
			}
			else
			{
				score=score-5;
				scr.setText("SCORE="+score);
			}
			
		}
		
		
		else if(me.getSource().equals(j5)||me.getSource().equals(j10))
		{
			flag1=0;
			flag2=0;
			flag3=0;
			flag4=0;
			flag5++;
			
			if(flag5==2)
			{
				j5.setVisible(false);
				panel.remove(j5);
				
				j10.setVisible(false);
				panel.remove(j10);
				count++;
				
			}
			if(count==5)
			{
				Again a=new Again();
				a.setVisible(true);
				this.setVisible(false);
			}
			else
			{
				score=score-5;
				scr.setText("SCORE="+score);
			}
			
		}
		
		
		else
		{
			
		}	
		
	}
	
	
	
}