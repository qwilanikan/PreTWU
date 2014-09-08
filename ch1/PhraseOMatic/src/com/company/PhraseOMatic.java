package com.company;

public class PhraseOMatic {

    public static void main(String[] args) {

        //make three sets of words to choose from
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based",
        "pervasiive", "smart", "six-sigma", "critical-path", "dynamic"};

        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered",
        "branded", "outside-the-box", "positioned", "networked", "focused","leveraged", "aligned", "targeted",
        "shared", "cooperative", "accelerated"};

        String[] wordListThree = {"Process", "tipping-point", "solution", "architecture", "core competency", "strategy",
        "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        //find out how long each list is
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //print out the phrase
        System.out.println("What we need is a " + phrase);

    }
}
