package ehu;
class KronoVar extends Thread {
	int i;
	
	KronoVar(int var){
		this.i = var;
	}
	
	public void run() {
		for (int aldagaia = i;aldagaia>=1;aldagaia--) {
			System.out.println(aldagaia);
			try {sleep(1000);}
			catch (InterruptedException e) {}
		}	
		System.out.println("Bukatu da!");
	}
}

class KronoAppVar {
	public static void main (String args[]){
		KronoVar k = new KronoVar(15);
		k.start();
	}
}