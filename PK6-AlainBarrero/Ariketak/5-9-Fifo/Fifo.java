package ehu;

public class Fifo {
	//s --> fifoan prozesu bat sartzeko apuntadorea
	int sartu = 0;
	//a --> fifoan dagoen prozesua ateratzeko apuntadorea 
	int atera = 0;
	//z --> fifoan dauden prozesu kopurua
	int zenbat = 0;

	//Fifo
	int[] fifo = new int[FifoApp.FifoKop];
	
	//when(z<FK) sartu.return[s] -> FIFO[(s+1)%FK][a][z+1]
	public synchronized int sartu(int id) throws InterruptedException{
		while(!(zenbat<FifoApp.FifoKop)) wait();
		zenbat = zenbat + 1;
		int sartuItzuli = sartu;
		sartu = (sartu + 1) % FifoApp.FifoKop;
		//Margotu pantailan "sartu"
		fifo[sartuItzuli] = id+1;
		Pantaila.margotuSartu(id, sartu, atera, zenbat, fifo);
		notifyAll();
		return sartuItzuli;
	}
	
	//when(z>0) atera[a] -> FIFO[s][(a+1)%FK][z-1]
	public synchronized void atera(int id, int pos) throws InterruptedException{
		while (!((zenbat > 0) && (atera==pos))) wait();
		zenbat = zenbat - 1;
		fifo[atera] = 0;
		atera = (atera + 1) % FifoApp.FifoKop;
		//Margotu pantailan "atera"
		Pantaila.margotuAtera(id, sartu, atera, zenbat, fifo);
		notifyAll();
	}
}
