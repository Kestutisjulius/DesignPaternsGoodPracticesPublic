package design_patterns.creational.factory_method;

/**
 * Creation type Pattern
 * It states that we have to define an interface (or abstract class) and allow subclasses object to
 * instantiate
 *
 * Factory method means that there is a method which acts as a Factory and creates objects (stuff)
 *
 * Implementation:
 * 1. Define factory method inside the interface
 * 2. Let subclasses implement it and decide with
 */
public interface Notification {
    void notifyUser();

}
