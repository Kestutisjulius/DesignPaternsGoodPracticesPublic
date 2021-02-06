package design_patterns.creational.singleton;

/**
 * Use singleton to ensure that we would have only one ComputerProducer per program.
 * And create global access point to it.
 */

public class ComputerProducer {

    private static ComputerProducer computerProducer;
    private int numberComputersProduced;

    //Singleton is achieved via private Constructor
    private ComputerProducer(){

    }

    public Computer produceComputer(){
        numberComputersProduced++;
        return new Computer();
    }
    public void showProducedComputersCount(){
        System.out.println("we produced: " + numberComputersProduced + " computers");
    }


    //Global access point
    public static ComputerProducer getComputerProducer(){
        //jeigu instancas egzistuoja
if (computerProducer!=null) {
    return computerProducer;
}else {
    // jei neegzistuoja
    computerProducer = new ComputerProducer();
    return computerProducer;
}



    }

}
