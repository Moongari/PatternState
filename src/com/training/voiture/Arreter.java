package com.training.voiture;

public class Arreter implements IControleVoiture{
    @Override
    public void action(Voiture voiture) {
        System.out.println("La voiture s'arrete , le moteur ne tourne plus.");
    }
}
