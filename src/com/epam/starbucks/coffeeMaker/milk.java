package com.epam.starbucks.coffeeMaker;

import java.util.Scanner;

public class milk {

    public void milkChoose(){
    System.out.println("Do you need milk? ");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
    Scanner scanner = new Scanner(System.in);
    int s = scanner.nextInt();
        switch (s) {
            case (1):
                System.out.println("You choose coffee with milk");
                break;
            case (2):
                System.out.println("You choose coffee without beans");
                break;
            default:
                System.out.println("Please try again");
        }
    }
}
