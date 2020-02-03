package com.epam.starbucks.coffeeMaker;
import java.util.Scanner;

public class bean {
    String espresso = "espresso";
    String blond = "blond";
    String decaf = "decaf";

    public void beanBrew (){
        System.out.println("Please choose beans: ");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        switch (s){
            case (1):
                System.out.println("You choose coffee with " + espresso + " beans");
                break;
            case (2):
                System.out.println("You choose coffee with " + blond + " beans");
                break;
            case (3):
                System.out.println("You choose coffee with " + decaf + " beans");
                break;
            default:
                System.out.println("Sorry, we don't have coffee with this type of beans");
        }
    }
}
