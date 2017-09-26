package ehu;

public class Ikaslea extends Thread{
	Bulegoa bulegoa;
	private int id;
	
	Ikaslea(int id, Bulegoa b){
		this.bulegoa = b;
		this.id = id;
	}
	
	//IKASLEA = (sartu ->galdetu ->erantzunaJaso -> atera ->IKASLEA).
	public void run() {
		while (true) {
			try {		
				bulegoa.sartu(id);
				sleep((long) (Math.random() * 3000));
				bulegoa.galdetu(id);
				sleep((long) (Math.random() * 3000));
				bulegoa.erantzunaJaso(id);
				sleep((long) (Math.random() * 3000));
				bulegoa.atera(id);
				sleep((long) (Math.random() * 3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
