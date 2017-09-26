package aparkalekua;

class AparkalekuaApp{
	final static int Plazak = 4;

	public static void main (String args[]) {
		/**
		 * @Izenburua: Aparkalekua
		 * @Describapena: Aparkaleku baten konkurrentzia
		 * @Egilea: Alain Barrero
		 * @Data: 2016/09/26
		 */
		
		Kontrolatzailea k = new Kontrolatzailea (Plazak);
		Sarrerak sar = new Sarrerak(k);
		Irteerak irt = new Irteerak(k);
		sar.start();
		irt.start();
	}
}