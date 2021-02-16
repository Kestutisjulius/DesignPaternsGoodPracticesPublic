package design_patterns.behavioral.chain_of_responsibility;

/**
 * Base interface should have a method to define the next processor and a method to process the request.
 *
 * Our case: we need different processor classes, to dispense amounts of money.
 * 50,20,10 .€ amount bills can be used.
 */
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    //
    void dispense(Currency currency); //pinigu isdavimas

}
