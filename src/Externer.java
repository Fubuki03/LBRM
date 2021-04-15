
public class Externer extends Angestellter {
	
	private String Contractor;
	
	public Externer(String name, String Vorname, String EMail, String Telefon, String Wohnort, int ID,
			String Geburtsjahr, Arbeitsgruppe Arbeitsgruppe, Boolean External, String Contractor) {
		super(name, Vorname, EMail, Telefon, Wohnort, ID, Geburtsjahr, Arbeitsgruppe, External);
		this.Contractor = Contractor;
	}


	public String getContractor() {
		return Contractor;
	}

	public void setContractor(String Contractor) {
		this.Contractor = Contractor;
	}
		
	

}
