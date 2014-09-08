package com.company;

/**
 * Created by sduvall10 on 9/4/14.
 *  Monster interface with takeDamage(int amount),
 *  String name(), and int currentHitpoints() methods.
 */
public interface Monster {

    void takeDamage(int amount);

    String name();

    int currentHitpoints();

}
