import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class KanyePanel extends JPanel implements ActionListener, MouseListener, MouseMotionListener {
	public KanyeHead head;
	public KanyeTimer timer;
	public KanyeTest test;
	public int points=0;
	public boolean endGame=false;
	public KanyePanel()
	{
	    setFocusable(true);
	    addMouseListener(this);
	    addMouseMotionListener(this);
		head=new KanyeHead();
		timer = new KanyeTimer();
		test = new KanyeTest();
		Music stronger = new Music();
	    //call the step() function 60 times per second
	    Timer timer = new Timer(1000/60, this);
	    timer.start();

	}
	public void paintComponent(Graphics g)
	{
		if(!endGame)
		{
			test.paintSongs(g);

			timer.paintTimer(g);
			
			head.paintHead(g);
			g.drawString("Points: " + points, 50, 50);
		}
		if(endGame)
		{
			g.clearRect(0, 0, 1280, 720);
	    	Font f = g.getFont().deriveFont(30f);
	    	g.setFont(f);
			g.drawString("You lost with a score of " + points+ " points!", 100, 100);
		}
			
		
	}
	public void actionPerformed(ActionEvent e) {
		if(!endGame)
		{
		if(!head.getLaser()&&timer.getTimeLeft()>0)
		{

			timer.actionPerformed(e);
			head.actionPerformed(e);
			repaint();
		}
		if(head.getLaser()&&test.isCorrect(head.returnX(), head.returnY()))
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			points++;
			head.setLaserFalse();
			timer.resetTimer();
			test.pickSongs();
		}
		else if(head.getLaser()&&!test.isCorrect(head.returnX(), head.returnY()))
		{
			endGame();
		}
		else if(timer.getTimeLeft()==0)
		{
			endGame();
		}
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseMoved(MouseEvent e) {
		head.mouseMoved(e);		
	}
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mousePressed(MouseEvent e) {
		head.mousePressed(e);
		
	}
	
	public void mouseReleased(MouseEvent e) {
		head.mouseReleased(e);
		
	}
	public void endGame()
	{
		endGame=true;
		repaint();
	}
}
