package ehu;

public class Pantaila {
	public void hasieratu(int prozesuKopurua){
		for(int i = 0; i<prozesuKopurua; i++){
			System.out.print("\t p[" + (i+1) + "]");
		}
		System.out.print("\t\ts");
		System.out.print("\ta");
		System.out.print("\tz");
		System.out.print("\t\tFIFO");
		System.out.println("");
		
		for(int i = 0; i<prozesuKopurua; i++){
			System.out.print("=====================");
		}
		System.out.println("");
	}
	
	public static void margotuSartu(int id, int sartu, int atera, int zenbat, int[] fifo){
		String s = "\t"+sartu;
		String a = "\t"+atera;
		String z = "\t"+zenbat;
		String tab = "\t";
		int sartuPos;
		for(int i = 0; i<id; i++){
			tab += "\t";
		}
		String tabM = "\t   ";
		while(id<FifoApp.ProzKop-1){
			tabM = "\t" + tabM;
			id++;
		}
		if(sartu>0) {
			sartuPos = sartu;
		}else{
			sartuPos = 8;
		}
		String fifoString = margotuFifo(fifo);
		System.out.println(tab + "sartu."+ sartuPos + tabM + s + a + z + fifoString);
	}
	
	public static void margotuAtera(int id, int sartu, int atera, int zenbat, int[] fifo){
		String s = "\t"+sartu;
		String a = "\t"+atera;
		String z = "\t"+zenbat;
		String tab = "\t";
		int ateraPos;
		for(int i = 0; i<id; i++){
			tab += "\t";
		}
		String tabM = "\t   ";
		while(id<FifoApp.ProzKop-1){
			tabM = "\t" + tabM;
			id++;
		}
		if(atera>0) {
			ateraPos = atera;
		}else{
			ateraPos = 8;
		}
		String fifoString = margotuFifo(fifo);
		System.out.println(tab + "atera." + ateraPos + tabM + s + a + z + fifoString);
	}
	
	public static String  margotuFifo(int[] fifo){
		String fifoString = "\t  |";
		for(int i=0; i<fifo.length; i++){
			if(fifo[i]>0){
				fifoString+= "*|";
			}else{
				fifoString+= " |";
			}
		}
		return fifoString;
	}
}
