package design_patterns.behavioral.chain_of_responsibility;

public class Dollar20Dispenser implements DispenseChain{

    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;

    }

    @Override
    public void dispense(Currency currency) {
        int amount = currency.getAmount();
        if (amount>=20){
            int numberOfNotes = amount / 20;
            int reminder = amount % 20;
            System.out.println("Dispensing " + numberOfNotes + " 20$ notes");
            if (reminder !=0){
                this.chain.dispense(new Currency(reminder));
            }
        } else {
            this.chain.dispense(currency);
        }

    }
}
