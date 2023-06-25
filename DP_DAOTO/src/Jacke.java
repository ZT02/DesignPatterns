import java.io.Serializable;

public class Jacke extends Kleidungsstück implements Serializable {
    private int wassersäule;

    public Jacke(int artikelID, int breite, int höhe, int tiefe, int kleidergroesse, String bezeichnung, String farbe, int wassersäule) {
        super(artikelID, breite, höhe, tiefe, kleidergroesse, bezeichnung, farbe);
        this.wassersäule = wassersäule;
    }

    public int getWassersäule() {
        return wassersäule;
    }

    public void setWassersäule(int wassersäule) {
        this.wassersäule = wassersäule;
    }

    public String toString() {
        String s = super.toString() + "Wassersäule: " +wassersäule+"\n";
        return s;
    }
}
