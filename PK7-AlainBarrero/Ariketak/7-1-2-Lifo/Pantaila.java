package ehu;

public class Pantaila {
	public void hasieratu(int prozesuKopurua){
		for(int i = 0; i<prozesuKopurua; i++){
			System.out.print("\t p[" + (i+1) + "]");
		}
		System.out.print("\t\ts\tk");
		System.out.print("\t\tLIFO");
		System.out.println("");
		
		for(int i = 0; i<prozesuKopurua; i++){
			System.out.print("==============");
		}
		System.out.println("");
	}
	
	public static void margotuSartu(int id, int sartu, int kont, int[] lifo){
		int ident = id+1;
		String s = "\t"+sartu;
		String tab = "\t";
		for(int i = 0; i<id; i++){
			tab += "\t";
		}
		String tabM = "\t";
		while(id<LifoApp.ProzKop-1){
			tabM = "\t" + tabM;
			id++;
		}
		String lifoString = margotuLifo(lifo);
		System.out.println(tab + "sartu."+ ident + tabM + s + "\t" + kont + lifoString);
	}
	
	public static void margotuAtera(int id, int sartu, int kont, int[] lifo){
		int ident = id+1;
		String s = "\t"+sartu;
		String tab = "\t";
		for(int i = 0; i<id; i++){
			tab += "\t";
		}
		String tabM = "\t   ";
		while(id<LifoApp.ProzKop-1){
			tabM = "\t" + tabM;
			id++;
		}
		String lifoString = margotuLifo(lifo);
		System.out.println(tab + "atera."+ident + tabM + s + "\t" + kont + lifoString);
	}
	
	public static String  margotuLifo(int[] lifo){
		String lifoString = "\t  |";
		for(int i=0; i<lifo.length; i++){
			if(lifo[i]>0){
				lifoString+= "*|";
			}else{
				lifoString+= " |";
			}
		}
		return lifoString;
	}
}
