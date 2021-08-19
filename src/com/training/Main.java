package com.training;

import com.training.Appareil.AppareilMenager;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //ceci sans le pattern State
        AppareilMenager appareil1= new AppareilMenager();
        appareil1.setPosition(1);
        appareil1.action();
        appareil1.setPosition(2);
        appareil1.action();
        appareil1.setPosition(3);
        appareil1.action();


        //Mettons en place le pattern State



    }
}
