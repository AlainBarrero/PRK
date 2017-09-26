package ehu;

public class PisukideApp {
	final static int Pisukideak = 3;
	final static int Botea = 9;

	public static void main (String args[]) {
		/**
		 * @Izenburua: Pisukidea
		 * @Describapena: 
		 * 					4. Ikasle jator batzuen pisuan gastuetarako bote bat dute.
		 *						• Norberak ahal duen heinean botean dirua sartzen du, eta behar duen
		 *						  neurrian hartu.
		 * @Egilea: Alain Barrero
		 * @Data: 2016/10/10
		 */
		
		//Pantaila sortzen dugu bertan datuak ikusi ahal izateko
		Pantaila p = new Pantaila();
		p.hasieratu(Pisukideak);
		
		//Pisukideak sortzego 
		Pisukidea pisukideak[] = new Pisukidea[Pisukideak];
		
		//Kotrola sortu
		Kontrola k = new Kontrola ();
		
		//Pisukideak sortu eta hasaiera hematen diegu
		for(int i = 0; i<Pisukideak; i++){
			pisukideak[i] = new Pisukidea(i,k);
		}
		for(int j = 0; j<Pisukideak; j++){
			pisukideak[j] .start();
		}
	}
}
