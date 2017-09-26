package aparkalekua;

class Kontrolatzailea {
	private int kop;
	private int plazak;
	Kontrolatzailea(int p)
	{plazak=p; kop=0;}
	synchronized void sartu() throws InterruptedException {
		while (!(kop<plazak))
			wait();
		++kop;
		System.out.println("Sartu da kotxe bat");
		System.out.println("\t\t\t\t\t\t Kopurua "+kop);
		notify();
	}
	synchronized void irten() throws InterruptedException {
		while(!(kop>0))
			wait();
		--kop;
		System.out.println("\t\t\t Atera da kotxe bat");
		System.out.println("\t\t\t\t\t\t Kopurua "+kop);
		notify();
	}
}