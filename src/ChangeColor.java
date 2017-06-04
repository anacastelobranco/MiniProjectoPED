
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
public class ChangeColor extends Filter {
		String color;
		
		public ChangeColor(String choseColor){
				color = choseColor;
		}
		
		@Override
		void applyFilter(BufferedImage image) {
				int w = image.getWidth();
				int h = image.getHeight();
				
				for(int x = 0; x < w; x++){
						for(int y = 0; y < h; y++){
								int color = image.getRGB(x, y);
								if(this.color.equals("Blue")){
									// |: ou bit a bit =! do ||
									color = color | 0xFF;
								}
								else if(this.color.equals("Green")){
									color = color | 0xFF00;
								}
								else if(this.color.equals("Red")){
									color = color | 0xFF0000;
								}
								else {
									System.out.println("Nao existe tal cor");
								}
								image.setRGB(x, y, color);
						}
				}
		}
}
