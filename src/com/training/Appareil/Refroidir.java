package com.training.Appareil;

public class Refroidir implements IEtatAppareil{
    @Override
    public void action(AppareilMenager app) {
        System.out.println("Appareil en mode refroidissement");
    }
}
