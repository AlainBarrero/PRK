package ehu;

public class Pantaila{

	public void hasieratu(){
		System.out.print("oi[1]");
		for(int i = 1; i<ZebrabideApp.OinezkoKop; i++){
			System.out.print("\toi[" + (i+1) + "]");
		}
		System.out.print("\t\t\t");
		System.out.print("     ZEBRABIDEA\t\t\t");
		for(int j = 0; j<ZebrabideApp.KotxeKop; j++){
			System.out.print("\tko[" + (j+1) + "]");
		}
		System.out.println("");

		System.out.println("");
	}
	
	public static void ekintzaOinezkoa(int id, String ekintza, int kotxeZebKop, int oinezZebKop, int itsaronKotKop, int itsaronOinKop, int txanda){
		String tab = "";
		String zeb = "\t\t";
		String tx = "";
		String oEz = "";
		for(int i = 0; i<id; i++){
			tab += "\t";
		}
		while(id<ZebrabideApp.OinezkoKop-1){
			zeb = "\t" + zeb;
			id++;
		}
		if(txanda==0){
			oEz = "Oinez";
			tx =  "-----";
		}else{
			tx = "Kotxe";
			oEz= "-----";
		}
		String oItsoiten = oinezKop(itsaronOinKop);
		String zebrabidean = zebOinezKop(oinezZebKop);
		String kItsoiten = kotxeKop(itsaronKotKop);
		System.out.println(tab + ekintza + zeb + "[" + oEz + "]" + oItsoiten + zebrabidean + kItsoiten + "[" + tx + "]");
	}
	
	public static void ekintzaKotxea(int id, String ekintza, int kotxeZebKop, int oinezZebKop, int itsaronKotKop, int itsaronOinKop, int txanda){
		String tab = "\t\t\t\t\t\t";
		String zeb = "\t\t";
		String tx = "";
		String kEz = "";
		for(int i = 0; i<id; i++){
			zeb += "\t";
		}
		if(txanda==1){
			kEz = "Kotxe";
			tx  = "-----";
		}else{
			tx = "Oinez";
			kEz= "-----";
		}
		String oItsoiten = oinezKop(itsaronOinKop);
		String zebrabidean = zebKotxeKop(kotxeZebKop);
		String kItsoiten = kotxeKop(itsaronKotKop);
		System.out.println(tab +  "["+ tx +"]" + oItsoiten + zebrabidean + kItsoiten + "["+ kEz +"]" + zeb + ekintza);
	}
	
	public static String kotxeKop(int itsaronKotKop){
		String kop = "[";
		for(int j = 0; j<ZebrabideApp.KotxeKop-itsaronKotKop; j++){
			kop+=" ";
		}
		for(int i = 0; i<itsaronKotKop; i++){
			kop += "K";
		}
		kop += "]";
		return kop;
	}
	
	public static String oinezKop(int itsaronOinKop){
		String kop = "[";
		for(int i = 0; i<itsaronOinKop; i++){
			kop += "O";
		}
		for(int j = 0; j<ZebrabideApp.OinezkoKop-itsaronOinKop; j++){
			kop+=" ";
		}
		kop += "]";
		return kop;
	}
	
	public static String zebKotxeKop(int kotxeZebKop){
		String kop = "[";
		for(int j = 0; j<ZebrabideApp.KotxeKop-kotxeZebKop; j++){
			kop+=" ";
		}
		for(int i = 0; i<kotxeZebKop; i++){
			kop += "K";
		}
		kop += "]";
		return kop;
	}
	
	public static String zebOinezKop(int oinezZebKop){
		String kop = "[";
		for(int i = 0; i<oinezZebKop; i++){
			kop += "O";
		}
		for(int j = 0; j<ZebrabideApp.OinezkoKop-oinezZebKop; j++){
			kop+=" ";
		}
		kop += "]";
		return kop;
	}
}
