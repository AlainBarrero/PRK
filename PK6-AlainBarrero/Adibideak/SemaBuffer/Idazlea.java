package ehu;

class Idazlea extends Thread {
    SemaBuffer buf;
    String alphabet ="abcdefghijklmnopqrstuvwxyz";
 
    Idazlea(SemaBuffer b) {buf = b;}
 
    public void run(){
        try{
            int ai = 0;
            while (true){
                if (Math.random()<0.3)
                    sleep(1000);
                System.out.println(alphabet.charAt(ai)+">");
                buf.put(alphabet.charAt(ai));
                ai=(ai+1) % alphabet.length();
            }
        }
        catch (InterruptedException e){}
    }
}

