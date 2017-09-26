package ehu;

public class Basatia extends Thread{
	Irla irla;
	private int id;
	
	Basatia(int id, Irla irla){
		this.irla = irla;
		this.id = id;
	}
	
	/*
		BASATIA = (begiratu[lap:0..LK] -> 	if(lap>0)then 	(erabaki[h:1..lap] ->hartu[h] ->askatu ->BASATIA)
											else			(askatu ->BASATIA)
		).
	*/
	
	public void run() {
		while (true) {
			try {	
				int lap = irla.begiratuLap(id);
				sleep((long) (Math.random() * 1000));
				if(lap>0){
					int hartu = (int)(Math.random()*irla.lap + 1);
					irla.hartu(id, hartu);
					sleep((long) (Math.random() * 1000));
					irla.askatu();
					sleep((long) (Math.random() * 1000));
				}else{
					irla.askatu();
					sleep((long) (Math.random() * 1000));
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
