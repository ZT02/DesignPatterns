public class Kleidungsstück extends Artikel{
    private int kleidergroesse;
    private String bezeichnung;
    private String farbe;



    public Kleidungsstück(int artikelID, int breite, int höhe, int tiefe, int kleidergroesse, String bezeichnung, String farbe) {
        super(artikelID, breite, höhe, tiefe);
        this.kleidergroesse = kleidergroesse;
        this.bezeichnung = bezeichnung;
        this.farbe = farbe;
    }

    public int getKleidergroesse() {
        return kleidergroesse;
    }

    public void setKleidergroesse(int kleidergroesse) {
        this.kleidergroesse = kleidergroesse;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    public String toString() {
        String s = super.toString() + "Kleidungsgroesse: " +kleidergroesse + "\nBezeichnung: " + bezeichnung + "\nFarbe: " + farbe+"\n";
        return s;
    }
}
