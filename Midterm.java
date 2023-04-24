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
		
		//Scene 3 Choice to Scene 4,5
		String strReportanswer;
		con.println("Having arrived on the planet, you must send your boss and colleagues on earth a report on your status.");
		con.println("Do you keep the existence of the Aliens a secret? Answer \"yes\" or \"no\"");
		strReportanswer = con.readLine();
		
		if(strReportanswer.equals("yes")){
			con.println("You keep the existence of the Aliens a secret and exclude their presence from your report.");
			scene8(con);
			scene9(con);
			int intpasscodeguess;
			int intRand;
			intRand = (int)(Math.random()*20000+1);

			con.println("The passcode is between 1 and 20000. What is your passcode guess?");
			intpasscodeguess = con.readInt();
			
			if(intpasscodeguess == intRand){
				
			} else{
				scene10(con);
			}
		
			
			
		}else if(strReportanswer.equals("no")){
			con.println("You report the Aliens to your boss.");
			con.clear();
			
			scene4part1(con);
			
			int intvisiontest;
			int inthumanvalue = 0;
			//Q1 - Visiontest
			BufferedImage imgHumanvisiontest = con.loadImage("humanvisiontest.png");
			con.drawImage(imgHumanvisiontest, 50, 50);
			con.println("What number do you see?");
			intvisiontest = con.readInt();
	
			if(intvisiontest==60){
				inthumanvalue = inthumanvalue + 2;
				con.println(inthumanvalue);
			}else if(intvisiontest!=60){
				inthumanvalue = inthumanvalue - 1;
				con.println(inthumanvalue);
			}
			
			//Q2 - Moral Dilemma
			con.sleep(22);
			con.clear();
			
			int intTrainquestion;
			con.println("Train Question");
			intTrainquestion = con.readInt();
			
			if(intTrainquestion == 1){
				inthumanvalue = inthumanvalue-1;
				con.println(inthumanvalue);
			} else if(intTrainquestion == 5){
				inthumanvalue = inthumanvalue + 5;
				con.println(inthumanvalue);
			}
			
			//Q3 - Colour Question
			con.sleep(22);
			con.clear();
			
			String strColourquestion;
			
			con.println("Are A and B the same colour?");
			strColourquestion = con.readLine();
			
			if(strColourquestion.equals("yes")){
				inthumanvalue = inthumanvalue + 3;
				con.println(inthumanvalue);
			} else if(!strColourquestion.equals("yes")){
				inthumanvalue = inthumanvalue - 1;
				con.println(inthumanvalue);
			}
			
			//Human value judge transition to scene 5,6, 7 end scenes
			if(inthumanvalue<5){
				scene5(con);
			}else if(inthumanvalue<=5 && inthumanvalue <=9){
				scene6(con);
			}else if(inthumanvalue == 100){
				scene7(con);
			}
			
		
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
	
	//Scene 4 - animations
	public static void scene4part1(Console con){
		con.println("The aliens find you untrustworthy and reveal that they are supergenius'");
		con.println("They put you in the lab to test you for your beneficial qualities");
	}
	
	//Scene5
	public static void scene5(Console con){
	con.println("Your planet is harvested for its resources and puppies");
	}
	
	//Scene 6
	public static void scene6(Console con){
	con.println("The aliens find you uninteresting, you return back to earth but you lose 2 of your senses");
	}
	
	//Scene 7
	public static void scene7(Console con){
	con.println("You prove to be intelligent");
	}	
	
	//Scene 8
	public static void scene8(Console con){
		con.println("Aliens bring you around their civilization that proves to be quite complex.");
	}
	
	//Scene 9
	public static void scene9(Console con){
		con.println("Aliens begin to take over your mind. Before they fully take over, you find a passcode on the wall to an escape ship");
		con.println("They have supplied you with the time but you have one guess.");
	}
	
	//Scene 10
	public static void scene10(Console con){
		
	}
	
	
	
	
}
