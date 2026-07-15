package DesignPatternsAndLLD.creationalDesignPatterns.BuilderDesignPattern;

public class Main {
    
    public static void main(String[] args) {
        User u1 = new User.UserBuilder("Sumanth").setAge(22).setCity("ATP").build();
        System.out.println(u1.toString());
        // u1.setDegree("BTECH");
        // System.out.println(u1.toString());

    }
}
