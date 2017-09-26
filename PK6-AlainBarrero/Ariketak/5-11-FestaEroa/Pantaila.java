package ehu;

public class Pantaila {
	public void hasieratu(int basatiKopurua){
		System.out.print("Txalupa");
		for(int i = 0; i<basatiKopurua; i++){
			System.out.print("\t b[" + (i+1) + "]");
		}
		System.out.print("\t Sukaldaria");
		System.out.print("\t Hondartza");
		System.out.print("\t Hozkailua");
		System.out.print("\t Lapikoa");
		
		System.out.println("");
		
		for(int i = 0; i<basatiKopurua; i++){
			System.out.print("===============================");
		}
		System.out.println("");
	}
	
	public static void sukaldaria(){
		System.out.println("\t\t\t\takatu");
		System.out.println("\t\t\t\tzatitu");
	}
	
	public static void begiratu(int[] begiratu){
		System.out.println("\t\t\t\tbeg[" + begiratu[0] + "][" + begiratu[1] + "][" + begiratu[2] + "]");
	}
	
	public static void begiratuHon(int hon){
		if(hon<FestaEroaApp.Hondartza){
			System.out.println("beg." + hon);
		}
	}
	
	public static void begiratuLap(int id, int lap){
		String tab="\t";
		for(int i = 0; i<id; i++){
			tab+="\t";
		}
		System.out.println(tab + "beg." + lap);
	}
	
	public static void hartu(int id, int hartu){
		String tab="\t";
		for(int i = 0; i<id; i++){
			tab+="\t";
		}
		System.out.println(tab + "hartu." + hartu);
	}
	
	public static void margotuEkintza(int lap, int hoz, int hon, String ekintza, String tab , String hasiTab){
		String hondartzan 	= "  [";
		String hozkailuan 	= "\t  [";
		String lapikoan 	= "\t  [";
		
		for(int i = 0; i<hon;i++){
			hondartzan += "*";
		}
		for(int j = 0; j<FestaEroaApp.Hondartza-hon; j++){
			hondartzan+=" ";
		}
		hondartzan += "]";
		
		for(int i = 0; i<hoz;i++){
			hozkailuan += "*";
		}
		for(int j = 0; j<FestaEroaApp.Hozkailua-hoz; j++){
			hozkailuan+=" ";
		}
		hozkailuan += "]";

		for(int i = 0; i<lap;i++){
			lapikoan += "*";
		}
		for(int j = 0; j<FestaEroaApp.Lapikoa-lap; j++){
			lapikoan+=" ";
		}
		lapikoan += "]";
		
		System.out.println(hasiTab + ekintza + tab + hondartzan + hozkailuan + lapikoan);
	}
}
