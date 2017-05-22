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
    
  }

  public void mouseReleased(MouseEvent e)
  {
    // TODO Auto-generated method stub
    
  }

  public void actionPerformed(ActionEvent e)
  {
    step();
    
  }
  public void step()
  {
    repaint();
  }
  public void paintComponent(Graphics g){
    Image img1 = Toolkit.getDefaultToolkit().getImage("KanyeFace.png");
    if(direction)
    {
      g.clearRect(500, 10, width, height);
      g.drawImage(img1, 500, 10, this);
    }
    else
    {
      g.clearRect(500, 10, width, height);

      g.drawImage(img1, 500 + width, 10, -width, height, this);
    }
    
}
  public void mouseDragged(MouseEvent e)
  {
    // TODO Auto-generated method stub
    
  }
  public void mouseMoved(MouseEvent e)
  {
    if(e.getX()>500)
    {
      
      direction=true;
    }
    else{
      direction = false;
    }
  }



  

}
