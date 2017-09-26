package ehu;

public class Prozesua extends Thread{
	
	Fifo fifo;
	private int id;
	
	Prozesua(int id, Fifo fifo){
		this.fifo = fifo;
		this.id = id;
	}
	
	//PROZESUA = (sartu.return[i:FR] -> atera[i] -> PROZESUA).
	public void run() {
		try {
			while(true) {
				int pos = fifo.sartu(id);
				sleep((long) (Math.random() * 3000));
				fifo.atera(id, pos);
				sleep((long) (Math.random() * 3000));
			}
		} catch (InterruptedException e){}
	}
	
}
