package com.company;

import java.util.ArrayList;
    /*
     *  Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
     *  String name(), and int currentHitpoints() methods. Store instances of both classes
     *  and store them in an ArrayList. Iterate through the list and make each monster take 10 points of damage.
     *  After you have damaged all of the monsters, report the name and current hit points of all monsters.
     *  Orcs are named “Orc” and have 20 initial hitpoints
     *  Trolls are named “Troll”, have 40 hit points and only take half damage
     */
public class Chapter789 {


    private ArrayList<Monster> monsters;

    private void setUpMonsters(){
        monsters = new ArrayList<Monster>();

        monsters.add(new Orc());
        monsters.add(new Troll());
        monsters.add(new Troll());
        monsters.add(new Orc());
        monsters.add(new Troll());
        monsters.add(new Troll());
        monsters.add(new Orc());
        monsters.add(new Orc());
    }

    private void playWithMonsters(){
        for (Monster m: monsters){
            m.takeDamage(10);
        }
    }

    private void displayStats(){
        System.out.println("Monsters: ");
        for (Monster m: monsters) {
            System.out.println("name: " + m.name() + ", hitpoints: " + m.currentHitpoints());
        }
    }

    public static void main(String[] args) {
        Chapter789 rpg = new Chapter789();
        rpg.setUpMonsters();
        rpg.playWithMonsters();
        rpg.displayStats();
    }
}
