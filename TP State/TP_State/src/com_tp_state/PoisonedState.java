package com_tp_state;

public class PoisonedState implements State {

    public void attack() {
        System.out.println("Poisoned Attack");
    }

    @Override
    public void move() {
        System.out.println("Poisoned Move");
    }
}
