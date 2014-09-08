package com.company;

// Create a class that counts how many times you call the method increment()
// and prints out that number when you call total(). Create a main method that calls increment 5 times
// and then calls total.
public class Chapter2 {
    int numInc;

    public static void main(String[] args) {
        Chapter2 c = new Chapter2();
        c.numInc = 0;
        int x = 0;
	    while (x < 5) {
            c.increment();
            x++;
        }
        c.total();
    }

    private void increment(){
        numInc++;
    }

    private void total(){
        System.out.println(numInc);
    }
}
