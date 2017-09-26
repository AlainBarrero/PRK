package ehu;

public class Agenda {
	int i = AgendaApp.AgendaKop;
	int r = 0;
	int[] itzuli = new int[2];
	int[] agenda;

	Agenda(int[] agenda){
		this.agenda = agenda;
	}
	
	//when(i>=2 &&	r<AK-1)  p[PR].hartu ->[i-1][i-2] ->AGENDA[i-2][r+1]
	public synchronized int[] hartu(int id) throws InterruptedException{
		while(!(i>=2 && r<AgendaApp.AgendaKop-1)) wait();
		
		//Itzuli behar dena montatu
		itzuli[0] = agenda[i-1];
		itzuli[1] = agenda[i-2];
		agenda[i-1] = 0;
		agenda[i-2] = 0;
		
		//Pantailan margotu hartu eta agenda
		Pantaila.margotuHartu(id, itzuli[0], itzuli[1], agenda);
		
		i = i-2;
		r = r+1;
		notifyAll();
		return itzuli;
	}
	
	/*
		when(i<AK && r>=1) p[PR].sartu -> 
											if(i==0 && r==1) then 	(emaitza	->STOP				)
										  	else 					([i]		->AGENDA[i+1][r-1]	)
	*/
	public synchronized void sartu(int id, int sartu) throws InterruptedException{
		while(!(i<AgendaApp.AgendaKop && r>=1)) wait();
		if(i==0 && r==1){
			//Pantailan margotu emaitza eta sartutakoa
			agenda[i] = sartu;
			Pantaila.margotuEmaitza(AgendaApp.ProzKop, agenda, id, sartu);
			System.exit(0);
		}else{
			//Pantailan margotu sartu eta agenda
			agenda[i] = sartu;
			Pantaila.margotuSartu(id, sartu, agenda);
			i = i+1;
			r = r-1;
		}
		notifyAll();
	}
	
	public synchronized int konparatu(int id, int hartuBat, int hartuBi) throws InterruptedException{
		int handiena;
		if(hartuBat > hartuBi){
			handiena = hartuBat;
		}else{
			handiena = hartuBi;
		}
		Pantaila.margotuKonparatu(id);
		notifyAll();
		return handiena;
	}	
	
}
