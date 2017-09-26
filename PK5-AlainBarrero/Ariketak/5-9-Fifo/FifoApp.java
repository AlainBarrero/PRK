package ehu;

public class FifoApp {
	
	final static int ProzKop = 10;	// Prozesu Kopurua
	final static int FifoKop = 8;	// Fifo posizio kopurua
	
	public static void main (String args[]) {
		/**
		 * @Izenburua: Fifo
		 * @Describapena: 
		 * 					9. FIFO ilara batean prozesuak sartu eta ateratzen dira.
		 * @Egilea: Alain Barrero
		 * @Data: 2016/10/22
		 **/
		
		Pantaila p = new Pantaila();
		p.hasieratu(ProzKop);
		
		Fifo fifo = new Fifo();
		Prozesua proz[] = new Prozesua[ProzKop];
		
		//Prozesuak sortu
		for(int i = 0; i<ProzKop; i++){
			proz[i] = new Prozesua(i,fifo);
			proz[i].start();
		}
	}
}
