import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class NutzerDao implements Dao, Serializable {



    private final String directory;


    public NutzerDao(String directory) {
        this.directory = directory;
        new File(directory).mkdirs();
    }
    public String getDirectiory() {
        return directory;
    }

    @Override
    public Artikel getArtikel(long ortID, long artikelID) {
        Artikel a = null;
        InputStream fis = null;

        try {

            fis = new FileInputStream(directory+"\\"+ortID+"\\"+artikelID+".dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            a = (Artikel) ois.readObject();
            fis.close();
            ois.close();
            return a;

        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }

        return null;

    }

    public Ort getOrt(long ortID) {

        Ort o;
        InputStream fis;

        try {

            fis = new FileInputStream(directory+"\\"+ortID+"\\"+ortID+".dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            o = (Ort) ois.readObject();
            fis.close();
            ois.close();
            return o;

        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }

        return null;

    }


    @Override
    public List<Artikel> getAll(long ortID) {
        File[] directFiles = new File(directory+"\\"+ortID).listFiles();

        List<Artikel> artikelList = new LinkedList<>();
        InputStream fis;

        try {

            assert directFiles != null;
            for(File f : directFiles) {
                fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Object obj = ois.readObject();
                if( obj instanceof Artikel) {
                    artikelList.add((Artikel) obj);
                    fis.close();
                    ois.close();
                }

            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }

        return artikelList;
    }

    @Override
    public void save(Artikel a, Ort o) {
        File directory = new File(this.directory+"\\"+o.getOrtsID());

        if (directory.exists() || directory.mkdirs()) {
            try {
                ObjectOutputStream temp = new ObjectOutputStream(new FileOutputStream(directory + "\\" + a.getArtikelID() + ".dat"));
                temp.writeObject(a);
                temp.flush();
                temp.close();

                temp = new ObjectOutputStream(new FileOutputStream(directory + "\\"  + o.getOrtsID() + ".dat"));
                temp.writeObject(o);
                temp.flush();
                temp.close();
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }


@Override
    public void updateArtikel(long ortID, Artikel a) {
    File directory = new File(this.directory+"\\"+ortID);

    if (directory.exists() || directory.mkdirs()) {
        try {
            ObjectOutputStream temp = new ObjectOutputStream(new FileOutputStream(directory + "\\" + a.getArtikelID() + ".dat"));
            temp.writeObject(a);
            temp.flush();
            temp.close();


        } catch (IOException e) {
            System.err.println(e);
        }
    }
    }


    @Override
    public void updateOrt(long ortID, Ort a) throws IOException {


        String oldDirectoryName = this.directory+"\\"+ortID;

        // Neuer Name des Verzeichnisses
        String newDirectoryName = this.directory+"\\"+a.getOrtsID();

        // Erzeuge ein File-Objekt für das alte Verzeichnis
        File oldDirectory = new File(oldDirectoryName);

        // Erzeuge ein File-Objekt für das neue Verzeichnis
        File newDirectory = new File(newDirectoryName);
        newDirectory.mkdirs();
        Path sourceDirectory = Path.of(oldDirectory.getPath());

        // Pfad zum neuen Verzeichnis
        Path targetDirectory = Path.of(newDirectory.getPath());

        try {
            // Kopiere den Inhalt des alten Verzeichnisses in das neue Verzeichnis
            Files.walk(sourceDirectory)
                    .forEach(source -> {
                        Path target = targetDirectory.resolve(sourceDirectory.relativize(source));
                        try {
                            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
                        } catch (IOException e) {
                            System.out.println("Fehler beim Kopieren der Datei: " + e.getMessage());
                        }
                    });

            System.out.println("Dateien erfolgreich kopiert.");
        } catch (Exception e) {
            System.out.println("Fehler beim Kopieren des Verzeichnisses: " + e.getMessage());
        }
        deleteObject(a.getOrtsID(), ortID);
        try {
            ObjectOutputStream temp = new ObjectOutputStream(new FileOutputStream(newDirectoryName + "\\" + a.getOrtsID() + ".dat"));
            temp.writeObject(a);
            temp.flush();
            temp.close();


        } catch (IOException e) {
            System.err.println(e);
        }
        deleteObject(a.getOrtsID(), ortID);
        deleteOrt(ortID);
    }

    @Override
    public void deleteObject( long ortID, long objectID) {
        String directoryToDelete = directory+"\\"+ortID+"\\"+objectID+".dat";
         File temp = new File(directoryToDelete);
        temp.delete();


        }
        @Override
    public void deleteOrt( long ortID) {

            Path directoryToDelete = Path.of(directory+"\\"+ortID);

            try {
                // Lösche das Verzeichnis und dessen Inhalt rekursiv
                Files.walk(directoryToDelete)
                        .sorted((path1, path2) -> -path1.compareTo(path2))
                        .forEach(path -> {
                            try {
                                Files.delete(path);
                            } catch (IOException e) {
                                System.out.println("Fehler beim Löschen des Pfads: " + e.getMessage());
                            }
                        });

                System.out.println("Verzeichnis erfolgreich gelöscht.");
            } catch (IOException e) {
                System.out.println("Fehler beim Löschen des Verzeichnisses: " + e.getMessage());
            }
    }

    public Ort ermittleEinenFreienOrt() {
        File[] temp = new File(directory).listFiles();

        for(File f : temp) {
            if (f.isDirectory()) {
                if(f.listFiles().length == 1)
                return getOrt((long) Double.parseDouble(f.getName()));
            }
        }
        return null;
    }

}

