import java.awt.Color;

import javax.swing.JFrame;

public class Main
{

	public static void main(String[] args)
	{
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBackground(Color.WHITE);

		window.setTitle("KanyeGame");
		window.setBounds(30, 30, 1280, 720);
		window.setResizable(false);
		window.add(new KanyePanel());



		window.setVisible(true);

	}

}
