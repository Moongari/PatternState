package com.training.Appareil;

public class Chauffage implements IEtatAppareil{
    @Override
    public void action(AppareilMenager app) {
        System.out.println("Appareil en mode chauffe");
    }
}
