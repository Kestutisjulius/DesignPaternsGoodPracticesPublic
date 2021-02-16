package design_patterns.behavioral.chain_of_responsibility.example1;

public class ImageFileHandler implements Handler{

    public Handler handler;
    public String handlerName;

    public ImageFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
        if (file.getFileType().equals("image")) {
            System.out.println("Process and saving image file ... by " + handlerName);
        } else if (handler!=null) {
            System.out.println(handlerName + " fowards request to " + handler.getHandlerName());
            handler.process(file);
        } else {
            System.out.println("File not supported");
        }

    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
