package darbas_grupese.grupePC;

import java.util.List;

public class PC {
    private Monitor monitor;
    private Processors processors;
    List<Gadget> computerGadget;
    private int totalPrice;

    public PC(Monitor monitor, Processors processors, List<Gadget> computerGadget) {
        this.monitor = monitor;
        this.processors = processors;
        this.computerGadget = computerGadget;

    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Processors getProcessors() {
        return processors;
    }

    public void setProcessors(Processors processors) {
        this.processors = processors;
    }

    public List<Gadget> getComputerGadget() {
        return computerGadget;
    }

    public void setComputerGadget(List<Gadget> computerGadget) {
        this.computerGadget = computerGadget;
    }

    public int getTotalPrice() {
        for (Gadget gadget : computerGadget) {
            gadget.getPrice();
        }
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "PC{" +
                "monitor=" + monitor +
                ", processors=" + processors +
                ", computerGadget=" + computerGadget +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
