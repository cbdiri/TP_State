package com_tp_state;
public class Main {
    public static void main(String[] args) {
    	
    	//Etape N°1 du TP
    	Character character = new Character();
    	System.out.println("Le personnage est créé dans l'état normal.");
        character.attack();
        character.move();

        character.setState(new EnragedState());
        System.out.println("Le personnage est enragé.");
        character.attack();
        character.move();

        character.setState(new PoisonedState());
        System.out.println("Le personnage est empoisonné.");
        character.attack();
        character.move();
    	
       // Etape N°2
        Character player1 = new Character();
        Character player2 = new Character();
        System.out.println("Joueur 1 est créé dans l'état normal.");
        System.out.println("Joueur 2 est créé dans l'état normal.");
        player1.healCharacter();
        player1.enrageCharacter();
        player2.poisonCharacter();
        System.out.println("----- Attaque entre Joueur 1 et Joueur 2 -----");
        player1.attackCharacter(player2);
        player2.healCharacter();
        System.out.println("----- Attaque entre Joueur 2 et Joueur 1 -----");
        player2.attackCharacter(player1);
    }
}

