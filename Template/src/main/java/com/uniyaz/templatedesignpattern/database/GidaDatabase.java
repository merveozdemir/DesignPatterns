package com.uniyaz.templatedesignpattern.database;

import com.uniyaz.templatedesignpattern.domain.Gida;

import java.util.ArrayList;
import java.util.List;

/**
 * DatabaseIslemleri
 *
 * @author Merve ÖZDEMİR
 * @since 06/07/2020
 */
public class GidaDatabase  {
    static List<Gida> gidaListesi = new ArrayList<>();

    public static void veritabaninaKaydet(Gida gida) {
        gidaListesi.add(gida);
    }

    public static void veritabanındanSil(Gida gida) {
        if (gidaListesi.contains(gida)){
            gidaListesi.remove(gida);
            System.out.println("ürün silindi.");
        }else{
            System.out.println("ürün bulunamadı.");
        }
    }


    public static int sayimYap() {
        return gidaListesi.size();
    }

    public static void urunleriListele() {
        for (Gida gida : gidaListesi) {
            System.out.println(gida.getId() + " - " + gida.getAdi());
        }

    }
}
