import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

public class KanyeTest {
	public String[] realSongs= {"All Day",
			"All Falls Down",
			"All of the Lights",
			"Amazing",
			"Awesome",
			"Bad News",
			"Big Brother",
			"Black Skinhead",
			"Blame Game",
			"Blood On The Leaves",
			"Bound 2",
			"Can't Tell Me Nothing",
			"Champion",
			"Champions",
			"Christian Dior Denim Flow",
			"Clique",
			"Cold",
			"Coldest Winter",
			"Dark Fantasy",
			"Devil in a New Dress",
			"Diamonds From Sierra Leone",
			"Don't Stop",
			"Everything I Am",
			"Facts",
			"Fade",
			"Famous",
			"Father Stretch My Hands Pt. 1",
			"Father Stretch My Hands Pt. 2",
			"Flashing Lights",
			"FML",
			"Gold Digger",
			"Gone",
			"Good Friday",
			"Good Life",
			"Gorgeous",
			"Guilt Trip",
			"Heard 'Em Say",
			"Heartless",
			"Hell of a Life",
			"Hey Mama",
			"Highlights",
			"Hold My Liquor",
			"Homecoming",
			"I Am a God",
			"I Wonder",
			"I'm In It",
			"Jesus Walks",
			"Lord, Lord, Lord",
			"Lost in The World",
			"Love Lockdown",
			"Low Lights",
			"Mama's Boyfriend",
			"Mercy",
			"Monster",
			"New God Flow",
			"New Slaves",
			"No More Parties in L.A.",
			"On Sight",
			"Only One",
			"Paranoid",
			"Pinnochio Story",
			"Power",
			"Real Friends",
			"Robocop",
			"Runaway",
			"Saint Pablo",
			"Say You Will",
			"See Me Now",
			"See You In My Nightmares",
			"Send It Up",
			"Siiiiiiiiilver Surffffeeeeer Intermission",
			"So Appalled",
			"Street Lights",
			"Stronger",
			"The Joy",
			"Through The Wire",
			"To the World",
			"Touch The Sky",
			"Ultralight Beam",
			"Waves",
			"Welcome to Heartbreak",
			"White Dress",
			"Who Will Survive in America",
	"Wolves"};
	public String[] fakeSongs={"All Night", "All Comes Up", "None Of The Lights", "Wonderful", "Superflorous", "Sad News", "My Big Brother", "Racist Skinhead", "Shame Game", "Blood On The Trees", "Bounded To You", "Don't Tell Me Anything", "I'm the Champ", "We're the Champions", "Jesus Christian Flow", "Click", "Freezing", "Hottest Summer", "Evil Dreams", "Devil's New Makeup", "Gold From Newmont Mining", "We're Going", "Everything I'm Not", "Lies", "Blur", "Popular", "Mother Close My Hands Pt.1", "Mother Close My Hands Pt.2", "S.O.S. Lights", "Love My Life", "Diamond Miner", "Dissapear", "Happy Mondays", "Yeezy Life", "Never Ever Let You Live This Down", "Let Me Go", "We'll Find A Way", "Coldest Story Ever Told", "No More Drugs For Me", "Hi Dad", "One Life, One Night", "My Mom's Boy", "Swerve", "Gossip", "Austin Powers"};
	int rnd = new Random().nextInt(realSongs.length);
	int rnd2 = new Random().nextInt(fakeSongs.length);
	int rnd3= (int) ( Math.random() * 2 + 1);

	Font f;

	public KanyeTest()
	{
	}
	public void pickSongs()
	{
		rnd = new Random().nextInt(realSongs.length);
		rnd2 = new Random().nextInt(fakeSongs.length);
		rnd3= (int) ( Math.random() * 2 + 1);
	}
	public void paintSongs(Graphics g)
	{
		g.clearRect(0, 0, 1280, 720);
		g.setColor(Color.BLACK);
		g.drawRect(50, 500, 500, 100);
		g.drawRect(700, 500, 500, 100);
		Font f = g.getFont().deriveFont(30f);
		g.setFont(f);
		if(rnd3==1)
		{
			g.drawString(realSongs[rnd], 60, 560);
			g.drawString(fakeSongs[rnd2], 710, 560);
		}
		else if(rnd3==2)
		{
			g.drawString(fakeSongs[rnd2], 60, 560);
			g.drawString(realSongs[rnd], 710, 560);

		}

	}
	public boolean isCorrect(int x, int y)
	{
		if(y>=500&&y<=600)
		{
			if(rnd3==1&&x>=700&&x<=1200)
			{
				return true;
			}
			if(rnd3==2&&x>=50&&x<=550)
			{
				return true;
			}
		}
		return false;
	}



}
