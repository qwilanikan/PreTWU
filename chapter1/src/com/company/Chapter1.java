package com.company;


// a program that prints the sum of all odd numbers from 1 to 100
public class Chapter1 {

    public static void main(String[] args) {
        int num = 1;
        int total = 0;
        while (num < 100) {
            total = total + num;
            num = num + 2;
        }
        System.out.println(total);
    }

}
