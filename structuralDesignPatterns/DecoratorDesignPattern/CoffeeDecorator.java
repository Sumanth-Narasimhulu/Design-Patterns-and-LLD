package DesignPatternsAndLLD.structuralDesignPatterns.DecoratorDesignPattern;

public abstract class CoffeeDecorator implements Coffee{
    public Coffee coffee;
    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
}
