
public abstract class Angestellter {

	private String Name;
	private String Vorname;
	private String EMail;
	private String Telefon;
	private String Wohnort;
	private int ID;
	private String Geburtsjahr;
	private Arbeitsgruppe Arbeitsgruppe;
	private Boolean External;

	public Angestellter(String name, String Vorname, String EMail, String Telefon, String Wohnort,int ID, String Geburtsjahr, Arbeitsgruppe Arbeitsgruppe, Boolean External) {
		this.Name = name;
		this.Vorname = Vorname;
		this.EMail = EMail;
		this.Telefon = Telefon;
		this.Wohnort = Wohnort;
		this.ID = ID;
		this.Geburtsjahr = Geburtsjahr;
		this.Arbeitsgruppe = Arbeitsgruppe;
		this.External = External;

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
	}

	public String getEMail() {
		return EMail;
	}

	public void setEMail(String eMail) {
		EMail = eMail;
	}

	public String getTelefon() {
		return Telefon;
	}

	public void setTelefon(String telefon) {
		Telefon = telefon;
	}

	public String getWohnort() {
		return Wohnort;
	}

	public void setWohnort(String wohnort) {
		Wohnort = wohnort;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getGeburtsjahr() {
		return Geburtsjahr;
	}

	public void setGeburtsjahr(String geburtsjahr) {
		Geburtsjahr = geburtsjahr;
	}

	public Arbeitsgruppe getArbeitsgruppe() {
		return Arbeitsgruppe;
	}

	public void setArbeitsgruppe(Arbeitsgruppe arbeitsgruppe) {
		Arbeitsgruppe = arbeitsgruppe;
	}

	public Boolean getExternal() {
		return External;
	}

	public void setExternal(Boolean external) {
		External = external;
	}

	


}
