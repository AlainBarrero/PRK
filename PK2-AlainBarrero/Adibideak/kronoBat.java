package ehu;
class Krono1 extends Thread {
	int i=10;
	public void run() {
		while (true) {
			if (i>0) {tik(); --i;}
			if (i==0){alarma(); return;}
		}
	}
 
	private void tik() {
		System.out.println(i);
		try {sleep(1000);}
		catch (InterruptedException e) {}
	}
 
	private void alarma() {
		System.out.println("Bukatu da!");
	}
}

class KronoAppBat {
	public static void main (String args[]){
		Krono1 k = new Krono1();
		k.start();
	}
}