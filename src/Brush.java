
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Ana CB
 * */

public class Brush {
		//simao: px e py nao sei como fazer mas é com o e.get
		//inr r = jSlider2.getValue();
		//Color color = jColorChooser2.getColor();
		
		public void drawLine(Color color, int px, int py, int r) {
				//  Draw the Rectangle onto the BufferedImage
				Graphics2D g2 = (Graphics2D)image.getGraphics();
				g2.setColor(color);
				g2.drawOval(px, py, r, r));


				
				
        }
}
