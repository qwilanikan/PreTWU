package com.company;

/**
 * Created by sduvall10 on 9/4/14.
 * Orcs are named “Orc” and have 20 initial hitpoints
 */
public class Orc implements Monster {

    String name = "Orc";
    int hitpoints = 20;

    public void takeDamage(int amount){
        hitpoints = hitpoints - amount;
    }

    public String name() {
        return name;
    }

    public int currentHitpoints() {
        return hitpoints;
    }
}
