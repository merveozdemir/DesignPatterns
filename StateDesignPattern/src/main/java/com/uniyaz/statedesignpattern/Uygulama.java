package com.uniyaz.statedesignpattern;

/**
 * Uygulama
 *
 * @author Merve ÖZDEMİR
 * @since 06/07/2020
 */
public class Uygulama {
    OturumState oturumState;

    public Uygulama() {
        this.oturumState = new GirisOturumState();
        System.out.println("Uygulamaya ilk anda giriş yapıldı");
    }

    public void girisYap(){
        getOturumState().checkCurrentStateForUygulamaGiris(this);
    }

    public void cikisYap(){
        getOturumState().checkCurrentStateForUygulamaCikis(this);
    }

    public OturumState getOturumState() {
        return oturumState;
    }

    public void setOturumState(OturumState oturumState) {
        this.oturumState = oturumState;
    }
}
