package DesignPatternsAndLLD.structuralDesignPatterns.FecadeDesignPattern;

public class SwiggyFacade {
    public Delivery delivery;
    public PaymentService paymentService;
    public Restaurent restaurent;
    public SwiggyFacade(){
        this.delivery = new Delivery();
        this.paymentService = new PaymentService();
        this.restaurent = new Restaurent();
    }
    public void placeOrder(String restaurentName,String user,int amount,String item){
        delivery.assignDeliveryPerson(restaurentName, user);
        paymentService.pay( amount);
        restaurent.notifyRestaurent(item,user);
    }
}
