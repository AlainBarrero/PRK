package ehu;

public class KotxeAnimatuak  {
	
	public static void main (String args[]) {
		
		/**
		 * @Izenburua: KotxeAnimatuak
		 * @Describapena: KotxeAnimatuak javaz
		 * @Egilea: Alain Barrero
		 * @Data: 2016/09/26
		 */
	
		Framea framea = new Framea();
		framea.setVisible(true);
		
		Kotxea k1 = new Kotxea(1, 400, -1, framea);
		Kotxea k2 = new Kotxea(2, 50, 1, framea);
						
		k1.start();
		k2.start();
	}
}



