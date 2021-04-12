import java.util.ArrayList;

public class Actions {

	public void AddAngestellter(Angestellter A) {
		if (A.getExternal() == false) {
			Angestellter User = new Externer(null, null, null, null, null, null, null, 0, null);
			User = A;
			Data.getInstance().InsertPerson(User);
		} else {
			Angestellter User = new Mitarbeiter(null, null, null, null, null, null, null, null, null, 0, 0, null);
			User = A;
			Data.getInstance().InsertPerson(User);
		}
	}

	public static ArrayList<Arbeitsgruppe> getGroups() {
		return Data.getInstance().getGroups();

	}

	public static ArrayList<Angestellter> getAllUsers() {
		return Data.getInstance().getAllUsers();
	}

	public void DeleteUser(Angestellter A) {

	}

	public Angestellter FindUser(Angestellter A) {
		for (Angestellter element : Data.getInstance().getAllUsers()) {
			if (element.contains("Java")) {
				return element;
			}
		}

	}
}
