package com.company;

/**
 * Created by sduvall10 on 8/31/14.
 */
public class GuessNumberTestDrive {

    public static void main (String[] args) {

        GuessNumber gn = new GuessNumber();

        int num = 5;
        gn.setNumber(num);

        String userGuess = "2";

        String result = gn.checkNumber(userGuess);

        String testResult = "failed";

        if (result.equals("too low")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}
