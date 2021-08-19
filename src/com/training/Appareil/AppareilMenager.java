package com.training.Appareil;

public class AppareilMenager {

    private int position;

    public void setPosition(int position) {
        this.position = position;
    }

    public void action() {

        switch (position) {
            case 1:
                System.out.println("Appareil Demarrer");
                break;

            case 2:
                System.out.println("Appareil en mode chauffe");
                break;

            case 3:
                System.out.println("Appareil en mode refroidissement");
                break;

            case 4:
                System.out.println("Appareil en mode soufflerie");
                break;
            default:
                System.out.println("Appareil ne fonctione pas dans cette etat");
                break;
        }
    }

}
