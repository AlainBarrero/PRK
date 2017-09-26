package ehu;
class KronoAlderantziz extends Thread {
	public void run() {
		int i;
		for (i=1;i<=10;i++) {
			System.out.println(i);
			try {sleep(1000);}
			catch (InterruptedException e) {}
		}	
		System.out.println("Bukatu da!");
	}
}

class KronoAppAlderantziz {
	public static void main (String args[]){
		KronoAlderantziz k = new KronoAlderantziz();
		k.start();
	}
}