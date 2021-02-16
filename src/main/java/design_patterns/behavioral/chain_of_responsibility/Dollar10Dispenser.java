package design_patterns.behavioral.chain_of_responsibility;

public class Dollar10Dispenser implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) { //pvz. next chain = Dollar 20Dispenser
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        int amount = currency.getAmount();
        if (amount >= 10){
            int numberOfNotes = amount / 10;
            int remainder = amount % 10;
            System.out.println("Dispensing " + numberOfNotes + " 10$ notes");
            if (remainder!=0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }

    }
}
