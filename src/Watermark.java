
import java.awt.Color;
import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author AnaCB
 */
public class Watermark extends Filter {

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
								int alpha = 120;
								originalImage.setRGB(x, y, new Color(r,g,b,125).getRGB());
						}
				}
		}
		
}
