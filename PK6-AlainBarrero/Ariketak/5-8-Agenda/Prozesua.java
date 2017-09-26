package ehu;

public class Prozesua extends Thread{
	Agenda agenda;
	private int id;
	
	Prozesua(int id, Agenda agenda){
		this.agenda = agenda;
		this.id = id;
	}
	//PROZESUA = (hartu  ->konparatu -> sartu ->PROZESUA).
	public void run() {
		try {
			while(true) {
				int[] agendaItzuli = agenda.hartu(id);
				int handiena = agenda.konparatu(id, agendaItzuli[0], agendaItzuli[1]);
				sleep((long) (Math.random() * 1000));
				agenda.sartu(id, handiena);
				sleep((long) (Math.random() * 5000));
			}
		} catch (InterruptedException e){}
	}
}
