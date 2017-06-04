
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
   baseado em http://www.wou.edu/~zchen06/Java/chapter11/imageviewer-final/SolarizeFilter.java
 */
public class Solarize extends Filter {
		
		@Override
		void applyFilter(BufferedImage image) {
				int w = image.getWidth();
				int h = image.getHeight();

				for(int x = 0; x < w; x++){
						for(int y = 0; y < h; y++){
								Color cor = new Color(image.getRGB(x, y));
								int r = cor.getRed();
								int g = cor.getGreen();
								int b = cor.getBlue();

								if(r <= 175) {
										r = 255 - r;
								}
								if(g <= 175) {
										g = 255 - g;
								}
								if(b <= 175) {
										b = 255 - b;
								}
								image.setRGB(x, y, new Color(r,g,b).getRGB());
						}
				}
		}
}
