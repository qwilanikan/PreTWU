package com.company;

/**
*  Create a new version of the Chapter 3 exercise where you pass the height and width into
*  the Rectangle constructor and initialize the instance variables there.
*  Add a perimeter() method to Rectangle.
*  Print the total area of all rectangles. Print the total perimeter of all rectangles.
**/
public class Main {

    public static void main(String[] args) {
        Averages a = new Averages();
        a.initRecs();
        double d = a.findAreaAve();
        System.out.println("the average area is " + d);
        double b = a.findPerimeterAve();
        System.out.println("the average perimeter is " + b);
    }
}
