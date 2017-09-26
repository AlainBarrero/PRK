package ehu;

public class Lagunak extends Thread{
	Maratoia maratoia;
	private int id;
	
	Lagunak(int id, Maratoia maratoia){
		this.maratoia = maratoia;
		this.id = id;
	}
	
	//LAGUNAK = (hasi ->korrikaEgin ->igeriEgin ->txirrinduanIbili  ->bukatu ->LAGUNAK).
	public void run() {
		try {
			while(true) {
				maratoia.hasi(id);
				sleep((long) (Math.random() * 3000));
				maratoia.korrikaEgin(id);
				sleep((long) (Math.random() * 3000));
				maratoia.igeriEgin(id);
				sleep((long) (Math.random() * 3000));
				maratoia.txirrinduanIbili(id);
				sleep((long) (Math.random() * 3000));
				maratoia.bukatu(id);
				sleep((long) (Math.random() * 3000));
			}
		} catch (InterruptedException e){}
	}
}
