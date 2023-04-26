import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class testing{
	public static void main (String[] args){
	Console con = new Console ("Midterm Project", 1280, 720);
			char chrSpace1;
			chrSpace1 = con.getChar();
		int intcounts;
		for(intcounts = 1;intcounts<1000;intcounts++){
			BufferedImage imgUntrustworthy = con.loadImage ("untrustworthy.png");
			con.drawImage(imgUntrustworthy, 0, 0);
			//alien jumpscare flashing
			if(intcounts>100&&intcounts<200){
				BufferedImage imgBetrayedAliens = con.loadImage("unhappyaliens.png");
				con.drawImage(imgBetrayedAliens, 0, 0);
				con.repaint();
			} else if(intcounts>200 && intcounts<500){
				BufferedImage imgAlienmessage = con.loadImage("alienmessagemad.png");
				con.drawImage(imgAlienmessage,0, 0);
				con.repaint();
			} else if(intcounts>500){
				BufferedImage imgAlienmessagetranslated = con.loadImage("translatedmessagemad1");
				con.drawImage(imgAlienmessagetranslated, 0, 0);
				con.sleep(1500);
				BufferedImage imgAlienmessagetranslated2 = con.loadImage("translatedmessagemad2");
				con.drawImage(imgAlienmessagetranslated2, 0, 0);
				con.sleep(1500);
				BufferedImage imgAlienmessagefinal = con.loadImage("prepareyourself.png");
				con.drawImage(imgAlienmessagefinal, 0, 0);
				con.repaint();
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
}
