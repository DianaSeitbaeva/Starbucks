package com.epam.starbucks;

import com.epam.starbucks.coffeemaker.*;

import java.util.Scanner;

public class Starter {
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
                new TraditionalCoffee().traditionalCoffeeBrew();
                break;
            case (2):
                new EspressoBase().espressoBaseBrew();
                break;
            case (3):
                new HotChocolate().hotChocolateBrew();
                break;
            case (4):
                new FrappuccinoWithCoffee().frappuccinoWithCoffeeBrew();
                break;
            case(5):
                new CreamyFrappuccinoWithoutCoffee().creamyFrappuccinoWithoutCoffee();
                break;
            default:
                System.out.println("Please try again!");;
        }
        System.out.println("Please enjoy your coffee!");
    }
}
