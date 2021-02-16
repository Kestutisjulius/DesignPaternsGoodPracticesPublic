package design_patterns.behavioral.chain_of_responsibility.example1;


public interface Handler {
    public void setHandler (Handler handler);
    public void process(File file);
    public String getHandlerName();
}
