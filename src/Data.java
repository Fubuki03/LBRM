import java.util.ArrayList;

public class Data {
private static ArrayList<Angestellter> userlist = new ArrayList<Angestellter>();
private static String[] Groups = {"Poduktions", "Forschung", "Lieferanten"};

	public static void InsertPerson(Angestellter A ) {
		userlist.add(A);
	}

	public static String[] getGroups() {
		return Groups;
	}
		
}
