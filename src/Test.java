public class Test {
public static void main(String[] args) {
    Actions Actions = new Actions();
    Arbeitsgruppe Agrp = Actions.getGroups().get(0);
    Mitarbeiter M = new Mitarbeiter("Lukas", null, "Hallo", null, null, 0, null, Agrp, null, null, null, 0);
    Actions.AddAngestellter(M);
    System.out.println(Actions.search("Hall"));
}
}
