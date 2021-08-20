package com.training.voiture;

public class MoteurPuissant implements IPuissanceVoiture{
    @Override
    public void action(Voiture voiture) {
        System.out.println("modification de la puissance du moteur plus de chevaux !!!");
    }

    @Override
    public void addPuissance(int puissance) {

        System.out.println("la puissance est passé a :  " + puissance +"chevaux");
    }
}
