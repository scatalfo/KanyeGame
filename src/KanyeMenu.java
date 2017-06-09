import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class KanyeMenu {
	public JButton playButton;

	public KanyeMenu()
	{
		playButton=new JButton("'Ye");
		
		Dimension dd = new Dimension(150,100);
		playButton.setLocation(100, 100);
		playButton.setPreferredSize(dd);
		//playButton.setBackground(Color.RED);
		//playButton.setOpaque(true);
		playButton.setBounds(100,100,30,30);
		//playButton.setForeground(Color.WHITE);
		//playButton.setBorderPainted(false);
		playButton.setFont(new Font("Arial", Font.PLAIN, 40));
		//playButton.setBorder(new RoundedBorder(150));
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

