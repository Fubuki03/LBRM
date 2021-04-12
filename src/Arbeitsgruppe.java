
public class Arbeitsgruppe {
	private String Name;
	private String Beschreibung;
	
	public Arbeitsgruppe (String Name, String Beschreibung) {
		this.Name = Name;
		this.Beschreibung = Beschreibung;
	}
	
	
	
	@Override
	public String toString() {
		return Name;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBeschreibung() {
		return Beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		Beschreibung = beschreibung;
	}
	
	

}
