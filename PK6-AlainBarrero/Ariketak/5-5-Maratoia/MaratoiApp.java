package ehu;

public class MaratoiApp {
	
	final static int ProzKop = 5;

	public static void main(String[] args) {
		/**
		Izenburua: Lagunen Maratioa
		Describapena:
						5. Hainbat prozesu sinkronizatzen dira denek batera ekintza jakin bat egiteko.
		Egilea: Alain Barrero
		Data: 2016/10/28
		**/
		Pantaila p = new Pantaila();
		p.hasieratu(ProzKop);
		
		Maratoia m = new Maratoia();
		Lagunak proz[] = new Lagunak[ProzKop];
		
		//Prozesuak sortu
		for(int i = 0; i<ProzKop; i++){
			proz[i] = new Lagunak(i,m);
			proz[i].start();
		}
	}

}
