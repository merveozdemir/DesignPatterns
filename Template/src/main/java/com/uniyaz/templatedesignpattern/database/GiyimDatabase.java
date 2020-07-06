package com.uniyaz.templatedesignpattern.database;

import com.uniyaz.templatedesignpattern.domain.Giyim;

import java.util.ArrayList;
import java.util.List;

/**
 * GiyimDatabase
 *
 * @author Merve ÖZDEMİR
 * @since 06/07/2020
 */
public class GiyimDatabase {
    static List<Giyim> giyimListesi = new ArrayList<>();


    public static void veritabaninaKaydet(Giyim giyim) {
        giyimListesi.add(giyim);
    }

    public static void veritabanındanSil(Giyim giyim) {
        if (giyimListesi.contains(giyim)){
            giyimListesi.remove(giyim);
            System.out.println("ürün silindi.");
        }else{
            System.out.println("ürün bulunamadı.");
        }
    }

    public static int sayimYap() {
        return giyimListesi.size();
    }

    public static void urunleriListele() {
        for (Giyim giyim : giyimListesi) {
            System.out.println(giyim.getId() + " - " + giyim.getAdi());
        }
    }
}
