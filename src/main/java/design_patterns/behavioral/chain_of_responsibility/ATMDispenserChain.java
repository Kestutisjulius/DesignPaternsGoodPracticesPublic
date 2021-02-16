package design_patterns.behavioral.chain_of_responsibility;

public class ATMDispenserChain {

    private DispenseChain firstChainElement;

    public ATMDispenserChain() {
        //initialize the chain
        //Specify first element of the chain
        this.firstChainElement = new Dollar50Dispenser();

        DispenseChain secondChainElement = new Dollar20Dispenser();
        DispenseChain thirdChainElement = new Dollar10Dispenser();
        firstChainElement.setNextChain(secondChainElement);
        secondChainElement.setNextChain(thirdChainElement);
    }

    public DispenseChain getFirstChainElement() {
        return firstChainElement;
    }
}
