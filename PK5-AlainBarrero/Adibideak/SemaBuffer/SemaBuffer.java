package ehu;

class SemaBuffer{
    private int tam;
    private int in=0, out=0;
    private char[] buf;
    Semaforo okupatuak; /** item kopurua zenbatzen du*/
    Semaforo libreak; /** toki kopurua zenbatzen du*/
    SemaBuffer(int size){
        this.tam = size;
        buf = new char[size];
        for (int i=0; i<size; i++)
            buf[i] = ' ';
        okupatuak = new Semaforo(0);
        libreak = new Semaforo(tam);
    }
 
    public void erakutsi(){
        System.out.print("\t\t|");
        for (int i=0; i<this.tam; i++)
            System.out.print(buf[i]+"|");
        System.out.print("\n");
    }
 
    public void put(char c) throws InterruptedException {
            libreak.behera();
            synchronized(this){
            	buf[in]=c; 
                in=(in+1)%tam;
                erakutsi();
            }
            okupatuak.gora();
    }
    public char get() throws InterruptedException {
            okupatuak.behera();
            char c=buf[out];
            synchronized(this){
            	 buf[out]=' ';
                 out=(out+1)%tam;
                 erakutsi();
            }
            libreak.gora();
            return (c);
            }    
}
