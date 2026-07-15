package DesignPatternsAndLLD.BehaviouralDesignPatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * YoutubeChannel
 */
public class YoutubeChannel {

    public String name;
    List<Subscriber>subscribers;
    public YoutubeChannel(String name){
        this.name = name;
        this.subscribers = new ArrayList<>();

    }

    public void subscribe(Subscriber user){
        subscribers.add(user);
    }
    public void unSubscribe(Subscriber user){
        subscribers.remove(user);
    }
    public void notifySubscribers(String title){
        for(Subscriber s: subscribers){
            s.update(title);
        }
    }
    public void uploadVideo(String video){
        System.out.println("Video uploaded");
        notifySubscribers(video);
    }
    
}