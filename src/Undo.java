
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Ana CB
  */

public class Undo {
		//Maximum number or undos allowed. More images, more memory, less speed.
		private int nPicAllowed  = 10;
		private ArrayList<BufferedImage> pics;
		private int cur_position;
		
		public Undo() {
				this.pics = new ArrayList<BufferedImage>();
				cur_position = -1;
				
		}
		
		//Add a picture
		public void addPic(BufferedImage img) {
				//deletes first images in the array when there are too much images
				for(int i=pics.size()-1; i > cur_position; i--){
						pics.remove(i);
				}
				cur_position++;
				pics.add(copyImage(img));
		}
		
		//Get last picture
		public BufferedImage getUndoPic() {
				if(cur_position > 0) {
						BufferedImage img = pics.get(cur_position-1);
						cur_position--;
						return img;
				}
				else {
						return null;
				}
		}
		
		//Redo
		public BufferedImage getRedoPic() {
				if(cur_position == pics.size()-1) {
						return null;
				}
				cur_position++;
				return pics.get(cur_position);
		}
		
		
		
		//Taken from StackOverflow https://stackoverflow.com/questions/3514158/how-do-you-clone-a-bufferedimage
		private BufferedImage copyImage(BufferedImage source){
				BufferedImage b = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
				Graphics2D g = b.createGraphics();
				g.drawImage(source, 0, 0, null);
				g.dispose();
				return b;
		}
}
