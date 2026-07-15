package DesignPatternsAndLLD.structuralDesignPatterns.DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Caramel(new MilkDecorator(new Expresso()));
        int cost = coffee.getCost();
        String description = coffee.getDescription();
        System.out.println(cost);
        System.out.println(description);
    }
}
