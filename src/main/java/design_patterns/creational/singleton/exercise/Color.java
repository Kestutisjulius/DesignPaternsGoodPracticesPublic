package design_patterns.creational.singleton.exercise;

public enum Color {
    WHITE(255,255,255),
    BLUE(0,0,255),
    GREEN(0,255,0),
    YELLOW(255,255,0),
    PURPLE(153,0,204),
    BLACK(0,0,0);

    private int red;
    private int green;
    private int blue;

    Color(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
}
