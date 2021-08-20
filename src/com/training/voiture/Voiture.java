package com.training.voiture;

public class Voiture {

    private IControleVoiture controleVoiture;
    private IPuissanceVoiture puissanceVoiture;




    public void setControleVoiture(IControleVoiture controleVoiture) {
        this.controleVoiture = controleVoiture;
    }
    public void setPuissanceVoiture(IPuissanceVoiture puissanceVoiture){
        this.puissanceVoiture = puissanceVoiture;
    }

    public void action() {
        controleVoiture.action(this);

    }

    public void AjoutPuissance(int puissance){
        puissanceVoiture.action(this);
       puissanceVoiture.addPuissance(puissance);
    }
}
