
public class Mitarbeiter extends Angestellter {

	private String Username;
	private String Password;
	private int Mitarbnr;
	private int Vertragsnr;

	public Mitarbeiter(String name, String Vorname, String EMail, String Telefon, String Wohnort, String Geburtsjahr,
			Arbeitsgruppe Arbeitsgruppe, String username, String password, int mitarbnr, int vertragsnr, Boolean External) {
		super(name, Vorname, EMail, Telefon, Wohnort, Geburtsjahr, Arbeitsgruppe, External);
		this.Username = username;
		this.Password = password;
		this.Mitarbnr = mitarbnr;
		this.Vertragsnr = vertragsnr;
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

	public int getMitarbnr() {
		return Mitarbnr;
	}

	public void setMitarbnr(int mitarbnr) {
		Mitarbnr = mitarbnr;
	}

	public int getVertragsnr() {
		return Vertragsnr;
	}

	public void setVertragsnr(int vertragsnr) {
		Vertragsnr = vertragsnr;
	}

}
