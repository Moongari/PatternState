package com.training.Appareil;

public class Demarrer implements IEtatAppareil{
    @Override
    public void action(AppareilMenager app) {
        System.out.println("Appareil Demarrer");
    }
}
