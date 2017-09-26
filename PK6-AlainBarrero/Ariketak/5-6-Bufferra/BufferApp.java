package ehu;

public class BufferApp {

	public static void main(String[] args) {
		/**
		 * @Izenburua: Buffer Mugatua
		 * @Describapena: 
		 * 					6. Egokitu buffer mugatuaren FSP eredua,
		 *						• put eta get egitean, jarri eta hartu behar den posizioa adierazteko
		 * @Egilea: Alain Barrero
		 * @Data: 2016/10/22
		 */
		
		Buffer b = new Buffer(5);
		Pantaila p = new Pantaila();
		
		p.hasieratu();
		
		Idazlea idaz = new Idazlea(b);
		Irakurlea irak = new Irakurlea(b);
		
		idaz.start();
		irak.start();
	}

}
