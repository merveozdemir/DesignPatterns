package mediatorDesignPattern;

/**
 * Kitap
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public class Kitap {

    private Long id;
    private String adi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        return  adi;
    }
}
