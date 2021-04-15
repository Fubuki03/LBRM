import java.util.ArrayList;
public class Start {

	public static void main(String[] args) {
		ArrayList<Angestellter> Userlist = Data.getInstance().getAllUsers();
		for (Angestellter Angestellter : Userlist){
			for(int index = 0 ; index < 10 ; index++){
				System.out.println(String.valueOf(o[index]));
				if (Angestellter ){
					System.out.print(Angestellter);
				} 		else {
						System.out.print("Null");
				}
			}
		GUI G = new GUI();

	}
	}

}
