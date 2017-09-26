package ehu;

public class Zebrabidea {
	
	private int oi = 0; 	//oi --> zebrabidean sartzeko itsoiten dauden pertsona kopurua
	private int ki = 0;		//ki --> zebrabidean sartzeko itsoiten dauden kotxe kopurua
	private int ks = 0;		//ks --> zebrabidean dauden kotxeen kontagailua
	private int os = 0;		//os --> zebrabidean dauden oinezkoen kontagailua
	private int tx = 0;		//tx --> txandak kontrolatuko dituen aldagaia
	
	
	//oinezkoa[ID].iritsi -> ZEBRABIDEA[oi+1][os][ki][ks][tx]
	public synchronized void iritsiOinezkoa(int id) throws InterruptedException{
		oi = oi + 1;
		Pantaila.ekintzaOinezkoa(id, "iritsi", ks, os, ki, oi, tx);
		notifyAll();
	}

	//when ((ks==0 && ki<3)|| (ks==0 && ki>2 && tx==Onz)) oinezkoa[ID].sartu -> if(ki>2)then ZEBRABIDEA[oi-1][os+1][ki][ks][Ktx]
	//																			else		ZEBRABIDEA[oi-1][os+1][ki][ks][tx]
	public synchronized void zeharkatuOinezkoa(int id) throws InterruptedException{
		while(!((ks==0 && ki<3)||(ks==0 && ki>2 && tx==0))) wait();
		if(ki>2){
			oi = oi - 1;
			os = os + 1;
			Pantaila.ekintzaOinezkoa(id, "sartu", ks, os, ki, oi, tx);
			tx = 1;
		}else{
			oi = oi - 1;
			os = os + 1;
			Pantaila.ekintzaOinezkoa(id, "sartu", ks, os, ki, oi, tx);
		}
		notifyAll();
	}

	//oinezkoa[ID].irten -> ZEBRABIDEA[oi][os-1][ki][ks][tx]
	public synchronized void irtenOinezkoa(int id) throws InterruptedException{
		os = os - 1;
		Pantaila.ekintzaOinezkoa(id, "irten", ks, os, ki, oi, tx);
		notifyAll();
	}
	
	//kotxea[ID].iritsi	-> ZEBRABIDEA[oi][os][ki+1][ks][tx]
	public synchronized void iritsiKotxe(int id) throws InterruptedException{
		ki = ki + 1;
		Pantaila.ekintzaKotxea(id, "iritsi", ks, os, ki, oi, tx);
		notifyAll();
	}
	
	//when (os==0 && (oi==0 || (ki>2 && tx==Ktx))) kotxea[ID].sartu -> 	if(ki>2)then ZEBRABIDEA[oi][os][ki-1][ks+1][Onz]
	//																	else		 ZEBRABIDEA[oi][os][ki-1][ks+1][tx]
	public synchronized void zeharkatuKotxea(int id) throws InterruptedException{
		while(!(os==0 && (oi==0 || (ki>2 && tx==1)))) wait();
		if(ki>2){
			ki = ki - 1;
			ks = ks + 1;
			Pantaila.ekintzaKotxea(id, "sartu", ks, os, ki, oi, tx);
			tx = 0;
		}else{
			ki = ki - 1;
			ks = ks + 1;
			Pantaila.ekintzaKotxea(id, "sartu", ks, os, ki, oi, tx);
		}
		notifyAll();
	}
	
	//kotxea[ID].irten 	-> ZEBRABIDEA[oi][os][ki][ks-1][tx]
	public synchronized void irtenKotxea(int id) throws InterruptedException{
		ks = ks - 1;
		Pantaila.ekintzaKotxea(id, "irten", ks, os, ki, oi, tx);
		notifyAll();
	}
}
