public class Test {
public static void main(String[] args) {
    Actions Actions = new Actions();
    Arbeitsgruppe Agrp = Actions.getGroups().get(0);
    
    Mitarbeiter L = new Mitarbeiter("Lukas", "Breiter", "mailmail@mail.mail", "0767996407", "Lausen", 123456, "2003", Agrp, false, "BREITERL", "Password", 123456789);
    Mitarbeiter H = new Mitarbeiter("Hannah", "Lukas", "mailmail@mail.mail", "0767996407", "Lausen", 123412, "2003", Agrp, false, "BREITERL", "Password", 123456789);
    Mitarbeiter M = new Mitarbeiter("Marco", "Rampinelli", "mailmail@mail.mail", "0767996407", "Lausen", 987656, "2003", Agrp, false, "BREITERL", "Password", 123456789);
    Mitarbeiter newM = new Mitarbeiter("update", "test", "mailmail@mail.mail", "0767996407", "Lausen", 234561, "2003", Agrp, false, "BREITERL", "Password", 123456789);
    
    Actions.AddAngestellter(L);
    Actions.AddAngestellter(H);
    Actions.AddAngestellter(M);

    System.out.print("Groups: ");
    System.out.println(Actions.getGroups());
    System.out.println("------------------------");
    System.out.println("Originalzustand:");
    
    for (Angestellter element : Actions.getAllUsers()){
        System.out.println(element.getName());
    }

    System.out.println("------------------------");
    System.out.println("Updaten & Löschen: ");


    Angestellter X = Actions.GetUserbyID(123456);
    Actions.DeleteUser(X);

    Angestellter old = Actions.GetUserbyID(123412);
    Actions.UpdateUser(old, newM);

    for (Angestellter element : Actions.getAllUsers()){
        System.out.println(element.getName());
    }

    System.out.println("------------------------");
    System.out.println("Search:");

    System.out.println("Ergebnisse:" + Actions.search("test").size());
    for (Angestellter element : Actions.search("test")){
        System.out.println(element.getID());
    }
}
}
