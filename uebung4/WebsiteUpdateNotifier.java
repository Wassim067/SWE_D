package uebung_vier;

public class WebsiteUpdateNotifier {
    public static void main(String[] args) {
        UpdateCheckerSystem system = new UpdateCheckerSystem();

        User alice = new User("Alice");
        system.registerUser(alice);

        Subscription sub1 = new Subscription("https://example.com", "daily", "email");
        Subscription sub2 = new Subscription("https://news.com", "hourly", "sms");

        alice.addSubscription(sub1);
        alice.addSubscription(sub2);

        // Simulierte periodische Prüfung
        for (int i = 0; i < 3; i++) {
            System.out.println("\nChecking for updates... (Iteration " + (i + 1) + ")");
            system.checkAllUpdates();
            try {
                Thread.sleep(1000); // 1 Sekunde warten (simulierte Zeit)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
