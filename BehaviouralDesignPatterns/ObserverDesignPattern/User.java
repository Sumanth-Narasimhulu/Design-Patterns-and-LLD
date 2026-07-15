package DesignPatternsAndLLD.BehaviouralDesignPatterns.ObserverDesignPattern;

public class User implements Subscriber{
    public String name;
    public User(String name){
        this.name = name;
    }
    @Override
    public void update(String title) {
        System.out.println("notifed to user "+ name+" about title "+title);
    }
    
}
