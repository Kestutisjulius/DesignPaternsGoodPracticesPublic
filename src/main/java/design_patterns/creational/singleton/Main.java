package design_patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        ComputerProducer computerProducer = ComputerProducer.getComputerProducer() ;

        computerProducer.showProducedComputersCount();
        Computer lenovo =  computerProducer.produceComputer();
        Computer asus =  computerProducer.produceComputer();
        Computer mac =  computerProducer.produceComputer();
        computerProducer.showProducedComputersCount();

        ComputerProducer piktasKlonas = ComputerProducer.getComputerProducer();
        Computer macBook = piktasKlonas.produceComputer();
        piktasKlonas.showProducedComputersCount();

        doSms();

    }

    private static void doSms(){
        ComputerProducer m = ComputerProducer.getComputerProducer();
        m.produceComputer();
        m.showProducedComputersCount();
    }
}
