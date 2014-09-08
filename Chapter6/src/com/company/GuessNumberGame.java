package com.company;

/*
* Write a program that chooses a random number between 1 and 100.
* Then asks the user to enter a guess. If they guess right then tell them they win,
* otherwise tell them if they guessed too high or low. Keep asking the user to guess until they get the right answer.
* Use classes to separate the different concerns of this program.
*
* Create a new version of the Chapter 5 problem where you also record all of the users guesses
* and print them out once they guess correctly. Use an ArrayList to store the guesses.
*
 */

import java.util.*;
public class GuessNumberGame {
    private GameHelper helper = new GameHelper();
    private GuessNumber gn = new GuessNumber();
    private ArrayList<String> guesses = new ArrayList<String>();
    private boolean isAlive = true;

    private void setUpGame() {
        int randomNum = (int) (Math.random() * 100 +1);
        gn.setNumber(randomNum);

        System.out.println("Your goal is to guess a number between 1 and 100" );
        System.out.println("Try to find it in the fewest number of guesses" );

    }

    private void startPlaying() {

        while(isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            guesses.add(guess);
            checkUserGuess(guess);

        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        String result = gn.checkNumber(userGuess);

        if (result.equals("correct")) {
            isAlive = false;
        }
    }

    private void finishGame() {
        System.out.println("You guessed it!  You win!");
        //print guesses
        System.out.println("your guesses were: ");
        for(String guess: guesses) {
            System.out.print(guess + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
	    //MAKE a new GuessNumber instance
        //Compute a random number between 1 and 100
        //INVOKE the setNumber() method on the GuessNumber instance
        //DECLARE a boolean variable representing the state of the game, named isAlive.  SET it to true

        //WHILE the game is alive (isAlive == true)"
            //GET user input from the command line
            // //CHECK the user guess
            //INVOKE the checkNumber() method of guesNum
            // //CHECK for game death
            // if result is "correct"
                //SET isAlive to false so we won't enter the loop again

        GuessNumberGame game = new GuessNumberGame();
        game.setUpGame();
        game.startPlaying();

    }
}
