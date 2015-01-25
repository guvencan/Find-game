/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author siyah-pc
 */
public class Board extends JFrame {
    
    public int count=0;
    public int finish=8;
    

    public Board() {
        
        Timer tm = new Timer();
        
        
        
        ArrayList<Box> list = new ArrayList<Box>(16);        
        String dizi [] ={"1","2","3","4","5","6","7","8","1","2","3","4","5","6","7","8"};

        Shuffle sf = new Shuffle();
        sf.shuffleArray(dizi);
  
        

                for(int i=0 ; i<16 ; i++)
		{
                    
		Box box = new Box();
                box.setText(dizi[i]);
                add(box); 
                
                
                box.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        
                        
                        count++;     
                        
                       box.setEnabled(false);
                       box.setIcon(new ImageIcon(("pic\\"+box.getText()+".jpg")));
                       box.setDisabledIcon(new ImageIcon(("pic\\"+box.getText()+".jpg")));
                        System.err.println("içerde");
                        list.add(box);
                        
                        if(count == 2)
                        {
                            
                            if(list.get(0).getText() == list.get(1).getText())
                            {                                
                                list.get(0).setVisible(false);
                                list.get(1).setVisible(false);
                                
                                finish--;
                                if(finish == 0)
                                    JOptionPane.showMessageDialog(rootPane, "  Helal Koçuma");
                            }
                            
                            try{
                            Thread.sleep(1000);
                            }catch(InterruptedException e){}
                        
                            
                            list.get(0).setIcon(new ImageIcon(("pic\\soru.jpg")));
                            list.get(1).setIcon(new ImageIcon(("pic\\soru.jpg"))); 
                            list.get(0).setEnabled(true);  
                            list.get(1).setEnabled(true);  
                                   
                            count=0;  
                            list.clear();
                        }
                        
                        
                        
                    }
                });
                
                
                         
                    
		}
       
   
        
        

        
    
        
    
        
        
        
        repaint();
        setLayout(new GridLayout(4,4));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setTitle("KARPAT");
        setResizable(true);
        setVisible(true);
    }
    
    
    
}

//    long seed = System.nanoTime();
//    Collections.shuffle(list, new Random(seed));