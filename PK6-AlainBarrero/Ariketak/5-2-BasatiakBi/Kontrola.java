package ehu;

public class Kontrola {
	private int puskaKopurua;

	Kontrola()
	{puskaKopurua=0;}
	
	
	//when(p >  0) 	b[BR].hartu	->LAPIKOA[p-1]
	public synchronized void hartu(int id, String str)throws InterruptedException{
		while (!(puskaKopurua>0)) wait();
		puskaKopurua--;
		Pantaila.margotuBasatia(id,str, puskaKopurua);
		notifyAll();
	}
	
	//when(p <= PK-BPK)  s.bota	->LAPIKOA[p+BPK]
	public synchronized void bota() throws InterruptedException{
		while(!(puskaKopurua<=BasatiApp.Puskak-BasatiApp.LapikoPuskak)) wait();
		puskaKopurua = puskaKopurua + BasatiApp.LapikoPuskak;
		Pantaila.margotuSukaldaria(puskaKopurua);
		notifyAll();
	}
}
