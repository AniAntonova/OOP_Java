/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.util.Scanner;

/**
 *
 * @author dzhel
 */
public class Probability {

    public static void main(String[] args) {
        //declaration
        double probability;
        int number,
                counter,
                counterAll;
        

        //inicialization
        counter = 0;
        counterAll = 0;
        for (int i = 3; i < 10; i++) {
            for (int j = 2; j < 9; j++) {
                for (int k = 4; k < 10; k++) {
                    for (int l = 1; l < 7; l++) {
                        for (int m = 6; m < 10; m++) {
                            number = m + l * 10 + k * 100 + j * 1000 + i * 10000;
                            if (number % 12 == 0) {
                                counter++;
                            }
                            counterAll++;
                        }
                    }
                }
            }
        }
        probability = (double) counter / counterAll;
        System.out.println(probability);
        //aoutput
    }
}
