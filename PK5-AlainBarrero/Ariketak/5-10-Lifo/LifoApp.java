package ehu;

public class LifoApp {
	
	final static int ProzKop = 9;	// Prozesu Kopurua
	final static int LifoKop = 8;	// Lifo posizio kopurua

	public static void main(String[] args) {
		/**
		Izenburua: LIFO
		Deskribapena:
				10. LIFO ilara batean prozesuak sartu eta ateratzen dira
		Egilea: Alain Barrero
		Data: 2016/10/17
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
