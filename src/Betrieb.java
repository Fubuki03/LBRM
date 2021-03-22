
import java.util.ArrayList;

public class Betrieb {
	private ArrayList<Angestellter> userlist = new ArrayList<Angestellter>();
	
	
	public ArrayList<Angestellter> getUserlist() {
		return userlist;
	}
	
	
	public Angestellter getbyid(int index) {
		return userlist.get(index);
		
	}



	
	

}

