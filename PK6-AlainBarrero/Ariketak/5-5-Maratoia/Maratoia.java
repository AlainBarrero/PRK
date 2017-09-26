package ehu;

public class Maratoia {
	
	int lagun 	= 0;
	int kontrol = 0;

	/*
	 * when(k==0) p[PR].hasi -> if (l==4) then 	MARATOIA[0][1]
	 *							else		   	MARATOIA[l+1][0]
	 */
	public synchronized void hasi(int id) throws InterruptedException{
		while(!(kontrol==0)) wait();
		//Margotu hasi pantailan
		Pantaila.margotuHasi(id);
		if(lagun == 4){
			lagun = 0;
			kontrol = 1;
		}else{
			lagun = lagun + 1;
			kontrol = 0;
		}
		notifyAll();
	}
	
	/*
	 * when(k==1) p[PR].korrikaEgin -> 	if (l==4) then 	MhenARATOIA[0][2]
	 *									else	 		MARATOIA[l+1][1]
	 */
	public synchronized void korrikaEgin(int id) throws InterruptedException{
		while(!(kontrol==1)) wait();
		//Margotu korrikaEgin pantailan
		Pantaila.margotuKorrikaEgin(id);
		if(lagun == 4){
			lagun = 0;
			kontrol = 2;
		}else{
			lagun = lagun + 1;
			kontrol = 1;
		}
		notifyAll();
	}
	
	/*
	 * when(k==2) p[PR].igeriEgin -> if (l==4) then 	MARATOIA[0][3]
	 *								 else		   		MARATOIA[l+1][2]
	 */
	public synchronized void igeriEgin(int id) throws InterruptedException{
		while(!(kontrol==2)) wait();
		//Margotu igeriEgin pantailan
		Pantaila.margotuIgeriEgin(id);
		if(lagun == 4){
			lagun = 0;
			kontrol = 3;
		}else{
			lagun = lagun + 1;
			kontrol = 2;
		}
		notifyAll();
	}
	
	/*
	 * when(k==3) p[PR].txirrinduanIbili -> if (l==4) then 	MARATOIA[0][4]
	 *										else		   	MARATOIA[l+1][3]
	 */
	public synchronized void txirrinduanIbili(int id) throws InterruptedException{
		while(!(kontrol==3)) wait();
		//Margotu txirrinduanIbili pantailan
		Pantaila.margotuTxirrinduanIbilia(id);
		if(lagun == 4){
			lagun = 0;
			kontrol = 4;
		}else{
			lagun = lagun + 1;
			kontrol = 3;
		}
		notifyAll();
	}
	
	/*
	 *when(k==4) p[PR].bukatu  -> 	if (l==4) then 	MARATOIA[0][0]
	 *								else		   	MARATOIA[l+1][4] 
	 */
	public synchronized void bukatu(int id) throws InterruptedException{
		while(!(kontrol==4)) wait();
		//Margotu bukatu pantailan
		Pantaila.margotuBukatu(id);
		if(lagun == 4){
			lagun = 0;
			kontrol = 0;
		}else{
			lagun = lagun + 1;
			kontrol = 4;
		}
		notifyAll();
	}
}
