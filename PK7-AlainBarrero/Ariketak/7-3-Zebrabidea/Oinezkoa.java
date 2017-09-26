package ehu;

public class Oinezkoa extends Thread{
	Zebrabidea zebrabidea;
	private int id;
	
	Oinezkoa(int id, Zebrabidea zebrabidea){
		this.zebrabidea = zebrabidea;
		this.id = id;
	}
	
	//PROZESUA = (iritsi ->sartu ->irten	->PROZESUA).
	public void run() {
		try {
			while(true) {
				sleep((long) (Math.random() * 3000));
				zebrabidea.iritsiOinezkoa(id);
				sleep((long) (Math.random() * 1000));
				zebrabidea.zeharkatuOinezkoa(id);
				sleep((long) (Math.random() * 1000));
				zebrabidea.irtenOinezkoa(id);
				sleep((long) (Math.random() * 1000));
			}
		} catch (InterruptedException e){}
	}
}
