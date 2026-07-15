package DesignPatternsAndLLD.structuralDesignPatterns.AdapterDesignPattern;

public class PaymentAdapter implements PaymentGateway {
    private ThirdPartyPayment payment;
    public PaymentAdapter(ThirdPartyPayment payment){
        this.payment = payment;
    }

    @Override
    public void pay(double amount) {
        String dhudlu = String.valueOf(amount);
        payment.makePayment(dhudlu);
    }
    
}
