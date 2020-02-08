package com.epam.starbucks.coffeemaker;
import java.util.Scanner;

public class FrappuccinoWithCoffee {
    public void frappuccinoWithCoffeeBrew(){
        new Bean().beanBrew();
        System.out.println("Please choose coffee from menu: ");
        System.out.println("1 - Caramel Frappuccino");
        System.out.println("2 - Classic Frappuccino");
        System.out.println("3 - Espresso Frappuccino");
        System.out.println("4 - Chocolate JAVA Frappuccino");
        System.out.println("5 - Mocca Frappuccino");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        switch (s){
            case (1):
                System.out.println("Please, your Caramel Frappuccino with caramel sauce");
                break;
            case (2):
                System.out.println("Please, your classic frappuccino");
                break;
            case(3):
                System.out.println("Please, your espresso frappuccino");
                break;
            case(4):
                System.out.println("Attention! Here is Chocolate JAVA Frappuccino!");
                break;
            case(5):
                System.out.println("Please, your sweet Mocca Frappuccino");
                break;
            default:
                System.out.println("Please try again!");
        }
        new Milk().milkChoose();
        new Foam().foamChoose();
        new ChocolateSauce().chocolateSauceChoose();
    }
}
