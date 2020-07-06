package com.uniyaz.templatedesignpattern;

import com.uniyaz.templatedesignpattern.database.GidaDatabase;
import com.uniyaz.templatedesignpattern.database.GiyimDatabase;
import com.uniyaz.templatedesignpattern.domain.Gida;
import com.uniyaz.templatedesignpattern.domain.Giyim;
import com.uniyaz.templatedesignpattern.template.BaseDepo;
import com.uniyaz.templatedesignpattern.template.BaseUrun;

/**
 * GiyimDepo
 *
 * @author Merve ÖZDEMİR
 * @since 06/07/2020
 */
public class GiyimDepo extends BaseDepo {

    @Override
    public void urunEkle(BaseUrun urun) {
        Giyim giyim = (Giyim) urun;
        GiyimDatabase.veritabaninaKaydet(giyim);
    }

    @Override
    public int sayimYap() {
        return GiyimDatabase.sayimYap();
    }

    @Override
    public void urunCikar(BaseUrun urun) {
        Giyim giyim = (Giyim) urun;
        GiyimDatabase.veritabanındanSil(giyim);
    }

    @Override
    public void urunleriListele() {
        GiyimDatabase.urunleriListele();
    }
}
