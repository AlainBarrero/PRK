package ehu;

class Kotxea extends Thread {
	private String ikurra;
	private int denbora;
	Pantalla p;
	int espazioa;
	
	public Kotxea(String ikurra, int abiadura, Pantalla p){
		this.ikurra = ikurra;
		this.denbora = 1000/abiadura;
		this.p = p;
		this.espazioa = 0;
	}
	
	public void run() {
		while (true) {
			p.margotu(ikurra, espazioa);
			try {sleep(denbora);}
			catch (InterruptedException e) {}
			espazioa++;
		}
	}
}

class Pantalla{
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

class KotxeKarreraApp{
	public static void main (String args[]) {
		/**
		 * @Izenburua: KotxeKarreraApp
		 * @Describapena: KotxeKarrera fsp java-z berridatzita
		 * @Egilea: Alain Barrero
		 * @Data: 2016/09/26
		 */
		
		
		Pantalla p = new Pantalla();
		Kotxea k1 = new Kotxea("+", 3, p);
		Kotxea k2 = new Kotxea("*", 7, p);
		
		k1.start();
		k2.start();
	}
}
