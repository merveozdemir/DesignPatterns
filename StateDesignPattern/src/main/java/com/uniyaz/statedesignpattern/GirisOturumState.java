package com.uniyaz.statedesignpattern;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * GirisOturumState
 *
 * @author Merve ÖZDEMİR
 * @since 06/07/2020
 */
public class GirisOturumState extends OturumState {

    @Override
    public void checkCurrentStateForUygulamaGiris(Uygulama uygulama) {
        if (this.equals(uygulama.getOturumState())){
            System.out.println("Uygulamaya zaten giriş yaptınız!\n");
        }
        else{
            GirisOturumState girisOturumState = new GirisOturumState();
            uygulama.setOturumState(girisOturumState);
            System.out.println("Uygulamaya giriş yapılıyor.\n");
        }
    }

    @Override
    public void checkCurrentStateForUygulamaCikis(Uygulama uygulama) {
        if (this.equals(uygulama.getOturumState())){
            CikisOturumState cikisOturumState = new CikisOturumState();
            uygulama.setOturumState(cikisOturumState);
            System.out.println("Uygulamadan çıkış yapılıyor.\n");
        }
        else{
            System.out.println("Uygulamadan zaten çıkış yaptınız.\n");
        }
    }

}
