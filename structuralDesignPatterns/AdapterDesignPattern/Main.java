package DesignPatternsAndLLD.structuralDesignPatterns.AdapterDesignPattern;

public class Main {
    public static void main(String[] args) {
        ThirdPartyPayment thirdParty = new ThirdPartyPayment();
        PaymentGateway payment = new PaymentAdapter(thirdParty);
        payment.pay(500.0);
    }
}
