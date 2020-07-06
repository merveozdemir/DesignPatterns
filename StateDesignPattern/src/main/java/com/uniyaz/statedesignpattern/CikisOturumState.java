package com.uniyaz.statedesignpattern;

/**
 * CikisOturumState
 *
 * @author Merve ÖZDEMİR
 * @since 06/07/2020
 */
public class CikisOturumState extends OturumState {
    @Override
    public void checkCurrentStateForUygulamaGiris(Uygulama uygulama) {
        if (this.equals(uygulama.getOturumState())){
            GirisOturumState girisOturumState = new GirisOturumState();
            uygulama.setOturumState(girisOturumState);
            System.out.println("Uygulamaya giriş yapılıyor.\n");
        }
        else{
            System.out.println("Uygulamaya zaten giriş yaptınız.\n");
        }
    }

    @Override
    public void checkCurrentStateForUygulamaCikis(Uygulama uygulama) {
        if (this.equals(uygulama.getOturumState())){
            System.out.println("Uygulamadan zaten çıkış yaptınız.\n");
        }
        else{
            CikisOturumState cikisOturumState = new CikisOturumState();
            uygulama.setOturumState(cikisOturumState);
            System.out.println("Uygulamadan çıkış yapılıyor.\n");
        }
    }

}
