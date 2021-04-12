import java.util.ArrayList;

public class Data {

	private static Data instance;
	private ArrayList<Angestellter> userlist = new ArrayList<Angestellter>();
	private ArrayList<Arbeitsgruppe> Arbeitsgruppe = new ArrayList<Arbeitsgruppe>();
	
	private Data() {
		Arbeitsgruppe.add(new Arbeitsgruppe ( "Labor", "Zuständig für die Erforschung neuer Produkte und Aufdecken Sicherheitsrisiken alter Produkten."));
		Arbeitsgruppe.add(new Arbeitsgruppe ( "Produktion", "Zuständig für die Produktion der ware"));
		Arbeitsgruppe.add(new Arbeitsgruppe ( "Liferanten", "Zuständig für die Auslieferung"));
	}


	public static synchronized Data getInstance() {
		if (instance == null) {
			instance = new Data();
		}
		return instance;
	}

	
	public void InsertPerson(Angestellter A) {
		userlist.add(A);
	}
	
	public ArrayList<Angestellter> getAllUsers() {
		return userlist;
	}
	
	public ArrayList<Arbeitsgruppe> getGroups() {
		return Arbeitsgruppe;
	}

}
