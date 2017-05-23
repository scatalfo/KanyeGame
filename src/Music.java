import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.embed.swing.JFXPanel;


import  sun.audio.*;   
public class Music {
	static MediaPlayer mediaPlayer;


	public Music()
	{
		final JFXPanel fxPanel = new JFXPanel();
		
		playAudio(getClass().getResource("Stronger.mp3"));
	}
	public static void playAudio(URL url)
	{
		Media hit = new Media(url.toString());
		mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.play();
	}

}
