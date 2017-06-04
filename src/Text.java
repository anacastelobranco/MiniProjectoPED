
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**@author Ana CB
 * https://stackoverflow.com/questions/18249592/how-to-change-font-size-in-drawstring-java
 */
public class Text {
		private String texto;
		private int size;
		private String font;
		private boolean is_bold;

		public Text(String texto, int size, String font, boolean is_bold) {
				this.texto = texto;
				this.size = size;
				this.font = font;
				this.is_bold = is_bold;
		}
		
		public void apply(BufferedImage img, int px, int py) {
				Graphics g = img.getGraphics();
				if(is_bold){
						g.setFont(new Font(font, Font.BOLD, size));
				}
				else {
						g.setFont(new Font(font, Font.PLAIN, size));
				}
				g.drawString(texto, px, py);
				g.dispose();
		}
		
		

}
