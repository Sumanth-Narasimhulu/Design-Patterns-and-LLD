package DesignPatternsAndLLD.BehaviouralDesignPatterns.StratergyDesignPattern;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStratergy(new UPI());
        cart.checkout(100);

        cart.setPaymentStratergy(new Creditcard());
        cart.checkout(300);

    }
}
