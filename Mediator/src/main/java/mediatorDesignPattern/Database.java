package mediatorDesignPattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Database
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public class Database {
    public static List<KitapUye> kitapUyeList = new ArrayList();

    public static List<KitapUye> getDatabase(){
        Kitap k1 = new Kitap();
        k1.setId(1L);
        k1.setAdi("Suç ve Ceza");

        Kitap k2 = new Kitap();
        k2.setId(2L);
        k2.setAdi("Sefiller");

        Kitap k3 = new Kitap();
        k3.setId(3L);
        k3.setAdi("insan ne ile yaşar?");

        Uye u1 = new Uye();
        u1.setId(1L);
        u1.setAdi("Merve Özdemir");
        
        Uye u2 = new Uye();
        u2.setId(2L);
        u2.setAdi("Ahmet Ak");

        Uye u3 = new Uye();
        u3.setId(3L);
        u3.setAdi("Ayşe Kara");
        
        KitapUye kayit1 = new KitapUye();
        kayit1.setKitap(k2);
        kayit1.setUye(u2);
        kayit1.setVerilisTarihi(new Date());
        kayit1.setGunSayisi(15);

        KitapUye kayit2 = new KitapUye();
        kayit2.setKitap(k3);
        kayit2.setUye(u1);
        kayit2.setVerilisTarihi(new Date());
        kayit2.setGunSayisi(10);

        kitapUyeList.add(kayit1);
        kitapUyeList.add(kayit2);

        return kitapUyeList;
    }

}
