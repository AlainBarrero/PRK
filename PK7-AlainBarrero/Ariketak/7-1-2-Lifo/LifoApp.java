package ehu;

public class LifoApp {
	
	final static int ProzKop = 9;		// Prozesu Kopurua
	final static int LifoKop = 8;		// Lifo posizio kopurua
	final static int LifoAtera = 15; 	// Lifotik atera prozesu guztiak

	public static void main(String[] args) {
		/**
		 * @Izenburua: Lifo
		 * @Describapena: 
		 * 					1. LIFO pilaren arazoa, prozesu guztiak noizbait pilatik aterako direla ziurtatuz.
		 * @Egilea: Alain Barrero
		 * @Data: 2016/11/22
		 **/
		
		Pantaila p = new Pantaila();
		p.hasieratu(ProzKop);
		

		Lifo lifo = new Lifo();
		Prozesua proz[] = new Prozesua[ProzKop];
		
		//Prozesuak sortu
		for(int i = 0; i<ProzKop; i++){
			proz[i] = new Prozesua(i,lifo);
			proz[i].start();
		}
	
	}
}
