import java.util.ArrayList;

public class MitarbeiterBlatt implements Mitarbeiter{
    private String Name;
    private int Personalnummer;
    private String Abteilung;
    private String Zustandändigkeit;
    private double Gehalt;

    private ArrayList<Mitarbeiter> Mitarbeiter;
    //Mitarbeiter fehlen
    public MitarbeiterBlatt(String Name, int Personalnummer, String Abteilung, String Zuständigkeit, double Gehalt) {
        this.Name = Name;
        this.Personalnummer = Personalnummer;
        this.Abteilung = Abteilung;
        this.Zustandändigkeit = Zuständigkeit;
        this.Gehalt = Gehalt;
        this.Mitarbeiter = new ArrayList<Mitarbeiter>();


    }

    public String getZustandändigkeit() {
        return Zustandändigkeit;
    }

    public void setZustandändigkeit(String zustandändigkeit) {
        Zustandändigkeit = zustandändigkeit;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPersonalnummer() {
        return Personalnummer;
    }

    public void setPersonalnummer(int personalnummer) {
        Personalnummer = personalnummer;
    }

    public String getAbteilung() {
        return Abteilung;
    }

    public void setAbteilung(String abteilung) {
        Abteilung = abteilung;
    }

    public double getGehalt() {
        return Gehalt;
    }

    public void setGehalt(double gehalt) {
        Gehalt = gehalt;
    }
    public String toString() {
        String s = "\nName: " + getName() + " Personalnummer: " + getPersonalnummer() + " Abteilung: " + getAbteilung() + " Zustaendigkeit: "+getZustandändigkeit() + " Gehalt: " +getGehalt();

        return s;
    }
}

