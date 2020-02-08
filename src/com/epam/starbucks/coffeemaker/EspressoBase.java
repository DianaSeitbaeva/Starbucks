package com.epam.starbucks.coffeemaker;

import java.util.Scanner;

public class EspressoBase {

    public void espressoBaseBrew(){
        new Bean().beanBrew();
        System.out.println("Please choose coffee from menu: ");
        System.out.println("1 - Americano");
        System.out.println("2 - Mokka");
        System.out.println("3 - Latte");
        System.out.println("4 - Cappuccino");
        System.out.println("5 - Caramel Macchiato");
        System.out.println("6 - Espresso");
        System.out.println("7 - Espresso con pana");
        System.out.println("8 - Espresso Macchiato");
        System.out.println("9 - Flat White");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        switch (s){
            case (1):
                System.out.println("Please, your Americano");
                break;
            case (2):
                System.out.println("Please, your chocolate Mokka");
                break;
            case(3):
                System.out.println("Please, your fancy Latte");
                break;
            case(4):
                System.out.println("Please, your gentle Cappuccino");
                break;
            case(5):
                System.out.println("Please, your sweet Caramel Macchiato");
                break;
            case(6):
                System.out.println("Espresso. Just Espresso. No need more words.");
                break;
            case(7):
                System.out.println("Espresso con pana, right here!");
                break;
            case(8):
                System.out.println("Please, your Espresso Macchiato");
                break;
            case(9):
                System.out.println("Please, your cool Flat White");
                break;
            default:
                System.out.println("Please try again!");
        }
        new Milk().milkChoose();
        new Foam().foamChoose();
    }
}
