package com.epam.starbucks.coffeeMaker;

public class hotChocolate {
    public void hotChocolateBrew(){
        new bean().beanBrew();
        System.out.println("Here we are! Our signature hot chocolate!");
        new milk().milkChoose();
        new foam().foamChoose();
        new chocolateSauce().chocolateSauceChoose();
    }
}
