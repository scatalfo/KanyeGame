import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.*;

public class KanyeMenu {
	public JButton playButton;

	public KanyeMenu()
	{
		playButton=new JButton("Play");
		   ActionListener playListener = new PlayListener();
		   playButton.addActionListener(playListener);

	}
	public void paintMenu(Graphics g)
	{
		Font f = g.getFont().deriveFont(30f);
		g.setFont(f);
		g.drawString("Instructions:", 560, 260);
		f = g.getFont().deriveFont(20f);
		g.setFont(f);
		g.drawString("Click on the box that doesn't contain a Kanye West Song before time runs out", 300, 300);

	}
	public JButton getPlayButton()
	{
		return playButton;
	}

}

