package ehu;

public class IrakuleIdazleApp {

	public static void main (String args[]) {
		IrakurriIdatziLehentasuna blokeoa = new IrakurriIdatziLehentasuna();
		//IrakurriIdatziSegurua blokeoa = new IrakurriIdatziSegurua();
		int IdKop=3;
		int IrKop=5;
		String tabul="";

		for(int i=1; i<=IrKop;i++){ System.out.print(i+".irak\t");       }    
		for(int i=1; i<=IdKop;i++){ System.out.print("\t"+i+".idaz");  }    
		System.out.println("\n=================================================================================\n");

		Irakurle ir[] = new Irakurle[IrKop];
		Idazle id[] = new Idazle[IdKop];

		for(int i=0; i<IrKop;i++){
			ir[i] = new Irakurle(blokeoa,tabul,1,3);
			ir[i].start();   
			tabul=tabul+"\t";
		}

		for(int i=0; i<IdKop;i++){
			tabul=tabul+"\t";
			id[i] = new Idazle(blokeoa,tabul,1,3);
			id[i].start();
		}
	}
}
