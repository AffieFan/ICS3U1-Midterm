import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class Midterm{
	public static void main (String[] args){
		Console con = new Console ("Midterm Project", 1280, 720);
		
		//Scene 1 - Title
		
		scene11(con);
		scene1(con);
		
		
		//Scene 1-2 Transition
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);

		String strName;
		con.println("Type your full name to begin (capitalize the first letters)");
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
			
		con.println("X coordinate = 6 / 2(1+2)"); 
		con.println("Y coordinate = 0!");
			
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
		con.clear();
		if(strReportanswer.equals("yes")){
			con.println("You keep the existence of the Aliens a secret and exclude their presence from your report.");
			scene8(con);
			char chrSpace2;
			chrSpace2 = con.getChar();
			if(chrSpace2 == ' ' );{
				con.clear();
				scene9(con);
			}
			con.sleep(10000);
			con.setDrawColor(Color.BLACK);
			con.fillRect(0,0,1280,720);
			
			int intpasscodeguess;
			int intRand;
			intRand = (int)(Math.random()*20000+1);
			con.clear();
			con.println("The passcode is between 1 and 20000. What is your passcode guess?");
			intpasscodeguess = con.readInt();
			
			if(intpasscodeguess == intRand){
				scene11(con);
				double dblmonths;
				double dblmonthsdoubled;
				con.println("Congrats, the password is correct and you are able to get away from the aliens");
				con.println("How many days do you think you stayed on the planet?");
				dblmonths = con.readDouble();
				dblmonthsdoubled = dblmonths*500;
				con.println("You return to earth.");
				con.println("However, when you return to earth you realize the aliens manipulated time on the planet.");
				con.println("You actually spent 500 times the amount of months you thought you spent on the planet.");
				con.println("You spent "+dblmonthsdoubled +" months on the planet");
				if(dblmonthsdoubled <=50){
					scene13(con);
				}else if(dblmonthsdoubled<=100 && dblmonthsdoubled>50){
					scene14(con);
				}else{
					scene15(con);
				}
				
			} else{
				//scene 10
				String strInitials;
				con.println(strName);
			}
		
			
			
		}else if(strReportanswer.equals("no")){
			con.println("You report the Aliens to your boss.");
			con.clear();
			
			scene4part1(con);
			
			con.clear();
			con.setDrawColor(Color.BLACK);
			con.fillRect(0, 0, 1280, 720);
			int intcount1=1;
			while(intcount1 == 1){
				Font fntAmatic = con.loadFont("Beginfont.ttf", 160);
				con.setDrawFont(fntAmatic);
				con.setDrawColor(Color.RED);
				con.fillRoundRect(290, 130, 700, 300, 40, 40 ); // xy positions, xy length, xyroundness
				con.setDrawColor(Color.BLACK);
				con.drawString("The Test", 350, 200);
				con.println("The Aliens are angered. They give you one last chance to prove yourself.");
				con.println("They have put you in a lab and are now testing you.");
				con.println("With every question you answer, they wager your human value");
				con.println("press space to begin the test");
				con.repaint();
				con.sleep(10);
				char chrSpace1;
				chrSpace1 = con.getChar();
				if(chrSpace1 == ' ' );{
					intcount1 = intcount1+1;
				}
			
			}
			
			con.setDrawColor(Color.BLACK);
			con.fillRect(0, 0, 1280, 720);
			con.clear();
			
			
			//Scene 4 part 2
			
			int intvisiontest;
			int inthumanvalue = 0;
			//Q1 - Visiontest
			for(intcount1 = 0; intcount1 <10; intcount1++){
				BufferedImage imgHumanvisiontest = con.loadImage("humanvisiontest.png");
				con.drawImage(imgHumanvisiontest, 0, 0);
			}
			con.println("What number do you see?");
			intvisiontest = con.readInt();
	
			if(intvisiontest==276){
				inthumanvalue = inthumanvalue + 1;
				con.println(inthumanvalue);
			}else if(intvisiontest!=276){
				inthumanvalue = inthumanvalue - 1;
			}
			
			//Q2 - Moral Dilemma
			con.sleep(500);
			con.clear();
			con.setDrawColor(Color.BLACK);
			con.fillRect(0, 0, 1280, 720);
			for(intcount1 = 0; intcount1 <10; intcount1++){
				BufferedImage imgMoralDilemma = con.loadImage("moraldilemma.png");
				con.drawImage(imgMoralDilemma, 0, 0);
			}
			int intTrainquestion;
			con.println("There are two flying saucer traffic paths.");
			con.println("On the path that the flying saucer is flying toward, there is your boss fred");
			con.println("On the other path, that the flying saucer is not flying toward, there is 5 aliens");
			con.println("You can press the imaginary remote control and kill the five aliens or let fred die.");
			con.println("Think carefully, saving your friend would display loyalty, saving the aliens would display logic");
			con.println("Do you save the one being Fred or the five Aliens? Enter 1 or 5");
			intTrainquestion = con.readInt();
			
			if(intTrainquestion == 1){
				inthumanvalue = inthumanvalue-1;
				con.println(inthumanvalue);
			} else if(intTrainquestion == 5){
				inthumanvalue = inthumanvalue + 5;
			}
			
			//Q3 - Colour Question
			con.sleep(500);
			con.clear();
			
			
			for(intcount1 = 0; intcount1 <100; intcount1++){
				BufferedImage imgShadow = con.loadImage("shadowcolours.png");
				con.drawImage(imgShadow, 0, 0);
				con.repaint();
			}
			con.sleep(100);
			String strColourquestion;
			con.setDrawColor(Color.BLACK);
			con.fillRect(0, 0, 1280, 720);
			con.println("Are A and B the same colour?");
			strColourquestion = con.readLine();
			
			if(strColourquestion.equals("yes")){
				inthumanvalue = inthumanvalue + 2;
				con.println(inthumanvalue);
			} else if(!strColourquestion.equals("no")){
				inthumanvalue = inthumanvalue - 1;
				con.println(inthumanvalue);
			}
			con.sleep(500);
			con.clear();
			
			//Human value judge transition to scene 5,6, 7 end scenes
			if(inthumanvalue<5){
				scene5(con);
				con.repaint();
			}else if(inthumanvalue<=5 && inthumanvalue <=9){
				scene6(con);
				con.repaint();
			}else if(inthumanvalue == 10){
				scene7(con);
				con.repaint();
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
		
		int intcounts;
		for(intcounts = 1;intcounts<575;intcounts++){
			BufferedImage imgUntrustworthy = con.loadImage ("untrustworthy.png");
			con.drawImage(imgUntrustworthy, 0, 0);
			con.repaint();
			//alien jumpscare flashing
			if(intcounts>100 && intcounts<150){
				BufferedImage imgBetrayedAliens = con.loadImage("unhappyaliens.png");
				con.drawImage(imgBetrayedAliens, 0, 0);
				con.repaint();
			} else if(intcounts>150 && intcounts<200){
				BufferedImage imgBetrayedAliens = con.loadImage("unhappyaliens.png");
				con.drawImage(imgBetrayedAliens, 0, 0);
				BufferedImage imgAlienmessage = con.loadImage("alienmessagemad.png");
				con.drawImage(imgAlienmessage,60, 50);
				con.repaint();
			} else if(intcounts>200 && intcounts<350){
				BufferedImage imgAlienmessagetranslated = con.loadImage("translatedmessagemad1.png");
				con.drawImage(imgAlienmessagetranslated, 60, 50);
				con.repaint();
			} else if(intcounts>350 && intcounts<500){
				con.setDrawColor(Color.BLACK);
				con.fillRect(0, 0, 1280, 720);
				BufferedImage imgAlienmessagetranslated2 = con.loadImage("translatedmessagemad2.png");
				con.drawImage(imgAlienmessagetranslated2, 60, 50);
				con.repaint();
			}else if (intcounts>=500){
				con.setDrawColor(Color.RED);
				con.fillRect(0, 0, 1280, 720);
				BufferedImage imgAlienmessagefinal = con.loadImage("prepareyourself.png");
				con.drawImage(imgAlienmessagefinal, 60, 50);
				con.repaint();
			}
			
		}
		
		
	}
	
	//Scene5
	public static void scene5(Console con){
	BufferedImage imgDeadEarth = con.loadImage("deadearth.png");
	con.drawImage(imgDeadEarth, 0, 0);
	con.sleep(200);
	Font fntAmatic = con.loadFont("Beginfont.ttf", 80);
	con.setDrawFont(fntAmatic);
	con.setDrawColor(Color.WHITE);
	con.drawString("Your planet is harvested", 200, 150);	
	con.drawString("for its puppies and then", 320, 300);
	con.drawString("destroyed", 500, 450);
	con.repaint();
	
	}
	
	//Scene 6
	public static void scene6(Console con){
		BufferedImage imgcolour = con.loadImage("colour.png");
		con.drawImage(imgcolour, 0, 0);
		con.println("The aliens find you uninteresting, you return back to earth but you can no longer see colour.");
		con.repaint();
		con.sleep(1000);
		
		BufferedImage imgnocolour = con.loadImage("nocolour.png");
		con.drawImage(imgnocolour, 0, 0);
		con.repaint();
		
		Font fntbegin = con.loadFont("Beginfont.ttf", 100);
		con.setDrawFont(fntbegin);
		con.setDrawColor(Color.WHITE);
		con.drawString("Your planet is dead", 200, 200);
		con.drawString("You will probably die", 180, 300);
		con.sleep(200);
		con.repaint();
	}
	
	//Scene 7
	public static void scene7(Console con){
		con.println("You prove to be intelligent");
		con.println("As you've proved adequate worth of the human race, the aliens harvest your blood.");
		con.println("Your blood is used to create a brain enhancing drug for the aliens.");
		con.println("Through this drug, they are able to adopt all the knowledge of the human brain.");
		con.println("Large amounts of blood is drawn everyday from your body but just less than the amount that would kill you.");
				
		BufferedImage imgAlienhospital = con.loadImage("alienhospital.png");
		con.drawImage(imgAlienhospital, 0, 0);
		con.repaint();
		
		Font fntbegin = con.loadFont("Beginfont.ttf",180);
		con.setDrawColor(Color.RED);
		con.setDrawFont(fntbegin);
		con.drawString("You have Anemia", 0, 300);
		con.repaint();
		
	}	
	
	//Scene 8
	public static void scene8(Console con){
		BufferedImage imgcomplexcivilization = con.loadImage("aliencity.png");
		con.drawImage(imgcomplexcivilization, 0, 0);
		con.println("Aliens bring you around their civilization that proves to be quite complex.");
		con.println("Press space to continue");

	}
	
	//Scene 9
	public static void scene9(Console con){
		BufferedImage imgconfused = con.loadImage("confused.png");
		con.drawImage(imgconfused, 0, 0);
		con.println("Aliens begin to take over your mind");
		con.println("Before they fully take over, you find a passcode on the wall to an escape ship");
	}
	
	
	//Scene 11
	public static void scene11(Console con){
		int intescapery = 250;
		int intcountery;
		for(intcountery = 0; intcountery < 100; intcountery++){
			BufferedImage imgescapeship = con.loadImage("escapeship.png");
			con.drawImage(imgescapeship, 0,0);
			con.repaint();
			if(intcountery < 70){
				BufferedImage imgescaper = con.loadImage("escaper.png");
				con.drawImage(imgescaper, -275, intescapery);
				con.repaint();
				con.sleep(22);
				intescapery = intescapery - 3;
			}
		}	
		BufferedImage imglandscape = con.loadImage("landscape.png");
		con.drawImage (imglandscape, 0, 0);		
					
		int intescapeshipx=0;
		int intescapeshipy=20;
		int intcounters;
		
		for(intcounters=0; intcounters<500; intcounters++){
			BufferedImage imglandscape2 = con.loadImage("landscape.png");
			con.drawImage (imglandscape2, 0, 0);
			con.repaint();
			BufferedImage imgflyingescapeship = con.loadImage("flyingescapeship.png");
			con.drawImage(imgflyingescapeship, intescapeshipx, intescapeshipy);
			con.repaint();
			intescapeshipx = intescapeshipx + 5;
			intescapeshipy = intescapeshipy-5;
			con.sleep(22);
		}

			
	}
	
	//Scene 12
	public static void scene12(Console con){
		
	}
	
	//Scene 13
	public static void scene13(Console con){
		
	}
	
	//Scene 14
	public static void scene14(Console con){
		
	}
	
	//Scene 15
	public static void scene15(Console con){
		
	}
	
	
	
	
}
