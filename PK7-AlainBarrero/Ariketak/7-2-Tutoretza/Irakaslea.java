package ehu;

public class Irakaslea extends Thread{
	Bulegoa bulegoa;
	
	Irakaslea(Bulegoa b){
		this.bulegoa = b;
	}
	
	//IRAKASLEA = (galderaEntzun ->pentsatu ->erantzun ->IRAKASLEA).
	public void run() {
		while (true) {
			try {
				bulegoa.galderaEntzun();
				sleep((long) (Math.random() * 3000));
				bulegoa.erantzun();
				sleep((long) (Math.random() * 3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
