package ehu;

class IdazleaDenbora extends Thread {
	private String baiEz;
	private int denbora, kopurua, azelerazioa;
	
	public IdazleaDenbora(String s, int i, int j, int z){
		baiEz=s;
		denbora=i;
		kopurua=j;
		azelerazioa = z;
	}
	
	public void run() {
		int i;
		for (i=0;i<kopurua;i++) {
			System.out.println(baiEz);
			try {
					denbora = denbora+azelerazioa;
					sleep(denbora);
				}
			catch (InterruptedException e) {}
		}
		System.out.println(" Bukatuta ("+baiEz+")");
	}
}

class BaiEzDenboraApp{
	public static void main (String args[]) {
		/**
		 * @Izenburua: BaiEzDenbora
		 * @Describapena: BaiEzDenbora fsp java-z berridatzita
		 * @Egilea: Alain Barrero
		 * @Data: 2016/09/26
		 */
		IdazleaDenbora bai = new IdazleaDenbora("bai",3000, 30, -100);
		IdazleaDenbora ez = new IdazleaDenbora("\t ez",100, 30, 100);
		bai.start();
		ez.start();
	}
}
