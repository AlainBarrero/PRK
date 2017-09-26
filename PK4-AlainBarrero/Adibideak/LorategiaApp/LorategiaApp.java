package ehu;

class LorategiaApp{
	public final static int MAX = 6;
	public static void main (String args[]) {
		System.out.println("LORATEGIA: return sakatu hasteko");
		try{int c = System.in.read();}catch(Exception ex){}
		Kontagailua k = new Kontagailua();
		Atea aurrekoa = new Atea("aur",k);
		Atea atzekoa = new Atea("\tatz",k);
		aurrekoa.start();
		atzekoa.start();
	}
}