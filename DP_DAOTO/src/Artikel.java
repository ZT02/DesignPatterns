import java.io.Serializable;

public class Artikel implements Serializable {
    private int artikelID;
    private int breite;
    private int höhe;
    private int tiefe;

    public Artikel(int artikelID, int breite, int höhe, int tiefe) {
        this.artikelID = artikelID;
        this.breite = breite;
        this.höhe = höhe;
        this.tiefe = tiefe;
    }
    public void setArtikelID(int artikelID) {
        this.artikelID = artikelID;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getHöhe() {
        return höhe;
    }

    public void setHöhe(int höhe) {
        this.höhe = höhe;
    }

    public int getTiefe() {
        return tiefe;
    }

    public void setTiefe(int tiefe) {
        this.tiefe = tiefe;
    }



    public int getArtikelID() {
        return artikelID;
    }

    public String toString() {
        String s = "\nID:" + artikelID + "\nKarton: "+breite+" x "+höhe+" x "+tiefe+"\n";
       return s;
    }
}
