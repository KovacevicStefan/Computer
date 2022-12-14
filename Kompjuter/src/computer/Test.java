package computer;

public class Test {

	public static void main(String[] args) {

		// OBJEKAT SE KREIRA TAKO STO UKUCAMO PRVO IME KLASE CIJI OBJEKAT KREIRAMO (U OVOM SLUCAJU "Computer"), DAMO NAZIV OBJEKTU ("c"),
		// ZATIM "new" PA "Computer(unutar zagrada dodeljujemo vrednosti obelezjima)" - OVO JE KONSTRUKTOR!
		
		Computer c = new Computer(8, "Windows", false);
		Computer c1 = new Computer();
		c1.setOs("Linux");
		c1.setPowerOn(false);
		c1.OnOff();
		c1.setRam(8);
		c1.prikazKomponenti();
		// SADA CU POZVATI METODU prikazKomponenti KOJA CE DA ISPISE VREDNOSTI OBELEZJA OBJEKTA KOJE SMO UNELI PREKO KONSTRUKTORA
		// METODU POZIVAMO OVAKO: "nazivObjekta.metoda()". U OVOM SLUCAJU NAZIV OBJEKTA JE "c", A METODA JE "prikazKomponenti()" 
		c.prikazKomponenti();
		
		// SAD POZIVAM "OnOff" METODU KOJA SLUZI DA PROMENI VREDNOST "powerOn" SA TRUE NA FALSE I OBRNUTO
		c.OnOff();
		
		// SADA KAD PONOVO POZOVEM METODU KOJA PRIKAZUJE VREDNOSTI OBELEZJA, VREDNOST "OnOff" KOJU SMO DEFINISALI U KONSTRUKTORU SADA TREBA
		// DA BUDE OBRNUTA OD UNETE
		c.prikazKomponenti();
		
		// AKO POZOVEM SETERE ZA OS I RAM I UNUTAR NJIH DODELIM NOVE VREDNOSTI RAMA I OS, KADA PONOVO POZOVEM METODU ZA PRIKAZ KOMPONENTI,
		// KOMPOMENTE SADA TREBA DA IMAJU VREDNOSTI NA KOJE SMO IH "SETOVALI"
		c.setOs("Mac");
		c.setRam(128);
		c.prikazKomponenti();
		
		// AKO ZELIMO DA VIDIMO SAMO VREDNOST JEDNE OD KOMPONENTI, ONDA UNUTAR "System.out.println" POZOVEMO GETER
		System.out.println(c.getOs());
		
		// KAD PREKO SETERA DODELIM DRUGU VREDNOST, GETER CE NAM VRATITI TU VREDNOST
		c.setOs("Linux");
		System.out.println(c.getOs());
	}

}
