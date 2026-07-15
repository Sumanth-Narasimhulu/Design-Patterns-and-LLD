package DesignPatternsAndLLD.creationalDesignPatterns.FactoryDesignPattern.foodExample;

public class Chicken implements Food {

    @Override
    public void prepare() {
        System.out.println("Prparing Chicken");
    }
    
}
