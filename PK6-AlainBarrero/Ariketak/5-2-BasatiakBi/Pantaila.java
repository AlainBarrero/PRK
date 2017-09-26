package ehu;

public class Pantaila {
		public void hasieratu(int basatiKopurua){
			System.out.print("suk");
			for(int i = 0; i<basatiKopurua; i++){
				System.out.print("\t b[" + (i+1) + "]");
			}
			System.out.print("\t       lapikoa");
			System.out.println("");
			
			
			System.out.print("==================");
			for(int i = 0; i < basatiKopurua; i++){
				System.out.print("===========");
			}
			System.out.println("");
		}
	
		public static void margotuBasatia(int id, String ekintza, int puskaKopurua){
			String tab = "\t";
			for(int i = 0; i<id; i++){
				tab += "\t";
			}
			String kop = "[";
			for(int j = 0; j<puskaKopurua; j++){
				kop += "*";
			}
			for(int k = 0; k<BasatiApp.Puskak-puskaKopurua; k++){
				kop+=" ";
			}
			kop += "]";
			String lap = "\t      ";
			while(id<BasatiApp.Basatiak-1){
				lap = "\t" + lap;
				id++;
			}
			System.out.println(tab + ekintza + lap +  kop);
		}
		
		public static void margotuSukaldaria(int puskak){
			String kop = "[";
			for(int i = 0; i<puskak; i++)kop += "*";
			for(int k = 0; k<BasatiApp.Puskak-puskak; k++){
				kop+=" ";
			}
			kop += "]";
			System.out.println("bota \t\t\t\t      " + kop);
		}
		
		public static void margotu(int id, String ekintza){
			String tab = "\t";
			for(int i = 0; i<id; i++){
				tab += "\t";
			}
			System.out.println(tab + ekintza);
		}
}
