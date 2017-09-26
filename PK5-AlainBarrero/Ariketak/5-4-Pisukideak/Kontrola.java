package ehu;

public class Kontrola {
	private int diruKopurua;
	private int blok = 0;
	
	Kontrola(){
		diruKopurua=0;
	}

	//when (i >0) 	p[IR].atera[d:1..i]  -> BOTEA[i-d][0]
	public synchronized void atera(int ateraKop, int piskudiea)throws InterruptedException{
		while(!(diruKopurua>0)) wait();
		diruKopurua = diruKopurua - ateraKop;
		blok = 0;
		//Pantailan margotu
		Pantaila.pisukideaAteraMargotu(piskudiea, diruKopurua, ateraKop);
		notifyAll();
	}

	//when (i <DK)	p[IR].sartu[d:1..DK-i] 	-> BOTEA[i+d][0]
	public synchronized void sartu(int sartuKop, int pisukidea) throws InterruptedException{
		while(!(diruKopurua<PisukideApp.Botea)) wait();
		diruKopurua = diruKopurua + sartuKop;
		blok = 0;
		//Pantaila margotu
		Pantaila.pisukideaSartuMargotu(pisukidea, diruKopurua, sartuKop);
		notifyAll();
	}
	
	//when (b==0)	p[IR].begiratu[i] 	-> BOTEA[i][1]
	public synchronized int begiratu(int id) throws InterruptedException{
		while(!(blok==0)) wait();
		blok = 1;
		Pantaila.margotuBegiratu(id, diruKopurua);
		notifyAll();
		return diruKopurua;
	}

	//p[IR].askatu	->	BOTEA[i][0]
	public synchronized void askatu(int id) throws InterruptedException{
		blok = 0;
		Pantaila.margotuAsaktu(id);
		notifyAll();
	}
}
