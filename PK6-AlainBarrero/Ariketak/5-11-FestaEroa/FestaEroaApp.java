package ehu;

public class FestaEroaApp {
	final static int Basatiak 	= 3;		//Basati kopurua
	final static int Hondartza 	= 5;		//Hondartzan sartzen diren misioiari kopurua
	final static int Hozkailua 	= 5;		//Hozkailuan sartzen diren puska kopurua
	final static int Lapikoa 	= 5;		//Lapikoan sartzen diren puska kopurua
	
	final static int HozkiluPuska = 3;		//Hozkailuan sartu behar diren puska kopurua
	
	public static void main (String args[]) {
		/**
		Izenburua: Basatien Festa Eroa
		Describapena: 
						11. Basatien festa eroa:
								Misiolariak iristean, sukaldariak akatzen ditu, zatitu, puskak hozkailuan sartu, eta
								hortik lapikora..., begiratuz beti ea tokia dagoen lapikoan, hozkailuan...	
		Egilea: Alain Barrero
		Data: 2016/10/31
		**/
		
		//Pantaila sortzen dugu bertan datuak ikusi ahal izateko
		Pantaila p = new Pantaila();
		p.hasieratu(Basatiak);
				
		//Basatiak sortzego
		Basatia basatiak[] = new Basatia[Basatiak];
		
		//Irla sortu
		Irla irla = new Irla();
		
		//Sukaldaria sortu eta hasiera heman
		Sukaldaria suk = new Sukaldaria(irla);
		suk.start();
		
		//Txalupa sortu eta hasiera heman
		Txalupa txalupa = new Txalupa(irla);
		txalupa.start();
		

		//Basatiak sortu eta hasaiera hematen diegu
		for(int i = 0; i<Basatiak; i++){
			basatiak[i] = new Basatia(i, irla);
		}
		for(int j = 0; j<Basatiak; j++){
			basatiak[j] .start();
		}
	}
}
