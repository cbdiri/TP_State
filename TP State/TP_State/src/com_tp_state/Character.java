package com_tp_state;

import java.util.Random;

public class Character {
    private State currentState;

    public Character() {
        this.currentState = new NormalState(); 
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void attack() {
        currentState.attack();
    }

    public void move() {
        currentState.move();
    }

    public void healCharacter() {
        if (currentState instanceof NormalState) {
            System.out.println("Le personnage est guéri.");
        } else {
            System.out.println("La guérison n'a aucun effet, le personnage n'est pas dans l'état normal.");
        }
    }

    public void enrageCharacter() {
        System.out.println("Le personnage devient enragé.");
        setState(new EnragedState());
    }

    public void poisonCharacter() {
        System.out.println("Le personnage est empoisonné.");
        setState(new PoisonedState());
    }

    public void attackCharacter(Character target) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        if (randomNumber < 30) {
            System.out.println("L'attaquant devient enragé.");
            this.setState(new EnragedState());
        } else if (randomNumber >= 30 && randomNumber < 60) {
            System.out.println("La cible devient enragée.");
            target.setState(new EnragedState());
        } else {
            System.out.println("Attaque réussie, mais pas de changement d'état.");
        }
    }
}

