package com.company;

/**
 * Created by sduvall10 on 8/31/14.
 */
public class GuessNumber {

    //Declare an int to hold the random num between 1 and 100
    int number;

    //Declare a checkNumber() method that takes a string for the user's guess checks it amd returns "hit", "low" or "high"

    //Declare a setNum() method that takes an int



    //Method: String CheckNumber(String userGuess)
        //Get the user's guess as a string parameter
        //Convert the user's guess to an int
        //Compare the user guess to the number
        //IF the user guess matches
            //return match

        //ELSE
            // Check if it is higher
                //return high
            // ELSE return low
    public String checkNumber(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = "too low";
        if (guess == number) {
            result = "correct";
        }
        else if (guess > number) {
            result = "too high";
        }

        System.out.println(result);
        return result;

    }


    //METHOD: void setNumber(int num)
        //Get the num as an int Param
        //Assign the num to the number variable

    public void setNumber(int num) {
        number = num;
    }
}
