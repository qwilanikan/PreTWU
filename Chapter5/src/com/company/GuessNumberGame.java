package com.company;

/*
* Write a program that chooses a random number between 1 and 100.
* Then asks the user to enter a guess. If they guess right then tell them they win,
* otherwise tell them if they guessed too high or low. Keep asking the user to guess until they get the right answer.
* Use classes to separate the different concerns of this program.
*
 */
public class GuessNumberGame {

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

        GameHelper helper = new GameHelper();

        GuessNumber gn = new GuessNumber();
        int randomNum = (int) (Math.random() * 100 +1);
        gn.setNumber(randomNum);
        boolean isAlive = true;

        while(isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = gn.checkNumber(guess);
            if (result.equals("correct")) {
                isAlive = false;
                System.out.println("You guessed it!  You win!");
            }
        }
    }
}
