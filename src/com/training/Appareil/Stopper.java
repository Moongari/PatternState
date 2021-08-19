package com.training.Appareil;

public class Stopper implements IEtatAppareil{
    @Override
    public void action(AppareilMenager app) {
        System.out.println("Appareil en mode Arret");
    }
}
