package ehu;

class Irakurlea extends Thread {
	Buffer buf;
	String alphabet= "abcdefghijklmnopqrstuvwxyz";
	
	Irakurlea(Buffer b) {buf = b;}
	
	public void run() {
		try {
			int ai = 0;
			while(true) {
				if (Math.random()<0.3) sleep(1000);
				//System.out.println("\t\t\t\t\t"+alphabet.charAt(ai)+">");
				buf.get(alphabet, ai);
				ai=(ai+1)%alphabet.length();
			}
		} catch (InterruptedException e){}
	}
}

