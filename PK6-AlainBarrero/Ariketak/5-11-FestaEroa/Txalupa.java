package ehu;

public class Txalupa extends Thread{
	Irla irla;
	
	Txalupa(Irla irla){
		this.irla = irla;
	}
	/*
		TXALUPA = (begiratu[hon:0..HK] -> 	if(hon<HK)then 	(erabaki[h:1..HK-hon] ->iritsi[h] ->askatu ->TXALUPA)
											else			(askatu ->TXALUPA)
		).
	 */
	public void run() {
		while (true) {
			try {	
				int hon = irla.begiratuHon();
				sleep((long) (Math.random() * 1000));
				if(hon<FestaEroaApp.Hondartza){
					int iritsi = (int)(Math.random()*(FestaEroaApp.Hondartza-hon) + 1);
					irla.iritsi(iritsi);
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
