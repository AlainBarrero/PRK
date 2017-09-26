package ehu;


public class Basatia extends Thread{
	Kontrola lapikoa;
	private int id;
	
	Basatia(int id, Kontrola l){
		lapikoa = l;
		this.id = id;
	}
	
	//BASATIA = ( hartu -> jan 	-> tripazgora -> BASATIA).
	public void run() {
		while (true) {
			try {		
				lapikoa.hartu(id, "hartu");
				sleep((long) (Math.random() * 3000));
				Pantaila.margotu(id,"jan");
				sleep((long) (Math.random() * 3000));
				Pantaila.margotu(id,"etzan");
				sleep((long) (Math.random() * 3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
