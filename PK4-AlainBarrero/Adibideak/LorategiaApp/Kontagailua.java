package ehu;

class Kontagailua {
	int balioa=0;

	Kontagailua() {
		System.out.println("\t\tguztira:"+balioa);
	}

	void gehitu() {
		int lag;
		lag=balioa; //balioa irakurri
		Simulatu.HWinterrupt();
		balioa=lag+1; //balioa idatzi
		System.out.println("\t\tguztira:"+balioa);
	}
}