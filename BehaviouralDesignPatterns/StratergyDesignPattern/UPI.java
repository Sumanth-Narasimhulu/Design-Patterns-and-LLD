package DesignPatternsAndLLD.BehaviouralDesignPatterns.StratergyDesignPattern;

public class UPI implements PaymentStratergy{

    @Override
    public void pay(double amount) {
        System.out.println("amount RS. "+amount+" paid with UPI");
    }
    
    
    
}
