import java.io.Serializable;

public class Schuhe extends Artikel implements Serializable {
    private int schuhgroesse;
    private String obermaterial;
    private String absatzform;

    public Schuhe(int artikelID, int breite, int höhe, int tiefe, int schuhgroesse, String obermaterial, String absatzform) {
        super(artikelID, breite, höhe, tiefe);
        this.schuhgroesse = schuhgroesse;
        this.obermaterial = obermaterial;
        this.absatzform = absatzform;
    }

    public int getSchuhgroesse() {
        return schuhgroesse;
    }

    public void setSchuhgroesse(int schuhgroesse) {
        this.schuhgroesse = schuhgroesse;
    }

    public String getObermaterial() {
        return obermaterial;
    }

    public void setObermaterial(String obermaterial) {
        this.obermaterial = obermaterial;
    }

    public String getAbsatzform() {
        return absatzform;
    }

    public void setAbsatzform(String absatzform) {
        this.absatzform = absatzform;
    }
    public String toString() {
        String s = super.toString() + "Schuhgroesse: " +schuhgroesse + "\nObermaterial: " + obermaterial + "\nAbsatzform: " + absatzform+"\n";
        return s;
    }
}
