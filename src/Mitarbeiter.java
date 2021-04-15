
public class Mitarbeiter extends Angestellter {

	private String Username;
	private String Password;
	private int Vertragsnr;

	public Mitarbeiter(String name, String Vorname, String EMail, String Telefon, String Wohnort, int ID, String Geburtsjahr, Arbeitsgruppe Arbeitsgruppe, Boolean External, String Username, String Password, int Vertragsnr) {
		super(name, Vorname, EMail, Telefon, Wohnort, ID, Geburtsjahr, Arbeitsgruppe, External);
		this.Username = Username;
		this.Password = Password;
		this.Vertragsnr = Vertragsnr; 
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getVertragsnr() {
		return Vertragsnr;
	}

	public void setVertragsnr(int vertragsnr) {
		Vertragsnr = vertragsnr;
	}
	
	

}
