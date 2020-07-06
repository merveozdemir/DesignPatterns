package com.uniyaz.templatedesignpattern;

import com.uniyaz.templatedesignpattern.database.GidaDatabase;
import com.uniyaz.templatedesignpattern.database.IlacDatabase;
import com.uniyaz.templatedesignpattern.domain.Gida;
import com.uniyaz.templatedesignpattern.domain.Ilac;
import com.uniyaz.templatedesignpattern.template.BaseDepo;
import com.uniyaz.templatedesignpattern.template.BaseUrun;

/**
 * IlacDepo
 *
 * @author Merve ÖZDEMİR
 * @since 06/07/2020
 */
public class IlacDepo extends BaseDepo {
    @Override
    public void urunEkle(BaseUrun urun) {
        Ilac ilac = (Ilac) urun;
        IlacDatabase.veritabaninaKaydet(ilac);
    }

    @Override
    public int sayimYap() {
        return IlacDatabase.sayimYap();
    }

    @Override
    public void urunCikar(BaseUrun urun) {
        Ilac ilac = (Ilac) urun;
        IlacDatabase.veritabanındanSil(ilac);
    }

    @Override
    public void urunleriListele() {
        IlacDatabase.urunleriListele();
    }
}
