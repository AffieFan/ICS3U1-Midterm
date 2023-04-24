import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class Midterm{
	public static void main (String[] args){
		Console con = new Console ("Midterm Project", 1280, 720);
		
		//Scene 1 - Title
		scene1(con);
		
		//Scene 1-2 Transition
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);	

		String strName;
		con.println("Type your name to begin");
		strName = con.readLine();
		con.println("Welcome "+strName);
			
		//Scene 2 - Mission Statement
		scene2(con);
		
		//Scene 2-3 transition
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
			
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
		
		//Scene 3 part 1 - Flying to the Planet
		scene3part1(con);
		
		
		//scene 3 part 2 - Meeting the Aliens
		scene3part2(con);
		
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		
		String strReportanswer;
		con.println("Having arrived on the planet, you must send your boss and colleagues on earth a report on your status.");
		con.println("Do you keep the existence of the Aliens a secret? Answer \"yes\" or \"no\"");
		strReportanswer = con.readLine();
		if(strReportanswer.equals("yes")){
			con.println("You don't report the Aliens.");
		}else if(strReportanswer.equals("no")){
			con.println("You report the Aliens.");
		}
		
				
	}
	
	//Scene 1
	public static void scene1(Console con){
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
	}
	
	//scene2
	public static void scene2(Console con){
		con.sleep(1000);
		con.clear();
		int intcounting;
		for(intcounting = 1; intcounting<20; intcounting++){ // change back length of mission statement
			BufferedImage imgScene2mission = con.loadImage("mission.png");
			con.drawImage(imgScene2mission, 0, 0);
			con.repaint();
			if(intcounting > 65){
				con.setDrawColor(new Color(223, 230, 230));
				con.fillRoundRect(290, 130, 700, 350, 40, 40 ); // xy positions, xy length, xyroundness
				con.setDrawColor(Color.BLACK);
				con.drawString("Mission Statement", 540, 150);
			}
		}
	}
	
	//scene 3 part1
	public static void scene3part1(Console con){
		int intShipx = -500;
		int intShipy = 500;
		int intPlanetx2 = 600;
		int intPlanety2 = 20;
		int intcounter;
		for(intcounter = 1; intcounter<70; intcounter++){
			
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
	}
	
	//scene 3 part 2
	public static void scene3part2(Console con){
		int intcounted;
		int intlandingshipy = 0;
		for(intcounted = 1; intcounted<140; intcounted++){
			BufferedImage imgScene3background = con.loadImage("scene3background.png");
			con.drawImage(imgScene3background, 0, 0);
			BufferedImage imgScene3landingship = con.loadImage("landingship.png");
			con.drawImage(imgScene3landingship, 100, intlandingshipy);
			con.repaint();
			intlandingshipy = intlandingshipy +2;
		}
		for(intcounted = 1; intcounted<900; intcounted++){
			BufferedImage imgAlienver1 = con.loadImage("Alienver1.png");
			con.drawImage(imgAlienver1, 250, 160);
			con.repaint();
			
			if(intcounted > 65 && intcounted<200){
				BufferedImage imgAliengreeting = con.loadImage("Aliengreeting.png");
				con.drawImage(imgAliengreeting, -50, 180);
				}
				
			if(intcounted>250 && intcounted<550){
				BufferedImage imgGreetingtranslated = con.loadImage("greetingtranslated.png");
				con.drawImage(imgGreetingtranslated, -50, 180);
				
			}
			
			if(intcounted>550){
				BufferedImage imgCryforhelp = con.loadImage("cryforhelp.png");
				con.drawImage(imgCryforhelp, -50, 180);
			}
			
		}
		
	}
	
	//Scene 4
	public static void scene4(Console con){
		
		
		
	}
	
	
	
}
