package ehu;

public class Pertsona extends Thread{

	private Framea framea;
	private Kontroladorea kontroladorea;
	private int pertsona;
	
	public Pertsona(Framea framea, Kontroladorea kontroladorea, int pertsona){
		this.framea = framea;
		this.kontroladorea = kontroladorea;
		this.pertsona = pertsona;
	}
	
	/*
	 PERTSONA = (iritsiSJ -> igoSJ -> jeitsiSP -> PERTSONA
		   		|iritsiSP -> igoSP -> jeitsiSJ -> PERTSONA).
	 */
	public void run() {
		try {
			while(true) {
				if(pertsona<5){
					sleep((long) (Math.random() * 100));
					kontroladorea.iritsiSanJuan(framea);
					framea.panela.iritsiSanJuan(kontroladorea.sanJuan);
					sleep((long) (Math.random() * 1000));
					kontroladorea.igoSanJuan(framea);
					sleep((long) (Math.random() * 1000));
					kontroladorea.jeitsiSanPedro(framea);
					framea.panela.jeitsiSanPedro(pertsona);
					sleep((long) (Math.random() * 7000));
				}else{
					sleep((long) (Math.random() * 7000));
					kontroladorea.iritsiSanPedro(framea);
					framea.panela.iritsiSanPedro(kontroladorea.sanPedro);
					sleep((long) (Math.random() * 1000));
					kontroladorea.igoSanPedro(framea);
					sleep((long) (Math.random() * 1000));
					kontroladorea.jeitsiSanJuan(framea);
					framea.panela.jeitsiSanJuan(pertsona);
					sleep((long) (Math.random() * 100));
				}
			}
		} catch (InterruptedException e){}
	}
}
