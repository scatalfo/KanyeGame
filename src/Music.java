import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.embed.swing.JFXPanel;


import  sun.audio.*;   
public class Music {
	static MediaPlayer mediaPlayer;


	public Music()
	{
		final JFXPanel fxPanel = new JFXPanel();

		playAudio("resources/Stronger.mp3");
	}
	public static void playAudio(String filename)
	{
		String bip = filename;
		Media hit = new Media(new File(bip).toURI().toString());
		mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.play();
	}
	public static void main(String[] args)
	{
		final JFXPanel fxPanel = new JFXPanel();

		System.out.println("x");
		playAudio("Stronger.mp3");
	}


}
