import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.*;

public class KanyeMenu {
	public JButton playButton;
	public JButton helpButton;

	public KanyeMenu()
	{
		playButton=new JButton("Play");
		   ActionListener playListener = new PlayListener();
		   playButton.addActionListener(playListener);

		helpButton = new JButton("Instructions");
	}
	public void paintMenu(Graphics g)
	{
		
	}
	public JButton getPlayButton()
	{
		return playButton;
	}
	public JButton getHelpButton()
	{
		return helpButton;
	}

}

