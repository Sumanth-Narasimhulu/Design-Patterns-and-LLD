package DesignPatternsAndLLD.creationalDesignPatterns.singleton;

public class Thread2 implements Runnable{

    @Override
    public void run() {
        SingletonDesign a = SingletonDesign.getInstance();
        System.out.println(a.hashCode());

    }
    
}
