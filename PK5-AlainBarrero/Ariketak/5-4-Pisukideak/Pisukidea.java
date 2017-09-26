package ehu;

public class Pisukidea extends Thread{
	Kontrola botea;
	private int pisukidea;
	
	Pisukidea(int pisukidea, Kontrola botea){
		this.botea = botea;
		this.pisukidea = pisukidea;
	}
	
	/*
	PISUKIDEA = (erabakiSartuAtera[e:BOOL] -> if(e==0)then (begiratu[i:DR] -> 
												if(i>0) then 	(erabaki[d:1..i] 	-> atera[d] 	-> PISUKIDEA) 
												else  		 	(askatu 							-> PISUKIDEA))
											  else (begiratu[i:DR] -> 
												if(i<DK) then 	(erabaki[d:1..DK-i] -> sartu[d] 	-> PISUKIDEA) 
												else 			(askatu 							-> PISUKIDEA))
	).
	*/
	public void run() {
		while (true) {
			try {	
				int erabaki = (int)(Math.random() * 2);
				Pantaila.margotuErabaki(pisukidea, erabaki);
				if(erabaki == 0){
					int begiratu = botea.begiratu(pisukidea);
					if(begiratu>0){
						int ateraKop = (int)(Math.random()*begiratu + 1);;
						botea.atera(ateraKop, pisukidea);
						sleep((long) (Math.random() * 3000));
					}else{
						botea.askatu(pisukidea);
						sleep((long) (Math.random() * 3000));
					}
				}else{
					int begiratu = botea.begiratu(pisukidea);
					if(begiratu<PisukideApp.Botea){
						int sartuKop =  1 + (int)(Math.random() * (PisukideApp.Botea-begiratu));
						botea.sartu(sartuKop, pisukidea);
						sleep((long) (Math.random() * 3000));
					}else{
						botea.askatu(pisukidea);
						sleep((long) (Math.random() * 3000));
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
