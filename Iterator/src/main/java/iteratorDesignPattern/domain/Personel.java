package iteratorDesignPattern.domain;

/**
 * Personel
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public class Personel {

    String adi;
    String soyadi;
    Long maas;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public Long getMaas() {
        return maas;
    }

    public void setMaas(Long maas) {
        this.maas = maas;
    }
}
