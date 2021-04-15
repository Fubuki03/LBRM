import java.util.ArrayList;

public class Data {

	private static Data instance;
	private ArrayList<Angestellter> userlist = new ArrayList<Angestellter>();
	private ArrayList<Arbeitsgruppe> Arbeitsgruppe = new ArrayList<Arbeitsgruppe>();
	
	private Data() {
		Arbeitsgruppe.add(new Arbeitsgruppe ( "Labor", "Zust�ndig f�r die Erforschung neuer Produkte und Aufdecken Sicherheitsrisiken alter Produkten."));
		Arbeitsgruppe.add(new Arbeitsgruppe ( "Produktion", "Zust�ndig f�r die Produktion der ware"));
		Arbeitsgruppe.add(new Arbeitsgruppe ( "Liferanten", "Zust�ndig f�r die Auslieferung"));
	}


	public static synchronized Data getInstance() {
		if (instance == null) {
			instance = new Data();
		}
		return instance;
	}

	public void remove(Angestellter A) {
		userlist.remove(A);
	}

	public void update(Angestellter old_A, Angestellter new_A) {
		int index = userlist.indexOf(old_A);
		userlist.set(index, new_A);
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
