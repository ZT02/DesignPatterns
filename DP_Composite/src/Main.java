import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("REICH Egon", 258762, "MANAGEMENT", "Geschäftsführer", 40239.39);
        Medienabteilung s1 = new Medienabteilung("FAUL Lars", 304909, "MEDIEN", "Leiter", 4020.03);
        MitarbeiterBlatt es = new MitarbeiterBlatt("Schmitt Konrad", 30000, "Medien", "Sachbearbeiter", 2020.0);
        ArrayList<Mitarbeiter> liste2 = new ArrayList<Mitarbeiter>();
        ArrayList<Mitarbeiter> liste = new ArrayList<Mitarbeiter>();
        liste.add(s1);
        liste2.add(es);
        s1.setMitarbeiter(liste2);
        m1.setMitarbeiter(liste);
        System.out.println(m1);

    }
}