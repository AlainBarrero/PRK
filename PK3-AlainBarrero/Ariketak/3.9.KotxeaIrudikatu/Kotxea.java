package ehu;

class Kotxea extends Thread {
	private int kotxea;
	private int abiadura;
	private int denbora;
	private Framea framea;
	
	
	private int azeleratu;
	
	public Kotxea(int kotx, int abiad, int azel, Framea f){
		kotxea=kotx;
		abiadura=abiad;
		framea=f;
		
		azeleratu=azel;
	}
	
	public void run() {
		try {sleep(1000);}
		catch (InterruptedException e) {}
		for (int x=0;x<540;x++) {
			framea.panela.setX(kotxea,x);
			
			denbora=(int)(1000/abiadura);
			try {
					sleep(denbora);
					if((abiadura-azeleratu) >30){
						abiadura = abiadura + azeleratu;
					}else{
						abiadura = 30;
					}
				}
			catch (InterruptedException e) {}
		}
		System.out.println(" Bukatuta ("+kotxea+")");
	}
}