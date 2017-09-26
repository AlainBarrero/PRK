package ehu;

public class Pantaila {

	public void hasieratu(int prozesuKopurua){
		for(int i = 0; i<prozesuKopurua; i++){
			System.out.print("\t p[" + (i+1) + "]");
		}
		System.out.println("");
		
		for(int i = 0; i<prozesuKopurua; i++){
			System.out.print("============");
		}
		System.out.println("");
	}
	
	public static void margotuHasi(int id){
		String tab = "\t";
		for(int i = 0; i < id; i++){
			tab += "\t";
		}
		System.out.println(tab + "hasi");
	}
	
	public static void margotuKorrikaEgin(int id){
		String tab = "\t";
		for(int i = 0; i < id; i++){
			tab += "\t";
		}
		System.out.println(tab + "korrikan");
	}
	
	public static void margotuIgeriEgin(int id){
		String tab = "\t";
		for(int i = 0; i < id; i++){
			tab += "\t";
		}
		System.out.println(tab + "igerian");
	}
	
	public static void margotuTxirrinduanIbilia(int id){
		String tab = "\t";
		for(int i = 0; i < id; i++){
			tab += "\t";
		}
		System.out.println(tab + "txirrinduan");
	}
	
	public static void margotuBukatu(int id){
		String tab = "\t";
		for(int i = 0; i < id; i++){
			tab += "\t";
		}
		System.out.println(tab + "bukatu");
	}
}
