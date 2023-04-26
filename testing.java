import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class testing{
	public static void main (String[] args){
	Console con = new Console ("Midterm Project", 1280, 720);
int intpasscodeguess;
			int intRand;
			intRand = (int)(Math.random()*5+1);
			con.clear();
			con.println("The passcode is between 1 and 5. What is your passcode guess?");
			intpasscodeguess = con.readInt();
			
			if(intpasscodeguess == intRand){
				double dblmonths;
				double dblmonthsdoubled;
				con.println("Congrats, the password is correct and you are able to get away from the aliens");
				con.sleep(500);
				
				//Scene 12
				con.clear();
				BufferedImage imgWormhole = con.loadImage("wormhole.png");
				con.drawImage(imgWormhole, 0,0);
				con.println("Upon exit, the aliens reveal their final trick.");
				con.println("As the torturous beings they are, they have toyed with the time you spent on their planet");
				con.println("How many months do you think you stayed on the planet? (Does not have to be an integer)");
				dblmonths = con.readDouble();
				dblmonthsdoubled = dblmonths*500;
				con.println("You return to earth.");
				con.println("However, when you return to earth you realize the aliens manipulated time on the planet.");
				con.println("You actually stayed 500 times the amount of months you thought you spent on the planet.");
				con.println("You spent "+dblmonthsdoubled +" months on the planet");
				con.sleep(10000);
			}
			
}
}
