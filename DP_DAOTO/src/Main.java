import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        NutzerDao test = new NutzerDao("Artikelverwaltung");
        Schuhe shoe = new Schuhe(117, 2, 2, 2, 46, "Leder", "Irgendeine");
        Jeans jeans = new Jeans(120, 3, 3, 3, 10, "Denim", "rot", 43);
        Ort testOrt = new Ort(20, 2, 3, 4);

        //save
        test.save(shoe, testOrt);
        test.save(jeans, testOrt);
        Ort testOrt2 = new Ort(40, 10, 20, 30);
        test.save(shoe, testOrt2);
/*
        System.out.println(test.getArtikel(testOrt.getOrtsID(), jeans.getArtikelID()));
        System.out.println(test.getOrt(testOrt.getOrtsID()));
        System.out.println(test.getAll(testOrt.getOrtsID()));
        test.updateArtikel(20, jeans);
        Ort testOrt2 = new Ort(30, 2, 3, 4);

        test.updateOrt(20, testOrt2);



        System.out.println(test.getArtikel(testOrt2.getOrtsID(), jeans.getArtikelID()));
        System.out.println(test.getOrt(testOrt2.getOrtsID()));
        System.out.println(test.getAll(testOrt2.getOrtsID()));


        //löscht einzelnes Objekt Jeans in Ort2
        test.deleteObject(testOrt2.getOrtsID(), jeans.getArtikelID());
        //Orte werden irgendwie nicht gelöscht
        test.deleteOrt(testOrt2.getOrtsID());
        test.deleteOrt(testOrt.getOrtsID());

        System.out.println(test.ermittleEinenFreienOrt()); */
    }
}