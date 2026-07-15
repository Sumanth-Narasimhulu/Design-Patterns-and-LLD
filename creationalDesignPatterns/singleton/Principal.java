
package DesignPatternsAndLLD.creationalDesignPatterns.singleton;

/**
 * singleton
 */

/*
 it's a simple Singleton example
 
*/
public class Principal {
    private static Principal instance;
    private String name;
    private Principal(){
        this.name = "sumanth";
    }
    public static Principal getInstance(){
        if(instance==null){
            instance = new Principal();
        }
        return instance;

    }
    public static void main(String[] args) {
        Principal p1 = Principal.getInstance();
        System.out.println(p1.name);
        Principal p2 = Principal.getInstance();
        System.out.println(p2.name);
        System.out.println(p1.equals(p2));
    }
    
}