package ehu;

public class Sukaldaria extends Thread{
	Kontrola lapikoa;
	Sukaldaria(Kontrola l){
		lapikoa = l;
	}
	
	//SUKALDARIA = ( bota -> SUKALDARIA ).
	public void run() {
		try { while(true) {
			lapikoa.bota();
			sleep((long) (Math.random() * 3000));
		}
		} catch (InterruptedException e){}
	}
}
