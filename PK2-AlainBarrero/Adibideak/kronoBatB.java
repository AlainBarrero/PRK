package ehu;
class Krono1b extends Thread {
	public void run() {
		int i;
		for (i=10;i>=0;i--) {
			System.out.println(i);
			try {sleep(1000);}
			catch (InterruptedException e) {}
		}	
		System.out.println("Bukatu da!");
	}
}

class KronoAppB {
	public static void main (String args[]){
		Krono1b k = new Krono1b();
		k.start();
	}
}