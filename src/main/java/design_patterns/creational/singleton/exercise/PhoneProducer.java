package design_patterns.creational.singleton.exercise;

public class PhoneProducer {
    private static PhoneProducer phoneProducer;
    private int phonesProduced;

    private PhoneProducer(){}
    public Phone producePhone(){
        phonesProduced++;
        return new Phone();
    }
    public void showPhoneProducedCount(){
        System.out.println("produced: " + phonesProduced + " phones");
    }
    public static PhoneProducer getPhoneProducer(){
        if (phoneProducer!=null) {
            return phoneProducer;
        } else {
            phoneProducer = new PhoneProducer();
            return phoneProducer;
        }
    }

}
