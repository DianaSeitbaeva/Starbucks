package com.epam.starbucks.coffeemaker;
import java.util.Scanner;

public class TraditionalCoffee {

    public void traditionalCoffeeBrew(){
        new Bean().beanBrew();
        System.out.println("Please choose coffee from menu: ");
        System.out.println("1 - Coffee Pike");
        System.out.println("2 - Coffee pure-over");
        System.out.println("3 - Coffee from french-press");
        System.out.println("4 - Coffee clover");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        switch (s){
            case (1):
                System.out.println("Please, your fresh brewed coffee Pike Place");
                break;
            case (2):
                System.out.println("Please, your fresh handy-brewed coffee Pure-Over");
                break;
            case(3):
                System.out.println("Please, your fresh pressed coffee");
                break;
            case(4):
                System.out.println("Please, your fresh-vacuumed clover coffee");
            default:
                System.out.println("Please try again!");
        }
        new Milk().milkChoose();
    }
}
