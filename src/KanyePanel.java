import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class KanyePanel extends JPanel implements ActionListener, MouseListener, MouseMotionListener {
	public KanyeHead head;
	public KanyeTimer timer;
	public KanyeTest test;
	public KanyeMenu menu;
	public Music audio;
	public OtherMusic otherAudio;
	public static boolean pressedPlay=false;
	public int points=0;
	public boolean endGame=false;
	public KanyePanel()
	{
		setFocusable(true);
		addMouseListener(this);
		addMouseMotionListener(this);
		head=new KanyeHead(this);
		timer = new KanyeTimer();
		test = new KanyeTest();
		audio = new Music();
		otherAudio = new OtherMusic();
		menu = new KanyeMenu();
		this.add(menu.getPlayButton());
		//call the step() function 60 times per second
		Timer timer = new Timer(1000/60, this);
		timer.start();

	}
	
	public void paintComponent(Graphics g)
	{

		if(!pressedPlay)
		{
			menu.paintMenu(g);
		}
		if(!endGame&&pressedPlay)
		{
			audio.stronger();
			otherAudio.play();
			test.paintSongs(g);

			timer.paintTimer(g);

			head.paintHead(g);
		    Toolkit t=Toolkit.getDefaultToolkit();  

		    Image im=t.getImage(getClass().getResource("newKanyeLaser.gif"));
		    if (head.isLeft().getBool()){
		    	//g.drawImage(im, head.isLeft().getX()-50,0,null);  //not implemented properly, Ben fix it so it shoots the laser at the right time
		    	g.drawImage(im, head.isLeft().getX()-50, 0, 181, 650, null);
		    	//System.out.println("test left");
		    }
		    if (head.isRight().getBool()){
		    	//g.drawImage(im, head.isRight().getX()-50,0,null);  //not implemented properly, Ben fix it so it shoots the laser at the right time
		    	g.drawImage(im, head.isLeft().getX()-50, 0, 181, 650, null);
		    }

			g.setColor(Color.BLACK);
			g.drawString("Points: " + points, 50, 50);
		}
		if(endGame&&pressedPlay)
		{
			g.clearRect(0, 0, 1280, 720);
			Font f = g.getFont().deriveFont(30f);
			g.setFont(f);
			g.drawString("You lost with a score of " + points+ " points!", 450, 250);
		}


	}
	public void actionPerformed(ActionEvent e) {
		if(pressedPlay)
		{
			this.remove(menu.getPlayButton());
			this.setLayout(null);

			
		}
		if(!endGame&&pressedPlay)
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
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

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
	public static void playPressed()
	{
		pressedPlay=true;
	}
}
