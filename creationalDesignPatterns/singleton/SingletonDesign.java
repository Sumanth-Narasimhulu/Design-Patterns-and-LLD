package DesignPatternsAndLLD.creationalDesignPatterns.singleton;

/**
 * SingletonDesign
 */
public class SingletonDesign {

    private static volatile SingletonDesign instance; 
    private SingletonDesign(){

    }
    public static SingletonDesign getInstance(){
        if(instance == null){
            synchronized(SingletonDesign.class){
                if(instance==null){
                    instance = new SingletonDesign();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();

    }
}