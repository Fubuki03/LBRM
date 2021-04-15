import java.util.ArrayList;

public class Actions {

	public static boolean AddAngestellter(Angestellter A) {
		if (A.getExternal() == false) {
			Angestellter User = new Externer(null, null, null, null, null, 0, null, null, null, null);
			User = A;
			Data.getInstance().InsertPerson(User);
			return(true);
		} else {
			Angestellter User = new Mitarbeiter(null, null, null, null, null, 0, null, null, null, null, null, 0);
			User = A;
			Data.getInstance().InsertPerson(User);
			return(true);
		}
	}

	public static ArrayList<Arbeitsgruppe> getGroups() {
		return Data.getInstance().getGroups();

	}

	public static ArrayList<Angestellter> getAllUsers() {
		return Data.getInstance().getAllUsers();
	}

	public void DeleteUser(Angestellter A) {
		Data.getInstance().remove(A);
	}

	public void UpdateUser(Angestellter A) {
		
	}

	public static void search(String Suche) {

	}

	public Angestellter GetUserbyID(int ID) {
		ArrayList<Angestellter> Userlist = Data.getInstance().getAllUsers();
		for (Angestellter element : Userlist){
			if (element.getID() == ID){
				  return element;
			}
		}
		Angestellter A = new Mitarbeiter(null, null, null, null, null, ID, null, null, null, null, null, ID);
		return A;
		
	}

	/*
	 * public Angestellter FindUser(Angestellter A) { for (Angestellter element :
	 * Data.getInstance().getAllUsers()) { if (element.contains("Java")) { return
	 * element; } }
	 * 
	 * }
	 */
}
