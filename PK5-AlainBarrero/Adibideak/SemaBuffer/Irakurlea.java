package ehu;

class Irakurlea extends Thread {
    SemaBuffer buf;
 
    Irakurlea(SemaBuffer b) {buf = b;}
 
    public void run(){
        try{
            while (true){
                if (Math.random()<0.3)
                    sleep(1000);
                char c =buf.get();
                System.out.println("\t\t\t\t\t\t"+c+">");
            }
        }
        catch (InterruptedException e){}
    }
}

