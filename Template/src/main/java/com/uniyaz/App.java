package com.uniyaz;

import com.uniyaz.templatedesignpattern.GidaDepo;
import com.uniyaz.templatedesignpattern.GiyimDepo;
import com.uniyaz.templatedesignpattern.IlacDepo;
import com.uniyaz.templatedesignpattern.domain.Gida;
import com.uniyaz.templatedesignpattern.domain.Giyim;
import com.uniyaz.templatedesignpattern.domain.Ilac;
import com.uniyaz.templatedesignpattern.template.BaseDepo;
import com.uniyaz.templatedesignpattern.template.BaseUrun;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("----------İlaç Deposu----------");
        BaseUrun ilac1 = new Ilac();
        ilac1.setId(1L);
        ilac1.setAdi("Parol");

        BaseUrun ilac2 = new Ilac();
        ilac2.setId(2L);
        ilac2.setAdi("Majezik");

        BaseDepo ilacDeposu = new IlacDepo();

        ilacDeposu.urunEkle(ilac1);
        ilacDeposu.urunEkle(ilac2);
        ilacDeposu.sayimYap();
        ilacDeposu.urunleriListele();
        System.out.println("Ürün adedi : "+ ilacDeposu.sayimYap());
        ilacDeposu.urunCikar(ilac2);
        System.out.println("Ürün adedi : "+ ilacDeposu.sayimYap());


        System.out.println("----------Giyim Deposu-----------");

        BaseUrun giyim1 = new Giyim();
        giyim1.setId(1L);
        giyim1.setAdi("Etek");

        BaseDepo giyimDeposu = new GiyimDepo();
        giyimDeposu.urunEkle(giyim1);
        giyimDeposu.urunleriListele();
        System.out.println("Ürün adedi : "+ giyimDeposu.sayimYap());



        System.out.println("---------Gıda Deposu--------------");
        BaseUrun gida1 = new Gida();
        gida1.setId(1L);
        gida1.setAdi("Elma");

        BaseUrun gida2 = new Gida();
        gida2.setId(2L);
        gida2.setAdi("Armut");

        BaseUrun gida3 = new Gida();
        gida3.setId(3L);
        gida3.setAdi("Çilek");

        BaseDepo gidaDeposu = new GidaDepo();
        gidaDeposu.urunEkle(gida1);
        gidaDeposu.urunEkle(gida2);
        gidaDeposu.urunCikar(gida3);
        System.out.println("Ürün adedi : "+gidaDeposu.sayimYap());
        gidaDeposu.urunleriListele();



    }
}
