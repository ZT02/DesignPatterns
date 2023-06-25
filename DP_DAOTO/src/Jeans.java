import java.io.Serializable;

public class Jeans extends Kleidungsstück implements Serializable {
    private int schrittlänge;

    public Jeans(int artikelID, int breite, int höhe, int tiefe, int kleidergroesse, String bezeichnung, String farbe, int schrittlänge) {
        super(artikelID, breite, höhe, tiefe, kleidergroesse, bezeichnung, farbe);
        this.schrittlänge = schrittlänge;
    }

    public int getSchrittlänge() {
        return schrittlänge;
    }

    public void setSchrittlänge(int schrittlänge) {
        this.schrittlänge = schrittlänge;
    }

    public String toString() {
        String s = super.toString() + "Schrittlänge: " +schrittlänge+"\n";
        return s;
    }
}
