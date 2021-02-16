package design_patterns.behavioral.chain_of_responsibility;

public class Dollar50Dispenser implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        int amount = currency.getAmount();
        if (amount>=50){
            int numberOfNotes = amount / 50;
            int reminder = amount % 50;
            System.out.println("Dispensing " + numberOfNotes + " 50$ notes");
            if (reminder !=0){
                this.chain.dispense(new Currency(reminder));
            }
        } else {
            this.chain.dispense(currency);
        }

    }
}
