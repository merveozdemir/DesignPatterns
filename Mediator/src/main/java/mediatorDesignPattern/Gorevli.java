package mediatorDesignPattern;

import java.util.List;

/**
 * Gorevli
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public abstract class Gorevli {

    protected List<KitapUye> getAllDatabase(){
        return Database.getDatabase();
    }
    abstract boolean kitapMusaitMi(Kitap kitap);
    abstract Uye kitapKimde(Kitap kitap);
    abstract void oduncVer(Kitap kitap, Uye uye);
    abstract void oduncuGeriAl(Kitap kitap, Uye uye);
}
