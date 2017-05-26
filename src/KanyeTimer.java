import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
public class KanyeTimer implements ActionListener {
	public int timeLeft=1280;
	public KanyeTimer()
	{
		Timer timer= new Timer(1000/60, this);
	}

	public void actionPerformed(ActionEvent e) {
		//		System.out.println(timeLeft);
		if(timeLeft>0)
		{
			timeLeft-=4;
		}
	}
	public void paintTimer(Graphics g){
		g.setColor(Color.WHITE);
		g.drawLine(0, 1, (timeLeft+2), 1);
		g.drawLine(0, 2, (timeLeft+2), 2);
		g.drawLine(0, 3, (timeLeft+2), 3);
		g.drawLine(0, 4, (timeLeft+2), 4);


		g.setColor(Color.RED);
		g.drawLine(0, 1, timeLeft, 1);
		g.drawLine(0, 2, timeLeft, 2);
		g.drawLine(0, 3, timeLeft, 3);
		g.drawLine(0, 4, timeLeft, 4);


	}
	public int getTimeLeft()
	{
		return timeLeft;
	}
	public void resetTimer()
	{
		timeLeft=1280;
	}

}
