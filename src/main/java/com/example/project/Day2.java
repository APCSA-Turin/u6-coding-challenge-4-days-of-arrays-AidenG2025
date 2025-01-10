
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names)
    { // your will be tested on this method
        String[][] list = new String[2][names.length];
        int good = -1;
        int bad = -1;
        for (int i = 0; i < names.length; i++) {
            if (Math.random() < 0.5) 
            {
                good++;
                list[0][good] = names[i];
            } else 
            {
                bad++;
                list[1][bad] = names[i];
            }
        }
        return list;  //you must return a two dimensional string array
    }

    public static void main(String[] args) {

    }
}