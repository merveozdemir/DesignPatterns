package mediatorDesignPattern;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * KutuphaneGorevlisi
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public class KutuphaneGorevlisiMediator extends Gorevli {

    List<KitapUye> kitapUyeList;

    public KutuphaneGorevlisiMediator() {
        this.kitapUyeList = getAllDatabase();
    }

    boolean kitapMusaitMi(Kitap kitap) {
        boolean musait = kitapUyeList.stream()
                .filter(kitapUye -> kitapUye.getKitap().getId().equals(kitap.getId()))
                .noneMatch(kitapUye -> kitapUye.isTeslimEdildi() == false);
        return musait;

    }

    Uye kitapKimde(Kitap kitap) {
        List<KitapUye> kitapUyeList = this.kitapUyeList.stream()
                .filter(kitapUye -> kitapUye.getKitap().getId().equals(kitap.getId()) && kitapUye.isTeslimEdildi() == false)
                .collect(Collectors.toList());
        if (kitapUyeList.size() == 1){
            return kitapUyeList.get(0).getUye();
        }
        return null;
    }

    void oduncVer(Kitap kitap, Uye uye) {
        if (kitapMusaitMi(kitap)){
            KitapUye kitapUye = new KitapUye();
            kitapUye.setKitap(kitap);
            kitapUye.setUye(uye);
            kitapUye.setVerilisTarihi(new Date());
            kitapUye.setGunSayisi(15);
            kitapUye.setTeslimEdildi(false);

            kitapUyeList.add(kitapUye);

            System.out.println("Kitap " + uye + " isimli üyeye ödünç verildi.");
        }
        else{
            Uye uyeSahip = kitapKimde(kitap);
            System.out.println("Kitap " + uyeSahip + " isimli üyeye ödünç verilmiş.");
        }
    }

    @Override
    void oduncuGeriAl(Kitap kitap, Uye uye) {
        List<KitapUye> kitapUyeList = this.kitapUyeList.stream()
                .filter(kitapUye -> kitapUye.getKitap().getId().equals(kitap.getId())
                        && kitapUye.getUye().getId().equals(uye.getId())
                        && kitapUye.isTeslimEdildi() == false)
                .collect(Collectors.toList());
        if (kitapUyeList.size() == 1){
            kitapUyeList.get(0).setTeslimEdildi(true);
            System.out.println(kitap + " isimli kitap "+ uye+" isimli üyeden geri alındı.");
        }
        else if( kitapUyeList.size() == 0) {
            System.out.println("Bu kitap bu üyede aktif kaydı yok");
        }
    }

}
