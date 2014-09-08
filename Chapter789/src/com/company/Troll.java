package com.company;

/**
 * Created by sduvall10 on 9/4/14.
 * Trolls are named “Troll”, have 40 hit points and only take half damage
 */
public class Troll implements Monster{

    String name = "Troll";
    int hitpoints = 40;

    public void takeDamage(int amount){
         hitpoints = hitpoints - amount/2;
    }

    public String name() {
        return name;
    }

    public int currentHitpoints() {
        return hitpoints;
    }
}
