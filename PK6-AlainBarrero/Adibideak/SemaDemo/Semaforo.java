package ehu;

public class Semaforo {
	private int balioa;
	
	public Semaforo (int hasierakoa)
	{balioa = hasierakoa;}
	
	synchronized public void gora() {
		++balioa;
		notify();
	}
	
	synchronized public void behera()
			throws InterruptedException {
		while (!(balioa>0)) wait();
		--balioa;
	}
}
