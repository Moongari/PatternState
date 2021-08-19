package com.training.Appareil;

public class AppareilMenager {

    private int position;
    private IEtatAppareil etatAppareil;

    public void setPosition(IEtatAppareil etatAppareil) {
        this.etatAppareil = etatAppareil;
    }

    // integrons notre pattern State
    public void action() {
        etatAppareil.action(this);
    }

}
