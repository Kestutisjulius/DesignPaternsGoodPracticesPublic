package design_patterns.creational.factory_method;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("SMS sending ...");
    }

    //galima papildoma logika...

}
