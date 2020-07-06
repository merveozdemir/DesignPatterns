package com.uniyaz.templatedesignpattern.database;

import com.uniyaz.templatedesignpattern.domain.Ilac;

import java.util.ArrayList;
import java.util.List;

/**
 * IlacDatabase
 *
 * @author Merve ÖZDEMİR
 * @since 06/07/2020
 */
public class IlacDatabase {
    static List<Ilac> ilaclistesi = new ArrayList<>();


    public static void veritabaninaKaydet(Ilac ilac) {
        ilaclistesi.add(ilac);
    }


    public static void veritabanındanSil(Ilac ilac) {
        if (ilaclistesi.contains(ilac)){
            ilaclistesi.remove(ilac);
            System.out.println("ürün silindi.");
        }else{
            System.out.println("ürün bulunamadı.");
        }
    }


    public static int sayimYap() {
        return ilaclistesi.size();
    }

    public static void urunleriListele() {
        for (Ilac ilac : ilaclistesi) {
            System.out.println(ilac.getId() + " - " + ilac.getAdi());
        }

    }
}

