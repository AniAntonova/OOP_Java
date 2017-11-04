/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

import java.util.Scanner;

/**
 *
 * @author dzhel
 */
public class Zad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*Scanner imput= new Scanner(System.in);
        System.out.println("Write Farenheit ");
      double F = imput.nextDouble();
      double C=5.0/9.0*(F-32);
        System.out.println("This is "+ C + " celsius");
        
        
        System.out.println("Write Celsius ");
        double celsIn = imput.nextDouble();
        double farOut= 9.0 / 5.0 * celsIn + 32;
        System.out.println("This is " + farOut + " Farenheit!");
        imput.nextLine();
        
        System.out.println("What do you want to enter?\n If Celsius press C\n If Farenheit press F\n"); 
        String str=imput.nextLine();
        if (str.equals("F")) {
            int far = imput.nextInt();
         C=5.0/9.0*(far-32);
        System.out.println("This is "+ C + " celsius");
        }
        else if(str.equals("C"))
        {
            int cel = imput.nextInt();
         farOut= 9.0 / 5.0 * cel + 32;
        System.out.println("This is " + farOut + " Farenheit!");
        }*/
      
      //FiveDigit
        System.out.print("Write a five-digit number ");
        Scanner in = new Scanner(System.in);
        System.out.println(1556);
        int number=in.nextInt();
        if(number/100000!=0)
        {
            System.out.println("this is not a five-digit number");
        }
        System.out.println("it is ok");
    }

    
    
}
