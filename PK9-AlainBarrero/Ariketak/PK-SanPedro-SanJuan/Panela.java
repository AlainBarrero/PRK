package ehu;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panela extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private Timer timer;
	private Image imageF;
	private Image imageBP, imageBJ;
	
	private Image sp1, sp2, sp3, sp4, sp5;
	private Image sj1, sj2, sj3, sj4, sj5;
	
	private int xp1=-60,xp2=-60,xp3=-60,xp4=-60,xp5=-60;
	private int yp1=320,yp2=320,yp3=320,yp4=320,yp5=320;
	
	private int xj6=800,xj7=800,xj8=800,xj9=800,xj10=800;
	private int yj6=280,yj7=280,yj8=280,yj9=280,yj10=280;
	
	private int bx1=10, by1=340;
	private int bx2=10 , by2=340;
	private boolean SanPedroSanJuan = true;
	
	
	public Panela(){
		//Fondoa irudikatu
		ImageIcon iif = new ImageIcon(this.getClass().getResource("fondo.png"));
        imageF = iif.getImage();
        
        //San Pedroko pertsonak
        ImageIcon ii1 = new ImageIcon(this.getClass().getResource("ezkPertsona.png"));
        sp1  = ii1.getImage();
        ImageIcon ii2 = new ImageIcon(this.getClass().getResource("ezkPertsona.png"));
        sp2  = ii2.getImage();
        ImageIcon ii3 = new ImageIcon(this.getClass().getResource("ezkPertsona.png"));
        sp3  = ii3.getImage();
        ImageIcon ii4 = new ImageIcon(this.getClass().getResource("ezkPertsona.png"));
        sp4  = ii4.getImage();
        ImageIcon ii5 = new ImageIcon(this.getClass().getResource("ezkPertsona.png"));
        sp5  = ii5.getImage();
        
        //San Juaneko pertsonak
        ImageIcon ii6 = new ImageIcon(this.getClass().getResource("eskPertsona.png"));
        sj1  = ii6.getImage();
        ImageIcon ii7 = new ImageIcon(this.getClass().getResource("eskPertsona.png"));
        sj2  = ii7.getImage();
        ImageIcon ii8 = new ImageIcon(this.getClass().getResource("eskPertsona.png"));
        sj3  = ii8.getImage();
        ImageIcon ii9 = new ImageIcon(this.getClass().getResource("eskPertsona.png"));
        sj4  = ii9.getImage();
        ImageIcon ii10 = new ImageIcon(this.getClass().getResource("eskPertsona.png"));
        sj5  = ii10.getImage();
        
        //Barkua margotu
        ImageIcon iib1 = new ImageIcon(this.getClass().getResource("barkuaSP.png"));
        imageBP  = iib1.getImage();
        ImageIcon iib2 = new ImageIcon(this.getClass().getResource("barkuaSJ.png"));
        imageBJ  = iib2.getImage();
        
        //Denbora tartea berriro pintatzeko
        timer = new Timer(15, this); 
        timer.start();
	}
	
	public void paint(Graphics g){
        super.paint(g);
       
        //Fondoa margotu
        g.drawImage(imageF, 0, 0, getWidth(), getHeight(), this);
        
        //San Pedroko pertsonak margotu
        g.drawImage(sp1, xp1, yp1, 250, 150, this);
        g.drawImage(sp2, xp2, yp2, 250, 150, this);
        g.drawImage(sp3, xp3, yp3, 250, 150, this);
        g.drawImage(sp4, xp4, yp4, 250, 150, this);
        g.drawImage(sp5, xp5, yp5, 250, 150, this);
        
        //Eskubiko pertsonak margotu
        g.drawImage(sj1, xj6, yj6, 250, 150, this);
        g.drawImage(sj2, xj7, yj7, 250, 150, this);
        g.drawImage(sj3, xj8, yj8, 250, 150, this);
        g.drawImage(sj4, xj9, yj9, 250, 150, this);
        g.drawImage(sj5,xj10,yj10,250, 150, this);

        //Barkua margotu
        if(SanPedroSanJuan){
        	g.drawImage(imageBP, bx1, by1, 150, 100, this);
        }else{
        	g.drawImage(imageBJ, bx2, by2, 150, 100, this);
        }
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint(); // panela bir-margotu
		
	}
	
	public void iritsiSanPedro(int sanPedro){
		switch(sanPedro){
		case 1:
			for (int x=-60;x<80;x++){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				xp1 = x;
			}
			break;
		case 2:
			for (int x=-60;x<80;x++){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				xp2 = x-20;
			}
			break;
		case 3:
			for (int x=-60;x<80;x++){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				xp3 = x-40;
			}
			break;
		case 4:
			for (int x=-60;x<80;x++){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				xp4 = x-60;
			}
			break;
		case 5:
			for (int x=-60;x<80;x++){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				xp5 = x-80;
			}
			break;
		}
	}
	
	public void iritsiSanJuan(int sanJuan){
		switch(sanJuan){
		case 1:
			for (int x=800;x>680;x--){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				xj6 = x;
			}
			break;
		case 2:
			for (int x=800;x>680;x--){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				xj7 = x-20;
			}
			break;
		case 3:
			for (int x=800;x>680;x--){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				xj8 = x-40;
			}
			break;
		case 4:
			for (int x=800;x>680;x--){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				xj9 = x-60;
			}
			break;
		case 5:
			for (int x=800;x>680;x--){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				xj10 = x-80;
			}
			break;
		}
	}
	
	public void igoSanPedro(int txalupaKop){
		switch(txalupaKop){
		case 1:
			for (int j=0; j<7; j++){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				yp1 = yp1 + j;
			}
			break;
		case 2:
			for (int j=0; j<7; j++){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				yp2 = yp2 + j;
			}
			break;
		case 3:
			for (int j=0; j<7; j++){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				yp3 = yp3 + j;
			}
			break;
		case 4:
			for (int j=0; j<7; j++){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				yp4 = yp4 + j;
			}
			break;
		case 5:
			for (int j=0; j<7; j++){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				yp5 = yp5 +  j;
			}
			break;
		}
	}
	
	public void igoSanJuan(int txalupaKop){
		switch(txalupaKop){
		case 1:
			for (int j=0; j<10; j++){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				yj6 = yj6 + j;
			}
			break;
		case 2:
			for (int j=0; j<10; j++){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				yj7 = yj7 + j;
			}
			break;
		case 3:
			for (int j=0; j<10; j++){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				yj8 = yj8 + j;
			}
			break;
		case 4:
			for (int j=0; j<10; j++){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				yj9 = yj9 + j;
			}
			break;
		case 5:
			for (int j=0; j<10; j++){
				try {Thread.sleep((long) (Math.random() * 100));} catch (InterruptedException e) {e.printStackTrace();}
				yj10 = yj10 +  j;
			}
			break;
		}
	}
	
	public void jeitsiSanJuan(int txalupaKop){
		switch(txalupaKop){
		case 5:
			for (int x=700;x<850;x++){
				try {Thread.sleep((long) (Math.random() * 50));} catch (InterruptedException e) {e.printStackTrace();}
				xp1 = x;
			}
			break;
		case 6:
			for (int x=700;x<850;x++){
				try {Thread.sleep((long) (Math.random() * 50));} catch (InterruptedException e) {e.printStackTrace();}
				xp2 = x-20;
			}
			break;
		case 7:
			for (int x=700;x<850;x++){
				try {Thread.sleep((long) (Math.random() * 50));} catch (InterruptedException e) {e.printStackTrace();}
				xp3 = x-40;
			}
			break;
		case 8:
			for (int x=700;x<850;x++){
				try {Thread.sleep((long) (Math.random() * 50));} catch (InterruptedException e) {e.printStackTrace();}
				xp4 = x-60;
			}
			break;
		case 9:
			for (int x=700;x<850;x++){
				try {Thread.sleep((long) (Math.random() * 50));} catch (InterruptedException e) {e.printStackTrace();}
				xp5 = x-80;
			}
			break;
		}
	}
	
	public void jeitsiSanPedro(int txalupaKop){
		switch(txalupaKop){
		case 0:
			for (int x=100;x>-100;x--){
				try {Thread.sleep((long) (Math.random() * 300));} catch (InterruptedException e) {e.printStackTrace();}
				xj6 = x;
			}
			break;
		case 1:
			for (int x=100;x>-100;x--){
				try {Thread.sleep((long) (Math.random() * 300));} catch (InterruptedException e) {e.printStackTrace();}
				xj7 = x-20;
			}
			break;
		case 2:
			for (int x=100;x>-100;x--){
				try {Thread.sleep((long) (Math.random() * 300));} catch (InterruptedException e) {e.printStackTrace();}
				xj8 = x-40;
			}
			break;
		case 3:
			for (int x=100;x>-100;x--){
				try {Thread.sleep((long) (Math.random() * 300));} catch (InterruptedException e) {e.printStackTrace();}
				xj9 = x-60;
			}
			break;
		case 4:
			for (int x=100;x>-100;x--){
				try {Thread.sleep((long) (Math.random() * 300));} catch (InterruptedException e) {e.printStackTrace();}
				xj10 = x-80;
			}
			break;
		}
	}
	
	public void irtenTxalupaSanPedro(){
		SanPedroSanJuan = true;
		xp1=-60;xp2=-60;xp3=-60;xp4=-60;xp5=-60;
		yp1=320;yp2=320;yp3=320;yp4=320;yp5=320;
		for (int x=10;x<650;x++){
			try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
			bx1 = x;
			bx2 = x;
		}
	}
	
	public void irtenTxalupaSanJuan(){
		SanPedroSanJuan = false;
		xj6=800;xj7=800;xj8=800;xj9=800;xj10=800;
		yj6=280;yj7=280;yj8=280;yj9=280;yj10=280;
		for (int x=650;x>10;x--){
			try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
			bx1 = x;
			bx2 = x;
		}
	}

}
