package DesignPatternsAndLLD.creationalDesignPatterns.FactoryDesignPattern.foodExample;

public class Main {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        Food chicken = foodFactory.createFood("chicken");
        chicken.prepare();
        Food pizza = foodFactory.createFood("pizza");
        pizza.prepare();
    }
}
