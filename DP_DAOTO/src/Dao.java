import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface Dao {
    public Artikel getArtikel(long ortID, long artikelID);
    public Ort getOrt(long ortID);

    public List<Artikel> getAll(long ortID);
    void save(Artikel a, Ort o);
    public void updateArtikel(long ortID, Artikel a);
    public void updateOrt(long ortID, Ort a) throws IOException;
    public void deleteObject( long ortID, long objectID);
    public void deleteOrt( long ortID);
}
