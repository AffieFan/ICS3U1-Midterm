import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class Midterm{
	public static void main (String[] args){
	Console con = new Console ("Midterm Project", 1280, 720);
	
	//Scene 1
		int intcount;
		int intplanetx = 600;
		int intplanety = 500;
		
		for (intcount = 1; intcount<200; intcount++){
			
			
			BufferedImage imgScene1stars = con.loadImage("stars.png");
			con.drawImage(imgScene1stars, 0, 0);
			
			BufferedImage imgScene1title = con.loadImage("title.png");
			con.drawImage(imgScene1title, 20, 20);
			
			BufferedImage imgScene1planet = con.loadImage("planet.jpg");
			con.drawImage(imgScene1planet, intplanetx, intplanety);
			
			con.repaint();
			con.sleep(1);
	
			intplanetx = intplanetx + 1 ;
			intplanety = intplanety - 1;
			
	
		}
	
		
	}
}
