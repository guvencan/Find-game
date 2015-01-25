/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author siyah-pc
 */
public class Box extends JButton{

    public Box() {
        
        Random rnd = new  Random();

        setSize(100,100);
        setIcon(new ImageIcon(("pic\\soru.jpg")));
        setVisible(true);
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
         //ImageIcon image = new ImageIcon(this.getClass().getResource("beer15.svg"));
        
        //setBackground(new Color(rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255)));
        
        //enable(false);
        
		
        
        
    }
    
    
    
    
}
