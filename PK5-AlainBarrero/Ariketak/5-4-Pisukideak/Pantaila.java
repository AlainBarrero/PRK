package ehu;

public class Pantaila {
	
	public void hasieratu(int pisukideKop){
		for(int i = 0; i<pisukideKop; i++){
			System.out.print("\t p[" + (i+1) + "]");
		}
		System.out.print("\t   botea");
		System.out.println("");
		
		for(int i = 0; i < pisukideKop;i++){
			System.out.print("=================");
		}
		System.out.println("");
	}

	public static void pisukideaAteraMargotu(int pisukidea, int diruKopurua, int ateraKop){
		String tab = "\t";
		for(int i = 0; i<pisukidea; i++){
			tab += "\t";
		}
		String kop = "[";
		for(int j = 0; j<diruKopurua; j++){
			kop += "*";
		}
		for(int k = 0; k<PisukideApp.Botea-diruKopurua; k++){
			kop+=" ";
		}
		kop += "]";
		String lap = "\t   ";
		while(pisukidea<PisukideApp.Pisukideak-1){
			lap = "\t" + lap;
			pisukidea++;
		}
		System.out.println(tab + "atera-" + ateraKop  + lap +  kop);
	}
	
	public static void pisukideaSartuMargotu(int pisukidea, int diruKopurua, int sartuKop){
		String tab = "\t";
		for(int i = 0; i<pisukidea; i++){
			tab += "\t";
		}
		String kop = "[";
		for(int j = 0; j<diruKopurua; j++){
			kop += "*";
		}
		for(int k = 0; k<PisukideApp.Botea-diruKopurua; k++){
			kop+=" ";
		}
		kop += "]";
		String lap = "\t   ";
		while(pisukidea<PisukideApp.Pisukideak-1){
			lap = "\t" + lap;
			pisukidea++;
		}
		System.out.println(tab + "sartu-" + sartuKop  + lap +  kop);
	}
	
	public static void margotuBegiratu(int id, int diruKopurua){
		String tab = "\t";
		for(int i = 0; i<id; i++){
			tab += "\t";
		}
			System.out.println(tab + "begiratu-" + diruKopurua);
	}
	
	public static void margotuAsaktu(int id){
		String tab = "\t";
		for(int i = 0; i<id; i++){
			tab += "\t";
		}
			System.out.println(tab + "askatu");
	}
	
	public static void margotuErabaki(int id, int erabakia){
		if(erabakia == 0){
			String tab = "\t";
			for(int i = 0; i<id; i++){
				tab += "\t";
			}
				System.out.println(tab + "erabaki-atera");
		}else{
			String tab = "\t";
			for(int i = 0; i<id; i++){
				tab += "\t";
			}
				System.out.println(tab + "erabaki-sartu");
		}
	}
	
	
}
