package uebung_vier;

public class Subscription {
    private String url;
    private String frequency;
    private String channel;

    public Subscription(String url, String frequency, String channel) {
        this.url = url;
        this.frequency = frequency;
        this.channel = channel;
    }

    public String getUrl() {
        return url;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getChannel() {
        return channel;
    }

    public void checkForUpdates() {
        // Simulierte Webseitenprüfung
        boolean updateDetected = Math.random() < 0.5;
        if (updateDetected) {
            sendNotification();
        }
    }

    private void sendNotification() {
        System.out.println("[" + channel + "] Update detected on " + url);
    }
}
