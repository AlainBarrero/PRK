package ehu;

public class Bulegoa {
	private int ikasleKopurua = 0;
	private int galdera = 0;
	private int erantzuna = 0;
	
	
	//when(ik<2) ik[RK].sartu ->BULEGOA[ik+1][gl][er]
	public synchronized void sartu(int id) throws InterruptedException{
		while(!(ikasleKopurua<2)) wait();
		ikasleKopurua = ikasleKopurua + 1;
		//Margotu pantailan ikaslea sartu
		Pantaila.ekintza(id, ikasleKopurua, galdera, erantzuna, "sartu");
		notifyAll();
	}
	
	//when(ik>0) ik[RK].atera ->BULEGOA[ik-1][gl][er]
	public synchronized void atera(int id) throws InterruptedException{
		while(!(ikasleKopurua>0)) wait();
		ikasleKopurua = ikasleKopurua - 1;
		//Margotu pantailan ikaslea atera
		Pantaila.ekintza(id, ikasleKopurua, galdera, erantzuna, "atera");
		notifyAll();
	}
	
	//when(gl==0 && er==0)	ik[RK].galdetu	->BULEGOA[ik][gl+1][er]
	public synchronized void galdetu(int id) throws InterruptedException{
		while(!(galdera==0 && erantzuna==0)) wait();
		galdera = galdera + 1;
		//Margotu pantailan ikaslearen galdera
		Pantaila.ekintza(id, ikasleKopurua, galdera, erantzuna, "galdetu");
		notifyAll();
	}
	
	//when(gl==1) ir.galderaEntzun 	->BULEGOA[ik][gl][er]
	public synchronized void galderaEntzun() throws InterruptedException{
		while(!(galdera==1)) wait();
		//Pantailan margotu galdera entzun
		Pantaila.irakalseEkintza(ikasleKopurua, galdera, erantzuna, "galderaEntzun");
		notifyAll();
	}
	
	
	//when(gl==1 && er==0) ir.erantzun ->BULEGOA[ik][gl-1][er+1]
	public synchronized void erantzun() throws InterruptedException{
		while(!(galdera==1 && erantzuna==0)) wait();
		galdera  = galdera - 1;
		erantzuna = erantzuna + 1;
		//Margotu pantailan erantzuna
		Pantaila.irakalseEkintza(ikasleKopurua, galdera, erantzuna, "erantzunaEginda");
		notifyAll();
	}
	
	
	//when(gl==0 && er==1)	ik[RK].erantzunaJaso ->BULEGOA[ik][gl][er-1]
	public synchronized void erantzunaJaso(int id) throws InterruptedException{
		while(!(galdera==0 && erantzuna==1)) wait();
		//Margotu pantailan erantzuna jaso
		Pantaila.ekintza(id, ikasleKopurua, galdera, erantzuna, "erantzunaJaso");
		erantzuna = erantzuna - 1;
		notifyAll();
	}	

}
