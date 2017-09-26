package ehu;

public class Kontrola {
	private int puskaKopurua;

	Kontrola()
	{puskaKopurua=0;}
	
	//when(p >  0) 	b[BR].hartu	-> LAPIKOA[p-1]
	public synchronized void hartu(int id, String str)throws InterruptedException{
		while (!(puskaKopurua>0)) wait();
		puskaKopurua--;
		Pantaila.margotuBasatia(id,str, puskaKopurua);
		notifyAll();//Lokartuta zeuden guztiak esnatzen ditu
	}
	
	//when(p == 0)  s.bota -> LAPIKOA[p+PK]
	public synchronized void bota() throws InterruptedException{
		while(!(puskaKopurua==0)) wait();
		puskaKopurua = puskaKopurua + BasatiApp.Puskak;
		Pantaila.margotuSukaldaria();
		notifyAll();//Lokartuta zeuden guztiak esnatzen ditu
	}
}
