package ehu;

public class Lifo {
	//s --> lifoan sartu eta ateratzeko apuntadorea
	int sartu = 0;
	
	int[] lifo = new int[LifoApp.LifoKop];
	
	//when(s<FK) sartu.return[s] -> FIFO[s+1]
	public synchronized int sartu(int id) throws InterruptedException{
		while(!(sartu<LifoApp.LifoKop)) wait();
		lifo[sartu]  = id+1;
		sartu = sartu + 1;
		//Margotu pantailan "sartu"
		Pantaila.margotuSartu(id, sartu, lifo);
		notifyAll();
		return sartu;
	}
	
	//when(s>0)	atera[s-1] -> FIFO[s-1]
	public synchronized void atera(int id, int pos) throws InterruptedException{
		while(!((sartu>0)&&(sartu==pos))) wait();
		sartu = sartu - 1;
		lifo[sartu] = 0;
		//Margotu pantailan "atera"
		Pantaila.margotuAtera(id, sartu, lifo);
		notifyAll();
	}
}
