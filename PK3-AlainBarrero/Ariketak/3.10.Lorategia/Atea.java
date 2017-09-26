package ehu;

class Atea extends Thread {
    private Kontrolagailua kont;
    private String atea;
   
    public Atea(String atea, Kontrolagailua k) {
        this.kont = k;
        this.atea = atea;
    }

    public void run() {
        while (kont.getKont()<9) {
            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {

            }
            System.out.println(atea);
            kont.gehitu();
            kont.imprimatu();
        }
    }
}