package aparkalekua;

class Irteerak extends Thread {
	Kontrolatzailea aparkalekua;
	Irteerak(Kontrolatzailea k){
		aparkalekua = k;
	}
	public void run() {
		try { while(true) {
			aparkalekua.irten();
			//System.out.println("\t\t\t Atera da kotxe bat");
			sleep((int) (Math.random() * 1000));
		}
		} catch (InterruptedException e){}
	}
}