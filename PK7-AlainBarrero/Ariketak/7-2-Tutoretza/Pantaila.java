package ehu;

public class Pantaila {
	
	public void hasieratu(){
		System.out.print("Irakaslea");
		
		for(int i = 0; i<BulegoApp.Ikasleak; i++){
			System.out.print("\tik[" + (i+1) + "]");
		}
		System.out.print("\t\t   BULEGOAN");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t\t\t [IK][GL][ER]");
		for(int i = 0; i < BulegoApp.Ikasleak; i++){
			System.out.print("====================");
		}
		System.out.println("");
	}
	
	public static void ekintza(int id, int ikasleKopurua, int galderaKopurua, int erantzunda, String ekintza){
		String tab = "\t\t";
		String bul = "";
		String zen = "";
		String ert = "";
		for(int i = 0; i<id; i++){
			tab += "\t";
		}
		String kop = "[";
		for(int j = 0; j<ikasleKopurua; j++){
			kop += "*";
		}
		for(int k = 0; k<2-ikasleKopurua; k++){
			kop+=" ";
		}
		kop += "]";
		if(ekintza.equals("erantzunaJaso")){
			bul = "\t  ";
		}else{
			 bul = "\t\t  ";
		}
		while(id<BulegoApp.Ikasleak-1){
			bul = "\t" + bul;
			id++;
		}
		if(galderaKopurua>0){
			zen = "[G]";
		}else{
			zen = "[ ]";
		}
		if(erantzunda>0){
			ert = "[E]";
		}else{
			ert = "[ ]";
		}
		System.out.println(tab + ekintza  + bul + kop + zen + ert);
	}
	
	public static void irakalseEkintza(int ikasleKopurua, int galderaKopurua, int erantzunda, String ekintza){
		String kop = "[";
		String zen = "";
		String ert = "";
		for(int j = 0; j<ikasleKopurua; j++){
			kop += "*";
		}
		for(int k = 0; k<2-ikasleKopurua; k++){
			kop+=" ";
		}
		kop += "]";
		if(galderaKopurua>0){
			zen = "[G]";
		}else{
			zen = "[ ]";
		}
		if(erantzunda>0){
			ert = "[E]";
		}else{
			ert = "[ ]";
		}
		System.out.println(ekintza + "\t\t\t\t\t\t\t\t\t  " +kop + zen + ert);
	}
}
