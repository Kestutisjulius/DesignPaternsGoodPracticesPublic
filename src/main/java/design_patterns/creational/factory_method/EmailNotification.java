package design_patterns.creational.factory_method;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending email to a user...");
    }
}
