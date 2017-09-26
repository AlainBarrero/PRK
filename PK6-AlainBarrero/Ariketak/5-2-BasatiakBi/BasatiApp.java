package ehu;

public class BasatiApp {
	final static int Puskak = 8;
	final static int Basatiak = 3;
	final static int LapikoPuskak = 3;

	public static void main (String args[]) {
		/**
		 * @Izenburua: Basatiak Bi
		 * @Describapena: 
		 * 					2. Basatien festa, baina orain
		 *						• sukaldariak aldi bakoitzean 3 puska botatzen ditu.
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
