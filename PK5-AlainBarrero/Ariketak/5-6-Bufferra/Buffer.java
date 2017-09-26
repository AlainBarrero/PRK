package ehu;

class Buffer{
	private int kont = 0;
	private int tam;
	int in = 0;
	int out = 0;
	private char[] buf = new char[' '];
	
	Buffer(int tamaina){
		this.tam = tamaina;
	}
	
	//when (i<N) put[p]  ->COUNT[i+1][(p+1)%N][g]
	public synchronized void put(char c, String alphabet, int ai) throws InterruptedException {
		while (!(kont<tam)) wait();
		buf[in] = c;
		++kont; 
		in=(in+1)%tam;
		Pantaila.margotuIdazlea(alphabet, ai);
		Pantaila.margotuBufferra(tam, buf);
		//erakutsi();
		notify();
	}
	
	//when (i>0) get[g]  ->COUNT[i-1][p][(g+1)%N]
	public synchronized char get(String alphabet, int ai) throws InterruptedException {
		while (!(kont>0)) wait();
		char c = buf[out];
		buf[out]=' ';
		--kont;
		out=(out+1)%tam;
		Pantaila.margotuIrakurlea(alphabet, ai);
		Pantaila.margotuBufferra(tam, buf);
		//erakutsi();
		notify();
		return (c);
	}
	
//	public synchronized void erakutsi(){
//		System.out.print("\t|");
//		for (int i = 0; i < tam; i++) {
//			System.out.print(buf[i]);
//			System.out.print('|');
//		}
//		System.out.println();
//	}
}
