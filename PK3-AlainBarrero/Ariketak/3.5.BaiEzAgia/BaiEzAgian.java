package ehu;

class Idazleak extends Thread {
	private String baiEz;
	private int denbora, kopurua;
	
	public Idazleak(String s, int i, int j){
		baiEz=s;
		denbora=i;
		kopurua=j;
	}
	
	public void run() {
		int i;
		for (i=0;i<kopurua;i++) {
			System.out.println(baiEz);
			try {sleep(denbora);}
			catch (InterruptedException e) {}
		}
		System.out.println(" Bukatuta ("+baiEz+")");
	}
}

class BaiEzAgianApp{
	public static void main (String args[]) {
		/**
		 * @Izenburua: BaiEzAgian
		 * @Describapena: BaiEzAgian fsp java-z berridatzita
		 * @Egilea: Alain Barrero
		 * @Data: 2016/09/26
		 */
		Idazleak bai = new Idazleak("bai",1000,4);
		Idazleak ez = new Idazleak("\t ez",400,20);
		Idazleak agian = new Idazleak("\t\t agian",200,8);
		bai.start();
		ez.start();
		agian.start();
	}
}
