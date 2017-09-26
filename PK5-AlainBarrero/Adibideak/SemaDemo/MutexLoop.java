package ehu;

class MutexLoop extends Thread {
	Semaforo mutex;
	String tartea;
	int luze;
	
	MutexLoop (Semaforo sema, int zenbat, String tabul) {
		mutex=sema; luze=zenbat; tartea=tabul;
	}
	
	public void run(){
		try {while(true) {
			for (int i=1;i<=6;i++) bisualizatu("|");
			mutex.behera(); // eskuratu elkar-bazterketa
			for (int i=1;i<=luze;i++) bisualizatu("*");// Ekintza kritikoa
			mutex.gora(); // askatu elkar-bazterketa
		}
		} catch(InterruptedException e){}
	}
	
	void bisualizatu(String ikurra) {
		try {System.out.println(tartea+ikurra);
		sleep((int)(Math.random()*1000));
		}catch (InterruptedException e) {}
	}
}