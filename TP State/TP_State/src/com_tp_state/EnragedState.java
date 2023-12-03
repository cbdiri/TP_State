package com_tp_state;

public class EnragedState implements State {

    public void attack() {
        System.out.println("Enraged Attack");
    }

    @Override
    public void move() {
        System.out.println("Enraged Move");
    }
}
