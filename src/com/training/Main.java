package com.training;

import com.training.Appareil.*;
import com.training.voiture.Voiture;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //ceci sans le pattern State
        AppareilMenager appareil1= new AppareilMenager();
        Voiture v1 = new Voiture();
        v1.setInstruction("Demarrer");
        v1.action();
        v1.setInstruction("accelerer");
        v1.action();
        v1.setInstruction("ralentir");
        v1.action();
        //Mettons en place le pattern State
/*        appareil1.setPosition(new Demarrer());
        appareil1.action();
        appareil1.setPosition(new Chauffage());
        appareil1.action();
        appareil1.setPosition(new Refroidir());
        appareil1.action();
        appareil1.setPosition(new Stopper());
        appareil1.action();*/



    }
}
