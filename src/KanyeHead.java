import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class KanyeHead extends JPanel implements ActionListener, MouseListener, MouseMotionListener
{
	public boolean direction;
	int width=300;
	int height=461;
	public boolean hasClicked;
	public int whereClickedX;
	public int whereClickedY;
	public boolean lasers=false;

	public KanyeHead()
	{
		setFocusable(true);
		addMouseListener(this);
		addMouseMotionListener(this);


		//call the step() function 60 times per second
		Timer timer = new Timer(1000/60, this);
		timer.start();

	}
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e)
	{
		if(!lasers)
		{
			whereClickedX=e.getX();
			whereClickedY=e.getY();
			hasClicked=true;
		}
		System.out.println(e.getX()+" "+e.getY());
	}

	public void mouseReleased(MouseEvent e)
	{
		hasClicked=false;

	}

	public void actionPerformed(ActionEvent e)
	{
		step();

	}
	public void step()
	{

		repaint();
	}
	public void paintHead(Graphics g){

		Image img1 = Toolkit.getDefaultToolkit().getImage("resources/KanyeFace.png");
		if(direction&&!lasers)
		{
			g.clearRect(500, 10, width, height);
			g.drawImage(img1, 500, 10, this);
		}

		else if(!direction&&!lasers)
		{
			g.clearRect(500, 10, width, height);

			g.drawImage(img1, 500 + width, 10, -width, height, this);
		}
		if(hasClicked&&direction&&!lasers)
		{
			g.setColor(Color.MAGENTA);
			g.drawLine(754, 241, whereClickedX, whereClickedY);
			g.drawLine(639, 243, whereClickedX, whereClickedY);
			lasers = true;

		}
		else if(hasClicked&&!direction&&!lasers)
		{
			g.setColor(Color.MAGENTA);
			g.drawLine(543, 243, whereClickedX, whereClickedY);
			g.drawLine(655, 241, whereClickedX, whereClickedY);
			lasers=true;

		}

	}
	public void mouseDragged(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}
	public void mouseMoved(MouseEvent e)
	{
		if(e.getX()>650)
		{

			direction=true;
		}
		else{
			direction = false;
		}
	}

	public boolean getLaser()
	{
		return lasers;
	}
	public void setLaserFalse()
	{
		lasers=false;
		hasClicked=false;
	}
	public int returnX()
	{
		return whereClickedX;
	}
	public int returnY()
	{
		return whereClickedY;
	}



}
