package com.company;

// Create an array of 5 Rectangles
// (each with height and width instance variables and an area() method).
// Find the average area of the rectangles.
public class Main {

    public static void main(String[] args) {
        AreaAverage a = new AreaAverage();
        a.initRecs();
        double d = a.findAreaAve();
        System.out.println("the average area is " + d);
    }
}
