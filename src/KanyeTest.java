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
	public String[] fakeSongs={"All I Do Is Win", "Bitches and Bottles (Let's Get It Started)", "Can't Stop", "Do You Mind", "Don't Ever Play Yourself", "Fed Up", "Feel Like Pac / I Feel Like Biggie", "For Free", "Future", "Gold Slugs", "Hold You Down", "Holy Key", "How Many Times", "I Got The Keys", "I Wish You Would", "I'm On One", "I'm So Blessed", "I'm the One", "It Aint Over Til It's Over", "Jermaine's Interlude", "Legendary", "Money", "My Life", "Nas Album Done", "No New Friends", "Obama (Winning More Interlude)", "Out Here Grindin", "Shining", "Suffering From Success", "Take it to the Head", "They Don't Love You No More", "Welcome To My Hood", "You Mine", "4 Your Eyez Only", "A Tale of 2 Citiez", "Ain't That Some S--t (Interlude)", "Apparently", "Born Sinner", "Breakdown", "Can't Get Enough", "Chaining Day", "Change", "Cole World", "Crooked Smile", "Deja Vu", "Dollar and a Dream III", "False Prophets (Be Like This)", "Fire Squad", "Foldin Clothes", "For Whom the Bell Tolls", "Forbidden Fruit", "G.O.M.D.", "God's Gift", "High for Hours", "Immortal", "In The Morning", "Interlude", "January 28th", "LAnd of the Snakes", "Let Nas Down", "Lights Please", "Lost Ones", "Miss America", "Mo Money (Interlude)", "Mr. Nice Watch", "Neighbors", "Never Told", "New York Times", "Niggaz Know", "No Role Modelz", "Nobody's Perfect", "Note to Self", "Power Trip", "Rise and Shine", "She Knows", "She's Mine Pt. 1", "She's Mine Pt. 2", "Sideline Story", "Sparks Will Fly", "Trouble", "Ville Mentality", "Villuminati", "Wet Dreamz", "Who Dat", "Work Out"}; //all J Cole and DJ Khaled songs
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
