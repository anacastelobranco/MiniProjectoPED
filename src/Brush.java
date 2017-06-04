/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Simao Nogueira
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.geom.Ellipse2D;

public class Brush implements MouseMotionListener {

    BufferedImage image = Interface.jPanel7.getImage();
    JPanel panel = Interface.jPanel7;
    
    @Override
    public void mouseDragged(MouseEvent e) {
        if(Interface.primeiro == true){
            System.out.println("primeiro");
            Interface.mexeu1X = e.getX();
            System.out.println("e.getX()");
            Interface.mexeu1Y = e.getY();
            Interface.primeiro = false;
            Ellipse2D ellipse = new Ellipse2D.Double(Interface.mexeu1X, Interface.mexeu1Y, 10, 10);
            this.addEllipse(ellipse, Interface.corEdit, true, Interface.corEdit, image, panel);
        }else{
            System.out.println("segundo");
            Interface.mexeu2X = e.getX();
            System.out.println("e.getX()");
            Interface.mexeu2Y = e.getY();
            Interface.primeiro = true;
            Ellipse2D ellipse = new Ellipse2D.Double(Interface.mexeu2X, Interface.mexeu2Y, 10, 10);
            this.addEllipse(ellipse, Interface.corEdit, true, Interface.corEdit, image, panel);
            System.out.println("fez1");
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
    
    public void addEllipse(Ellipse2D ellipse, Color color, boolean fill, Color color2, BufferedImage image, JPanel panel) {
        //  Draw the Ellipse onto the BufferedImage
        Graphics2D g2 = (Graphics2D)image.getGraphics();
        g2.setColor( color );
        g2.draw( ellipse );
        System.out.println("fez2");
        if(fill == true){
            g2.fill( ellipse );
        }

        panel.repaint();
    }
}