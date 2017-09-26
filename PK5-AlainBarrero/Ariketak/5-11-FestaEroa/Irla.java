package ehu;

public class Irla {
	
	int hon = 0;
	int hoz = 0;
	int lap = 0;
	int blk = 0;
	
	//when(hon<HK) t.iritsi[i:1..HK-hon] ->IRLA[hon+i][hoz][lap][blk]
	public synchronized void iritsi(int misioilari) throws InterruptedException{
		while(!(hon<FestaEroaApp.Hondartza)) wait();
		hon = hon + misioilari;
		//Margotu pantailan iritsi
		Pantaila.margotuEkintza(lap, hoz, hon, "iritsi." + misioilari, " \t\t\t\t\t", "");
		notifyAll();
	}
	
	//when(hoz+HS<ZK && hon>0)	s.hozkailura ->IRLA[hon-1][hoz+HS][lap][blk]
	public synchronized void hozkailuan() throws InterruptedException{
		while(!(hoz+FestaEroaApp.HozkiluPuska<FestaEroaApp.Hozkailua && hon>0)) wait();
		hon = hon - 1;
		hoz = hoz + FestaEroaApp.HozkiluPuska;
		//Margotu pantailan hozkailua
		Pantaila.margotuEkintza(lap, hoz, hon, "hozkailura", "\t", "\t\t\t\t");
		notifyAll();
	}
	
	//when(lap<LK && hoz>0)	s.bota[b:1..LK]	->IRLA[hon][hoz-b][lap+b][blk]
	public synchronized void bota(int bota) throws InterruptedException{
		while(!(lap<FestaEroaApp.Lapikoa && hoz>0)) wait();
		hoz = hoz - bota;
		lap = lap + bota;
		//Margotu pantailan bota
		Pantaila.margotuEkintza(lap, hoz, hon, "bota."+bota, "\t\t", "\t\t\t\t");
		notifyAll();
	}
	
	//when(lap>0) b[BR].hartu[h:1..lap]	->IRLA[hon][hoz][lap-h][blk]
	public synchronized void hartu(int id, int hartu) throws InterruptedException{
		while(!(lap>0)) wait();
		lap = lap - hartu;
		//Margotu pantailan hartu
		Pantaila.hartu(id, hartu);
		notifyAll();
	}
	
	//when (blk==0)	s.begiratu[hon][hoz][lap] -> IRLA[hon][hoz][lap][1]
	public synchronized int[] begiratu() throws InterruptedException{
		blk = 1;
		int[] begiratu = new int[3];
		begiratu[0] = hon;
		begiratu[1] = hoz;
		begiratu[2] = lap;
		//Margotu pantailan begiratu
		Pantaila.begiratu(begiratu);
		notifyAll();
		return begiratu;
	}
	
	//when (blk==0)	b[BR].begiratu[lap] -> IRLA[hon][hoz][lap][1]
	public synchronized int begiratuLap(int id) throws InterruptedException{
		blk = 1;
		Pantaila.begiratuLap(id, lap);
		notifyAll();
		return lap;
	}
	
	//when (blk==0)	t.begiratu[hon] -> IRLA[hon][hoz][lap][1]
	public synchronized int begiratuHon() throws InterruptedException{
		blk = 1;
		Pantaila.begiratuHon(hon);
		notifyAll();
		return hon;
	}
	
	//{b[BR],s,t}.askatu -> IRLA[hon][hoz][lap][0]
	public synchronized void askatu() throws InterruptedException{
		blk = 0;
		notifyAll();
	}

}
