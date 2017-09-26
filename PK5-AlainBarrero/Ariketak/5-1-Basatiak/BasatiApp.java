package ehu;

public class BasatiApp {
	final static int Puskak = 4;
	final static int Basatiak = 4;

	public static void main (String args[]) {
		/**
		 * @Izenburua: Basatiak
		 * @Describapena: 
		 * 				1. Basatien festa:
		 *					• Basati bakoitzak lapiko batetik misiolari-puska bat hartzen du; puska hori
		 *					  jaten bukatzean, tripazgora jarri eta ondoren beste bat hartzen du...
		 * 					• Basati sukaldariak lapikoa hutsik dagoenean lapikoa betetzen du
		 *					  misiolari-puskekin.
		 * @Egilea: Alain Barrero
		 * @Data: 2016/09/26
		 */
		
		//Pantaila sortzen dugu bertan datuak ikusi ahal izateko
		Pantaila p = new Pantaila();
		p.hasieratu(Basatiak);
		
		//Basatiak sortzego 
		Basatia basatiak[] = new Basatia[Basatiak];
		
		//Kotrola sortu
		Kontrola k = new Kontrola ();
		
		//Sukaldaria sortu eta hasiera heman
		Sukaldaria suk = new Sukaldaria(k);
		suk.start();
		
		//Basatiak sortu eta hasaiera hematen diegu
		for(int i = 0; i<Basatiak; i++){
			basatiak[i] = new Basatia(i, k);
		}
		for(int j = 0; j<Basatiak; j++){
			basatiak[j] .start();
		}
	}
}
