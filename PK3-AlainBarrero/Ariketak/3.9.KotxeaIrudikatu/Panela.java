package ehu;

import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
// Timer Imports
import java.awt.Toolkit;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 

public class Panela extends JPanel implements ActionListener {
    private Image image1,image2, image3, image4;
    private Timer timer;
    private int x1, x2, y1=155, y2=160;

	public void setX(int kotxea, int balioa){
		if (kotxea==1)	{x1=balioa;}
		else			{x2=balioa;}
	}
	
    public Panela(){
    	ImageIcon ii = new ImageIcon(this.getClass().getResource("kotxeBat.gif"));
        image1 = ii.getImage();
    	ImageIcon ii2 = new ImageIcon(this.getClass().getResource("moto.gif"));
        image2 = ii2.getImage();
        this.setBackground(Color.white);
       
        //Atzealdeko irudia
        ImageIcon ii3 = new ImageIcon(this.getClass().getResource("des.jpg"));
        image3 = ii3.getImage();
        
        ImageIcon ii4 = new ImageIcon(this.getClass().getResource("meta.gif"));
        image4 = ii4.getImage();
         
        timer = new Timer(15, this); // 15ms-ro actionPerformed metodoari deitzen dio
        timer.start();
    }

    public void paint(Graphics g){
        super.paint(g);
        
        //Atzealdeko irudia
        g.drawImage(image3, 0, 0, getWidth(), getHeight(), this);
        g.drawImage(image4, 570 , 150, this);
        
        g.drawImage(image1, x1 , y1, this);
        g.drawImage(image2, x2 , y2, this);
    }

    public void actionPerformed(ActionEvent e){ 
        repaint(); // panela bir-margotu (re-paint)
    }
}