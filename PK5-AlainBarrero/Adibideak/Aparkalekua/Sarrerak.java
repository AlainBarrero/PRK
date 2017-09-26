package aparkalekua;

class Sarrerak extends Thread {
	Kontrolatzailea aparkalekua;
	Sarrerak(Kontrolatzailea k){
		aparkalekua = k;
	}
	public void run() {
		try { while(true) {
			aparkalekua.sartu();
			//System.out.println("Sartu da kotxe bat");
			sleep((int) (Math.random() * 1000));
		}
		} catch (InterruptedException e){}
	}
}