package com.uniyaz.statedesignpattern;

/**
 * OturumState
 *
 * @author Merve ÖZDEMİR
 * @since 06/07/2020
 */
public abstract class OturumState {

    public abstract void checkCurrentStateForUygulamaGiris(Uygulama uygulama);
    public abstract void checkCurrentStateForUygulamaCikis(Uygulama uygulama);
}
