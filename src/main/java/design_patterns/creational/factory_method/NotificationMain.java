package design_patterns.creational.factory_method;

public class NotificationMain {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");

        notification.notifyUser();
    }
}
