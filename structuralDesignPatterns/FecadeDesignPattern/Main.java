package DesignPatternsAndLLD.structuralDesignPatterns.FecadeDesignPattern;

public class Main {
    public static void main(String[] args) {
        SwiggyFacade facade = new SwiggyFacade();
        facade.placeOrder("Meghana", "Sumanth", 380, "Chicken Biryani");
    }
}
