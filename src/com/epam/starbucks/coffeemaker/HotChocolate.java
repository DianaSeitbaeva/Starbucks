package com.epam.starbucks.coffeemaker;

public class HotChocolate {
    public void hotChocolateBrew(){
        new Bean().beanBrew();
        System.out.println("Here we are! Our signature hot chocolate!");
        new Milk().milkChoose();
        new Foam().foamChoose();
        new ChocolateSauce().chocolateSauceChoose();
    }
}
