package ehu;

public class NagusiApp {
	final static int PertsonaKop = 10;	//Pertsona kopurua
	final static int TxalupaSartu = 5;	//Txalupan sartzen diren pertsona kopurua
	final static int PortuKopurua = 5;  //Portuetan sartzen diren pertsonen kopurua
	final static int SanPedro = 0;
	final static int SanJuan = 1; 
	
	public static void main(String[] args){
		/**
		Izenburua: San Pedro – San Juan
		Describapena:
						Pasaian badago txalupa bat San Pedro eta San Juan komunikatzeko.
						Alde batetik bestera pasatzeko beharrezkoa da txalupa beteta egotea, edo beste aldean
						txalupa betetzeko nahiko jende zain egotea.
						Enbarkaderoan soilik txalupa bat betetzeko behar den jendea sartzen da.			
		Egilea: Alain Barrero
		Data: 2016/12/6
		**/
		
		//Framea sortu eta bistaratu
		Framea framea = new Framea();
		framea.setVisible(true);
		
		//Kontroladorea sortu 
		Kontroladorea kontroladorea = new Kontroladorea();
		
		//Txalupa sortu eta hasieratu
		Txalupa tx = new Txalupa(framea, kontroladorea);
		tx.start();
		
		//Pertsonak sortu eta hasiera heman
		Pertsona pertsona[] = new Pertsona[PertsonaKop];
		
		for(int i = 0; i<PertsonaKop; i++)pertsona[i] = new Pertsona(framea, kontroladorea, i);
		for(int y = 0; y<PertsonaKop; y++)pertsona[y].start();
	}
}
