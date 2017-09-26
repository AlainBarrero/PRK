package ehu;

public class Kontroladorea {
	
	int sanPedro 	= 0;	//sp: San Pedron dauden pertsona kopurua.
	int sanJuan 	= 0;	//sj: San Juanen dauden pertsona kopurua.
	int txalupaKop	= 0;	//tx: Txalupan dauden pertsona kopurua.
	int txalupaNon	= 0;	//nt: Txalupa non dagoen: 0 (San Pedron), 1 (San Juanen).
	int txalupaIts	= 0;	//ib: Txalupa itsasoan dagoen ala ez. 1 itsasoan, 0 lurran.
	int pertsonaJei	= 0;	//pb: Pertsonak jeisten dagoen ala ez jakiteko
	
	//when (sp < EK) {p[PR]}.iritsiSP -> PASAIA [sp+1][sj][tx][nt][ib][pb]
	public synchronized void iritsiSanPedro(Framea framea) throws InterruptedException{
		while(!(sanPedro<NagusiApp.PortuKopurua)) wait();
		sanPedro = sanPedro + 1;
		//framea.panela.iritsiSanPedro(sanPedro);
		notifyAll();
	}
	
	//when (sj < EK) {p[PR]}.iritsiSJ -> PASAIA [sp][sj+1][tx][nt][ib][pb]
	public synchronized void iritsiSanJuan(Framea framea) throws InterruptedException{
		while(!(sanJuan<NagusiApp.PortuKopurua)) wait();
		sanJuan = sanJuan + 1;
		//framea.panela.iritsiSanJuan(sanJuan);
		notifyAll();
	}
	
	//when (tx < TK && nt == SP && pb == 0) {p[PR]}.igoSP -> PASAIA [sp-1][sj][tx+1][nt][ib][pb]
	public synchronized void igoSanPedro(Framea framea) throws InterruptedException{
		while(!(txalupaKop<NagusiApp.TxalupaSartu && txalupaNon==NagusiApp.SanPedro && pertsonaJei==0)) wait();
		sanPedro = sanPedro - 1;
		txalupaKop = txalupaKop + 1;
		framea.panela.igoSanPedro(txalupaKop);
		notifyAll();
	}
	
	//when (tx < TK && nt == SJ && pb == 0) {p[PR]}.igoSJ -> PASAIA [sp][sj-1][tx+1][nt][ib][pb]
	public synchronized void igoSanJuan(Framea framea) throws InterruptedException{
		while(!(txalupaKop<NagusiApp.TxalupaSartu && txalupaNon==NagusiApp.SanJuan && pertsonaJei==0)) wait();
		sanJuan = sanJuan - 1;
		txalupaKop = txalupaKop + 1;
		framea.panela.igoSanJuan(txalupaKop);
		notifyAll();
	}
	
	//when (ib == 0 && nt == SJ && tx > 0) {p[PR]}.jeitsiSJ	-> 	if (tx > 1) then 	PASAIA [sp][sj][tx-1][nt][ib][1]
	//															else 				PASAIA[sp][sj][tx-1][nt][ib][0]
	public synchronized void jeitsiSanJuan(Framea framea) throws InterruptedException{
		while(!(txalupaIts==0 && txalupaNon==NagusiApp.SanJuan && txalupaKop>0)) wait();
		if(txalupaKop>1){
			//framea.panela.jeitsiSanJuan(txalupaKop);
			txalupaKop = txalupaKop - 1;
			pertsonaJei = 1;
		}else{
			//framea.panela.jeitsiSanJuan(txalupaKop);
			txalupaKop = txalupaKop - 1;
			pertsonaJei = 0;
		}
		notifyAll();
	}
	
	//when (ib == 0 && nt == SP && tx > 0) {p[PR]}.jeitsiSP	-> 	if (tx > 1) then 	PASAIA [sp][sj][tx-1][nt][ib][1]
	//															else 				PASAIA[sp][sj][tx-1][nt][ib][0]
	public synchronized void jeitsiSanPedro(Framea framea) throws InterruptedException{
		while(!(txalupaIts==0 && txalupaNon==NagusiApp.SanPedro && txalupaKop>0)) wait();
		if(txalupaKop>1){
			//framea.panela.jeitsiSanPedro(txalupaKop);
			txalupaKop = txalupaKop - 1;
			pertsonaJei = 1;
		}else{
			//framea.panela.jeitsiSanPedro(txalupaKop);
			txalupaKop = txalupaKop - 1;
			pertsonaJei = 0;
		}
		notifyAll();
	}
	
	//when ((tx == TK && pb == 0)|| (sj == EK && sp == 0 && pb == 0)) t.irtenSP	-> PASAIA [sp][sj][tx][nt][1][pb]
	public synchronized void irtenTxalupaSanPedro(Framea framea) throws InterruptedException{
		while(!((txalupaKop==NagusiApp.TxalupaSartu && pertsonaJei==0)
									||(sanJuan==NagusiApp.PortuKopurua && sanPedro==0 && pertsonaJei==0))) wait();
		txalupaIts = 1;
		framea.panela.irtenTxalupaSanPedro();
		notifyAll();
	}
	
	//when ((tx == TK && pb == 0)|| (sp == EK && sj == 0 && pb == 0)) t.irtenSJ -> PASAIA [sp][sj][tx][nt][1][pb]
	public synchronized void irtenTxalupaSanJuan(Framea framea) throws InterruptedException{
		while(!((txalupaKop==NagusiApp.TxalupaSartu && pertsonaJei==0)
									||(sanPedro==NagusiApp.PortuKopurua && sanJuan==0 && pertsonaJei==0))) wait();
		txalupaIts = 1;
		framea.panela.irtenTxalupaSanJuan();
		notifyAll();
	}
	
	//when (ib == 1 && nt == SP) t.iritsiSJ -> 	if (tx > 0) then 	PASAIA [sp][sj][tx][SJ][0][1]
	//											else 				PASAIA [sp][sj][tx][SJ][0][0]
	public synchronized void iritsiTxalupaSanJuan(Framea framea) throws InterruptedException{
		while(!(txalupaIts==1 && txalupaNon==NagusiApp.SanPedro)) wait();
		if(txalupaKop>0){
			txalupaNon = NagusiApp.SanJuan;
			txalupaIts = 0;
			pertsonaJei = 1;
		}else{
			txalupaNon = NagusiApp.SanJuan;
			txalupaIts = 0;
			pertsonaJei = 0;
		}
		notifyAll();
	}
	
	//when (ib == 1 && nt == SJ) t.iritsiSP	-> 	if (tx > 0) then 	PASAIA [sp][sj][tx][SP][0][1]
	//											else 				PASAIA [sp][sj][tx][SP][0][0]
	public synchronized void iritsiTxalupaSanPedro(Framea framea) throws InterruptedException{
		while(!(txalupaIts==1 && txalupaNon==NagusiApp.SanJuan)) wait();
		if(txalupaKop>0){
			txalupaNon = NagusiApp.SanPedro;
			txalupaIts = 0;
			pertsonaJei = 1;
		}else{
			txalupaNon = NagusiApp.SanPedro;
			txalupaIts = 0;
			pertsonaJei = 0;
		}
		notifyAll();
	}
}
