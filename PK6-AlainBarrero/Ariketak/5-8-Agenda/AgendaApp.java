package ehu;


public class AgendaApp {
	
	final static int ProzKop 	= 8;
	final static int AgendaKop	= 10;
	final static int[] Agenda = new int[AgendaKop];

	public static void main(String[] args) {
		/**
		Izenburua: Agenda
		Describapena:
						8. Array bateko zenbakien artean maximoa aukeratu, agendaren eredua erabiliz.
						   Ondo pentsatu noiz bukatzen den prozesaketa.
		Egiela: Alain Barrero
		Data: 2016/10/22
		**/
        for(int j = 0; j <  Agenda.length; j++) {
        	Agenda[j] = (int) ( Math.random() * (10 - 1) + 1);
        }
		
		Pantaila p = new Pantaila();
		p.hasieratu(ProzKop, Agenda);
		
		Agenda a = new Agenda(Agenda);
		Prozesua proz[] = new Prozesua[ProzKop];
		
		//Prozesuak sortu
		for(int i = 0; i<ProzKop; i++){
			proz[i] = new Prozesua(i,a);
			proz[i].start();
		}

	}

}
