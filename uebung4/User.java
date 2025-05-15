package uebung_vier;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Subscription> subscriptions = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addSubscription(Subscription subscription) {
        subscriptions.add(subscription);
        System.out.println("Subscription added for URL: " + subscription.getUrl());
    }

    public void removeSubscription(String url) {
        subscriptions.removeIf(s -> s.getUrl().equals(url));
        System.out.println("Subscription removed for URL: " + url);
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public String getName() {
        return name;
    }
    
}
