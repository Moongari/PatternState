package com.training.voiture;

public class Accelerer implements IControleVoiture{
    @Override
    public void action(Voiture voiture) {
        System.out.println("La voiture accelere....");
    }
}
