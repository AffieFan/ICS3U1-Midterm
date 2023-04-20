import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class Midterm{
	public static void main (String[] args){
	Console con = new Console ("Midterm Project", 1280, 720);
	
	
	//Testing Place


	
	//Scene 1
	int intcount;
	int intplanetx = 600;
	int intplanety = 500;
	
	for (intcount = 1; intcount<50; intcount++){
		
		BufferedImage imgScene1stars = con.loadImage("stars.jpg");
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
		
	//Scene 1-2 Transition
	con.setDrawColor(Color.BLACK);
	con.fillRect(0, 0, 1280, 720);

	String strName;
	con.println("Type your name to begin");
	strName = con.readLine();
	con.println("Welcome "+strName);
		
	//Scene 2 
	con.sleep(1000);
	con.clear();
		
	//Scene 3
	double dblxcoordinate;
	double dblycoordinate;
	int intnumber=1;
		
	con.println("X coordinate = mathequation"); //finish math equation for these two lines
	con.println("Y coordinate = mathequation");
		
	while(intnumber==1){
		con.println("What is the X coordinate?");
		dblxcoordinate = con.readDouble();
		con.println("What is the Y coordinate?");
		dblycoordinate = con.readDouble();
		
		if(dblxcoordinate == 1 && dblycoordinate == 1){
			con.println("You have identified the location of the planet. Flying there now.");
			intnumber = intnumber+1;
		}else{
			con.println("No planet found in entered coordinates. Try again.");
		}
			
		}

		
	}
	
}
