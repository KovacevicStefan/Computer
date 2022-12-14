package computer;

public class Computer {

	// OBELEZJA - MORAJU BITI PRIVATE A DODATNO MOGU BITI STATIC, FINAL, CONST
	
	private int ram;
	private String os;
	private boolean powerOn;
	
	
	// KONSTRUKTORI
	
	public Computer() {
		// DEFAULT KONSTRUKTOR - BEZ VREDNOSTI, NJEGA UVEK DEFINISEMO I ON SE KORISTI PRI KREIRANJU OBJEKTA U SLUCAJU DA OBJEKAT NE ZAHTEVA
		// PROMENU VREDNOSTI OBELEZJA
	}
	
	public Computer(int ram, String os, boolean powerOn) {
		// KONSTRUKTOR KOJIM DEFINISEMO/MENJAMO VREDNOSTI OBELEZJA OBJEKTA KOJI KREIRAMO. DAKLE, "this.os = os" ZNACI DA OBELEZJU "os"
		// DEFINISANOM GORE, DODELJUJEMO VREDNOSTI TAKO STO PRI KREIRANJU STAVIMO VREDNOST U ZAGRADU
		
		this.os = os;
		this.ram = ram;
		this.powerOn = powerOn;
	}
	
	// METODE - NJIHOVIM POZIVANJEM ILI MENJAMO VREDNOSTI OBELEZJA, ILI ISPISUJEMO NESTO, ILI POREDIMO DVA OBJEKTA...
	
	public void OnOff() {
		
		// OVA METODA KADA SE POZOVE SLUZI DA PROMENI VREDNOST OBELEZJA "powerOn". AKO JE VREDNOST TOG OBELEZJA true ON JE MENJA NA false
		
		if(powerOn == true) {
			this.powerOn = false;
		}else {
			this.powerOn = true;
		}
	}

	public void prikazKomponenti() {
		
		// OVU METODU SAM JA DODAO KAKO BIH LAKSE OBJASNIO. NJU KADA POZOVEMO ONA ISPISE RECENICU GDE PRIKAZE SVE VREDNOSTI
		
		System.out.println("Racunar ima " +ram + " GB RAM-a, koristi " +os +" operativni sistem, i ukljucen je - " +powerOn);
	}
	
	// GETERI I SETERI - METODE KOJE POSTAVLJAJU NOVU VREDNOST OBELEZJA (SETERI) I VRACAJU TRENUTNU VREDNOST (GETERI)
	// POSTO SU I ONI METODE, MOGUCE IH JE PROMENITI KAO DOLE, ALI TO NECE BITI NA TESTU
	
	public int getRam() {
		
		// OVAJ GETER KADA POZOVEMO U TEST KLASI ON NAM VRATI TRENUTNU VREDNOST TOG OBELEZJA
		
		return ram;
	}

	public void setRam(int ram) {

		// OVAJ SETER ZAHTEVA VREDNOST (KOJA SE UNOSI U ZAGRADAMA) I UKOLIKO TA VREDNOST NIJE JEDNA OD DOLE NAVEDENIH,
		// ISPISUJE SE DA VREDNOST NIJE PRIHVATLJIVA, I OBELEZJU SE DODELJUJE VREDNOST "4"
		
		if(ram == 2 || ram == 4 || ram == 8 || ram == 16 || ram == 32 || ram == 64 || ram == 128) {
			this.ram = ram;
		}else {
			System.out.println("Vrednost " +ram +" nije prihvatljiva");
			this.ram = 4;
		}
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		
		// OVAJ SETER RADI ISTU STVAR KAO SETER ZA RAM, SAMO SA OPERATIVNIM SISTEMIMA
		
		if(os == "Windows" || os == "Linux" || os == "Mac") {
			this.os = os;
		}else {
			System.out.println("Operativni sistem " +os +" nije moguce izabrati");
			this.os = "built-in";
		}
	}

	public boolean isPowerOn() {
		return powerOn;
	}

	public void setPowerOn(boolean powerOn) {
		
		// OVAJ SETER JE KLASICAN SETER. VREDNOST SE PRI POZIVANJU UNESE U ZAGRADU, I OBELEZJE DOBIJE TU VREDNOST
		
		this.powerOn = powerOn;
	}
	
	
	
}
