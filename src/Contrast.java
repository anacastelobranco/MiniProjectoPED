
import java.awt.Color;
import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Ana CB
 */
public class Contrast extends Filter {
		
		public int value;

		public Contrast(int value) {
				this.value = value;
		}

		@Override
		void applyFilter(BufferedImage originalImage) {
				int w = originalImage.getWidth();
				int h = originalImage.getHeight();
				
				for(int x = 0; x < w; x++){
						for(int y = 0; y < h; y++){
								Color cor = new Color(originalImage.getRGB(x, y));
								int r = cor.getRed();
								int g = cor.getGreen();
								int b = cor.getBlue();
								
								//low constrast: values between 85 and 170 stay the same:
								//if below 85 >multiply by 1.25; if above 170 > multiply by 0.75
								if(value == 1){
										if(r < 85) {
												r = (int)(r*1.25);
										}
										if(g < 85) {
												g = (int)(g*1.25);
										}
										if(b < 85) {
												b = (int)(1*1.25);
										}
										if(r > 170) {
												r = (int)(r*0.75);
										}
										if(g > 170) {
												g = (int)(g*0.75);
										}
										if( b> 170) {
												b = (int)(b*0.75);
										}
								}
								//middle contraste remains the same
								
								//high contraste
								//if below 125 >multiply by 0.75; if above 125 > multiply by 1.25
								else if(value == 2){
										if(r < 125) {
												r = (int)(r*0.75);
										}
										if(g < 125) {
												g = (int)(g*0.75);
										}
										if(b < 125) {
												b = (int)(b*0.75);
										}
										if(r > 125) {
												r = (int)(r*1.25);
										}
										if(g > 125) {
												g = (int)(g*1.25);
										}
										if( b> 125) {
												b = (int)(b*1.25);
										}
								}
								
								//when values exceed the RGB rage convert them to the maximum/minimum value possible
								if( r>255) {
										r= 255;
								}
								if (g>255){
										g = 255;
								}
										
								if (b>255){
										b=255;
								}
								
								if( r<0) {
										r= 0;
								}
								if (g<0){
										g = 0;
								}
										
								if (b<0){
										b=0;
								}
						
								originalImage.setRGB(x, y, new Color(r,g,b).getRGB());
						}
				}
		}
}
