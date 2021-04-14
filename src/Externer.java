
public class Externer extends Angestellter {
	private int extnr;
	
	public Externer(String name, String Vorname, String EMail, String Telefon, String Wohnort, String Geburtsjahr,
			Arbeitsgruppe Arbeitsgruppe, int extnr, Boolean External) {
		super(name, Vorname, EMail, Telefon, Wohnort, Geburtsjahr, Arbeitsgruppe, External);
		this.extnr = xtnr;
		
	}

	public int getExtnr() {
		return extnr;
	}

	public void setExtnr(int extnr) {
		this.extnr = extnr;
	}
		
	

}
