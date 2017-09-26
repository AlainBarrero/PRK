package ehu;

public class Txalupa extends Thread{

	private Framea framea;
	private Kontroladorea kontroladorea;
	
	public Txalupa(Framea framea, Kontroladorea kontroladorea){
		this.framea = framea;
		this.kontroladorea = kontroladorea;
	}
	
	//TXALUPA = (irtenSP -> bidaiatu-> iritsiSJ -> irtenSJ -> bidaiatu-> iritsiSP -> TXALUPA).
	public void run() {
		try {
			while(true) {
				kontroladorea.irtenTxalupaSanPedro(framea);
				sleep((long) (Math.random() * 100));
				kontroladorea.iritsiTxalupaSanJuan(framea);
				sleep((long) (Math.random() * 100));
				kontroladorea.irtenTxalupaSanJuan(framea);
				sleep((long) (Math.random() * 100));
				kontroladorea.iritsiTxalupaSanPedro(framea);
				sleep((long) (Math.random() * 100));
			}
		} catch (InterruptedException e){}
	}
}
