package ehu;

class Kontrolagailua {
    private int kont = 0;
    
    public int getKont(){
    	return kont;
    }
    
    public void gehitu() {
        kont++;
    }
    public void imprimatu() {
        System.out.println("\t\t\t" + kont);
    }
}