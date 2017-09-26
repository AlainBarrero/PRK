package ehu;

/**  Buffer mugatua - 2.Eredua: Semaforoekin */
class Buffer2App{
    final static int bufferTamaina=5;
    public static void main (String args[]){
    	/**
    	Izenburua: SemaBuffer
    	Describapena: semaforoaren eredua bufferrarekin
    	Egilea: Alain Barrero
    	Data: 2016/10/29
    	**/
    	
        System.out.println("Idazlea\t\tBufferra\t\tIrakurlea");
        System.out.println("===================================================");
        SemaBuffer sem = new SemaBuffer(bufferTamaina);
        Idazlea id = new Idazlea(sem);
        Irakurlea irak = new Irakurlea(sem);
        id.start();
        irak.start();
    }
}