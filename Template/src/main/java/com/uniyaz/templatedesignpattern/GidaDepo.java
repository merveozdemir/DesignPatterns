package com.uniyaz.templatedesignpattern;

import com.uniyaz.templatedesignpattern.database.GidaDatabase;
import com.uniyaz.templatedesignpattern.domain.Gida;
import com.uniyaz.templatedesignpattern.template.BaseDepo;
import com.uniyaz.templatedesignpattern.template.BaseUrun;

/**
 * GıdaDepo
 *
 * @author Merve ÖZDEMİR
 * @since 06/07/2020
 */
public class GidaDepo extends BaseDepo {


    @Override
    public void urunEkle(BaseUrun urun) {
        Gida gida = (Gida) urun;
        GidaDatabase.veritabaninaKaydet(gida);
    }

    @Override
    public int sayimYap() {
        return GidaDatabase.sayimYap();
    }

    @Override
    public void urunCikar(BaseUrun urun) {
        Gida gida = (Gida) urun;
        GidaDatabase.veritabanındanSil(gida);
    }

    @Override
    public void urunleriListele() {
        GidaDatabase.urunleriListele();
    }
}
