package com.company;

/**
 * each with height and width instance variables and an area() method
 * Created by sduvall10 on 8/29/14.
 *
 * pass the height and width into the Rectangle constructor and initialize the instance variables there.
 * Add a perimeter() method to Rectangle.
 */
public class Rectangle {
    int height;
    int width;

    public Rectangle(int h, int w) {
        height = h;
        width = w;
    }

    int area(){
        int area = height * width;
        return area;
    }

    int perimeter() {
        int perimeter = height*2 + width*2;
        return perimeter;
    }
}