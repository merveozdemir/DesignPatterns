package mediatorDesignPattern;

import java.util.Date;

/**
 * KitapUye
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public class KitapUye {
    private Kitap kitap;
    private Uye uye;
    private Date verilisTarihi;
    private int gunSayisi;
    private boolean teslimEdildi;

    public Kitap getKitap() {
        return kitap;
    }

    public void setKitap(Kitap kitap) {
        this.kitap = kitap;
    }

    public Uye getUye() {
        return uye;
    }

    public void setUye(Uye uye) {
        this.uye = uye;
    }

    public Date getVerilisTarihi() {
        return verilisTarihi;
    }

    public void setVerilisTarihi(Date verilisTarihi) {
        this.verilisTarihi = verilisTarihi;
    }

    public int getGunSayisi() {
        return gunSayisi;
    }

    public void setGunSayisi(int gunSayisi) {
        this.gunSayisi = gunSayisi;
    }

    public boolean isTeslimEdildi() {
        return teslimEdildi;
    }

    public void setTeslimEdildi(boolean teslimEdildi) {
        this.teslimEdildi = teslimEdildi;
    }
}
