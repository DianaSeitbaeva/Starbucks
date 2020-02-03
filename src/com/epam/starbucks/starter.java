package com.epam.starbucks;

import com.epam.starbucks.coffeeMaker.*;

import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Starbucks! Please choose your order: ");
        System.out.println("1 - Traditional coffee");
        System.out.println("2 - Coffee on espresso base");
        System.out.println("3 - Hot chocolate");
        System.out.println("4 - Frappuccino with coffee");
        System.out.println("5 - Frappuccino without coffee");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        switch (s) {
            case (1):
                new traditionalCoffee().traditionalCoffeeBrew();
                break;
            case (2):
                new espressoBase().espressoBaseBrew();
                break;
            case (3):
                new hotChocolate().hotChocolateBrew();
                break;
            case (4):
                new frappuccinoWithCoffee().frappuccinoWithCoffeeBrew();
                break;
            case(5):
                new creamyFrappuccinoWithoutCoffee().creamyFrappuccinoWithoutCoffee();
                break;
            default:
                System.out.println("Please try again!");;
        }
        System.out.println("Please enjoy your coffee!");
    }
}
