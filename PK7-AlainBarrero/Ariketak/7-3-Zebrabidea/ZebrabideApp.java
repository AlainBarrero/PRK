package ehu;

public class ZebrabideApp {
	final static int OinezkoKop = 5;	// Oinezko Kopurua
	final static int KotxeKop = 5;		// Kotxe kopurua
	

	public static void main(String[] args) {
		/**
		Izenburua: Zebrabidea
		Describapena:
						3. Zebrabide batetara iristean, kotxeak zain geldituko dira oinezkoren bat pasatzen edo pasatzeko zain baldin badago.
						Oinezkoek, ordea, zain geldituko dira une horretan kotxe bat pasatzen ari bada, harrapatuak ez izateko.
						Gainera ataskorik sor ez dadin, hiru kotxe baino gehiago zain badaude, oinezkoek ere itxarongo dute.
		Egilea: Alain Barrero
		Data: 2017/11/10
		**/
	
		Pantaila p = new Pantaila();
		p.hasieratu();
		
		Oinezkoa prozOinezkoa[] = new Oinezkoa[OinezkoKop];
		Kotxea	 prozKotxea[] = new Kotxea[KotxeKop];
		
		Zebrabidea z = new Zebrabidea();
		
		//Oinezkoak sortu
		for(int i = 0; i<OinezkoKop; i++){
			prozOinezkoa[i] = new Oinezkoa(i,z);
			prozOinezkoa[i].start();
		}
		
		//Kotxeak sortu
		for(int i = 0; i<KotxeKop; i++){
			prozKotxea[i] = new Kotxea(i,z);
			prozKotxea[i].start();
		}
	}

}
