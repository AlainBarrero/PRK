package ehu;

class KotxeaAzeleratu extends Thread {
	private String ikurra;
	private int denbora;
	private int azeleratu;
	PantallaAzeleratu p;
	int espazioa;
	
	public KotxeaAzeleratu(String ikurra, int abiadura,int azeleratu, PantallaAzeleratu p){
		this.ikurra = ikurra;
		this.denbora = 1000/abiadura;
		this.azeleratu = azeleratu;
		this.p = p;
		this.espazioa = 0;
	}
	
	public void run() {
		while (true) {
			p.margotu(ikurra, espazioa);
			try {
				sleep(denbora);
				denbora = denbora + azeleratu;
			}catch (InterruptedException e) {}
			espazioa++;
		}
	}
}

class PantallaAzeleratu{
	private int x1=0, x2=0;
	public void margotu(String ikurra, int balioa){
		if(ikurra=="+") x1=balioa;
		else x2=balioa;
		
		for(int pBerria=0; pBerria<25; pBerria++) System.out.println();
		for(int k1 = 0; k1 < x1; k1++){System.out.print(' ');} System.out.print("*"+x1);
		System.out.println();
		for(int k2 = 0; k2 < x2; k2++){System.out.print(' ');} System.out.print("+"+x2);
	}
}

class KotxeKarreraAzeleratuApp{
	public static void main (String args[]) {
		/**
		 * @Izenburua: KotxeKarreraAzeleratua
		 * @Describapena: KotxeKarreraAzeleratu javaz
		 * @Egilea: Alain Barrero
		 * @Data: 2016/09/26
		 */
		
		PantallaAzeleratu p = new PantallaAzeleratu();
		KotxeaAzeleratu k1 = new KotxeaAzeleratu("+", 3,5, p);
		KotxeaAzeleratu k2 = new KotxeaAzeleratu("*", 7,10, p);
		
		k1.start();
		k2.start();
	}
}
