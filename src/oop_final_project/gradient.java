
package oop_final_project;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class gradient extends JPanel {


    public void gradient() {
        setOpaque(false);
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 =(Graphics2D) grphcs;
        g2.setColor(getBackground());
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paintComponent(grphcs); 
    }
  
        
    
}