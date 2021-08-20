package com.training.voiture;


public class Voiture {

    private String instruction ;

    public void setInstruction(String instruction){this.instruction = instruction;}


    public  void action(){

        if(instruction.equalsIgnoreCase("demarrer"))
        {
            System.out.println("Demarrage du véhicule ");

        }else if(instruction.equalsIgnoreCase("accelerer")){
            System.out.println("Acceleration du véhicule");

        }else if(instruction.equalsIgnoreCase("ralentir")){
            System.out.println("le véhicule ralentit");

            
        }else if(instruction.equalsIgnoreCase("arreter")){

            System.out.println("le véhicule s'arrete");
        }


    }

}
