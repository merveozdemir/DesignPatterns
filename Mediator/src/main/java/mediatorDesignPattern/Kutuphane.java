package mediatorDesignPattern;

/**
 * Kutuphane
 *
 * @author Merve ÖZDEMİR
 * @since 15/06/2020
 */
public class Kutuphane {

    KutuphaneGorevlisiMediator kutuphaneGorevlisiMediator;

    public Kutuphane(KutuphaneGorevlisiMediator kutuphaneGorevlisiMediator) {
        this.kutuphaneGorevlisiMediator = kutuphaneGorevlisiMediator;
    }

    void oduncVer(Kitap kitap, Uye uye){
        kutuphaneGorevlisiMediator.oduncVer(kitap, uye);
    }

    void oduncuGeriAl(Kitap kitap, Uye uye){
        kutuphaneGorevlisiMediator.oduncuGeriAl(kitap,uye);
    }
}
