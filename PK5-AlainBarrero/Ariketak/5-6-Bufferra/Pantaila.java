package ehu;

public class Pantaila {
	
	public void hasieratu(){
		System.out.print("Idazlea");
		System.out.print("\t\t Bufferra");
		System.out.print("\t Irakurlea");
		System.out.println("");
		System.out.println("============================================");
	}
	
	public static void margotuIdazlea(String alphabet, int ai){
		System.out.println(alphabet.charAt(ai)+">");
	}
	
	public static void margotuIrakurlea(String alphabet, int ai){
		System.out.println("\t\t\t\t   "+alphabet.charAt(ai)+">");
	}
	
	public static void margotuBufferra(int tam,  char[] buf){
		System.out.print("\t\t|");
		for (int i = 0; i < tam; i++) {
			System.out.print(buf[i]);
			System.out.print('|');
		}
		System.out.println();
	}
	
}
