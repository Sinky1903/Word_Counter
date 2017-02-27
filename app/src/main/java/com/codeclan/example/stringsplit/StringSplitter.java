package com.codeclan.example.stringsplit;

/**
 * Created by user on 27/02/2017.
 */

public class StringSplitter {

//    instance variable
    private String input;

//    constructor
    public StringSplitter(String input) {
        this.input = input;
    }

//    methods
//    public void splitString() {
//        String[] words = input.split(" ");
//        for (String s : words) {
//            System.out.println(s);
//        }
//    }

    public int countString() {
        int total = 0;
        String[] words = input.split(" ");
        for (String s : words) {
            total ++;
        }
        return total;
//
    }
}
