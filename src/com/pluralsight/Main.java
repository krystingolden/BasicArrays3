package com.pluralsight;

import java.util.Random;

public class Main {
    /*
    https://programmingbydoing.com/
    Basic arrays 3 - Assignment #141
     */

    public static void main(String[] args) {

        Integer[] integers = new Integer[1000];

        int index;
        Random r = new Random();

        for (index = 0; index < integers.length; index++){
            int number = r.nextInt(100);
            if (number < 10){
                number += 10;
            }
            integers[index] = number;
            System.out.print(integers[index] + "  ");
        }


    }
}
