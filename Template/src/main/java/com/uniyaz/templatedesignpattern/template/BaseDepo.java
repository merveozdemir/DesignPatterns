package com.uniyaz.templatedesignpattern.template;

import javax.xml.crypto.Data;

/**
 * BaseDepo
 *
 * @author Merve ÖZDEMİR
 * @since 06/07/2020
 */
public abstract class BaseDepo {

    Long urunAdedi;

    public abstract void urunEkle(BaseUrun urun);
    public abstract int sayimYap();
    public abstract void urunCikar(BaseUrun urun);
    public abstract void urunleriListele();

}
