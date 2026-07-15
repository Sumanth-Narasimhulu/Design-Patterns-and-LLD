package DesignPatternsAndLLD.structuralDesignPatterns.DecoratorDesignPattern;

public class Expresso implements Coffee {

    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public int getCost() {
        return 50;
    }
    
}
