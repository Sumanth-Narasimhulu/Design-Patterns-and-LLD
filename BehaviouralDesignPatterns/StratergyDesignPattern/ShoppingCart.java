package DesignPatternsAndLLD.BehaviouralDesignPatterns.StratergyDesignPattern;

public class ShoppingCart {
    
    PaymentStratergy stratergy;
    public void setPaymentStratergy(PaymentStratergy stratergy){
        this.stratergy = stratergy;
    }
    public void checkout(double amount){
        stratergy.pay(amount);
    }
}
