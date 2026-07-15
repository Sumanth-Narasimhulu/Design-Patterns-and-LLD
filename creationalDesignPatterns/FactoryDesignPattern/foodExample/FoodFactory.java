package DesignPatternsAndLLD.creationalDesignPatterns.FactoryDesignPattern.foodExample;

public class FoodFactory {
    public Food createFood(String foodName){
        if(foodName.equalsIgnoreCase("Pizza")){
            return new Pizza();
        }else if(foodName.equalsIgnoreCase("Chicken")){
            return new Chicken();
        }
        throw new IllegalArgumentException("Unknown food: " + foodName);
    }
}
