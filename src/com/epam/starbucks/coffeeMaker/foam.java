package com.epam.starbucks.coffeeMaker;

import java.util.Scanner;

public class foam {
    public void foamChoose(){
        System.out.println("Do you wanna some foam coat?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        switch (s) {
            case (1):
                System.out.println("Here we are!");
                break;
            case (2):
                System.out.println("Up to you");
                break;
            default:
                System.out.println("Please try again");
        }
    }
}
