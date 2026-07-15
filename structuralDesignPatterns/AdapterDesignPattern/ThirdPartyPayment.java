package DesignPatternsAndLLD.structuralDesignPatterns.AdapterDesignPattern;

public class ThirdPartyPayment {
    void makePayment(String amount){
        System.out.println("The amount paid is "+amount);
    }
}
