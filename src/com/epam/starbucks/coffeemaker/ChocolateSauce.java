package com.epam.starbucks.coffeemaker;
import java.util.Scanner;

public class ChocolateSauce {
    public void chocolateSauceChoose(){
            System.out.println("Do you wanna some chocolate sauce over here?");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            Scanner scanner = new Scanner(System.in);
            int s = scanner.nextInt();
            switch (s) {
                case (1):
                    System.out.println("Please enjoy!");
                    break;
                case (2):
                    System.out.println("As you wish");
                    break;
                default:
                    System.out.println("Please try again");
            }
        }
    }
