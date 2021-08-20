package com.training;

import com.training.Appareil.*;
import com.training.voiture.*;
import com.training.voiture.Demarrer;


public class Main {

    public static void main(String[] args) {
	// write your code here
        //ceci sans le pattern State
        AppareilMenager appareil1= new AppareilMenager();
        Voiture v1 = new Voiture();


        //Mettons en place le pattern State
 /*      appareil1.setPosition(new com.training.Appareil.Demarrer());
        appareil1.action();
        appareil1.setPosition(new Chauffage());
        appareil1.action();
        appareil1.setPosition(new Refroidir());
        appareil1.action();
        appareil1.setPosition(new Stopper());
        appareil1.action();*/

        v1.setControleVoiture(new Demarrer());
        v1.action();
        v1.setControleVoiture(new Accelerer());
        v1.setPuissanceVoiture(new MoteurPuissant());
        v1.action();
        v1.AjoutPuissance(300);
        v1.setControleVoiture(new Arreter());
        v1.action();





    }
}
