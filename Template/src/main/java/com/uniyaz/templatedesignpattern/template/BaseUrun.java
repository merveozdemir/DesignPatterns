package com.uniyaz.templatedesignpattern.template;

/**
 * Urun
 *
 * @author Merve ÖZDEMİR
 * @since 06/07/2020
 */
public abstract class BaseUrun {
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
}
