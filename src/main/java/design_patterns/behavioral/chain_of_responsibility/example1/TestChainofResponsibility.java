package design_patterns.behavioral.chain_of_responsibility.example1;

public class TestChainofResponsibility {
    public static void main(String[] args) {
        File file = null;
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler docHandler = new DocFileHandler("Doc Handler");
        Handler excelHandler = new ExcelFileHandler("Excel Handler");
        Handler audioHandler = new AudioFileHandler("Audio Handler");
        Handler videoHandler = new VideoFileHandler("Video Handler");
        Handler imageHandler = new ImageFileHandler("Image Handler");

        textHandler.setHandler(docHandler);
        docHandler.setHandler(excelHandler);
        excelHandler.setHandler(audioHandler);
        audioHandler.setHandler(videoHandler);
        videoHandler.setHandler(imageHandler);

        file = new File("Abc.mp3", "audio", "C:\\path");
        audioHandler.process(file);
        file = new File("Abc.jpg", "video", "C:\\path");
        videoHandler.process(file);
        file = new File("Abc.doc", "doc", "C:\\path");
        docHandler.process(file);
        file = new File("Abc.bat", "bat", "C:\\path");
        textHandler.process(file);
    }
}
