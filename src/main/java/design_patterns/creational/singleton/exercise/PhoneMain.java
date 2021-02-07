package design_patterns.creational.singleton.exercise;

public class PhoneMain {
    public static void main(String[] args) {
        PhoneProducer phoneProducer = PhoneProducer.getPhoneProducer();


        phoneProducer.producePhone(); //+1
        Phone iPhone = phoneProducer.producePhone(); //+1
        phoneProducer.showPhoneProducedCount();
        phoneProducer.producePhone(); //+1

        samsungPhone(); //+1
        phoneProducer.showPhoneProducedCount();
    }

    private static void samsungPhone(){
        PhoneProducer samsung = PhoneProducer.getPhoneProducer();
        samsung.producePhone();

    }
}
