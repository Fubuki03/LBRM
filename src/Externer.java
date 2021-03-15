
public class Externer extends Angestellter {
	private int extnr;
	
	public Externer(String name, String Vorname, String EMail, String Telefon, String Wohnort, String Geburtsjahr,
			Arbeitsgruppe Arbeitsgruppe, int extnr) {
		super(name, Vorname, EMail, Telefon, Wohnort, Geburtsjahr, Arbeitsgruppe);
		this.extnr = extnr;
		
	}

	public int getExtnr() {
		return extnr;
	}

	public void setExtnr(int extnr) {
		this.extnr = extnr;
	}
		
	

}
