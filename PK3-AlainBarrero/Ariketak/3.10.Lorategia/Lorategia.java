package ehu;

public class Lorategia {

    public static void main(String[] args) {
    	/**
		 * @Izenburua: Lorategia
		 * @Describapena: Lorategia
		 * @Egilea: Alain Barrero
		 * @Data: 2016/09/26
		 */
    	
        System.out.println("Atea1 \t Atea2 \t\t Kontadorea");
        Kontrolagailua kont = new Kontrolagailua();
        
        Atea a1 = new Atea("sartu 1", kont);
        Atea a2 = new Atea("\t sartu 2", kont);
        
        a1.start();
        a2.start();
    }

}