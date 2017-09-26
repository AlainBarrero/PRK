package ehu;

public class Prozesua extends Thread{
	Lifo kontrola;
	private int id;
	
	Prozesua(int id, Lifo lifo){
		this.kontrola = lifo;
		this.id = id;
	}
	
	//PROZESUA = (sartu.return[i:FR] -> atera[i] -> PROZESUA).
	public void run() {
		try {
			while(true) {
				int pos = kontrola.sartu(id);
				sleep((long) (Math.random() * 3000));
				kontrola.atera(id, pos);
				sleep((long) (Math.random() * 3000));
			}
		} catch (InterruptedException e){}
	}
}
