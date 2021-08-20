package com.training.voiture;

public class Demarrer implements IControleVoiture{
    @Override
    public void action(Voiture voiture) {
        System.out.println("La voiture demarre...");
    }
}
