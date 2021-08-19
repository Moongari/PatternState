package com.training;

import com.training.Appareil.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //ceci sans le pattern State
        AppareilMenager appareil1= new AppareilMenager();



        //Mettons en place le pattern State
        appareil1.setPosition(new Demarrer());
        appareil1.action();
        appareil1.setPosition(new Chauffage());
        appareil1.action();
        appareil1.setPosition(new Refroidir());
        appareil1.action();
        appareil1.setPosition(new Stopper());
        appareil1.action();
    }
}
