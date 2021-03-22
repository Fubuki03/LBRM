import java.util.ArrayList;

public class Actions {

	public void AddAngestellter(Angestellter A) {
		if (A.getExternal() == false) {
			Angestellter User = new Externer(null, null, null, null, null, null, null, 0, null);
			User = A;
			InsertPerson.InsertPerson(User);
		} else  {
			Angestellter User = new Mitarbeiter(null, null, null, null, null, null, null, null, null, 0, 0, null);
			User = A;
			InsertPerson.InsertPerson(User);
		}
	}

	public void EditUser(Angestellter A) {

	}

	public void DeleteUser(Angestellter A) {

	}

	public void FindUser(Angestellter A) {

	}

	public ArrayList<Angestellter> getAll() {
		ArrayList<Angestellter> userlist = new ArrayList<Angestellter>();
		return userlist;
	}

}
