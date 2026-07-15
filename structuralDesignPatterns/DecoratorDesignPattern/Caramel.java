package DesignPatternsAndLLD.structuralDesignPatterns.DecoratorDesignPattern;

public class Caramel extends CoffeeDecorator {
  
    public Caramel(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getDescription() {
       return coffee.getDescription()+" -> Caramel";
    }

    @Override
    public int getCost() {
        return coffee.getCost()+20;
    }
    
}
