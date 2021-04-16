import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Actions {

	public void AddAngestellter(Angestellter A) {
		Data.getInstance().InsertPerson(A);
	}

	public ArrayList<Arbeitsgruppe> getGroups() {
		return Data.getInstance().getGroups();

	}

	public ArrayList<Angestellter> getAllUsers() {
		return Data.getInstance().getAllUsers();
	}

	public void DeleteUser(Angestellter A) {
		Data.getInstance().remove(A);
	}

	public void UpdateUser(Angestellter old_A, Angestellter up_A) {
		Data.getInstance().update(old_A, up_A);
	}

	public List<Angestellter> search(String suche) {
		ArrayList<Angestellter> Userlist = Data.getInstance().getAllUsers();
		List<Angestellter> filtertusers = Userlist.stream().filter(a -> (suche.equals(a.getArbeitsgruppe().getName())
				|| a.getEMail().equals(suche))
			|| (a instanceof Externer && ((Externer)a).getContractor().equals(suche)) 
			|| (a instanceof Mitarbeiter && ((Mitarbeiter)a).getName().equals(suche)
				|| ((Mitarbeiter)a).getName().equals(suche) 
				|| ((Mitarbeiter)a).getPassword().equals(suche))).collect(Collectors.toList());
		return filtertusers;
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

}
