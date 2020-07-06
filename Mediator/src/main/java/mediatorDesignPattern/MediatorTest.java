package mediatorDesignPattern;

import java.util.List;

/**
 * MediatorTest
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public class MediatorTest {
    public static void main(String[] args) {
        Kitap sucVeCeza = new Kitap();
        sucVeCeza.setId(1L);
        sucVeCeza.setAdi("Suç ve Ceza");

        Kitap sefiller = new Kitap();
        sefiller.setId(2L);
        sefiller.setAdi("Sefiller");

        Kitap insanNeIle = new Kitap();
        insanNeIle.setId(3L);
        insanNeIle.setAdi("insan ne ile yaşar?");

        Uye merve = new Uye();
        merve.setId(1L);
        merve.setAdi("Merve Özdemir");

        Uye ahmet = new Uye();
        ahmet.setId(2L);
        ahmet.setAdi("Ahmet Ak");

        Uye ayse = new Uye();
        ayse.setId(3L);
        ayse.setAdi("Ayşe Kara");

        KutuphaneGorevlisiMediator kutuphaneGorevlisiMediator = new KutuphaneGorevlisiMediator();
        Kutuphane kutuphane = new Kutuphane(kutuphaneGorevlisiMediator);

        getGuncelVeriler();

        System.out.println("---------ödünç verme------------");
        kutuphane.oduncVer(sucVeCeza, merve);
        getGuncelVeriler();

        System.out.println("--------ödünç verme--------------");
        kutuphane.oduncVer(sucVeCeza, ahmet);
        getGuncelVeriler();

        System.out.println("-------ödünç geri alma------------------");
        kutuphane.oduncuGeriAl(sefiller, ahmet);
        getGuncelVeriler();

        System.out.println("-----------Ödünç verme-------------");
        kutuphane.oduncVer(sefiller, ayse);
        getGuncelVeriler();
    }

    private static void getGuncelVeriler() {
        System.out.println("-------------------------------------------");
        List<KitapUye> kitapUyeList = Database.kitapUyeList;
        for (KitapUye kitapUye : kitapUyeList) {
            System.out.println(kitapUye.getKitap() + " | "+ kitapUye.getUye()+"  | " + kitapUye.isTeslimEdildi());
        }

        System.out.println("-------------------------------------------");
    }
}
