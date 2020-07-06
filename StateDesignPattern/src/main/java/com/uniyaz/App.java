package com.uniyaz;

import com.uniyaz.statedesignpattern.Uygulama;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Uygulama uygulama = new Uygulama(); //uygulamaya giriş yapıldı

        System.out.println("--------2. kere giriş işlemi---------------");
        uygulama.girisYap(); //tekrar giriş yapıldığını belirtecek.
        System.out.println("--------Çıkış işlemi---------------");
        uygulama.cikisYap(); //çıkış yapılacak
        System.out.println("--------2. kere çıkış işlemi---------------");
        uygulama.cikisYap(); //tekrar çıkış yapılmasına izin vermeyecek.
        System.out.println("--------Giriş işlemi---------------");
        uygulama.girisYap(); //giriş yapılacak
        System.out.println("--------Çıkış işlemi---------------");
        uygulama.cikisYap(); //çıkış yapılacak
    }
}
