package ehu;
class Krono2 implements Runnable{
	Thread t;
	public void start() {
		t = new Thread(this);
		t.start();
	}
 
	public void run() {
		int i;
		for (i=10;i>=0;i--) {
			System.out.println(i);
			try {Thread.sleep(1000);}
			catch (InterruptedException e){}
		}
		System.out.println("Bukatua!");
	}
}

class KronoAppBi {
	public static void main (String args[]){
		Krono2 k = new Krono2();
		k.start();
	}
}