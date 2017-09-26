package ehu;

public class Lifo {
	int sartu = 0;		//s --> lifoan sartu eta ateratzeko apuntadorea
	int kont = 0;		//k --> lifoan sartu diren prozesuen kontagailua
	int balio = 0;		//b --> lifoan dauden prozesu guztiak aterako direla bermatzen duen aldagaia
	
	int[] lifo = new int[LifoApp.LifoKop];
	
	//when(s<FK && b==0) sartu.return[s] -> if(k<10)then			FIFO[s+1][k+1][0]
	//										else					FIFO[s+1][0][1]
	public synchronized int sartu(int id) throws InterruptedException{
		while(!(sartu<LifoApp.LifoKop && balio==0)) wait();
		lifo[sartu]  = id+1;
		if(kont<15){
			kont = kont+1;
			sartu = sartu + 1;
			balio = 0;
		}else{
			sartu = sartu + 1;
			kont = 0;
			balio = 1;
		}
		Pantaila.margotuSartu(id, sartu, kont, lifo);
		notifyAll();
		return sartu;
	}
	
	//when(s>0)	atera[s-1] -> 	if(b==1 && s!=1)then	FIFO[s-1][0][1]
	//							else					FIFO[s-1][k][0]
	public synchronized void atera(int id, int pos) throws InterruptedException{
		while(!((sartu>0)&&(sartu==pos))) wait();
		lifo[sartu-1] = 0;
		if(balio==1 && sartu != 1){
			sartu = sartu - 1;
			kont = 0;
			balio = 1;
		}else{
			sartu = sartu - 1;
			balio = 0;
		}
		Pantaila.margotuAtera(id, sartu, kont, lifo);
		notifyAll();
	}
}
