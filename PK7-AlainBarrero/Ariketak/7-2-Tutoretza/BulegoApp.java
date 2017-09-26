package ehu;

public class BulegoApp {
	final static int Ikasleak = 7;
	
	public static void main(String[] args) {
		/**
		Izenburua: Tutoretza
		Describapena:
						2. Konkurrenteko ikasleek azterketa garaian ikasten egoten dira (suposatzen da):
							• Ikasleek zerbait ez badute ulertzen irakaslearen bulegora joaten dira, bulegoan sartu, galdera egin 
							eta erantzuna jaso ondoren bulegotik ateratzen dira, berriz ikastera joateko.
							• Irakasleak, ikasle batek galdera bat egiten dionean, erantzun baino lehen
							pentsatu egiten du (suposatzen da).
							• Gainera irakaslea nahiko berezia denez, tutoretzetarako ondoko arauak ditu:
								◦ Bulegoan bi ikasle batera egon daitezke, baina ez gehiago.
								◦ Ikasle batek egin duen galdera erantzun arte, besteak ezin du galdetu.
								◦ Ikasle bakoitzak galdera bakar bat egin dezake tutoretza bakoitzean.
								◦ Bulegoan sartzeko eta galdera egiteko ez da errespetatzen aurretik zein zegoen.
		**/
		
		//Pantaila sortzen dugu bertan datuak ikusi ahal izateko
		Pantaila p = new Pantaila();
		p.hasieratu();
				
		//Ikasleak sortzego 
		Ikaslea ikasleak[] = new Ikaslea[Ikasleak];
				
		//Bulegoa sortu
		Bulegoa b = new Bulegoa();
				
		//Irakaslea sortu eta hasiera heman
		Irakaslea irakaslea = new Irakaslea(b);
		irakaslea.start();
				
		//Ikasleak sortu eta hasaiera hematen diegu
		for(int i = 0; i<Ikasleak; i++){
			ikasleak[i] = new Ikaslea(i, b);
		}
		for(int j = 0; j<Ikasleak; j++){
			ikasleak[j] .start();
		}
	}

}
