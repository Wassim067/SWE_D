package uebung_vier;

import java.util.ArrayList;
import java.util.List;

public class UpdateCheckerSystem {
    private List<User> users = new ArrayList<>();

    public void registerUser(User user) {
        users.add(user);
        System.out.println("User registered: " + user.getName());
    }

    public void checkAllUpdates() {
        for (User user : users) {
            for (Subscription sub : user.getSubscriptions()) {
                sub.checkForUpdates();
            }
        }
    }
}
