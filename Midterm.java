import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class Midterm{
	public static void main (String[] args){
		Console con = new Console ("Midterm Project", 1280, 720);
		
		//Scene 1 - Title
		int intcount;
		int intplanetx = 600;
		int intplanety = 500;
		
		for (intcount = 1; intcount<10; intcount++){ // change back to 100
			
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
		
		for(intcount = 1; intcount<20; intcount++){ // change back length of mission statement
			BufferedImage imgScene2mission = con.loadImage("mission.png");
			con.drawImage(imgScene2mission, 0, 0);
			con.repaint();
			if(intcount > 65){
				con.setDrawColor(new Color(223, 230, 230));
				con.fillRoundRect(290, 130, 700, 350, 40, 40 ); // xy positions, xy length, xyroundness
				con.setDrawColor(Color.BLACK);
				con.drawString("Mission Statement", 540, 150);
			}
		}

		//Scene 2
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
			
		//Scene 3
		
		//Coordinates
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
		con.sleep(1000);
		con.clear();
		
		//animations
		int intShipx = -500;
		int intShipy = 500;
		int intPlanetx2 = 600;
		int intPlanety2 = 20;
		
		for(intcount = 1; intcount<70; intcount++){
			
			BufferedImage imgScene3stars = con.loadImage("stars.jpg");
			con.drawImage(imgScene3stars, 0, 0);	
			
			BufferedImage imgScene3planet = con.loadImage("planet.jpg");
			con.drawImage(imgScene3planet, intPlanetx2, intPlanety2)
			;
			BufferedImage imgScene3ship = con.loadImage("ship.png");
			con.drawImage(imgScene3ship, intShipx, intShipy);
			
			intShipx = intShipx + 10;
			intShipy = intShipy - 3;
			intPlanetx2 = intPlanetx2 -3 ;
			intPlanety2 = intPlanety2 - 1 ;
			
			con.repaint();
			con.sleep(1);
		}
		
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);	
		
		for(intcount = 1; intcount<70; intcount++){
			BufferedImage imgScene3landingship = con.loadImage("landingship.png");
			con.drawImage(imgScene3landingship, 500, 500);
		}
		
		
	}
	
}
