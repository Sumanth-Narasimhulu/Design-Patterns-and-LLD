package DesignPatternsAndLLD.BehaviouralDesignPatterns.ObserverDesignPattern;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel("DSA");
        Subscriber sumanth = new User("sumanth");
        Subscriber user2 = new User("user2");
        Subscriber user3 = new User("user3");
        youtubeChannel.subscribe(sumanth);
        youtubeChannel.subscribe(user2);
        youtubeChannel.subscribe(user3);

        youtubeChannel.uploadVideo("LLD");

        youtubeChannel.unSubscribe(user3);
        youtubeChannel.uploadVideo("DSA");
    }
}
