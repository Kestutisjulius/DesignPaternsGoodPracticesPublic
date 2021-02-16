package design_patterns.creational.factory_method;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Push NOTIFICATION is sent...");
    }
    //galima papildoma logika
}
