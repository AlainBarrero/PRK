package ehu;

public class Sukaldaria extends Thread{
	Kontrola lapikoa;
	Sukaldaria(Kontrola l){
		lapikoa = l;
	}
	
	//SUKALDARIA = ( bota -> SUKALDARIA).
	public void run() {
		try { while(true) {
			lapikoa.bota();
		}
		} catch (InterruptedException e){}
	}
}
