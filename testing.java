import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class testing{
	public static void main (String[] args){
	Console con = new Console ("Midterm Project", 1280, 720);
			while(1==1){
					int intinitialx = 0;
					int intinitialy = 0;
					int intdeltax = 200;
					int intdeltay = 200;
					while(2==2){
						con.setDrawColor(Color.RED);
						con.drawString("AF", intinitialx, intinitialy);
						con.repaint();
						con.sleep(10);
						con.setDrawColor(Color.BLACK);
						con.fillRect(0,0, 1280, 720);
						intinitialx = intinitialx + intdeltax;
						intinitialy = intinitialy + intdeltay;
						if(intinitialx<=0){
							intdeltax = 5;
						}else if (intinitialx >1280){
							intdeltax = -5;
						}
						
						if(intinitialy<0){
							intdeltay = 5;
						}else if (intinitialy>720){
							intdeltay = -5;
						}
					}
				}
			
}
}
