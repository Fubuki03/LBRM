import java.util.List;
public class Test {
public static void main(String[] args) {
    Actions Actions = new Actions();
    Arbeitsgruppe Agrp = Actions.getGroups().get(0);
    Mitarbeiter M = new Mitarbeiter("Lukas", "Breiter", "mailmail@mail.mail", "0767996407", "Lausen", 123456, "2003", Agrp, false, "BREITERL", "Password", 123456789);
    Mitarbeiter A = new Mitarbeiter("Hannah", "Lukas", "mailmail@mail.mail", "0767996407", "Lausen", 123412, "2003", Agrp, false, "BREITERL", "Password", 123456789);
    Mitarbeiter W = new Mitarbeiter("Marco", "Rampinelli", "mailmail@mail.mail", "0767996407", "Lausen", 987656, "2003", Agrp, false, "BREITERL", "Password", 123456789);
    Actions.AddAngestellter(M);
    Actions.AddAngestellter(A);
    List<Angestellter> gefundeAngestellters = Actions.search("Lukas");

    for (Angestellter element : gefundeAngestellters){
     System.out.println(element.getID());
    }
}
}
