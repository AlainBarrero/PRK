package ehu;

public class Sukaldaria extends Thread{
	Irla irla;
	
	Sukaldaria(Irla irla){
		this.irla = irla;
	}
	
	/*
		SUKALDARIA = (begiratu[hon:0..HK][hoz:0..ZK][lap:0..LK] -> 	
					if(hoz>0 && lap<LK)then 		if(hoz<LK-lap)then 	(erabaki[b:1..hoz] 		->bota[b]  ->askatu ->SUKALDARIA)
													else				(erabaki[b:1..LK-lap]	->bota[b]  ->askatu ->SUKALDARIA)
															
					else 	if(hon>0 && hoz+HS<ZK)then	(hozkailura	->askatu ->SUKALDARIA)
							else						(askatu 			 ->SUKALDARIA)							
		).
	*/
	
	public void run() {
		while (true) {
			try {	
				int[] begiratu = irla.begiratu();
				int hon = begiratu[0];
				int hoz = begiratu[1];
				int lap = begiratu[2];
				sleep((long) (Math.random() * 1000));
				if(hoz>0 && lap<FestaEroaApp.Lapikoa){
					if(hoz<FestaEroaApp.Lapikoa-lap){
						int bota = (int)(Math.random()*hoz + 1);
						irla.bota(bota);
						sleep((long) (Math.random() * 1000));
						irla.askatu();
						sleep((long) (Math.random() * 1000));
					}else{
						int bota = (int)(Math.random()*(FestaEroaApp.Lapikoa-lap) + 1);
						irla.bota(bota);
						sleep((long) (Math.random() * 1000));
						irla.askatu();
						sleep((long) (Math.random() * 1000));
					}
				}else{
					if(hon>0 && hoz+FestaEroaApp.HozkiluPuska<FestaEroaApp.Hozkailua){
						irla.hozkailuan();
						sleep((long) (Math.random() * 1000));
						irla.askatu();
						sleep((long) (Math.random() * 1000));
					}else{
						irla.askatu();
						sleep((long) (Math.random() * 1000));
					}
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
