package ehu;

public class Pantaila {
	public void hasieratu(int prozesuKopurua, int[] agenda){
		System.out.print("p[1]");
		for(int i = 1; i<prozesuKopurua; i++){
			System.out.print("\t p[" + (i+1) + "]");
		}
		System.out.print("\t\t\t\tAGENDA");
		System.out.println("");
		
		for(int i = 0; i<prozesuKopurua; i++){
			System.out.print("=============");
		}
		System.out.println("");
		System.out.println(margotuAgenda(agenda,0));
	}
	
	public static void margotuHartu(int id, int hartuBat, int hartuBi, int[] agenda){
		String tab = "";
		for(int i = 0; i < id; i++){
			tab += "\t";
		}
		String agendaString = margotuAgenda(agenda, id);
		System.out.println(tab + "hartu." + hartuBat + "." + hartuBi);
		System.out.println(agendaString);
	}
	
	public static void margotuSartu(int id, int sartu, int[] agenda){
		String tab = "";
		for(int i = 0; i < id; i++){
			tab += "\t";
		}
		String agendaString = margotuAgenda(agenda, id);
		System.out.println(tab + "sartu." + sartu);
		System.out.println(agendaString);
	}
	
	public static void margotuKonparatu(int id){
		String tab = "";
		for(int i = 0; i < id; i++){
			tab += "\t";
		}
		System.out.println(tab + "konparatu");
	}
	
	
	public static void margotuEmaitza(int prozesuKopurua, int[] agenda, int id, int sartu){
		margotuSartu(id, sartu, agenda);
		System.out.println("");
		System.out.println("====================================================EMAITZA====================================================");
	}
	
	public static String margotuAgenda(int[] agenda, int id){
		String tab = "  \t\t";
		for(int j=0; j<AgendaApp.ProzKop; j++){
			tab += "\t";
		}
		String agendaString = "|";
		for(int i=0; i<agenda.length; i++){
			if(agenda[i]>0){
				agendaString+= agenda[i] + "|";
			}else{
				agendaString+= " |";
			}
		}
		return  tab + agendaString;
	}
}
