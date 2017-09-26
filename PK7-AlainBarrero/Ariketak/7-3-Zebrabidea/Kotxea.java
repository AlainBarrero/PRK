package ehu;

public class Kotxea extends Thread{
	Zebrabidea zebrabidea;
	private int id;
	
	Kotxea(int id, Zebrabidea zebrabidea){
		this.zebrabidea = zebrabidea;
		this.id = id;
	}
	
	//PROZESUA = (iritsi ->sartu ->irten	->PROZESUA).
	public void run() {
		try {
			while(true) {
				sleep((long) (Math.random() * 1000));
				zebrabidea.iritsiKotxe(id);
				sleep((long) (Math.random() * 1000));
				zebrabidea.zeharkatuKotxea(id);
				sleep((long) (Math.random() * 1000));
				zebrabidea.irtenKotxea(id);
				sleep((long) (Math.random() * 3000));
			}
		} catch (InterruptedException e){}
	}
}
