package ehu;

class Atea extends Thread {
	Kontagailua jendea;
	String atearenIzena;

	public Atea (String zeinAte, Kontagailua k){
		jendea=k;
		atearenIzena = zeinAte;
	}

	public void run() {
		try{
			System.out.println(atearenIzena+">"+0);
			for (int i=1;i<=LorategiaApp.MAX;i++){
				Thread.sleep(1000); //segundu bat itxaron
				System.out.println(atearenIzena+">"+i);
				jendea.gehitu();
			}
		} catch (InterruptedException e) {}
	}
}