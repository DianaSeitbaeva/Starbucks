package com.epam.starbucks.coffeeMaker;

import java.util.Scanner;

public class creamyFrappuccinoWithoutCoffee {
    public void creamyFrappuccinoWithoutCoffee(){
        System.out.println("Please choose coffee from menu: ");
        System.out.println("1 - Chocolate Cream Frappuccino");
        System.out.println("2 - Vanilla Cream Frappuccino");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        switch (s){
            case (1):
                System.out.println("Please, your wonderful Chocolate Cream Frappuccino");
                break;
            case (2):
                System.out.println("Please, your sweet Vanilla Cream Frappuccino");
                break;
            default:
                System.out.println("Please try again!");
        }
        new milk().milkChoose();
        new foam().foamChoose();
        new chocolateSauce().chocolateSauceChoose();
    }
}
