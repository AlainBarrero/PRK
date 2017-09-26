package ehu;

public class SemaforoApp {

	public static void main(String[] args) {
		System.out.println("\t1\t2\t3");
		System.out.println("============================");
		Semaforo s = new Semaforo(1);
		MutexLoop ml1 = new MutexLoop(s, 1, "\t");
		MutexLoop ml2 = new MutexLoop(s, 2, "\t\t");
		MutexLoop ml3 = new MutexLoop(s, 3, "\t\t\t");
		
		ml1.start();
		ml2.start();
		ml3.start();

	}

}
