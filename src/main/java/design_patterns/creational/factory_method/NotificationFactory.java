package design_patterns.creational.factory_method;

/**
 * Factory class to instantiate concrete classes.
 */
public class NotificationFactory {

    public Notification createNotification(String channel){
        if ("SMS".equalsIgnoreCase(channel)){
            return new SMSNotification();
        }
        else if ("EMAIL".equalsIgnoreCase(channel)){
            return new EmailNotification();
        }
        else if ("PUSH".equalsIgnoreCase(channel)){
            return new PushNotification();
        } else {
            return null; // galima grazinti DefaultNotification
        }
    }
}
