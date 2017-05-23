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
		timer.start();
	}

	public void actionPerformed(ActionEvent e) {
//		System.out.println(timeLeft);
		if(timeLeft>0)
		{
			timeLeft--;
		}
	}
	  public void paintTimer(Graphics g){
		  g.setColor(Color.WHITE);
		  g.drawLine(0, 1, (timeLeft+2), 1);
		  g.setColor(Color.RED);
		  g.drawLine(0, 1, timeLeft, 1);
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
